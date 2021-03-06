// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opensergo/proto/service_contract/v1/service_contract.proto

package io.opensergo.proto.service_contract.v1;

/**
 * Protobuf type {@code opensergo.proto.service_contract.v1.EnumValueOptions}
 */
public final class EnumValueOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:opensergo.proto.service_contract.v1.EnumValueOptions)
    EnumValueOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EnumValueOptions.newBuilder() to construct.
  private EnumValueOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnumValueOptions() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EnumValueOptions();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EnumValueOptions(
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
          case 8: {
            bitField0_ |= 0x00000001;
            deprecated_ = input.readBool();
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
    return io.opensergo.proto.service_contract.v1.ServiceContractProto.internal_static_opensergo_proto_service_contract_v1_EnumValueOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opensergo.proto.service_contract.v1.ServiceContractProto.internal_static_opensergo_proto_service_contract_v1_EnumValueOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opensergo.proto.service_contract.v1.EnumValueOptions.class, io.opensergo.proto.service_contract.v1.EnumValueOptions.Builder.class);
  }

  private int bitField0_;
  public static final int DEPRECATED_FIELD_NUMBER = 1;
  private boolean deprecated_;
  /**
   * <pre>
   * Is this enum value deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum value, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating enum values.
   * </pre>
   *
   * <code>optional bool deprecated = 1;</code>
   * @return Whether the deprecated field is set.
   */
  @java.lang.Override
  public boolean hasDeprecated() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * Is this enum value deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for the enum value, or it will be completely ignored; in the very least,
   * this is a formalization for deprecating enum values.
   * </pre>
   *
   * <code>optional bool deprecated = 1;</code>
   * @return The deprecated.
   */
  @java.lang.Override
  public boolean getDeprecated() {
    return deprecated_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(1, deprecated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, deprecated_);
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
    if (!(obj instanceof io.opensergo.proto.service_contract.v1.EnumValueOptions)) {
      return super.equals(obj);
    }
    io.opensergo.proto.service_contract.v1.EnumValueOptions other = (io.opensergo.proto.service_contract.v1.EnumValueOptions) obj;

    if (hasDeprecated() != other.hasDeprecated()) return false;
    if (hasDeprecated()) {
      if (getDeprecated()
          != other.getDeprecated()) return false;
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
    if (hasDeprecated()) {
      hash = (37 * hash) + DEPRECATED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getDeprecated());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opensergo.proto.service_contract.v1.EnumValueOptions parseFrom(
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
  public static Builder newBuilder(io.opensergo.proto.service_contract.v1.EnumValueOptions prototype) {
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
   * Protobuf type {@code opensergo.proto.service_contract.v1.EnumValueOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:opensergo.proto.service_contract.v1.EnumValueOptions)
      io.opensergo.proto.service_contract.v1.EnumValueOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opensergo.proto.service_contract.v1.ServiceContractProto.internal_static_opensergo_proto_service_contract_v1_EnumValueOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opensergo.proto.service_contract.v1.ServiceContractProto.internal_static_opensergo_proto_service_contract_v1_EnumValueOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opensergo.proto.service_contract.v1.EnumValueOptions.class, io.opensergo.proto.service_contract.v1.EnumValueOptions.Builder.class);
    }

    // Construct using io.opensergo.proto.service_contract.v1.EnumValueOptions.newBuilder()
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
      deprecated_ = false;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opensergo.proto.service_contract.v1.ServiceContractProto.internal_static_opensergo_proto_service_contract_v1_EnumValueOptions_descriptor;
    }

    @java.lang.Override
    public io.opensergo.proto.service_contract.v1.EnumValueOptions getDefaultInstanceForType() {
      return io.opensergo.proto.service_contract.v1.EnumValueOptions.getDefaultInstance();
    }

    @java.lang.Override
    public io.opensergo.proto.service_contract.v1.EnumValueOptions build() {
      io.opensergo.proto.service_contract.v1.EnumValueOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opensergo.proto.service_contract.v1.EnumValueOptions buildPartial() {
      io.opensergo.proto.service_contract.v1.EnumValueOptions result = new io.opensergo.proto.service_contract.v1.EnumValueOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deprecated_ = deprecated_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof io.opensergo.proto.service_contract.v1.EnumValueOptions) {
        return mergeFrom((io.opensergo.proto.service_contract.v1.EnumValueOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opensergo.proto.service_contract.v1.EnumValueOptions other) {
      if (other == io.opensergo.proto.service_contract.v1.EnumValueOptions.getDefaultInstance()) return this;
      if (other.hasDeprecated()) {
        setDeprecated(other.getDeprecated());
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
      io.opensergo.proto.service_contract.v1.EnumValueOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.opensergo.proto.service_contract.v1.EnumValueOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean deprecated_ ;
    /**
     * <pre>
     * Is this enum value deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum value, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating enum values.
     * </pre>
     *
     * <code>optional bool deprecated = 1;</code>
     * @return Whether the deprecated field is set.
     */
    @java.lang.Override
    public boolean hasDeprecated() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Is this enum value deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum value, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating enum values.
     * </pre>
     *
     * <code>optional bool deprecated = 1;</code>
     * @return The deprecated.
     */
    @java.lang.Override
    public boolean getDeprecated() {
      return deprecated_;
    }
    /**
     * <pre>
     * Is this enum value deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum value, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating enum values.
     * </pre>
     *
     * <code>optional bool deprecated = 1;</code>
     * @param value The deprecated to set.
     * @return This builder for chaining.
     */
    public Builder setDeprecated(boolean value) {
      bitField0_ |= 0x00000001;
      deprecated_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Is this enum value deprecated?
     * Depending on the target platform, this can emit Deprecated annotations
     * for the enum value, or it will be completely ignored; in the very least,
     * this is a formalization for deprecating enum values.
     * </pre>
     *
     * <code>optional bool deprecated = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeprecated() {
      bitField0_ = (bitField0_ & ~0x00000001);
      deprecated_ = false;
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


    // @@protoc_insertion_point(builder_scope:opensergo.proto.service_contract.v1.EnumValueOptions)
  }

  // @@protoc_insertion_point(class_scope:opensergo.proto.service_contract.v1.EnumValueOptions)
  private static final io.opensergo.proto.service_contract.v1.EnumValueOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opensergo.proto.service_contract.v1.EnumValueOptions();
  }

  public static io.opensergo.proto.service_contract.v1.EnumValueOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnumValueOptions>
      PARSER = new com.google.protobuf.AbstractParser<EnumValueOptions>() {
    @java.lang.Override
    public EnumValueOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EnumValueOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnumValueOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnumValueOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opensergo.proto.service_contract.v1.EnumValueOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

