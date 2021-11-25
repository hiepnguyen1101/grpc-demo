// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moviefinder/common/common.proto

package me.hiepdev.moviefinder.common;

/**
 * Protobuf type {@code common.Movie}
 */
public final class Movie extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:common.Movie)
    MovieOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Movie.newBuilder() to construct.
  private Movie(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Movie() {
    title_ = "";
    genre_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Movie();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Movie(
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

            title_ = s;
            break;
          }
          case 21: {

            rating_ = input.readFloat();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            genre_ = rawValue;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            description_ = s;
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
    return me.hiepdev.moviefinder.common.Common.internal_static_common_Movie_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return me.hiepdev.moviefinder.common.Common.internal_static_common_Movie_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            me.hiepdev.moviefinder.common.Movie.class, me.hiepdev.moviefinder.common.Movie.Builder.class);
  }

  public static final int TITLE_FIELD_NUMBER = 1;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 1;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 1;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RATING_FIELD_NUMBER = 2;
  private float rating_;
  /**
   * <code>float rating = 2;</code>
   * @return The rating.
   */
  @java.lang.Override
  public float getRating() {
    return rating_;
  }

  public static final int GENRE_FIELD_NUMBER = 3;
  private int genre_;
  /**
   * <code>.common.Genre genre = 3;</code>
   * @return The enum numeric value on the wire for genre.
   */
  @java.lang.Override public int getGenreValue() {
    return genre_;
  }
  /**
   * <code>.common.Genre genre = 3;</code>
   * @return The genre.
   */
  @java.lang.Override public me.hiepdev.moviefinder.common.Genre getGenre() {
    @SuppressWarnings("deprecation")
    me.hiepdev.moviefinder.common.Genre result = me.hiepdev.moviefinder.common.Genre.valueOf(genre_);
    return result == null ? me.hiepdev.moviefinder.common.Genre.UNRECOGNIZED : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object description_;
  /**
   * <code>string description = 4;</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 4;</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
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
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, title_);
    }
    if (rating_ != 0F) {
      output.writeFloat(2, rating_);
    }
    if (genre_ != me.hiepdev.moviefinder.common.Genre.COMEDY.getNumber()) {
      output.writeEnum(3, genre_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, title_);
    }
    if (rating_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, rating_);
    }
    if (genre_ != me.hiepdev.moviefinder.common.Genre.COMEDY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, genre_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, description_);
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
    if (!(obj instanceof me.hiepdev.moviefinder.common.Movie)) {
      return super.equals(obj);
    }
    me.hiepdev.moviefinder.common.Movie other = (me.hiepdev.moviefinder.common.Movie) obj;

    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (java.lang.Float.floatToIntBits(getRating())
        != java.lang.Float.floatToIntBits(
            other.getRating())) return false;
    if (genre_ != other.genre_) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
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
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + RATING_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getRating());
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + genre_;
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.common.Movie parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.common.Movie parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.common.Movie parseFrom(
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
  public static Builder newBuilder(me.hiepdev.moviefinder.common.Movie prototype) {
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
   * Protobuf type {@code common.Movie}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:common.Movie)
      me.hiepdev.moviefinder.common.MovieOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.hiepdev.moviefinder.common.Common.internal_static_common_Movie_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.hiepdev.moviefinder.common.Common.internal_static_common_Movie_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.hiepdev.moviefinder.common.Movie.class, me.hiepdev.moviefinder.common.Movie.Builder.class);
    }

    // Construct using me.hiepdev.moviefinder.common.Movie.newBuilder()
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
      title_ = "";

      rating_ = 0F;

      genre_ = 0;

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return me.hiepdev.moviefinder.common.Common.internal_static_common_Movie_descriptor;
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.common.Movie getDefaultInstanceForType() {
      return me.hiepdev.moviefinder.common.Movie.getDefaultInstance();
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.common.Movie build() {
      me.hiepdev.moviefinder.common.Movie result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.common.Movie buildPartial() {
      me.hiepdev.moviefinder.common.Movie result = new me.hiepdev.moviefinder.common.Movie(this);
      result.title_ = title_;
      result.rating_ = rating_;
      result.genre_ = genre_;
      result.description_ = description_;
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
      if (other instanceof me.hiepdev.moviefinder.common.Movie) {
        return mergeFrom((me.hiepdev.moviefinder.common.Movie)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(me.hiepdev.moviefinder.common.Movie other) {
      if (other == me.hiepdev.moviefinder.common.Movie.getDefaultInstance()) return this;
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (other.getRating() != 0F) {
        setRating(other.getRating());
      }
      if (other.genre_ != 0) {
        setGenreValue(other.getGenreValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
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
      me.hiepdev.moviefinder.common.Movie parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (me.hiepdev.moviefinder.common.Movie) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 1;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
        getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 1;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      
      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 1;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      title_ = value;
      onChanged();
      return this;
    }

    private float rating_ ;
    /**
     * <code>float rating = 2;</code>
     * @return The rating.
     */
    @java.lang.Override
    public float getRating() {
      return rating_;
    }
    /**
     * <code>float rating = 2;</code>
     * @param value The rating to set.
     * @return This builder for chaining.
     */
    public Builder setRating(float value) {
      
      rating_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float rating = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRating() {
      
      rating_ = 0F;
      onChanged();
      return this;
    }

    private int genre_ = 0;
    /**
     * <code>.common.Genre genre = 3;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>.common.Genre genre = 3;</code>
     * @param value The enum numeric value on the wire for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreValue(int value) {
      
      genre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 3;</code>
     * @return The genre.
     */
    @java.lang.Override
    public me.hiepdev.moviefinder.common.Genre getGenre() {
      @SuppressWarnings("deprecation")
      me.hiepdev.moviefinder.common.Genre result = me.hiepdev.moviefinder.common.Genre.valueOf(genre_);
      return result == null ? me.hiepdev.moviefinder.common.Genre.UNRECOGNIZED : result;
    }
    /**
     * <code>.common.Genre genre = 3;</code>
     * @param value The genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenre(me.hiepdev.moviefinder.common.Genre value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      genre_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.common.Genre genre = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenre() {
      
      genre_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 4;</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 4;</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      description_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      
      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     * <code>string description = 4;</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      description_ = value;
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


    // @@protoc_insertion_point(builder_scope:common.Movie)
  }

  // @@protoc_insertion_point(class_scope:common.Movie)
  private static final me.hiepdev.moviefinder.common.Movie DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new me.hiepdev.moviefinder.common.Movie();
  }

  public static me.hiepdev.moviefinder.common.Movie getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Movie>
      PARSER = new com.google.protobuf.AbstractParser<Movie>() {
    @java.lang.Override
    public Movie parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Movie(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Movie> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Movie> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public me.hiepdev.moviefinder.common.Movie getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

