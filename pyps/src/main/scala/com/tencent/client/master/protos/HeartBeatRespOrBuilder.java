// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

public interface HeartBeatRespOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ClientMaster.HeartBeatResp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Status ret = 1;</code>
   */
  int getRetValue();
  /**
   * <code>.Status ret = 1;</code>
   */
  com.tencent.client.common.protos.Status getRet();

  /**
   * <code>string msg = 2;</code>
   */
  java.lang.String getMsg();
  /**
   * <code>string msg = 2;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <code>.ClientMaster.Command cmd = 3;</code>
   */
  int getCmdValue();
  /**
   * <code>.ClientMaster.Command cmd = 3;</code>
   */
  com.tencent.client.master.protos.Command getCmd();
}
