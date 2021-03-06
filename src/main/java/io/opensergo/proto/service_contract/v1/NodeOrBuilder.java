// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opensergo/proto/service_contract/v1/service_contract.proto

package io.opensergo.proto.service_contract.v1;

public interface NodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.proto.service_contract.v1.Node)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Identifier that uniquely identifies a process within a VM/container.
   * </pre>
   *
   * <code>.opensergo.proto.service_contract.v1.NodeIdentifier identifier = 1;</code>
   * @return Whether the identifier field is set.
   */
  boolean hasIdentifier();
  /**
   * <pre>
   * Identifier that uniquely identifies a process within a VM/container.
   * </pre>
   *
   * <code>.opensergo.proto.service_contract.v1.NodeIdentifier identifier = 1;</code>
   * @return The identifier.
   */
  io.opensergo.proto.service_contract.v1.NodeIdentifier getIdentifier();
  /**
   * <pre>
   * Identifier that uniquely identifies a process within a VM/container.
   * </pre>
   *
   * <code>.opensergo.proto.service_contract.v1.NodeIdentifier identifier = 1;</code>
   */
  io.opensergo.proto.service_contract.v1.NodeIdentifierOrBuilder getIdentifierOrBuilder();

  /**
   * <pre>
   * Locality specifying where the instance is running.
   * </pre>
   *
   * <code>optional .opensergo.proto.service_contract.v1.Locality locality = 4;</code>
   * @return Whether the locality field is set.
   */
  boolean hasLocality();
  /**
   * <pre>
   * Locality specifying where the instance is running.
   * </pre>
   *
   * <code>optional .opensergo.proto.service_contract.v1.Locality locality = 4;</code>
   * @return The locality.
   */
  io.opensergo.proto.service_contract.v1.Locality getLocality();
  /**
   * <pre>
   * Locality specifying where the instance is running.
   * </pre>
   *
   * <code>optional .opensergo.proto.service_contract.v1.Locality locality = 4;</code>
   */
  io.opensergo.proto.service_contract.v1.LocalityOrBuilder getLocalityOrBuilder();

  /**
   * <code>optional string tag = 5;</code>
   * @return Whether the tag field is set.
   */
  boolean hasTag();
  /**
   * <code>optional string tag = 5;</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <code>optional string tag = 5;</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();

  /**
   * <code>optional string cluster = 6;</code>
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   * <code>optional string cluster = 6;</code>
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   * <code>optional string cluster = 6;</code>
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString
      getClusterBytes();

  /**
   * <code>optional string env = 7;</code>
   * @return Whether the env field is set.
   */
  boolean hasEnv();
  /**
   * <code>optional string env = 7;</code>
   * @return The env.
   */
  java.lang.String getEnv();
  /**
   * <code>optional string env = 7;</code>
   * @return The bytes for env.
   */
  com.google.protobuf.ByteString
      getEnvBytes();
}
