// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moviefinder/common/common.proto

package me.hiepdev.moviefinder.common;

public final class Common {
  private Common() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_common_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_common_Movie_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037moviefinder/common/common.proto\022\006commo" +
      "n\"Y\n\005Movie\022\r\n\005title\030\001 \001(\t\022\016\n\006rating\030\002 \001(" +
      "\002\022\034\n\005genre\030\003 \001(\0162\r.common.Genre\022\023\n\013descr" +
      "iption\030\004 \001(\t*8\n\005Genre\022\n\n\006COMEDY\020\000\022\n\n\006ACT" +
      "ION\020\001\022\014\n\010THRILLER\020\002\022\t\n\005DRAMA\020\003B!\n\035me.hie" +
      "pdev.moviefinder.commonP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_common_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_common_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_common_Movie_descriptor,
        new java.lang.String[] { "Title", "Rating", "Genre", "Description", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}