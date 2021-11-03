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

package com.google.api.services.retail.v2alpha.model;

/**
 * Request message for RemoveLocalInventories method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest extends com.google.api.client.json.GenericJson {

  /**
   * If set to true, and the Product is not found, the local inventory removal request will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowMissing;

  /**
   * Required. A list of place IDs to have their inventory deleted. At most 1000 place IDs are
   * allowed per request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> placeIds;

  /**
   * The time when the inventory deletions are issued. Used to prevent out-of-order updates and
   * deletions on local inventory fields. If not provided, the internal system time will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String removeTime;

  /**
   * If set to true, and the Product is not found, the local inventory removal request will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowMissing() {
    return allowMissing;
  }

  /**
   * If set to true, and the Product is not found, the local inventory removal request will still be
   * processed and retained for at most 1 day and processed once the Product is created. If set to
   * false, a NOT_FOUND error is returned if the Product is not found.
   * @param allowMissing allowMissing or {@code null} for none
   */
  public GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest setAllowMissing(java.lang.Boolean allowMissing) {
    this.allowMissing = allowMissing;
    return this;
  }

  /**
   * Required. A list of place IDs to have their inventory deleted. At most 1000 place IDs are
   * allowed per request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPlaceIds() {
    return placeIds;
  }

  /**
   * Required. A list of place IDs to have their inventory deleted. At most 1000 place IDs are
   * allowed per request.
   * @param placeIds placeIds or {@code null} for none
   */
  public GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest setPlaceIds(java.util.List<java.lang.String> placeIds) {
    this.placeIds = placeIds;
    return this;
  }

  /**
   * The time when the inventory deletions are issued. Used to prevent out-of-order updates and
   * deletions on local inventory fields. If not provided, the internal system time will be used.
   * @return value or {@code null} for none
   */
  public String getRemoveTime() {
    return removeTime;
  }

  /**
   * The time when the inventory deletions are issued. Used to prevent out-of-order updates and
   * deletions on local inventory fields. If not provided, the internal system time will be used.
   * @param removeTime removeTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest setRemoveTime(String removeTime) {
    this.removeTime = removeTime;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest clone() {
    return (GoogleCloudRetailV2alphaRemoveLocalInventoriesRequest) super.clone();
  }

}
