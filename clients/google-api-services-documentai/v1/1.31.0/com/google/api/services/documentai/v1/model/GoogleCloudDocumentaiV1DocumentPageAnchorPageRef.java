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

package com.google.api.services.documentai.v1.model;

/**
 * Represents a weak reference to a page element within a document.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1DocumentPageAnchorPageRef extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Identifies the bounding polygon of a layout element on the page.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1BoundingPoly boundingPoly;

  /**
   * Optional. Confidence of detected page element, if applicable. Range [0, 1].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Optional. Deprecated. Use PageRef.bounding_poly instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layoutId;

  /**
   * Optional. The type of the layout element that is being referenced if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String layoutType;

  /**
   * Required. Index into the Document.pages element, for example using Document.pages to locate the
   * related page element.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long page;

  /**
   * Optional. Identifies the bounding polygon of a layout element on the page.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * Optional. Identifies the bounding polygon of a layout element on the page.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef setBoundingPoly(GoogleCloudDocumentaiV1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * Optional. Confidence of detected page element, if applicable. Range [0, 1].
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Optional. Confidence of detected page element, if applicable. Range [0, 1].
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Optional. Deprecated. Use PageRef.bounding_poly instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayoutId() {
    return layoutId;
  }

  /**
   * Optional. Deprecated. Use PageRef.bounding_poly instead.
   * @param layoutId layoutId or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef setLayoutId(java.lang.String layoutId) {
    this.layoutId = layoutId;
    return this;
  }

  /**
   * Optional. The type of the layout element that is being referenced if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getLayoutType() {
    return layoutType;
  }

  /**
   * Optional. The type of the layout element that is being referenced if any.
   * @param layoutType layoutType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef setLayoutType(java.lang.String layoutType) {
    this.layoutType = layoutType;
    return this;
  }

  /**
   * Required. Index into the Document.pages element, for example using Document.pages to locate the
   * related page element.
   * @return value or {@code null} for none
   */
  public java.lang.Long getPage() {
    return page;
  }

  /**
   * Required. Index into the Document.pages element, for example using Document.pages to locate the
   * related page element.
   * @param page page or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef setPage(java.lang.Long page) {
    this.page = page;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentPageAnchorPageRef) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageAnchorPageRef clone() {
    return (GoogleCloudDocumentaiV1DocumentPageAnchorPageRef) super.clone();
  }

}
