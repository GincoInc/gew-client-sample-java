// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

public interface SetRatesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:adamant.global.v1.SetRatesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Array of rate objects
   * </pre>
   *
   * <code>repeated .adamant.global.v1.RequestRate rates = 1;</code>
   */
  java.util.List<adamant.global.v1.Model.RequestRate> 
      getRatesList();
  /**
   * <pre>
   *Array of rate objects
   * </pre>
   *
   * <code>repeated .adamant.global.v1.RequestRate rates = 1;</code>
   */
  adamant.global.v1.Model.RequestRate getRates(int index);
  /**
   * <pre>
   *Array of rate objects
   * </pre>
   *
   * <code>repeated .adamant.global.v1.RequestRate rates = 1;</code>
   */
  int getRatesCount();
  /**
   * <pre>
   *Array of rate objects
   * </pre>
   *
   * <code>repeated .adamant.global.v1.RequestRate rates = 1;</code>
   */
  java.util.List<? extends adamant.global.v1.Model.RequestRateOrBuilder> 
      getRatesOrBuilderList();
  /**
   * <pre>
   *Array of rate objects
   * </pre>
   *
   * <code>repeated .adamant.global.v1.RequestRate rates = 1;</code>
   */
  adamant.global.v1.Model.RequestRateOrBuilder getRatesOrBuilder(
      int index);
}
