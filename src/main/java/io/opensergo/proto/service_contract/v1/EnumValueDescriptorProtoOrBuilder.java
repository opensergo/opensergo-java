// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opensergo/proto/service_contract/v1/service_contract.proto

package io.opensergo.proto.service_contract.v1;

public interface EnumValueDescriptorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.proto.service_contract.v1.EnumValueDescriptorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional int32 number = 2;</code>
   * @return Whether the number field is set.
   */
  boolean hasNumber();
  /**
   * <code>optional int32 number = 2;</code>
   * @return The number.
   */
  int getNumber();

  /**
   * <code>optional .opensergo.proto.service_contract.v1.EnumValueOptions options = 3;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .opensergo.proto.service_contract.v1.EnumValueOptions options = 3;</code>
   * @return The options.
   */
  io.opensergo.proto.service_contract.v1.EnumValueOptions getOptions();
  /**
   * <code>optional .opensergo.proto.service_contract.v1.EnumValueOptions options = 3;</code>
   */
  io.opensergo.proto.service_contract.v1.EnumValueOptionsOrBuilder getOptionsOrBuilder();
}
