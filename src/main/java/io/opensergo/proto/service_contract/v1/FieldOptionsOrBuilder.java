// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: opensergo/proto/service_contract/v1/service_contract.proto

package io.opensergo.proto.service_contract.v1;

public interface FieldOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:opensergo.proto.service_contract.v1.FieldOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Is this field deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for accessors, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating fields.
   * </pre>
   *
   * <code>optional bool deprecated = 3;</code>
   * @return Whether the deprecated field is set.
   */
  boolean hasDeprecated();
  /**
   * <pre>
   * Is this field deprecated?
   * Depending on the target platform, this can emit Deprecated annotations
   * for accessors, or it will be completely ignored; in the very least, this
   * is a formalization for deprecating fields.
   * </pre>
   *
   * <code>optional bool deprecated = 3;</code>
   * @return The deprecated.
   */
  boolean getDeprecated();

  /**
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   *
   * <code>repeated .opensergo.proto.service_contract.v1.UninterpretedOption uninterpreted_option = 999;</code>
   */
  java.util.List<io.opensergo.proto.service_contract.v1.UninterpretedOption> 
      getUninterpretedOptionList();
  /**
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   *
   * <code>repeated .opensergo.proto.service_contract.v1.UninterpretedOption uninterpreted_option = 999;</code>
   */
  io.opensergo.proto.service_contract.v1.UninterpretedOption getUninterpretedOption(int index);
  /**
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   *
   * <code>repeated .opensergo.proto.service_contract.v1.UninterpretedOption uninterpreted_option = 999;</code>
   */
  int getUninterpretedOptionCount();
  /**
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   *
   * <code>repeated .opensergo.proto.service_contract.v1.UninterpretedOption uninterpreted_option = 999;</code>
   */
  java.util.List<? extends io.opensergo.proto.service_contract.v1.UninterpretedOptionOrBuilder> 
      getUninterpretedOptionOrBuilderList();
  /**
   * <pre>
   * The parser stores options it doesn't recognize here. See above.
   * </pre>
   *
   * <code>repeated .opensergo.proto.service_contract.v1.UninterpretedOption uninterpreted_option = 999;</code>
   */
  io.opensergo.proto.service_contract.v1.UninterpretedOptionOrBuilder getUninterpretedOptionOrBuilder(
      int index);
}
