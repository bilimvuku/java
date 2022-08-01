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

package com.google.api.services.chat.v1.model;

/**
 * Represents a single item in the grid layout.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1GridItem extends com.google.api.client.json.GenericJson {

  /**
   * A user-specified identifier for this grid item. This identifier is returned in the parent
   * Grid's onClick callback parameters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The image that displays in the grid item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1ImageComponent image;

  /**
   * The layout to use for the grid item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layout;

  /**
   * The grid item's subtitle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subtitle;

  /**
   * The horizontal alignment of the grid item's text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textAlignment;

  /**
   * The grid item's title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * A user-specified identifier for this grid item. This identifier is returned in the parent
   * Grid's onClick callback parameters.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * A user-specified identifier for this grid item. This identifier is returned in the parent
   * Grid's onClick callback parameters.
   * @param id id or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The image that displays in the grid item.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1ImageComponent getImage() {
    return image;
  }

  /**
   * The image that displays in the grid item.
   * @param image image or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setImage(GoogleAppsCardV1ImageComponent image) {
    this.image = image;
    return this;
  }

  /**
   * The layout to use for the grid item.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayout() {
    return layout;
  }

  /**
   * The layout to use for the grid item.
   * @param layout layout or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setLayout(java.lang.String layout) {
    this.layout = layout;
    return this;
  }

  /**
   * The grid item's subtitle.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubtitle() {
    return subtitle;
  }

  /**
   * The grid item's subtitle.
   * @param subtitle subtitle or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setSubtitle(java.lang.String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

  /**
   * The horizontal alignment of the grid item's text.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextAlignment() {
    return textAlignment;
  }

  /**
   * The horizontal alignment of the grid item's text.
   * @param textAlignment textAlignment or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setTextAlignment(java.lang.String textAlignment) {
    this.textAlignment = textAlignment;
    return this;
  }

  /**
   * The grid item's title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The grid item's title.
   * @param title title or {@code null} for none
   */
  public GoogleAppsCardV1GridItem setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleAppsCardV1GridItem set(String fieldName, Object value) {
    return (GoogleAppsCardV1GridItem) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1GridItem clone() {
    return (GoogleAppsCardV1GridItem) super.clone();
  }

}
