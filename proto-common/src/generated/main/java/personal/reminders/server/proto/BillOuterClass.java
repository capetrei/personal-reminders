// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Bill.proto

package personal.reminders.server.proto;

public final class BillOuterClass {
  private BillOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_reminders_server_proto_BillProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_reminders_server_proto_BillProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_reminders_server_proto_BillRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_reminders_server_proto_BillRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_reminders_server_proto_BillResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_reminders_server_proto_BillResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_personal_reminders_server_proto_ListBillsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_personal_reminders_server_proto_ListBillsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nBill.proto\022\037personal.reminders.server." +
      "proto\032\033google/protobuf/empty.proto\"=\n\tBi" +
      "llProto\022\n\n\002id\030\001 \001(\005\022\017\n\007service\030\002 \001(\t\022\023\n\013" +
      "providerURL\030\003 \001(\t\"3\n\013BillRequest\022\017\n\007serv" +
      "ice\030\001 \001(\t\022\023\n\013providerURL\030\002 \001(\t\"\037\n\014BillRe" +
      "sponse\022\017\n\007message\030\001 \001(\t\"N\n\021ListBillsResp" +
      "onse\0229\n\005bills\030\001 \003(\0132*.personal.reminders" +
      ".server.proto.BillProto2\313\001\n\004Bill\022h\n\007SetB" +
      "ill\022,.personal.reminders.server.proto.Bi" +
      "llRequest\032-.personal.reminders.server.pr" +
      "oto.BillResponse\"\000\022Y\n\tListBills\022\026.google" +
      ".protobuf.Empty\0322.personal.reminders.ser" +
      "ver.proto.ListBillsResponse\"\000B#\n\037persona" +
      "l.reminders.server.protoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_personal_reminders_server_proto_BillProto_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_personal_reminders_server_proto_BillProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_reminders_server_proto_BillProto_descriptor,
        new java.lang.String[] { "Id", "Service", "ProviderURL", });
    internal_static_personal_reminders_server_proto_BillRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_personal_reminders_server_proto_BillRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_reminders_server_proto_BillRequest_descriptor,
        new java.lang.String[] { "Service", "ProviderURL", });
    internal_static_personal_reminders_server_proto_BillResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_personal_reminders_server_proto_BillResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_reminders_server_proto_BillResponse_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_personal_reminders_server_proto_ListBillsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_personal_reminders_server_proto_ListBillsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_personal_reminders_server_proto_ListBillsResponse_descriptor,
        new java.lang.String[] { "Bills", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
