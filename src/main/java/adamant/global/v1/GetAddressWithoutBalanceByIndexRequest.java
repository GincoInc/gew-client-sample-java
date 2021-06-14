// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.GetAddressWithoutBalanceByIndexRequest}
 */
public  final class GetAddressWithoutBalanceByIndexRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)
    GetAddressWithoutBalanceByIndexRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAddressWithoutBalanceByIndexRequest.newBuilder() to construct.
  private GetAddressWithoutBalanceByIndexRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAddressWithoutBalanceByIndexRequest() {
    walletId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAddressWithoutBalanceByIndexRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetAddressWithoutBalanceByIndexRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            walletId_ = s;
            break;
          }
          case 16: {

            index_ = input.readUInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_GetAddressWithoutBalanceByIndexRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_GetAddressWithoutBalanceByIndexRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.class, adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.Builder.class);
  }

  public static final int WALLET_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object walletId_;
  /**
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  public java.lang.String getWalletId() {
    java.lang.Object ref = walletId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      walletId_ = s;
      return s;
    }
  }
  /**
   * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
   */
  public com.google.protobuf.ByteString
      getWalletIdBytes() {
    java.lang.Object ref = walletId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      walletId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INDEX_FIELD_NUMBER = 2;
  private int index_;
  /**
   * <code>uint32 index = 2 [(.validate.rules) = { ... }</code>
   */
  public int getIndex() {
    return index_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getWalletIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, walletId_);
    }
    if (index_ != 0) {
      output.writeUInt32(2, index_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getWalletIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, walletId_);
    }
    if (index_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, index_);
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
    if (!(obj instanceof adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)) {
      return super.equals(obj);
    }
    adamant.global.v1.GetAddressWithoutBalanceByIndexRequest other = (adamant.global.v1.GetAddressWithoutBalanceByIndexRequest) obj;

    if (!getWalletId()
        .equals(other.getWalletId())) return false;
    if (getIndex()
        != other.getIndex()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + WALLET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getWalletId().hashCode();
    hash = (37 * hash) + INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(adamant.global.v1.GetAddressWithoutBalanceByIndexRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code adamant.global.v1.GetAddressWithoutBalanceByIndexRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)
      adamant.global.v1.GetAddressWithoutBalanceByIndexRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_GetAddressWithoutBalanceByIndexRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_GetAddressWithoutBalanceByIndexRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.class, adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.Builder.class);
    }

    // Construct using adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      walletId_ = "";

      index_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_GetAddressWithoutBalanceByIndexRequest_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.GetAddressWithoutBalanceByIndexRequest getDefaultInstanceForType() {
      return adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.GetAddressWithoutBalanceByIndexRequest build() {
      adamant.global.v1.GetAddressWithoutBalanceByIndexRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.GetAddressWithoutBalanceByIndexRequest buildPartial() {
      adamant.global.v1.GetAddressWithoutBalanceByIndexRequest result = new adamant.global.v1.GetAddressWithoutBalanceByIndexRequest(this);
      result.walletId_ = walletId_;
      result.index_ = index_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof adamant.global.v1.GetAddressWithoutBalanceByIndexRequest) {
        return mergeFrom((adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.GetAddressWithoutBalanceByIndexRequest other) {
      if (other == adamant.global.v1.GetAddressWithoutBalanceByIndexRequest.getDefaultInstance()) return this;
      if (!other.getWalletId().isEmpty()) {
        walletId_ = other.walletId_;
        onChanged();
      }
      if (other.getIndex() != 0) {
        setIndex(other.getIndex());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      adamant.global.v1.GetAddressWithoutBalanceByIndexRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.GetAddressWithoutBalanceByIndexRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object walletId_ = "";
    /**
     * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
     */
    public java.lang.String getWalletId() {
      java.lang.Object ref = walletId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        walletId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
     */
    public com.google.protobuf.ByteString
        getWalletIdBytes() {
      java.lang.Object ref = walletId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        walletId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setWalletId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      walletId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder clearWalletId() {
      
      walletId_ = getDefaultInstance().getWalletId();
      onChanged();
      return this;
    }
    /**
     * <code>string wallet_id = 1 [(.validate.rules) = { ... }</code>
     */
    public Builder setWalletIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      walletId_ = value;
      onChanged();
      return this;
    }

    private int index_ ;
    /**
     * <code>uint32 index = 2 [(.validate.rules) = { ... }</code>
     */
    public int getIndex() {
      return index_;
    }
    /**
     * <code>uint32 index = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder setIndex(int value) {
      
      index_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 index = 2 [(.validate.rules) = { ... }</code>
     */
    public Builder clearIndex() {
      
      index_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.GetAddressWithoutBalanceByIndexRequest)
  private static final adamant.global.v1.GetAddressWithoutBalanceByIndexRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.GetAddressWithoutBalanceByIndexRequest();
  }

  public static adamant.global.v1.GetAddressWithoutBalanceByIndexRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAddressWithoutBalanceByIndexRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetAddressWithoutBalanceByIndexRequest>() {
    @java.lang.Override
    public GetAddressWithoutBalanceByIndexRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetAddressWithoutBalanceByIndexRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetAddressWithoutBalanceByIndexRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAddressWithoutBalanceByIndexRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.GetAddressWithoutBalanceByIndexRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

