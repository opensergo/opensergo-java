// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opensergo/proto/service_contract/v1/service_contract.proto

package io.opensergo.proto.service_contract.v1;

public interface ReportMetadataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.proto.service_contract.v1.ReportMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string app_name = 1;</code>
   * @return The appName.
   */
  java.lang.String getAppName();
  /**
   * <code>string app_name = 1;</code>
   * @return The bytes for appName.
   */
  com.google.protobuf.ByteString
      getAppNameBytes();

  /**
   * <code>.opensergo.proto.service_contract.v1.Node node = 2;</code>
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   * <code>.opensergo.proto.service_contract.v1.Node node = 2;</code>
   * @return The node.
   */
  io.opensergo.proto.service_contract.v1.Node getNode();
  /**
   * <code>.opensergo.proto.service_contract.v1.Node node = 2;</code>
   */
  io.opensergo.proto.service_contract.v1.NodeOrBuilder getNodeOrBuilder();

  /**
   * <code>repeated .opensergo.proto.service_contract.v1.ServiceMetadata service_metadata = 3;</code>
   */
  java.util.List<io.opensergo.proto.service_contract.v1.ServiceMetadata> 
      getServiceMetadataList();
  /**
   * <code>repeated .opensergo.proto.service_contract.v1.ServiceMetadata service_metadata = 3;</code>
   */
  io.opensergo.proto.service_contract.v1.ServiceMetadata getServiceMetadata(int index);
  /**
   * <code>repeated .opensergo.proto.service_contract.v1.ServiceMetadata service_metadata = 3;</code>
   */
  int getServiceMetadataCount();
  /**
   * <code>repeated .opensergo.proto.service_contract.v1.ServiceMetadata service_metadata = 3;</code>
   */
  java.util.List<? extends io.opensergo.proto.service_contract.v1.ServiceMetadataOrBuilder> 
      getServiceMetadataOrBuilderList();
  /**
   * <code>repeated .opensergo.proto.service_contract.v1.ServiceMetadata service_metadata = 3;</code>
   */
  io.opensergo.proto.service_contract.v1.ServiceMetadataOrBuilder getServiceMetadataOrBuilder(
      int index);
}
