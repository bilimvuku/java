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

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for InAppProductListing.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InAppProductListing extends com.google.api.client.json.GenericJson {

  /**
   * The localized entitlement benefits of the in-app product. These are supported only for
   * subscriptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> benefits;

  /**
   * The localized description of the in-app product. These are deprecated for subscriptions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The localized title of the in-app product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * The localized entitlement benefits of the in-app product. These are supported only for
   * subscriptions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBenefits() {
    return benefits;
  }

  /**
   * The localized entitlement benefits of the in-app product. These are supported only for
   * subscriptions.
   * @param benefits benefits or {@code null} for none
   */
  public InAppProductListing setBenefits(java.util.List<java.lang.String> benefits) {
    this.benefits = benefits;
    return this;
  }

  /**
   * The localized description of the in-app product. These are deprecated for subscriptions.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The localized description of the in-app product. These are deprecated for subscriptions.
   * @param description description or {@code null} for none
   */
  public InAppProductListing setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The localized title of the in-app product.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The localized title of the in-app product.
   * @param title title or {@code null} for none
   */
  public InAppProductListing setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public InAppProductListing set(String fieldName, Object value) {
    return (InAppProductListing) super.set(fieldName, value);
  }

  @Override
  public InAppProductListing clone() {
    return (InAppProductListing) super.clone();
  }

}
