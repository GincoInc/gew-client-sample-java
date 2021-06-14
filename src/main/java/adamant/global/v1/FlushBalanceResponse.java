// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.FlushBalanceResponse}
 */
public  final class FlushBalanceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.FlushBalanceResponse)
    FlushBalanceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FlushBalanceResponse.newBuilder() to construct.
  private FlushBalanceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FlushBalanceResponse() {
    flushedAddresses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FlushBalanceResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FlushBalanceResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              flushedAddresses_ = new java.util.ArrayList<adamant.global.v1.Model.FlushedAddress>();
              mutable_bitField0_ |= 0x00000001;
            }
            flushedAddresses_.add(
                input.readMessage(adamant.global.v1.Model.FlushedAddress.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        flushedAddresses_ = java.util.Collections.unmodifiableList(flushedAddresses_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_FlushBalanceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_FlushBalanceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.FlushBalanceResponse.class, adamant.global.v1.FlushBalanceResponse.Builder.class);
  }

  public static final int FLUSHED_ADDRESSES_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.FlushedAddress> flushedAddresses_;
  /**
   * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.FlushedAddress> getFlushedAddressesList() {
    return flushedAddresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.FlushedAddressOrBuilder> 
      getFlushedAddressesOrBuilderList() {
    return flushedAddresses_;
  }
  /**
   * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
   */
  public int getFlushedAddressesCount() {
    return flushedAddresses_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
   */
  public adamant.global.v1.Model.FlushedAddress getFlushedAddresses(int index) {
    return flushedAddresses_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
   */
  public adamant.global.v1.Model.FlushedAddressOrBuilder getFlushedAddressesOrBuilder(
      int index) {
    return flushedAddresses_.get(index);
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
    for (int i = 0; i < flushedAddresses_.size(); i++) {
      output.writeMessage(1, flushedAddresses_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < flushedAddresses_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, flushedAddresses_.get(i));
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
    if (!(obj instanceof adamant.global.v1.FlushBalanceResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.FlushBalanceResponse other = (adamant.global.v1.FlushBalanceResponse) obj;

    if (!getFlushedAddressesList()
        .equals(other.getFlushedAddressesList())) return false;
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
    if (getFlushedAddressesCount() > 0) {
      hash = (37 * hash) + FLUSHED_ADDRESSES_FIELD_NUMBER;
      hash = (53 * hash) + getFlushedAddressesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.FlushBalanceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.FlushBalanceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.FlushBalanceResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.FlushBalanceResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.FlushBalanceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.FlushBalanceResponse)
      adamant.global.v1.FlushBalanceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_FlushBalanceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_FlushBalanceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.FlushBalanceResponse.class, adamant.global.v1.FlushBalanceResponse.Builder.class);
    }

    // Construct using adamant.global.v1.FlushBalanceResponse.newBuilder()
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
        getFlushedAddressesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (flushedAddressesBuilder_ == null) {
        flushedAddresses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        flushedAddressesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_FlushBalanceResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.FlushBalanceResponse getDefaultInstanceForType() {
      return adamant.global.v1.FlushBalanceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.FlushBalanceResponse build() {
      adamant.global.v1.FlushBalanceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.FlushBalanceResponse buildPartial() {
      adamant.global.v1.FlushBalanceResponse result = new adamant.global.v1.FlushBalanceResponse(this);
      int from_bitField0_ = bitField0_;
      if (flushedAddressesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          flushedAddresses_ = java.util.Collections.unmodifiableList(flushedAddresses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.flushedAddresses_ = flushedAddresses_;
      } else {
        result.flushedAddresses_ = flushedAddressesBuilder_.build();
      }
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
      if (other instanceof adamant.global.v1.FlushBalanceResponse) {
        return mergeFrom((adamant.global.v1.FlushBalanceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.FlushBalanceResponse other) {
      if (other == adamant.global.v1.FlushBalanceResponse.getDefaultInstance()) return this;
      if (flushedAddressesBuilder_ == null) {
        if (!other.flushedAddresses_.isEmpty()) {
          if (flushedAddresses_.isEmpty()) {
            flushedAddresses_ = other.flushedAddresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFlushedAddressesIsMutable();
            flushedAddresses_.addAll(other.flushedAddresses_);
          }
          onChanged();
        }
      } else {
        if (!other.flushedAddresses_.isEmpty()) {
          if (flushedAddressesBuilder_.isEmpty()) {
            flushedAddressesBuilder_.dispose();
            flushedAddressesBuilder_ = null;
            flushedAddresses_ = other.flushedAddresses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            flushedAddressesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFlushedAddressesFieldBuilder() : null;
          } else {
            flushedAddressesBuilder_.addAllMessages(other.flushedAddresses_);
          }
        }
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
      adamant.global.v1.FlushBalanceResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.FlushBalanceResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.FlushedAddress> flushedAddresses_ =
      java.util.Collections.emptyList();
    private void ensureFlushedAddressesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        flushedAddresses_ = new java.util.ArrayList<adamant.global.v1.Model.FlushedAddress>(flushedAddresses_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.FlushedAddress, adamant.global.v1.Model.FlushedAddress.Builder, adamant.global.v1.Model.FlushedAddressOrBuilder> flushedAddressesBuilder_;

    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.FlushedAddress> getFlushedAddressesList() {
      if (flushedAddressesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(flushedAddresses_);
      } else {
        return flushedAddressesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public int getFlushedAddressesCount() {
      if (flushedAddressesBuilder_ == null) {
        return flushedAddresses_.size();
      } else {
        return flushedAddressesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public adamant.global.v1.Model.FlushedAddress getFlushedAddresses(int index) {
      if (flushedAddressesBuilder_ == null) {
        return flushedAddresses_.get(index);
      } else {
        return flushedAddressesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder setFlushedAddresses(
        int index, adamant.global.v1.Model.FlushedAddress value) {
      if (flushedAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.set(index, value);
        onChanged();
      } else {
        flushedAddressesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder setFlushedAddresses(
        int index, adamant.global.v1.Model.FlushedAddress.Builder builderForValue) {
      if (flushedAddressesBuilder_ == null) {
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.set(index, builderForValue.build());
        onChanged();
      } else {
        flushedAddressesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder addFlushedAddresses(adamant.global.v1.Model.FlushedAddress value) {
      if (flushedAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.add(value);
        onChanged();
      } else {
        flushedAddressesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder addFlushedAddresses(
        int index, adamant.global.v1.Model.FlushedAddress value) {
      if (flushedAddressesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.add(index, value);
        onChanged();
      } else {
        flushedAddressesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder addFlushedAddresses(
        adamant.global.v1.Model.FlushedAddress.Builder builderForValue) {
      if (flushedAddressesBuilder_ == null) {
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.add(builderForValue.build());
        onChanged();
      } else {
        flushedAddressesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder addFlushedAddresses(
        int index, adamant.global.v1.Model.FlushedAddress.Builder builderForValue) {
      if (flushedAddressesBuilder_ == null) {
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.add(index, builderForValue.build());
        onChanged();
      } else {
        flushedAddressesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder addAllFlushedAddresses(
        java.lang.Iterable<? extends adamant.global.v1.Model.FlushedAddress> values) {
      if (flushedAddressesBuilder_ == null) {
        ensureFlushedAddressesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, flushedAddresses_);
        onChanged();
      } else {
        flushedAddressesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder clearFlushedAddresses() {
      if (flushedAddressesBuilder_ == null) {
        flushedAddresses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        flushedAddressesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public Builder removeFlushedAddresses(int index) {
      if (flushedAddressesBuilder_ == null) {
        ensureFlushedAddressesIsMutable();
        flushedAddresses_.remove(index);
        onChanged();
      } else {
        flushedAddressesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public adamant.global.v1.Model.FlushedAddress.Builder getFlushedAddressesBuilder(
        int index) {
      return getFlushedAddressesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public adamant.global.v1.Model.FlushedAddressOrBuilder getFlushedAddressesOrBuilder(
        int index) {
      if (flushedAddressesBuilder_ == null) {
        return flushedAddresses_.get(index);  } else {
        return flushedAddressesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.FlushedAddressOrBuilder> 
         getFlushedAddressesOrBuilderList() {
      if (flushedAddressesBuilder_ != null) {
        return flushedAddressesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(flushedAddresses_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public adamant.global.v1.Model.FlushedAddress.Builder addFlushedAddressesBuilder() {
      return getFlushedAddressesFieldBuilder().addBuilder(
          adamant.global.v1.Model.FlushedAddress.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public adamant.global.v1.Model.FlushedAddress.Builder addFlushedAddressesBuilder(
        int index) {
      return getFlushedAddressesFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.FlushedAddress.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.FlushedAddress flushed_addresses = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.FlushedAddress.Builder> 
         getFlushedAddressesBuilderList() {
      return getFlushedAddressesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.FlushedAddress, adamant.global.v1.Model.FlushedAddress.Builder, adamant.global.v1.Model.FlushedAddressOrBuilder> 
        getFlushedAddressesFieldBuilder() {
      if (flushedAddressesBuilder_ == null) {
        flushedAddressesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.FlushedAddress, adamant.global.v1.Model.FlushedAddress.Builder, adamant.global.v1.Model.FlushedAddressOrBuilder>(
                flushedAddresses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        flushedAddresses_ = null;
      }
      return flushedAddressesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.FlushBalanceResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.FlushBalanceResponse)
  private static final adamant.global.v1.FlushBalanceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.FlushBalanceResponse();
  }

  public static adamant.global.v1.FlushBalanceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FlushBalanceResponse>
      PARSER = new com.google.protobuf.AbstractParser<FlushBalanceResponse>() {
    @java.lang.Override
    public FlushBalanceResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FlushBalanceResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FlushBalanceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FlushBalanceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.FlushBalanceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

