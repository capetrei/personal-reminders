// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Grocery.proto

package personal.reminders.server.proto;

/**
 * Protobuf type {@code personal.reminders.server.proto.GroceryProto}
 */
public final class GroceryProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:personal.reminders.server.proto.GroceryProto)
    GroceryProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GroceryProto.newBuilder() to construct.
  private GroceryProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GroceryProto() {
    item_ = "";
    shopURL_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GroceryProto();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return personal.reminders.server.proto.GroceryOuterClass.internal_static_personal_reminders_server_proto_GroceryProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return personal.reminders.server.proto.GroceryOuterClass.internal_static_personal_reminders_server_proto_GroceryProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            personal.reminders.server.proto.GroceryProto.class, personal.reminders.server.proto.GroceryProto.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int ITEM_FIELD_NUMBER = 2;
  private volatile java.lang.Object item_;
  /**
   * <code>string item = 2;</code>
   * @return The item.
   */
  @java.lang.Override
  public java.lang.String getItem() {
    java.lang.Object ref = item_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      item_ = s;
      return s;
    }
  }
  /**
   * <code>string item = 2;</code>
   * @return The bytes for item.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getItemBytes() {
    java.lang.Object ref = item_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      item_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SHOPURL_FIELD_NUMBER = 3;
  private volatile java.lang.Object shopURL_;
  /**
   * <code>string shopURL = 3;</code>
   * @return The shopURL.
   */
  @java.lang.Override
  public java.lang.String getShopURL() {
    java.lang.Object ref = shopURL_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      shopURL_ = s;
      return s;
    }
  }
  /**
   * <code>string shopURL = 3;</code>
   * @return The bytes for shopURL.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getShopURLBytes() {
    java.lang.Object ref = shopURL_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      shopURL_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(item_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, item_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shopURL_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, shopURL_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(item_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, item_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(shopURL_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, shopURL_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof personal.reminders.server.proto.GroceryProto)) {
      return super.equals(obj);
    }
    personal.reminders.server.proto.GroceryProto other = (personal.reminders.server.proto.GroceryProto) obj;

    if (getId()
        != other.getId()) return false;
    if (!getItem()
        .equals(other.getItem())) return false;
    if (!getShopURL()
        .equals(other.getShopURL())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + ITEM_FIELD_NUMBER;
    hash = (53 * hash) + getItem().hashCode();
    hash = (37 * hash) + SHOPURL_FIELD_NUMBER;
    hash = (53 * hash) + getShopURL().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static personal.reminders.server.proto.GroceryProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static personal.reminders.server.proto.GroceryProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static personal.reminders.server.proto.GroceryProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static personal.reminders.server.proto.GroceryProto parseFrom(
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
  public static Builder newBuilder(personal.reminders.server.proto.GroceryProto prototype) {
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
   * Protobuf type {@code personal.reminders.server.proto.GroceryProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:personal.reminders.server.proto.GroceryProto)
      personal.reminders.server.proto.GroceryProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return personal.reminders.server.proto.GroceryOuterClass.internal_static_personal_reminders_server_proto_GroceryProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return personal.reminders.server.proto.GroceryOuterClass.internal_static_personal_reminders_server_proto_GroceryProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              personal.reminders.server.proto.GroceryProto.class, personal.reminders.server.proto.GroceryProto.Builder.class);
    }

    // Construct using personal.reminders.server.proto.GroceryProto.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      item_ = "";

      shopURL_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return personal.reminders.server.proto.GroceryOuterClass.internal_static_personal_reminders_server_proto_GroceryProto_descriptor;
    }

    @java.lang.Override
    public personal.reminders.server.proto.GroceryProto getDefaultInstanceForType() {
      return personal.reminders.server.proto.GroceryProto.getDefaultInstance();
    }

    @java.lang.Override
    public personal.reminders.server.proto.GroceryProto build() {
      personal.reminders.server.proto.GroceryProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public personal.reminders.server.proto.GroceryProto buildPartial() {
      personal.reminders.server.proto.GroceryProto result = new personal.reminders.server.proto.GroceryProto(this);
      result.id_ = id_;
      result.item_ = item_;
      result.shopURL_ = shopURL_;
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
      if (other instanceof personal.reminders.server.proto.GroceryProto) {
        return mergeFrom((personal.reminders.server.proto.GroceryProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(personal.reminders.server.proto.GroceryProto other) {
      if (other == personal.reminders.server.proto.GroceryProto.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getItem().isEmpty()) {
        item_ = other.item_;
        onChanged();
      }
      if (!other.getShopURL().isEmpty()) {
        shopURL_ = other.shopURL_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              id_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              item_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              shopURL_ = input.readStringRequireUtf8();

              break;
            } // case 26
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object item_ = "";
    /**
     * <code>string item = 2;</code>
     * @return The item.
     */
    public java.lang.String getItem() {
      java.lang.Object ref = item_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        item_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string item = 2;</code>
     * @return The bytes for item.
     */
    public com.google.protobuf.ByteString
        getItemBytes() {
      java.lang.Object ref = item_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        item_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string item = 2;</code>
     * @param value The item to set.
     * @return This builder for chaining.
     */
    public Builder setItem(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      item_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string item = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearItem() {
      
      item_ = getDefaultInstance().getItem();
      onChanged();
      return this;
    }
    /**
     * <code>string item = 2;</code>
     * @param value The bytes for item to set.
     * @return This builder for chaining.
     */
    public Builder setItemBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      item_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object shopURL_ = "";
    /**
     * <code>string shopURL = 3;</code>
     * @return The shopURL.
     */
    public java.lang.String getShopURL() {
      java.lang.Object ref = shopURL_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        shopURL_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string shopURL = 3;</code>
     * @return The bytes for shopURL.
     */
    public com.google.protobuf.ByteString
        getShopURLBytes() {
      java.lang.Object ref = shopURL_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        shopURL_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string shopURL = 3;</code>
     * @param value The shopURL to set.
     * @return This builder for chaining.
     */
    public Builder setShopURL(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      shopURL_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string shopURL = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearShopURL() {
      
      shopURL_ = getDefaultInstance().getShopURL();
      onChanged();
      return this;
    }
    /**
     * <code>string shopURL = 3;</code>
     * @param value The bytes for shopURL to set.
     * @return This builder for chaining.
     */
    public Builder setShopURLBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      shopURL_ = value;
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


    // @@protoc_insertion_point(builder_scope:personal.reminders.server.proto.GroceryProto)
  }

  // @@protoc_insertion_point(class_scope:personal.reminders.server.proto.GroceryProto)
  private static final personal.reminders.server.proto.GroceryProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new personal.reminders.server.proto.GroceryProto();
  }

  public static personal.reminders.server.proto.GroceryProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GroceryProto>
      PARSER = new com.google.protobuf.AbstractParser<GroceryProto>() {
    @java.lang.Override
    public GroceryProto parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GroceryProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GroceryProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public personal.reminders.server.proto.GroceryProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

