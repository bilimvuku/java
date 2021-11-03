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

package com.google.api.services.retail.v2beta.model;

/**
 * Fulfillment information, such as the store IDs for in-store pickup or region IDs for different
 * shipping methods.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaFulfillmentInfo extends com.google.api.client.json.GenericJson {

  /**
   * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the
   * region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed.
   * Each value must be a string with a length limit of 30 characters, matching the pattern
   * `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> placeIds;

  /**
   * The fulfillment type, including commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their display names before
   * rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" *
   * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" *
   * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the
   * region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed.
   * Each value must be a string with a length limit of 30 characters, matching the pattern
   * `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPlaceIds() {
    return placeIds;
  }

  /**
   * The IDs for this type, such as the store IDs for FulfillmentInfo.type.pickup-in-store or the
   * region IDs for FulfillmentInfo.type.same-day-delivery. A maximum of 3000 values are allowed.
   * Each value must be a string with a length limit of 30 characters, matching the pattern
   * `[a-zA-Z0-9_-]+`, such as "store1" or "REGION-2". Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @param placeIds placeIds or {@code null} for none
   */
  public GoogleCloudRetailV2betaFulfillmentInfo setPlaceIds(java.util.List<java.lang.String> placeIds) {
    this.placeIds = placeIds;
    return this;
  }

  /**
   * The fulfillment type, including commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their display names before
   * rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" *
   * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" *
   * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The fulfillment type, including commonly used types (such as pickup in store and same day
   * delivery), and custom types. Customers have to map custom types to their display names before
   * rendering UI. Supported values: * "pickup-in-store" * "ship-to-store" * "same-day-delivery" *
   * "next-day-delivery" * "custom-type-1" * "custom-type-2" * "custom-type-3" * "custom-type-4" *
   * "custom-type-5" If this field is set to an invalid value other than these, an INVALID_ARGUMENT
   * error is returned.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2betaFulfillmentInfo setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaFulfillmentInfo set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaFulfillmentInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaFulfillmentInfo clone() {
    return (GoogleCloudRetailV2betaFulfillmentInfo) super.clone();
  }

}
