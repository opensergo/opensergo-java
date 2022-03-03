// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: specification/proto/servicecontract.proto

package com.alibaba.opensergo.api.proto;

public interface EnumDescriptorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.api.EnumDescriptorProto)
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
   * <code>repeated .opensergo.api.EnumValueDescriptorProto value = 2;</code>
   */
  java.util.List<com.alibaba.opensergo.api.proto.EnumValueDescriptorProto> 
      getValueList();
  /**
   * <code>repeated .opensergo.api.EnumValueDescriptorProto value = 2;</code>
   */
  com.alibaba.opensergo.api.proto.EnumValueDescriptorProto getValue(int index);
  /**
   * <code>repeated .opensergo.api.EnumValueDescriptorProto value = 2;</code>
   */
  int getValueCount();
  /**
   * <code>repeated .opensergo.api.EnumValueDescriptorProto value = 2;</code>
   */
  java.util.List<? extends com.alibaba.opensergo.api.proto.EnumValueDescriptorProtoOrBuilder> 
      getValueOrBuilderList();
  /**
   * <code>repeated .opensergo.api.EnumValueDescriptorProto value = 2;</code>
   */
  com.alibaba.opensergo.api.proto.EnumValueDescriptorProtoOrBuilder getValueOrBuilder(
      int index);

  /**
   * <code>optional .opensergo.api.MessageOptions options = 3;</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <code>optional .opensergo.api.MessageOptions options = 3;</code>
   * @return The options.
   */
  com.alibaba.opensergo.api.proto.MessageOptions getOptions();
  /**
   * <code>optional .opensergo.api.MessageOptions options = 3;</code>
   */
  com.alibaba.opensergo.api.proto.MessageOptionsOrBuilder getOptionsOrBuilder();
}