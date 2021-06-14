// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListXRPInitSignInfoResponse}
 */
public  final class ListXRPInitSignInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListXRPInitSignInfoResponse)
    ListXRPInitSignInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListXRPInitSignInfoResponse.newBuilder() to construct.
  private ListXRPInitSignInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListXRPInitSignInfoResponse() {
    signInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListXRPInitSignInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListXRPInitSignInfoResponse(
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
              signInfoList_ = new java.util.ArrayList<adamant.global.v1.Model.SignInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            signInfoList_.add(
                input.readMessage(adamant.global.v1.Model.SignInfo.parser(), extensionRegistry));
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
        signInfoList_ = java.util.Collections.unmodifiableList(signInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListXRPInitSignInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListXRPInitSignInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListXRPInitSignInfoResponse.class, adamant.global.v1.ListXRPInitSignInfoResponse.Builder.class);
  }

  public static final int SIGN_INFO_LIST_FIELD_NUMBER = 1;
  private java.util.List<adamant.global.v1.Model.SignInfo> signInfoList_;
  /**
   * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
   */
  public java.util.List<adamant.global.v1.Model.SignInfo> getSignInfoListList() {
    return signInfoList_;
  }
  /**
   * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
   */
  public java.util.List<? extends adamant.global.v1.Model.SignInfoOrBuilder> 
      getSignInfoListOrBuilderList() {
    return signInfoList_;
  }
  /**
   * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
   */
  public int getSignInfoListCount() {
    return signInfoList_.size();
  }
  /**
   * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
   */
  public adamant.global.v1.Model.SignInfo getSignInfoList(int index) {
    return signInfoList_.get(index);
  }
  /**
   * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
   */
  public adamant.global.v1.Model.SignInfoOrBuilder getSignInfoListOrBuilder(
      int index) {
    return signInfoList_.get(index);
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
    for (int i = 0; i < signInfoList_.size(); i++) {
      output.writeMessage(1, signInfoList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < signInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, signInfoList_.get(i));
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
    if (!(obj instanceof adamant.global.v1.ListXRPInitSignInfoResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListXRPInitSignInfoResponse other = (adamant.global.v1.ListXRPInitSignInfoResponse) obj;

    if (!getSignInfoListList()
        .equals(other.getSignInfoListList())) return false;
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
    if (getSignInfoListCount() > 0) {
      hash = (37 * hash) + SIGN_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getSignInfoListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListXRPInitSignInfoResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListXRPInitSignInfoResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListXRPInitSignInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListXRPInitSignInfoResponse)
      adamant.global.v1.ListXRPInitSignInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListXRPInitSignInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListXRPInitSignInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListXRPInitSignInfoResponse.class, adamant.global.v1.ListXRPInitSignInfoResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListXRPInitSignInfoResponse.newBuilder()
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
        getSignInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (signInfoListBuilder_ == null) {
        signInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        signInfoListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListXRPInitSignInfoResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListXRPInitSignInfoResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListXRPInitSignInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListXRPInitSignInfoResponse build() {
      adamant.global.v1.ListXRPInitSignInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListXRPInitSignInfoResponse buildPartial() {
      adamant.global.v1.ListXRPInitSignInfoResponse result = new adamant.global.v1.ListXRPInitSignInfoResponse(this);
      int from_bitField0_ = bitField0_;
      if (signInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          signInfoList_ = java.util.Collections.unmodifiableList(signInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.signInfoList_ = signInfoList_;
      } else {
        result.signInfoList_ = signInfoListBuilder_.build();
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
      if (other instanceof adamant.global.v1.ListXRPInitSignInfoResponse) {
        return mergeFrom((adamant.global.v1.ListXRPInitSignInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListXRPInitSignInfoResponse other) {
      if (other == adamant.global.v1.ListXRPInitSignInfoResponse.getDefaultInstance()) return this;
      if (signInfoListBuilder_ == null) {
        if (!other.signInfoList_.isEmpty()) {
          if (signInfoList_.isEmpty()) {
            signInfoList_ = other.signInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSignInfoListIsMutable();
            signInfoList_.addAll(other.signInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.signInfoList_.isEmpty()) {
          if (signInfoListBuilder_.isEmpty()) {
            signInfoListBuilder_.dispose();
            signInfoListBuilder_ = null;
            signInfoList_ = other.signInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            signInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSignInfoListFieldBuilder() : null;
          } else {
            signInfoListBuilder_.addAllMessages(other.signInfoList_);
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
      adamant.global.v1.ListXRPInitSignInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListXRPInitSignInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<adamant.global.v1.Model.SignInfo> signInfoList_ =
      java.util.Collections.emptyList();
    private void ensureSignInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        signInfoList_ = new java.util.ArrayList<adamant.global.v1.Model.SignInfo>(signInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.SignInfo, adamant.global.v1.Model.SignInfo.Builder, adamant.global.v1.Model.SignInfoOrBuilder> signInfoListBuilder_;

    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.SignInfo> getSignInfoListList() {
      if (signInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(signInfoList_);
      } else {
        return signInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public int getSignInfoListCount() {
      if (signInfoListBuilder_ == null) {
        return signInfoList_.size();
      } else {
        return signInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public adamant.global.v1.Model.SignInfo getSignInfoList(int index) {
      if (signInfoListBuilder_ == null) {
        return signInfoList_.get(index);
      } else {
        return signInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder setSignInfoList(
        int index, adamant.global.v1.Model.SignInfo value) {
      if (signInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignInfoListIsMutable();
        signInfoList_.set(index, value);
        onChanged();
      } else {
        signInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder setSignInfoList(
        int index, adamant.global.v1.Model.SignInfo.Builder builderForValue) {
      if (signInfoListBuilder_ == null) {
        ensureSignInfoListIsMutable();
        signInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        signInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder addSignInfoList(adamant.global.v1.Model.SignInfo value) {
      if (signInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignInfoListIsMutable();
        signInfoList_.add(value);
        onChanged();
      } else {
        signInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder addSignInfoList(
        int index, adamant.global.v1.Model.SignInfo value) {
      if (signInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSignInfoListIsMutable();
        signInfoList_.add(index, value);
        onChanged();
      } else {
        signInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder addSignInfoList(
        adamant.global.v1.Model.SignInfo.Builder builderForValue) {
      if (signInfoListBuilder_ == null) {
        ensureSignInfoListIsMutable();
        signInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        signInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder addSignInfoList(
        int index, adamant.global.v1.Model.SignInfo.Builder builderForValue) {
      if (signInfoListBuilder_ == null) {
        ensureSignInfoListIsMutable();
        signInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        signInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder addAllSignInfoList(
        java.lang.Iterable<? extends adamant.global.v1.Model.SignInfo> values) {
      if (signInfoListBuilder_ == null) {
        ensureSignInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, signInfoList_);
        onChanged();
      } else {
        signInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder clearSignInfoList() {
      if (signInfoListBuilder_ == null) {
        signInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        signInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public Builder removeSignInfoList(int index) {
      if (signInfoListBuilder_ == null) {
        ensureSignInfoListIsMutable();
        signInfoList_.remove(index);
        onChanged();
      } else {
        signInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public adamant.global.v1.Model.SignInfo.Builder getSignInfoListBuilder(
        int index) {
      return getSignInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public adamant.global.v1.Model.SignInfoOrBuilder getSignInfoListOrBuilder(
        int index) {
      if (signInfoListBuilder_ == null) {
        return signInfoList_.get(index);  } else {
        return signInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public java.util.List<? extends adamant.global.v1.Model.SignInfoOrBuilder> 
         getSignInfoListOrBuilderList() {
      if (signInfoListBuilder_ != null) {
        return signInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(signInfoList_);
      }
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public adamant.global.v1.Model.SignInfo.Builder addSignInfoListBuilder() {
      return getSignInfoListFieldBuilder().addBuilder(
          adamant.global.v1.Model.SignInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public adamant.global.v1.Model.SignInfo.Builder addSignInfoListBuilder(
        int index) {
      return getSignInfoListFieldBuilder().addBuilder(
          index, adamant.global.v1.Model.SignInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .adamant.global.v1.SignInfo sign_info_list = 1;</code>
     */
    public java.util.List<adamant.global.v1.Model.SignInfo.Builder> 
         getSignInfoListBuilderList() {
      return getSignInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        adamant.global.v1.Model.SignInfo, adamant.global.v1.Model.SignInfo.Builder, adamant.global.v1.Model.SignInfoOrBuilder> 
        getSignInfoListFieldBuilder() {
      if (signInfoListBuilder_ == null) {
        signInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            adamant.global.v1.Model.SignInfo, adamant.global.v1.Model.SignInfo.Builder, adamant.global.v1.Model.SignInfoOrBuilder>(
                signInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        signInfoList_ = null;
      }
      return signInfoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListXRPInitSignInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListXRPInitSignInfoResponse)
  private static final adamant.global.v1.ListXRPInitSignInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListXRPInitSignInfoResponse();
  }

  public static adamant.global.v1.ListXRPInitSignInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListXRPInitSignInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListXRPInitSignInfoResponse>() {
    @java.lang.Override
    public ListXRPInitSignInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListXRPInitSignInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListXRPInitSignInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListXRPInitSignInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListXRPInitSignInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

