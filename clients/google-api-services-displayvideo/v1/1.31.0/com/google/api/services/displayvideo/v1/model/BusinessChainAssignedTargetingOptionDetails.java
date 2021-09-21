/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.displayvideo.v1.model;

/**
 * Details for assigned Business chain targeting option. This will be populated in the details field
 * of an AssignedTargetingOption when targeting_type is `TARGETING_TYPE_BUSINESS_CHAIN`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BusinessChainAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The display name of a business chain, e.g. "KFC", "Chase Bank".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Required. The radius of the area around the business chain that will be targeted. The units of
   * the radius are specified by proximity_radius_unit. Must be 1 to 800 if unit is
   * `DISTANCE_UNIT_KILOMETERS` and 1 to 500 if unit is `DISTANCE_UNIT_MILES`. The minimum increment
   * for both cases is 0.1. Inputs will be rounded to the nearest acceptable value if it is too
   * granular, e.g. 15.57 will become 15.6.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double proximityRadiusAmount;

  /**
   * Required. The unit of distance by which the targeting radius is measured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proximityRadiusUnit;

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BUSINESS_CHAIN`.
   * Accepted business chain targeting option IDs can be retrieved using SearchTargetingOptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * Output only. The display name of a business chain, e.g. "KFC", "Chase Bank".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The display name of a business chain, e.g. "KFC", "Chase Bank".
   * @param displayName displayName or {@code null} for none
   */
  public BusinessChainAssignedTargetingOptionDetails setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Required. The radius of the area around the business chain that will be targeted. The units of
   * the radius are specified by proximity_radius_unit. Must be 1 to 800 if unit is
   * `DISTANCE_UNIT_KILOMETERS` and 1 to 500 if unit is `DISTANCE_UNIT_MILES`. The minimum increment
   * for both cases is 0.1. Inputs will be rounded to the nearest acceptable value if it is too
   * granular, e.g. 15.57 will become 15.6.
   * @return value or {@code null} for none
   */
  public java.lang.Double getProximityRadiusAmount() {
    return proximityRadiusAmount;
  }

  /**
   * Required. The radius of the area around the business chain that will be targeted. The units of
   * the radius are specified by proximity_radius_unit. Must be 1 to 800 if unit is
   * `DISTANCE_UNIT_KILOMETERS` and 1 to 500 if unit is `DISTANCE_UNIT_MILES`. The minimum increment
   * for both cases is 0.1. Inputs will be rounded to the nearest acceptable value if it is too
   * granular, e.g. 15.57 will become 15.6.
   * @param proximityRadiusAmount proximityRadiusAmount or {@code null} for none
   */
  public BusinessChainAssignedTargetingOptionDetails setProximityRadiusAmount(java.lang.Double proximityRadiusAmount) {
    this.proximityRadiusAmount = proximityRadiusAmount;
    return this;
  }

  /**
   * Required. The unit of distance by which the targeting radius is measured.
   * @return value or {@code null} for none
   */
  public java.lang.String getProximityRadiusUnit() {
    return proximityRadiusUnit;
  }

  /**
   * Required. The unit of distance by which the targeting radius is measured.
   * @param proximityRadiusUnit proximityRadiusUnit or {@code null} for none
   */
  public BusinessChainAssignedTargetingOptionDetails setProximityRadiusUnit(java.lang.String proximityRadiusUnit) {
    this.proximityRadiusUnit = proximityRadiusUnit;
    return this;
  }

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BUSINESS_CHAIN`.
   * Accepted business chain targeting option IDs can be retrieved using SearchTargetingOptions.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_BUSINESS_CHAIN`.
   * Accepted business chain targeting option IDs can be retrieved using SearchTargetingOptions.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public BusinessChainAssignedTargetingOptionDetails setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  @Override
  public BusinessChainAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (BusinessChainAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public BusinessChainAssignedTargetingOptionDetails clone() {
    return (BusinessChainAssignedTargetingOptionDetails) super.clone();
  }

}
