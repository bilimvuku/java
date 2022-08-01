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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * An image resource. You may provide a larger image than was requested, so long as the aspect ratio
 * is preserved.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Image extends com.google.api.client.json.GenericJson {

  /**
   * Image height in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer height;

  /**
   * The URL of the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * Image width in pixels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer width;

  /**
   * Image height in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHeight() {
    return height;
  }

  /**
   * Image height in pixels.
   * @param height height or {@code null} for none
   */
  public Image setHeight(java.lang.Integer height) {
    this.height = height;
    return this;
  }

  /**
   * The URL of the image.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The URL of the image.
   * @param url url or {@code null} for none
   */
  public Image setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * Image width in pixels.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getWidth() {
    return width;
  }

  /**
   * Image width in pixels.
   * @param width width or {@code null} for none
   */
  public Image setWidth(java.lang.Integer width) {
    this.width = width;
    return this;
  }

  @Override
  public Image set(String fieldName, Object value) {
    return (Image) super.set(fieldName, value);
  }

  @Override
  public Image clone() {
    return (Image) super.clone();
  }

}
