// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: client_master.proto

package com.tencent.client.master.protos;

/**
 * Protobuf type {@code ClientMaster.GetAngelLocationReq}
 */
public  final class GetAngelLocationReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ClientMaster.GetAngelLocationReq)
    GetAngelLocationReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAngelLocationReq.newBuilder() to construct.
  private GetAngelLocationReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAngelLocationReq() {
    workId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAngelLocationReq(
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

            workId_ = input.readInt64();
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
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_GetAngelLocationReq_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_GetAngelLocationReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tencent.client.master.protos.GetAngelLocationReq.class, com.tencent.client.master.protos.GetAngelLocationReq.Builder.class);
  }

  public static final int WORKID_FIELD_NUMBER = 1;
  private long workId_;
  /**
   * <code>int64 workId = 1;</code>
   */
  public long getWorkId() {
    return workId_;
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
    if (workId_ != 0L) {
      output.writeInt64(1, workId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (workId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, workId_);
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
    if (!(obj instanceof com.tencent.client.master.protos.GetAngelLocationReq)) {
      return super.equals(obj);
    }
    com.tencent.client.master.protos.GetAngelLocationReq other = (com.tencent.client.master.protos.GetAngelLocationReq) obj;

    boolean result = true;
    result = result && (getWorkId()
        == other.getWorkId());
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
    hash = (37 * hash) + WORKID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWorkId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tencent.client.master.protos.GetAngelLocationReq parseFrom(
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
  public static Builder newBuilder(com.tencent.client.master.protos.GetAngelLocationReq prototype) {
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
   * Protobuf type {@code ClientMaster.GetAngelLocationReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ClientMaster.GetAngelLocationReq)
      com.tencent.client.master.protos.GetAngelLocationReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_GetAngelLocationReq_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_GetAngelLocationReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tencent.client.master.protos.GetAngelLocationReq.class, com.tencent.client.master.protos.GetAngelLocationReq.Builder.class);
    }

    // Construct using com.tencent.client.master.protos.GetAngelLocationReq.newBuilder()
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
      workId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tencent.client.master.protos.ClientMasterProto.internal_static_ClientMaster_GetAngelLocationReq_descriptor;
    }

    public com.tencent.client.master.protos.GetAngelLocationReq getDefaultInstanceForType() {
      return com.tencent.client.master.protos.GetAngelLocationReq.getDefaultInstance();
    }

    public com.tencent.client.master.protos.GetAngelLocationReq build() {
      com.tencent.client.master.protos.GetAngelLocationReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.tencent.client.master.protos.GetAngelLocationReq buildPartial() {
      com.tencent.client.master.protos.GetAngelLocationReq result = new com.tencent.client.master.protos.GetAngelLocationReq(this);
      result.workId_ = workId_;
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
      if (other instanceof com.tencent.client.master.protos.GetAngelLocationReq) {
        return mergeFrom((com.tencent.client.master.protos.GetAngelLocationReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tencent.client.master.protos.GetAngelLocationReq other) {
      if (other == com.tencent.client.master.protos.GetAngelLocationReq.getDefaultInstance()) return this;
      if (other.getWorkId() != 0L) {
        setWorkId(other.getWorkId());
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
      com.tencent.client.master.protos.GetAngelLocationReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tencent.client.master.protos.GetAngelLocationReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long workId_ ;
    /**
     * <code>int64 workId = 1;</code>
     */
    public long getWorkId() {
      return workId_;
    }
    /**
     * <code>int64 workId = 1;</code>
     */
    public Builder setWorkId(long value) {
      
      workId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 workId = 1;</code>
     */
    public Builder clearWorkId() {
      
      workId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:ClientMaster.GetAngelLocationReq)
  }

  // @@protoc_insertion_point(class_scope:ClientMaster.GetAngelLocationReq)
  private static final com.tencent.client.master.protos.GetAngelLocationReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tencent.client.master.protos.GetAngelLocationReq();
  }

  public static com.tencent.client.master.protos.GetAngelLocationReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAngelLocationReq>
      PARSER = new com.google.protobuf.AbstractParser<GetAngelLocationReq>() {
    public GetAngelLocationReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAngelLocationReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAngelLocationReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAngelLocationReq> getParserForType() {
    return PARSER;
  }

  public com.tencent.client.master.protos.GetAngelLocationReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

