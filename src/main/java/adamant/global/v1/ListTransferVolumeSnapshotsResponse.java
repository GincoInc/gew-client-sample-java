// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
 * Protobuf type {@code adamant.global.v1.ListTransferVolumeSnapshotsResponse}
 */
public  final class ListTransferVolumeSnapshotsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:adamant.global.v1.ListTransferVolumeSnapshotsResponse)
    ListTransferVolumeSnapshotsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListTransferVolumeSnapshotsResponse.newBuilder() to construct.
  private ListTransferVolumeSnapshotsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListTransferVolumeSnapshotsResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListTransferVolumeSnapshotsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListTransferVolumeSnapshotsResponse(
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
            adamant.global.v1.Model.TransferVolumeSnapshots.Builder subBuilder = null;
            if (transferVolumeSnapshots_ != null) {
              subBuilder = transferVolumeSnapshots_.toBuilder();
            }
            transferVolumeSnapshots_ = input.readMessage(adamant.global.v1.Model.TransferVolumeSnapshots.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(transferVolumeSnapshots_);
              transferVolumeSnapshots_ = subBuilder.buildPartial();
            }

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
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListTransferVolumeSnapshotsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListTransferVolumeSnapshotsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            adamant.global.v1.ListTransferVolumeSnapshotsResponse.class, adamant.global.v1.ListTransferVolumeSnapshotsResponse.Builder.class);
  }

  public static final int TRANSFER_VOLUME_SNAPSHOTS_FIELD_NUMBER = 1;
  private adamant.global.v1.Model.TransferVolumeSnapshots transferVolumeSnapshots_;
  /**
   * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
   */
  public boolean hasTransferVolumeSnapshots() {
    return transferVolumeSnapshots_ != null;
  }
  /**
   * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
   */
  public adamant.global.v1.Model.TransferVolumeSnapshots getTransferVolumeSnapshots() {
    return transferVolumeSnapshots_ == null ? adamant.global.v1.Model.TransferVolumeSnapshots.getDefaultInstance() : transferVolumeSnapshots_;
  }
  /**
   * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
   */
  public adamant.global.v1.Model.TransferVolumeSnapshotsOrBuilder getTransferVolumeSnapshotsOrBuilder() {
    return getTransferVolumeSnapshots();
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
    if (transferVolumeSnapshots_ != null) {
      output.writeMessage(1, getTransferVolumeSnapshots());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (transferVolumeSnapshots_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getTransferVolumeSnapshots());
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
    if (!(obj instanceof adamant.global.v1.ListTransferVolumeSnapshotsResponse)) {
      return super.equals(obj);
    }
    adamant.global.v1.ListTransferVolumeSnapshotsResponse other = (adamant.global.v1.ListTransferVolumeSnapshotsResponse) obj;

    if (hasTransferVolumeSnapshots() != other.hasTransferVolumeSnapshots()) return false;
    if (hasTransferVolumeSnapshots()) {
      if (!getTransferVolumeSnapshots()
          .equals(other.getTransferVolumeSnapshots())) return false;
    }
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
    if (hasTransferVolumeSnapshots()) {
      hash = (37 * hash) + TRANSFER_VOLUME_SNAPSHOTS_FIELD_NUMBER;
      hash = (53 * hash) + getTransferVolumeSnapshots().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse parseFrom(
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
  public static Builder newBuilder(adamant.global.v1.ListTransferVolumeSnapshotsResponse prototype) {
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
   * Protobuf type {@code adamant.global.v1.ListTransferVolumeSnapshotsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:adamant.global.v1.ListTransferVolumeSnapshotsResponse)
      adamant.global.v1.ListTransferVolumeSnapshotsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListTransferVolumeSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListTransferVolumeSnapshotsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              adamant.global.v1.ListTransferVolumeSnapshotsResponse.class, adamant.global.v1.ListTransferVolumeSnapshotsResponse.Builder.class);
    }

    // Construct using adamant.global.v1.ListTransferVolumeSnapshotsResponse.newBuilder()
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
      if (transferVolumeSnapshotsBuilder_ == null) {
        transferVolumeSnapshots_ = null;
      } else {
        transferVolumeSnapshots_ = null;
        transferVolumeSnapshotsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return adamant.global.v1.GlobalAPIProto.internal_static_adamant_global_v1_ListTransferVolumeSnapshotsResponse_descriptor;
    }

    @java.lang.Override
    public adamant.global.v1.ListTransferVolumeSnapshotsResponse getDefaultInstanceForType() {
      return adamant.global.v1.ListTransferVolumeSnapshotsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public adamant.global.v1.ListTransferVolumeSnapshotsResponse build() {
      adamant.global.v1.ListTransferVolumeSnapshotsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public adamant.global.v1.ListTransferVolumeSnapshotsResponse buildPartial() {
      adamant.global.v1.ListTransferVolumeSnapshotsResponse result = new adamant.global.v1.ListTransferVolumeSnapshotsResponse(this);
      if (transferVolumeSnapshotsBuilder_ == null) {
        result.transferVolumeSnapshots_ = transferVolumeSnapshots_;
      } else {
        result.transferVolumeSnapshots_ = transferVolumeSnapshotsBuilder_.build();
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
      if (other instanceof adamant.global.v1.ListTransferVolumeSnapshotsResponse) {
        return mergeFrom((adamant.global.v1.ListTransferVolumeSnapshotsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(adamant.global.v1.ListTransferVolumeSnapshotsResponse other) {
      if (other == adamant.global.v1.ListTransferVolumeSnapshotsResponse.getDefaultInstance()) return this;
      if (other.hasTransferVolumeSnapshots()) {
        mergeTransferVolumeSnapshots(other.getTransferVolumeSnapshots());
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
      adamant.global.v1.ListTransferVolumeSnapshotsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (adamant.global.v1.ListTransferVolumeSnapshotsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private adamant.global.v1.Model.TransferVolumeSnapshots transferVolumeSnapshots_;
    private com.google.protobuf.SingleFieldBuilderV3<
        adamant.global.v1.Model.TransferVolumeSnapshots, adamant.global.v1.Model.TransferVolumeSnapshots.Builder, adamant.global.v1.Model.TransferVolumeSnapshotsOrBuilder> transferVolumeSnapshotsBuilder_;
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public boolean hasTransferVolumeSnapshots() {
      return transferVolumeSnapshotsBuilder_ != null || transferVolumeSnapshots_ != null;
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public adamant.global.v1.Model.TransferVolumeSnapshots getTransferVolumeSnapshots() {
      if (transferVolumeSnapshotsBuilder_ == null) {
        return transferVolumeSnapshots_ == null ? adamant.global.v1.Model.TransferVolumeSnapshots.getDefaultInstance() : transferVolumeSnapshots_;
      } else {
        return transferVolumeSnapshotsBuilder_.getMessage();
      }
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public Builder setTransferVolumeSnapshots(adamant.global.v1.Model.TransferVolumeSnapshots value) {
      if (transferVolumeSnapshotsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        transferVolumeSnapshots_ = value;
        onChanged();
      } else {
        transferVolumeSnapshotsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public Builder setTransferVolumeSnapshots(
        adamant.global.v1.Model.TransferVolumeSnapshots.Builder builderForValue) {
      if (transferVolumeSnapshotsBuilder_ == null) {
        transferVolumeSnapshots_ = builderForValue.build();
        onChanged();
      } else {
        transferVolumeSnapshotsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public Builder mergeTransferVolumeSnapshots(adamant.global.v1.Model.TransferVolumeSnapshots value) {
      if (transferVolumeSnapshotsBuilder_ == null) {
        if (transferVolumeSnapshots_ != null) {
          transferVolumeSnapshots_ =
            adamant.global.v1.Model.TransferVolumeSnapshots.newBuilder(transferVolumeSnapshots_).mergeFrom(value).buildPartial();
        } else {
          transferVolumeSnapshots_ = value;
        }
        onChanged();
      } else {
        transferVolumeSnapshotsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public Builder clearTransferVolumeSnapshots() {
      if (transferVolumeSnapshotsBuilder_ == null) {
        transferVolumeSnapshots_ = null;
        onChanged();
      } else {
        transferVolumeSnapshots_ = null;
        transferVolumeSnapshotsBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public adamant.global.v1.Model.TransferVolumeSnapshots.Builder getTransferVolumeSnapshotsBuilder() {
      
      onChanged();
      return getTransferVolumeSnapshotsFieldBuilder().getBuilder();
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    public adamant.global.v1.Model.TransferVolumeSnapshotsOrBuilder getTransferVolumeSnapshotsOrBuilder() {
      if (transferVolumeSnapshotsBuilder_ != null) {
        return transferVolumeSnapshotsBuilder_.getMessageOrBuilder();
      } else {
        return transferVolumeSnapshots_ == null ?
            adamant.global.v1.Model.TransferVolumeSnapshots.getDefaultInstance() : transferVolumeSnapshots_;
      }
    }
    /**
     * <code>.adamant.global.v1.TransferVolumeSnapshots transfer_volume_snapshots = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        adamant.global.v1.Model.TransferVolumeSnapshots, adamant.global.v1.Model.TransferVolumeSnapshots.Builder, adamant.global.v1.Model.TransferVolumeSnapshotsOrBuilder> 
        getTransferVolumeSnapshotsFieldBuilder() {
      if (transferVolumeSnapshotsBuilder_ == null) {
        transferVolumeSnapshotsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            adamant.global.v1.Model.TransferVolumeSnapshots, adamant.global.v1.Model.TransferVolumeSnapshots.Builder, adamant.global.v1.Model.TransferVolumeSnapshotsOrBuilder>(
                getTransferVolumeSnapshots(),
                getParentForChildren(),
                isClean());
        transferVolumeSnapshots_ = null;
      }
      return transferVolumeSnapshotsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:adamant.global.v1.ListTransferVolumeSnapshotsResponse)
  }

  // @@protoc_insertion_point(class_scope:adamant.global.v1.ListTransferVolumeSnapshotsResponse)
  private static final adamant.global.v1.ListTransferVolumeSnapshotsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new adamant.global.v1.ListTransferVolumeSnapshotsResponse();
  }

  public static adamant.global.v1.ListTransferVolumeSnapshotsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListTransferVolumeSnapshotsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListTransferVolumeSnapshotsResponse>() {
    @java.lang.Override
    public ListTransferVolumeSnapshotsResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListTransferVolumeSnapshotsResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListTransferVolumeSnapshotsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListTransferVolumeSnapshotsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public adamant.global.v1.ListTransferVolumeSnapshotsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

