// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protovsjson.proto

package me.hiepdev.provsjson;

public final class Protovsjson {
  private Protovsjson() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protovsjson_ContactProtobuf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protovsjson_ContactProtobuf_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_protovsjson_UserProtobuf_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_protovsjson_UserProtobuf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021protovsjson.proto\022\013protovsjson\"7\n\017Cont" +
      "actProtobuf\022\023\n\013phoneNumber\030\005 \001(\t\022\017\n\007coun" +
      "try\030\006 \001(\t\"s\n\014UserProtobuf\022\022\n\nfirst_name\030" +
      "\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\022\r\n\005email\030\003 \001(\t\022" +
      "-\n\007contact\030\004 \003(\0132\034.protovsjson.ContactPr" +
      "otobufB\030\n\024me.hiepdev.provsjsonP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_protovsjson_ContactProtobuf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_protovsjson_ContactProtobuf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protovsjson_ContactProtobuf_descriptor,
        new java.lang.String[] { "PhoneNumber", "Country", });
    internal_static_protovsjson_UserProtobuf_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_protovsjson_UserProtobuf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_protovsjson_UserProtobuf_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Email", "Contact", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}