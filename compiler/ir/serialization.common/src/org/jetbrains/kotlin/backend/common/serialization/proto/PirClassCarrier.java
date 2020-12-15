// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier}
 */
public final class PirClassCarrier extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier)
    PirClassCarrierOrBuilder {
  // Use PirClassCarrier.newBuilder() to construct.
  private PirClassCarrier(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private PirClassCarrier(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final PirClassCarrier defaultInstance;
  public static PirClassCarrier getDefaultInstance() {
    return defaultInstance;
  }

  public PirClassCarrier getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private PirClassCarrier(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            lastModified_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            parentSymbol_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            origin_ = input.readInt32();
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              annotation_ = new java.util.ArrayList<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall>();
              mutable_bitField0_ |= 0x00000008;
            }
            annotation_.add(input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall.PARSER, extensionRegistry));
            break;
          }
          case 40: {
            bitField0_ |= 0x00000008;
            thisReceiver_ = input.readInt64();
            break;
          }
          case 48: {
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
              typeParameters_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000020;
            }
            typeParameters_.add(input.readInt64());
            break;
          }
          case 50: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
              typeParameters_ = new java.util.ArrayList<java.lang.Long>();
              mutable_bitField0_ |= 0x00000020;
            }
            while (input.getBytesUntilLimit() > 0) {
              typeParameters_.add(input.readInt64());
            }
            input.popLimit(limit);
            break;
          }
          case 56: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              superTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000040;
            }
            superTypes_.add(input.readInt32());
            break;
          }
          case 58: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040) && input.getBytesUntilLimit() > 0) {
              superTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000040;
            }
            while (input.getBytesUntilLimit() > 0) {
              superTypes_.add(input.readInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 64: {
            bitField0_ |= 0x00000010;
            flags_ = input.readInt64();
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        annotation_ = java.util.Collections.unmodifiableList(annotation_);
      }
      if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
        typeParameters_ = java.util.Collections.unmodifiableList(typeParameters_);
      }
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        superTypes_ = java.util.Collections.unmodifiableList(superTypes_);
      }
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<PirClassCarrier> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<PirClassCarrier>() {
    public PirClassCarrier parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new PirClassCarrier(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<PirClassCarrier> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int LASTMODIFIED_FIELD_NUMBER = 1;
  private int lastModified_;
  /**
   * <code>required int32 lastModified = 1;</code>
   */
  public boolean hasLastModified() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 lastModified = 1;</code>
   */
  public int getLastModified() {
    return lastModified_;
  }

  public static final int PARENTSYMBOL_FIELD_NUMBER = 2;
  private long parentSymbol_;
  /**
   * <code>optional int64 parentSymbol = 2;</code>
   */
  public boolean hasParentSymbol() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int64 parentSymbol = 2;</code>
   */
  public long getParentSymbol() {
    return parentSymbol_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 3;
  private int origin_;
  /**
   * <code>optional int32 origin = 3;</code>
   */
  public boolean hasOrigin() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 origin = 3;</code>
   */
  public int getOrigin() {
    return origin_;
  }

  public static final int ANNOTATION_FIELD_NUMBER = 4;
  private java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> annotation_;
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  public java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> getAnnotationList() {
    return annotation_;
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  public java.util.List<? extends org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCallOrBuilder> 
      getAnnotationOrBuilderList() {
    return annotation_;
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  public int getAnnotationCount() {
    return annotation_.size();
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall getAnnotation(int index) {
    return annotation_.get(index);
  }
  /**
   * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCallOrBuilder getAnnotationOrBuilder(
      int index) {
    return annotation_.get(index);
  }

  public static final int THISRECEIVER_FIELD_NUMBER = 5;
  private long thisReceiver_;
  /**
   * <code>optional int64 thisReceiver = 5;</code>
   */
  public boolean hasThisReceiver() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional int64 thisReceiver = 5;</code>
   */
  public long getThisReceiver() {
    return thisReceiver_;
  }

  public static final int TYPEPARAMETERS_FIELD_NUMBER = 6;
  private java.util.List<java.lang.Long> typeParameters_;
  /**
   * <code>repeated int64 typeParameters = 6;</code>
   */
  public java.util.List<java.lang.Long>
      getTypeParametersList() {
    return typeParameters_;
  }
  /**
   * <code>repeated int64 typeParameters = 6;</code>
   */
  public int getTypeParametersCount() {
    return typeParameters_.size();
  }
  /**
   * <code>repeated int64 typeParameters = 6;</code>
   */
  public long getTypeParameters(int index) {
    return typeParameters_.get(index);
  }

  public static final int SUPERTYPES_FIELD_NUMBER = 7;
  private java.util.List<java.lang.Integer> superTypes_;
  /**
   * <code>repeated int32 superTypes = 7;</code>
   */
  public java.util.List<java.lang.Integer>
      getSuperTypesList() {
    return superTypes_;
  }
  /**
   * <code>repeated int32 superTypes = 7;</code>
   */
  public int getSuperTypesCount() {
    return superTypes_.size();
  }
  /**
   * <code>repeated int32 superTypes = 7;</code>
   */
  public int getSuperTypes(int index) {
    return superTypes_.get(index);
  }

  public static final int FLAGS_FIELD_NUMBER = 8;
  private long flags_;
  /**
   * <code>optional int64 flags = 8 [default = 0];</code>
   */
  public boolean hasFlags() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional int64 flags = 8 [default = 0];</code>
   */
  public long getFlags() {
    return flags_;
  }

  private void initFields() {
    lastModified_ = 0;
    parentSymbol_ = 0L;
    origin_ = 0;
    annotation_ = java.util.Collections.emptyList();
    thisReceiver_ = 0L;
    typeParameters_ = java.util.Collections.emptyList();
    superTypes_ = java.util.Collections.emptyList();
    flags_ = 0L;
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasLastModified()) {
      memoizedIsInitialized = 0;
      return false;
    }
    for (int i = 0; i < getAnnotationCount(); i++) {
      if (!getAnnotation(i).isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, lastModified_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt64(2, parentSymbol_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, origin_);
    }
    for (int i = 0; i < annotation_.size(); i++) {
      output.writeMessage(4, annotation_.get(i));
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt64(5, thisReceiver_);
    }
    for (int i = 0; i < typeParameters_.size(); i++) {
      output.writeInt64(6, typeParameters_.get(i));
    }
    for (int i = 0; i < superTypes_.size(); i++) {
      output.writeInt32(7, superTypes_.get(i));
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeInt64(8, flags_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(1, lastModified_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt64Size(2, parentSymbol_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(3, origin_);
    }
    for (int i = 0; i < annotation_.size(); i++) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(4, annotation_.get(i));
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt64Size(5, thisReceiver_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < typeParameters_.size(); i++) {
        dataSize += org.jetbrains.kotlin.protobuf.CodedOutputStream
          .computeInt64SizeNoTag(typeParameters_.get(i));
      }
      size += dataSize;
      size += 1 * getTypeParametersList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < superTypes_.size(); i++) {
        dataSize += org.jetbrains.kotlin.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(superTypes_.get(i));
      }
      size += dataSize;
      size += 1 * getSuperTypesList().size();
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt64Size(8, flags_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier)
      org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrierOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      lastModified_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      parentSymbol_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      origin_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      annotation_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);
      thisReceiver_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000010);
      typeParameters_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      superTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000040);
      flags_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000080);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier result = new org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.lastModified_ = lastModified_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.parentSymbol_ = parentSymbol_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.origin_ = origin_;
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        annotation_ = java.util.Collections.unmodifiableList(annotation_);
        bitField0_ = (bitField0_ & ~0x00000008);
      }
      result.annotation_ = annotation_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000008;
      }
      result.thisReceiver_ = thisReceiver_;
      if (((bitField0_ & 0x00000020) == 0x00000020)) {
        typeParameters_ = java.util.Collections.unmodifiableList(typeParameters_);
        bitField0_ = (bitField0_ & ~0x00000020);
      }
      result.typeParameters_ = typeParameters_;
      if (((bitField0_ & 0x00000040) == 0x00000040)) {
        superTypes_ = java.util.Collections.unmodifiableList(superTypes_);
        bitField0_ = (bitField0_ & ~0x00000040);
      }
      result.superTypes_ = superTypes_;
      if (((from_bitField0_ & 0x00000080) == 0x00000080)) {
        to_bitField0_ |= 0x00000010;
      }
      result.flags_ = flags_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier.getDefaultInstance()) return this;
      if (other.hasLastModified()) {
        setLastModified(other.getLastModified());
      }
      if (other.hasParentSymbol()) {
        setParentSymbol(other.getParentSymbol());
      }
      if (other.hasOrigin()) {
        setOrigin(other.getOrigin());
      }
      if (!other.annotation_.isEmpty()) {
        if (annotation_.isEmpty()) {
          annotation_ = other.annotation_;
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          ensureAnnotationIsMutable();
          annotation_.addAll(other.annotation_);
        }
        
      }
      if (other.hasThisReceiver()) {
        setThisReceiver(other.getThisReceiver());
      }
      if (!other.typeParameters_.isEmpty()) {
        if (typeParameters_.isEmpty()) {
          typeParameters_ = other.typeParameters_;
          bitField0_ = (bitField0_ & ~0x00000020);
        } else {
          ensureTypeParametersIsMutable();
          typeParameters_.addAll(other.typeParameters_);
        }
        
      }
      if (!other.superTypes_.isEmpty()) {
        if (superTypes_.isEmpty()) {
          superTypes_ = other.superTypes_;
          bitField0_ = (bitField0_ & ~0x00000040);
        } else {
          ensureSuperTypesIsMutable();
          superTypes_.addAll(other.superTypes_);
        }
        
      }
      if (other.hasFlags()) {
        setFlags(other.getFlags());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasLastModified()) {
        
        return false;
      }
      for (int i = 0; i < getAnnotationCount(); i++) {
        if (!getAnnotation(i).isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int lastModified_ ;
    /**
     * <code>required int32 lastModified = 1;</code>
     */
    public boolean hasLastModified() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 lastModified = 1;</code>
     */
    public int getLastModified() {
      return lastModified_;
    }
    /**
     * <code>required int32 lastModified = 1;</code>
     */
    public Builder setLastModified(int value) {
      bitField0_ |= 0x00000001;
      lastModified_ = value;
      
      return this;
    }
    /**
     * <code>required int32 lastModified = 1;</code>
     */
    public Builder clearLastModified() {
      bitField0_ = (bitField0_ & ~0x00000001);
      lastModified_ = 0;
      
      return this;
    }

    private long parentSymbol_ ;
    /**
     * <code>optional int64 parentSymbol = 2;</code>
     */
    public boolean hasParentSymbol() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int64 parentSymbol = 2;</code>
     */
    public long getParentSymbol() {
      return parentSymbol_;
    }
    /**
     * <code>optional int64 parentSymbol = 2;</code>
     */
    public Builder setParentSymbol(long value) {
      bitField0_ |= 0x00000002;
      parentSymbol_ = value;
      
      return this;
    }
    /**
     * <code>optional int64 parentSymbol = 2;</code>
     */
    public Builder clearParentSymbol() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parentSymbol_ = 0L;
      
      return this;
    }

    private int origin_ ;
    /**
     * <code>optional int32 origin = 3;</code>
     */
    public boolean hasOrigin() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 origin = 3;</code>
     */
    public int getOrigin() {
      return origin_;
    }
    /**
     * <code>optional int32 origin = 3;</code>
     */
    public Builder setOrigin(int value) {
      bitField0_ |= 0x00000004;
      origin_ = value;
      
      return this;
    }
    /**
     * <code>optional int32 origin = 3;</code>
     */
    public Builder clearOrigin() {
      bitField0_ = (bitField0_ & ~0x00000004);
      origin_ = 0;
      
      return this;
    }

    private java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> annotation_ =
      java.util.Collections.emptyList();
    private void ensureAnnotationIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        annotation_ = new java.util.ArrayList<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall>(annotation_);
        bitField0_ |= 0x00000008;
       }
    }

    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public java.util.List<org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> getAnnotationList() {
      return java.util.Collections.unmodifiableList(annotation_);
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public int getAnnotationCount() {
      return annotation_.size();
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall getAnnotation(int index) {
      return annotation_.get(index);
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder setAnnotation(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAnnotationIsMutable();
      annotation_.set(index, value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder setAnnotation(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall.Builder builderForValue) {
      ensureAnnotationIsMutable();
      annotation_.set(index, builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder addAnnotation(org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAnnotationIsMutable();
      annotation_.add(value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder addAnnotation(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAnnotationIsMutable();
      annotation_.add(index, value);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder addAnnotation(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall.Builder builderForValue) {
      ensureAnnotationIsMutable();
      annotation_.add(builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder addAnnotation(
        int index, org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall.Builder builderForValue) {
      ensureAnnotationIsMutable();
      annotation_.add(index, builderForValue.build());

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder addAllAnnotation(
        java.lang.Iterable<? extends org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall> values) {
      ensureAnnotationIsMutable();
      org.jetbrains.kotlin.protobuf.AbstractMessageLite.Builder.addAll(
          values, annotation_);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder clearAnnotation() {
      annotation_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000008);

      return this;
    }
    /**
     * <code>repeated .org.jetbrains.kotlin.backend.common.serialization.proto.IrConstructorCall annotation = 4;</code>
     */
    public Builder removeAnnotation(int index) {
      ensureAnnotationIsMutable();
      annotation_.remove(index);

      return this;
    }

    private long thisReceiver_ ;
    /**
     * <code>optional int64 thisReceiver = 5;</code>
     */
    public boolean hasThisReceiver() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional int64 thisReceiver = 5;</code>
     */
    public long getThisReceiver() {
      return thisReceiver_;
    }
    /**
     * <code>optional int64 thisReceiver = 5;</code>
     */
    public Builder setThisReceiver(long value) {
      bitField0_ |= 0x00000010;
      thisReceiver_ = value;
      
      return this;
    }
    /**
     * <code>optional int64 thisReceiver = 5;</code>
     */
    public Builder clearThisReceiver() {
      bitField0_ = (bitField0_ & ~0x00000010);
      thisReceiver_ = 0L;
      
      return this;
    }

    private java.util.List<java.lang.Long> typeParameters_ = java.util.Collections.emptyList();
    private void ensureTypeParametersIsMutable() {
      if (!((bitField0_ & 0x00000020) == 0x00000020)) {
        typeParameters_ = new java.util.ArrayList<java.lang.Long>(typeParameters_);
        bitField0_ |= 0x00000020;
       }
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public java.util.List<java.lang.Long>
        getTypeParametersList() {
      return java.util.Collections.unmodifiableList(typeParameters_);
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public int getTypeParametersCount() {
      return typeParameters_.size();
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public long getTypeParameters(int index) {
      return typeParameters_.get(index);
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public Builder setTypeParameters(
        int index, long value) {
      ensureTypeParametersIsMutable();
      typeParameters_.set(index, value);
      
      return this;
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public Builder addTypeParameters(long value) {
      ensureTypeParametersIsMutable();
      typeParameters_.add(value);
      
      return this;
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public Builder addAllTypeParameters(
        java.lang.Iterable<? extends java.lang.Long> values) {
      ensureTypeParametersIsMutable();
      org.jetbrains.kotlin.protobuf.AbstractMessageLite.Builder.addAll(
          values, typeParameters_);
      
      return this;
    }
    /**
     * <code>repeated int64 typeParameters = 6;</code>
     */
    public Builder clearTypeParameters() {
      typeParameters_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000020);
      
      return this;
    }

    private java.util.List<java.lang.Integer> superTypes_ = java.util.Collections.emptyList();
    private void ensureSuperTypesIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        superTypes_ = new java.util.ArrayList<java.lang.Integer>(superTypes_);
        bitField0_ |= 0x00000040;
       }
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public java.util.List<java.lang.Integer>
        getSuperTypesList() {
      return java.util.Collections.unmodifiableList(superTypes_);
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public int getSuperTypesCount() {
      return superTypes_.size();
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public int getSuperTypes(int index) {
      return superTypes_.get(index);
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public Builder setSuperTypes(
        int index, int value) {
      ensureSuperTypesIsMutable();
      superTypes_.set(index, value);
      
      return this;
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public Builder addSuperTypes(int value) {
      ensureSuperTypesIsMutable();
      superTypes_.add(value);
      
      return this;
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public Builder addAllSuperTypes(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureSuperTypesIsMutable();
      org.jetbrains.kotlin.protobuf.AbstractMessageLite.Builder.addAll(
          values, superTypes_);
      
      return this;
    }
    /**
     * <code>repeated int32 superTypes = 7;</code>
     */
    public Builder clearSuperTypes() {
      superTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000040);
      
      return this;
    }

    private long flags_ ;
    /**
     * <code>optional int64 flags = 8 [default = 0];</code>
     */
    public boolean hasFlags() {
      return ((bitField0_ & 0x00000080) == 0x00000080);
    }
    /**
     * <code>optional int64 flags = 8 [default = 0];</code>
     */
    public long getFlags() {
      return flags_;
    }
    /**
     * <code>optional int64 flags = 8 [default = 0];</code>
     */
    public Builder setFlags(long value) {
      bitField0_ |= 0x00000080;
      flags_ = value;
      
      return this;
    }
    /**
     * <code>optional int64 flags = 8 [default = 0];</code>
     */
    public Builder clearFlags() {
      bitField0_ = (bitField0_ & ~0x00000080);
      flags_ = 0L;
      
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier)
  }

  static {
    defaultInstance = new PirClassCarrier(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.PirClassCarrier)
}
