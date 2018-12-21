// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BasicTypes.proto

package com.hederahashgraph.api.proto.java;

public interface ThresholdKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.ThresholdKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * a valid signature set must have at least this many signatures
   * </pre>
   *
   * <code>uint32 threshold = 1;</code>
   */
  int getThreshold();

  /**
   * <pre>
   * list of all the keys that can sign
   * </pre>
   *
   * <code>.proto.KeyList keys = 2;</code>
   */
  boolean hasKeys();
  /**
   * <pre>
   * list of all the keys that can sign
   * </pre>
   *
   * <code>.proto.KeyList keys = 2;</code>
   */
  com.hederahashgraph.api.proto.java.KeyList getKeys();
  /**
   * <pre>
   * list of all the keys that can sign
   * </pre>
   *
   * <code>.proto.KeyList keys = 2;</code>
   */
  com.hederahashgraph.api.proto.java.KeyListOrBuilder getKeysOrBuilder();
}
