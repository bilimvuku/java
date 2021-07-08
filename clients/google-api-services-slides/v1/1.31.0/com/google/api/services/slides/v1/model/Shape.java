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

package com.google.api.services.slides.v1.model;

/**
 * A PageElement kind representing a generic shape that does not have a more specific
 * classification.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Slides API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Shape extends com.google.api.client.json.GenericJson {

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the shape is a placeholder shape and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Placeholder placeholder;

  /**
   * The properties of the shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShapeProperties shapeProperties;

  /**
   * The type of the shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shapeType;

  /**
   * The text content of the shape.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextContent text;

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the shape is a placeholder shape and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * @return value or {@code null} for none
   */
  public Placeholder getPlaceholder() {
    return placeholder;
  }

  /**
   * Placeholders are page elements that inherit from corresponding placeholders on layouts and
   * masters. If set, the shape is a placeholder shape and any inherited properties can be resolved
   * by looking at the parent placeholder identified by the Placeholder.parent_object_id field.
   * @param placeholder placeholder or {@code null} for none
   */
  public Shape setPlaceholder(Placeholder placeholder) {
    this.placeholder = placeholder;
    return this;
  }

  /**
   * The properties of the shape.
   * @return value or {@code null} for none
   */
  public ShapeProperties getShapeProperties() {
    return shapeProperties;
  }

  /**
   * The properties of the shape.
   * @param shapeProperties shapeProperties or {@code null} for none
   */
  public Shape setShapeProperties(ShapeProperties shapeProperties) {
    this.shapeProperties = shapeProperties;
    return this;
  }

  /**
   * The type of the shape.
   * @return value or {@code null} for none
   */
  public java.lang.String getShapeType() {
    return shapeType;
  }

  /**
   * The type of the shape.
   * @param shapeType shapeType or {@code null} for none
   */
  public Shape setShapeType(java.lang.String shapeType) {
    this.shapeType = shapeType;
    return this;
  }

  /**
   * The text content of the shape.
   * @return value or {@code null} for none
   */
  public TextContent getText() {
    return text;
  }

  /**
   * The text content of the shape.
   * @param text text or {@code null} for none
   */
  public Shape setText(TextContent text) {
    this.text = text;
    return this;
  }

  @Override
  public Shape set(String fieldName, Object value) {
    return (Shape) super.set(fieldName, value);
  }

  @Override
  public Shape clone() {
    return (Shape) super.clone();
  }

}
