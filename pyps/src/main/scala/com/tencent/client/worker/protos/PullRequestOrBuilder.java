// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_worker.proto

package com.tencent.client.worker.protos;

public interface PullRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientMaster.PullRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 pid = 1;</code>
   */
  int getPid();

  /**
   * <code>int32 matId = 3;</code>
   */
  int getMatId();

  /**
   * <code>int32 epoch = 4;</code>
   */
  int getEpoch();

  /**
   * <code>int32 batch = 5;</code>
   */
  int getBatch();

  /**
   * <code>bytes objectId = 6;</code>
   */
  com.google.protobuf.ByteString getObjectId();
}
