// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

/**
 * Protobuf type {@code ClientMaster.SetAngelLocationResp}
 */
public  final class SetAngelLocationResp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientMaster.SetAngelLocationResp)
    SetAngelLocationRespOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SetAngelLocationResp.newBuilder() to construct.
  private SetAngelLocationResp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SetAngelLocationResp() {
    ret_ = 0;
    msg_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SetAngelLocationResp(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            ret_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_SetAngelLocationResp_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_SetAngelLocationResp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.client.master.protos.SetAngelLocationResp.class, com.tencent.client.master.protos.SetAngelLocationResp.Builder.class);
  }

  public static final int RET_FIELD_NUMBER = 1;
  private int ret_;
  /**
   * <code>.Status ret = 1;</code>
   */
  public int getRetValue() {
    return ret_;
  }
  /**
   * <code>.Status ret = 1;</code>
   */
  public com.tencent.client.common.protos.Status getRet() {
    com.tencent.client.common.protos.Status result = com.tencent.client.common.protos.Status.valueOf(ret_);
    return result == null ? com.tencent.client.common.protos.Status.UNRECOGNIZED : result;
  }

  public static final int MSG_FIELD_NUMBER = 2;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 2;</code>
   */
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (ret_ != com.tencent.client.common.protos.Status.OK.getNumber()) {
      output.writeEnum(1, ret_);
    }
    if (!getMsgBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, msg_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ret_ != com.tencent.client.common.protos.Status.OK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, ret_);
    }
    if (!getMsgBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, msg_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tencent.client.master.protos.SetAngelLocationResp)) {
      return super.equals(obj);
    }
    com.tencent.client.master.protos.SetAngelLocationResp other = (com.tencent.client.master.protos.SetAngelLocationResp) obj;

    boolean result = true;
    result = result && ret_ == other.ret_;
    result = result && getMsg()
        .equals(other.getMsg());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + RET_FIELD_NUMBER;
    hash = (53 * hash) + ret_;
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.SetAngelLocationResp parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tencent.client.master.protos.SetAngelLocationResp prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code ClientMaster.SetAngelLocationResp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientMaster.SetAngelLocationResp)
      com.tencent.client.master.protos.SetAngelLocationRespOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_SetAngelLocationResp_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_SetAngelLocationResp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.client.master.protos.SetAngelLocationResp.class, com.tencent.client.master.protos.SetAngelLocationResp.Builder.class);
    }

    // Construct using com.tencent.client.master.protos.SetAngelLocationResp.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      ret_ = 0;

      msg_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_SetAngelLocationResp_descriptor;
    }

    public com.tencent.client.master.protos.SetAngelLocationResp getDefaultInstanceForType() {
      return com.tencent.client.master.protos.SetAngelLocationResp.getDefaultInstance();
    }

    public com.tencent.client.master.protos.SetAngelLocationResp build() {
      com.tencent.client.master.protos.SetAngelLocationResp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.tencent.client.master.protos.SetAngelLocationResp buildPartial() {
      com.tencent.client.master.protos.SetAngelLocationResp result = new com.tencent.client.master.protos.SetAngelLocationResp(this);
      result.ret_ = ret_;
      result.msg_ = msg_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tencent.client.master.protos.SetAngelLocationResp) {
        return mergeFrom((com.tencent.client.master.protos.SetAngelLocationResp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.client.master.protos.SetAngelLocationResp other) {
      if (other == com.tencent.client.master.protos.SetAngelLocationResp.getDefaultInstance()) return this;
      if (other.ret_ != 0) {
        setRetValue(other.getRetValue());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tencent.client.master.protos.SetAngelLocationResp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.client.master.protos.SetAngelLocationResp) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int ret_ = 0;
    /**
     * <code>.Status ret = 1;</code>
     */
    public int getRetValue() {
      return ret_;
    }
    /**
     * <code>.Status ret = 1;</code>
     */
    public Builder setRetValue(int value) {
      ret_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Status ret = 1;</code>
     */
    public com.tencent.client.common.protos.Status getRet() {
      com.tencent.client.common.protos.Status result = com.tencent.client.common.protos.Status.valueOf(ret_);
      return result == null ? com.tencent.client.common.protos.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.Status ret = 1;</code>
     */
    public Builder setRet(com.tencent.client.common.protos.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ret_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Status ret = 1;</code>
     */
    public Builder clearRet() {
      
      ret_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 2;</code>
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 2;</code>
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ClientMaster.SetAngelLocationResp)
  }

  // @@protoc_insertion_point(class_scope:ClientMaster.SetAngelLocationResp)
  private static final com.tencent.client.master.protos.SetAngelLocationResp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.client.master.protos.SetAngelLocationResp();
  }

  public static com.tencent.client.master.protos.SetAngelLocationResp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SetAngelLocationResp>
      PARSER = new com.google.protobuf.AbstractParser<SetAngelLocationResp>() {
    public SetAngelLocationResp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SetAngelLocationResp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SetAngelLocationResp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SetAngelLocationResp> getParserForType() {
    return PARSER;
  }

  public com.tencent.client.master.protos.SetAngelLocationResp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

