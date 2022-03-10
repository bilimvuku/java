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

package com.google.api.services.run.v2.model;

/**
 * Holds a single traffic routing entry for the Service. Allocations can be done to a specific
 * Revision name, or pointing to the latest Ready Revision.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2TrafficTarget extends com.google.api.client.json.GenericJson {

  /**
   * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer percent;

  /**
   * Revision to which to send this portion of traffic, if traffic allocation is by revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * Indicates a string to be part of the URI to exclusively reference this target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tag;

  /**
   * The allocation type for this traffic target.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPercent() {
    return percent;
  }

  /**
   * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
   * @param percent percent or {@code null} for none
   */
  public GoogleCloudRunV2TrafficTarget setPercent(java.lang.Integer percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Revision to which to send this portion of traffic, if traffic allocation is by revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * Revision to which to send this portion of traffic, if traffic allocation is by revision.
   * @param revision revision or {@code null} for none
   */
  public GoogleCloudRunV2TrafficTarget setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Indicates a string to be part of the URI to exclusively reference this target.
   * @return value or {@code null} for none
   */
  public java.lang.String getTag() {
    return tag;
  }

  /**
   * Indicates a string to be part of the URI to exclusively reference this target.
   * @param tag tag or {@code null} for none
   */
  public GoogleCloudRunV2TrafficTarget setTag(java.lang.String tag) {
    this.tag = tag;
    return this;
  }

  /**
   * The allocation type for this traffic target.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The allocation type for this traffic target.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRunV2TrafficTarget setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRunV2TrafficTarget set(String fieldName, Object value) {
    return (GoogleCloudRunV2TrafficTarget) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2TrafficTarget clone() {
    return (GoogleCloudRunV2TrafficTarget) super.clone();
  }

}
