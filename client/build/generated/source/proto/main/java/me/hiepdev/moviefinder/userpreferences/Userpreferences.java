// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: moviefinder/userpreferences/userpreferences.proto

package me.hiepdev.moviefinder.userpreferences;

public final class Userpreferences {
  private Userpreferences() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userpreferences_UserPreferencesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userpreferences_UserPreferencesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_userpreferences_UserPreferencesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_userpreferences_UserPreferencesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1moviefinder/userpreferences/userprefer" +
      "ences.proto\022\017userpreferences\032\037moviefinde" +
      "r/common/common.proto\"F\n\026UserPreferences" +
      "Request\022\016\n\006userid\030\001 \001(\t\022\034\n\005movie\030\002 \001(\0132\r" +
      ".common.Movie\"7\n\027UserPreferencesResponse" +
      "\022\034\n\005movie\030\001 \001(\0132\r.common.Movie2\211\001\n\026UserP" +
      "referencesService\022o\n\024getShortlistedMovie" +
      "s\022\'.userpreferences.UserPreferencesReque" +
      "st\032(.userpreferences.UserPreferencesResp" +
      "onse\"\000(\0010\001B*\n&me.hiepdev.moviefinder.use" +
      "rpreferencesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          me.hiepdev.moviefinder.common.Common.getDescriptor(),
        });
    internal_static_userpreferences_UserPreferencesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_userpreferences_UserPreferencesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userpreferences_UserPreferencesRequest_descriptor,
        new java.lang.String[] { "Userid", "Movie", });
    internal_static_userpreferences_UserPreferencesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_userpreferences_UserPreferencesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_userpreferences_UserPreferencesResponse_descriptor,
        new java.lang.String[] { "Movie", });
    me.hiepdev.moviefinder.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
