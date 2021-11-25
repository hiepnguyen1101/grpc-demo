// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moviefinder/userpreferences/userpreferences.proto

package me.hiepdev.moviefinder.userpreferences;

/**
 * Protobuf type {@code userpreferences.UserPreferencesResponse}
 */
public final class UserPreferencesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:userpreferences.UserPreferencesResponse)
    UserPreferencesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserPreferencesResponse.newBuilder() to construct.
  private UserPreferencesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserPreferencesResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserPreferencesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserPreferencesResponse(
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
            me.hiepdev.moviefinder.common.Movie.Builder subBuilder = null;
            if (movie_ != null) {
              subBuilder = movie_.toBuilder();
            }
            movie_ = input.readMessage(me.hiepdev.moviefinder.common.Movie.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(movie_);
              movie_ = subBuilder.buildPartial();
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
    return me.hiepdev.moviefinder.userpreferences.Userpreferences.internal_static_userpreferences_UserPreferencesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return me.hiepdev.moviefinder.userpreferences.Userpreferences.internal_static_userpreferences_UserPreferencesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.class, me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.Builder.class);
  }

  public static final int MOVIE_FIELD_NUMBER = 1;
  private me.hiepdev.moviefinder.common.Movie movie_;
  /**
   * <code>.common.Movie movie = 1;</code>
   * @return Whether the movie field is set.
   */
  @java.lang.Override
  public boolean hasMovie() {
    return movie_ != null;
  }
  /**
   * <code>.common.Movie movie = 1;</code>
   * @return The movie.
   */
  @java.lang.Override
  public me.hiepdev.moviefinder.common.Movie getMovie() {
    return movie_ == null ? me.hiepdev.moviefinder.common.Movie.getDefaultInstance() : movie_;
  }
  /**
   * <code>.common.Movie movie = 1;</code>
   */
  @java.lang.Override
  public me.hiepdev.moviefinder.common.MovieOrBuilder getMovieOrBuilder() {
    return getMovie();
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
    if (movie_ != null) {
      output.writeMessage(1, getMovie());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (movie_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMovie());
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
    if (!(obj instanceof me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse)) {
      return super.equals(obj);
    }
    me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse other = (me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse) obj;

    if (hasMovie() != other.hasMovie()) return false;
    if (hasMovie()) {
      if (!getMovie()
          .equals(other.getMovie())) return false;
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
    if (hasMovie()) {
      hash = (37 * hash) + MOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getMovie().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parseFrom(
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
  public static Builder newBuilder(me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse prototype) {
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
   * Protobuf type {@code userpreferences.UserPreferencesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:userpreferences.UserPreferencesResponse)
      me.hiepdev.moviefinder.userpreferences.UserPreferencesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return me.hiepdev.moviefinder.userpreferences.Userpreferences.internal_static_userpreferences_UserPreferencesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return me.hiepdev.moviefinder.userpreferences.Userpreferences.internal_static_userpreferences_UserPreferencesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.class, me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.Builder.class);
    }

    // Construct using me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.newBuilder()
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
      if (movieBuilder_ == null) {
        movie_ = null;
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return me.hiepdev.moviefinder.userpreferences.Userpreferences.internal_static_userpreferences_UserPreferencesResponse_descriptor;
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse getDefaultInstanceForType() {
      return me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse build() {
      me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse buildPartial() {
      me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse result = new me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse(this);
      if (movieBuilder_ == null) {
        result.movie_ = movie_;
      } else {
        result.movie_ = movieBuilder_.build();
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
      if (other instanceof me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse) {
        return mergeFrom((me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse other) {
      if (other == me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse.getDefaultInstance()) return this;
      if (other.hasMovie()) {
        mergeMovie(other.getMovie());
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
      me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private me.hiepdev.moviefinder.common.Movie movie_;
    private com.google.protobuf.SingleFieldBuilderV3<
        me.hiepdev.moviefinder.common.Movie, me.hiepdev.moviefinder.common.Movie.Builder, me.hiepdev.moviefinder.common.MovieOrBuilder> movieBuilder_;
    /**
     * <code>.common.Movie movie = 1;</code>
     * @return Whether the movie field is set.
     */
    public boolean hasMovie() {
      return movieBuilder_ != null || movie_ != null;
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     * @return The movie.
     */
    public me.hiepdev.moviefinder.common.Movie getMovie() {
      if (movieBuilder_ == null) {
        return movie_ == null ? me.hiepdev.moviefinder.common.Movie.getDefaultInstance() : movie_;
      } else {
        return movieBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public Builder setMovie(me.hiepdev.moviefinder.common.Movie value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        movie_ = value;
        onChanged();
      } else {
        movieBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public Builder setMovie(
        me.hiepdev.moviefinder.common.Movie.Builder builderForValue) {
      if (movieBuilder_ == null) {
        movie_ = builderForValue.build();
        onChanged();
      } else {
        movieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public Builder mergeMovie(me.hiepdev.moviefinder.common.Movie value) {
      if (movieBuilder_ == null) {
        if (movie_ != null) {
          movie_ =
            me.hiepdev.moviefinder.common.Movie.newBuilder(movie_).mergeFrom(value).buildPartial();
        } else {
          movie_ = value;
        }
        onChanged();
      } else {
        movieBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public Builder clearMovie() {
      if (movieBuilder_ == null) {
        movie_ = null;
        onChanged();
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public me.hiepdev.moviefinder.common.Movie.Builder getMovieBuilder() {
      
      onChanged();
      return getMovieFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    public me.hiepdev.moviefinder.common.MovieOrBuilder getMovieOrBuilder() {
      if (movieBuilder_ != null) {
        return movieBuilder_.getMessageOrBuilder();
      } else {
        return movie_ == null ?
            me.hiepdev.moviefinder.common.Movie.getDefaultInstance() : movie_;
      }
    }
    /**
     * <code>.common.Movie movie = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        me.hiepdev.moviefinder.common.Movie, me.hiepdev.moviefinder.common.Movie.Builder, me.hiepdev.moviefinder.common.MovieOrBuilder> 
        getMovieFieldBuilder() {
      if (movieBuilder_ == null) {
        movieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            me.hiepdev.moviefinder.common.Movie, me.hiepdev.moviefinder.common.Movie.Builder, me.hiepdev.moviefinder.common.MovieOrBuilder>(
                getMovie(),
                getParentForChildren(),
                isClean());
        movie_ = null;
      }
      return movieBuilder_;
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


    // @@protoc_insertion_point(builder_scope:userpreferences.UserPreferencesResponse)
  }

  // @@protoc_insertion_point(class_scope:userpreferences.UserPreferencesResponse)
  private static final me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse();
  }

  public static me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserPreferencesResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserPreferencesResponse>() {
    @java.lang.Override
    public UserPreferencesResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserPreferencesResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserPreferencesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserPreferencesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public me.hiepdev.moviefinder.userpreferences.UserPreferencesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
