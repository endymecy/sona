/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package org.apache.spark.angel.psf.embedding;

import it.unimi.dsi.fastutil.ints.Int2IntMap;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import org.apache.spark.angel.graph.utils.FastSigmoid;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Random;

public class CBowModel {

  private int window;
  private int negative;
  private float alpha;
  private int numNode;
  private int dimension;


  public CBowModel(int window, int negative, float alpha, int numNode, int dimension) {
    this.window = window;
    this.negative = negative;
    this.alpha = alpha;
    this.numNode = numNode;
    this.dimension = dimension;
  }

  public int[] indicesForCbow(int[][] sentences, int seed) {
    Random winRand = new Random(seed);
    Random negRand = new Random(seed + 1);

    IntOpenHashSet indices = new IntOpenHashSet();
    for (int s = 0; s < sentences.length; s++) {
      int len = sentences[s].length;
      for (int p = 0; p < len; p++) {
        int word = sentences[s][p];
        indices.add(word);

        int b = winRand.nextInt(window);

        int cw = 0;

        for (int a = b; a < window * 2 + 1 - b; a++) {
          if (a != window) {
            int c = p - window + a;
            if (c < 0) continue;
            if (c > len) continue;
            cw ++;
          }
        }

        if (cw > 0) {
          int target;
          for (int d = 0; d < negative; d++) {
            do {
              target = negRand.nextInt(numNode);
            } while (target == word);
            indices.add(target);
          }
        }
      }
    }
    return indices.toIntArray();
  }

  public Tuple2<Double, Integer> cbow(int[][] sentences, int seed, float[] layers, Int2IntOpenHashMap index, float[] deltas) {
    Arrays.fill(deltas, 0.0f);

    Random winRand = new Random(seed);
    Random negRand = new Random(seed + 1);

    Int2IntOpenHashMap inputCounter = new Int2IntOpenHashMap();
    Int2IntOpenHashMap outputCounter = new Int2IntOpenHashMap();

    float[] neu1 = new float[dimension];
    float[] neu1e = new float[dimension];
    int loss_cnt = 0;

    double sum_loss = 0.0;
    for (int s = 0; s < sentences.length; s++) {
      int sentence_length = sentences[s].length;

      for (int sentence_position = 0; sentence_position < sentence_length; sentence_position++) {
        // current word
        int word = sentences[s][sentence_position];
        // neu1 stores the average value of input vectors in the context (CBOW)
        Arrays.fill(neu1, 0);
        Arrays.fill(neu1e, 0);

        int b = winRand.nextInt(window);

        // Continuous Bag-of-Words Model
        int cw = 0;

        // Accumulate the input vectors from context
        for (int a = b; a < window * 2 + 1 - b; a++)
          if (a != window) {
            int c = sentence_position - window + a;
            if (c < 0) continue;
            if (c >= sentence_length) continue;
            int last_word = sentences[s][c];
            if (last_word == -1) continue;
            if (!index.containsKey(last_word)) System.out.println("Error");
            int offset = index.get(last_word) * dimension * 2;
            for (c = 0; c < dimension; c++) neu1[c] += layers[c + offset];
            cw++;
          }

        if (cw > 0) {
          for (int c = 0; c < dimension; c++) neu1[c] /= cw;
          // negative sampling
          int target, label;
          for (int d = 0; d < negative + 1; d++) {
            if (d == 0) {
              target = word;
              label = 1;
            } else {
              do {
                target = negRand.nextInt(numNode);
              } while (target == word);
              label = 0;
            }

            if (!index.containsKey(target)) System.out.println("Error");
            int l2 = index.get(target) * dimension * 2 + dimension;
            float f = 0f;
            for (int c = 0; c < dimension; c++) f += neu1[c] * layers[c + l2];

            float prob = FastSigmoid.sigmoid(f);
            if (d == 0) sum_loss -= FastSigmoid.log(prob);
            else sum_loss -= FastSigmoid.log(1 - prob);
            loss_cnt ++;


            // Using the sigmoid value from the pre-computed table
            float g = (label - FastSigmoid.sigmoid(f)) * alpha;
            // accumulate for the hidden layer
            for (int c = 0; c < dimension; c++) neu1e[c] += g * layers[c + l2];
            // update output layer
            for (int c = 0; c < dimension; c++) deltas[l2 + c] += g * neu1[c];
            // add the counter for target
            outputCounter.addTo(target, 1);
          }

          // update hidden layer
          for (int a = b; a < window * 2 + 1 - b; a++)
            if (a != window) {
              int c = sentence_position - window + a;
              if (c < 0) continue;
              if (c >= sentence_length) continue;
              int last_word = sentences[s][c];
              if (last_word == -1) continue;
              // Update the input vector for each word in the context
              int offset = index.get(last_word) * dimension * 2;
              for (c = 0; c < dimension; c++) deltas[c + offset] += neu1e[c];
              // add the counter to input
              inputCounter.addTo(last_word, 1);
            }
        }
      }
    }


    // update input layers
    ObjectIterator<Int2IntMap.Entry> it = inputCounter.int2IntEntrySet().fastIterator();
    while (it.hasNext()) {
      Int2IntMap.Entry entry = it.next();
      int node = entry.getIntKey();
      int offset = index.get(node) * dimension * 2;
      int divider = entry.getIntValue();
      for (int a = 0; a < dimension; a++) deltas[a + offset] /=  divider;
    }

    // update output layers
    it = outputCounter.int2IntEntrySet().fastIterator();
    while (it.hasNext()) {
      Int2IntMap.Entry entry = it.next();
      int node = entry.getIntKey();
      int offset = index.get(node) * dimension * 2 + dimension;
      int divider = entry.getIntValue();
      for (int a = 0; a < dimension; a++) deltas[a + offset] /=  divider;
    }

//    for (int a = 0; a < layers.length; a++) deltas[a] = layers[a] - deltas[a];
    return new Tuple2<>(sum_loss, loss_cnt);
  }

}
