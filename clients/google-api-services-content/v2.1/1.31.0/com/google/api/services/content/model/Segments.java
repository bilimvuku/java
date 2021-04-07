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

package com.google.api.services.content.model;

/**
 * Dimensions according to which metrics are segmented in the response. Values of product
 * dimensions, e.g., offer id, reflect the state of a product at the time of the corresponding
 * event, e.g., impression or order. Segment fields cannot be selected in queries without also
 * selecting at least one metric field. Values are only set for dimensions requested explicitly in
 * the request's search query. Next id: 22
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Segments extends com.google.api.client.json.GenericJson {

  /**
   * Date in the merchant timezone to which metrics apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date date;

  /**
   * Merchant-provided id of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offerId;

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String program;

  /**
   * Date in the merchant timezone to which metrics apply.
   * @return value or {@code null} for none
   */
  public Date getDate() {
    return date;
  }

  /**
   * Date in the merchant timezone to which metrics apply.
   * @param date date or {@code null} for none
   */
  public Segments setDate(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Merchant-provided id of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getOfferId() {
    return offerId;
  }

  /**
   * Merchant-provided id of the product.
   * @param offerId offerId or {@code null} for none
   */
  public Segments setOfferId(java.lang.String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * @return value or {@code null} for none
   */
  public java.lang.String getProgram() {
    return program;
  }

  /**
   * Program to which metrics apply, e.g., Free Product Listing.
   * @param program program or {@code null} for none
   */
  public Segments setProgram(java.lang.String program) {
    this.program = program;
    return this;
  }

  @Override
  public Segments set(String fieldName, Object value) {
    return (Segments) super.set(fieldName, value);
  }

  @Override
  public Segments clone() {
    return (Segments) super.clone();
  }

}
