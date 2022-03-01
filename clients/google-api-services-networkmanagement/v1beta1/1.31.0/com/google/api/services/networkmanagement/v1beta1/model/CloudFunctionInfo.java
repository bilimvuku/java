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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * For display only. Metadata associated with a Cloud function.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CloudFunctionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Name of a Cloud function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Location in which the Cloud function is deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * URI of a Cloud function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Latest successfully deployed version id of the Cloud function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long versionId;

  /**
   * Name of a Cloud function.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of a Cloud function.
   * @param displayName displayName or {@code null} for none
   */
  public CloudFunctionInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Location in which the Cloud function is deployed.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location in which the Cloud function is deployed.
   * @param location location or {@code null} for none
   */
  public CloudFunctionInfo setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * URI of a Cloud function.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of a Cloud function.
   * @param uri uri or {@code null} for none
   */
  public CloudFunctionInfo setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Latest successfully deployed version id of the Cloud function.
   * @return value or {@code null} for none
   */
  public java.lang.Long getVersionId() {
    return versionId;
  }

  /**
   * Latest successfully deployed version id of the Cloud function.
   * @param versionId versionId or {@code null} for none
   */
  public CloudFunctionInfo setVersionId(java.lang.Long versionId) {
    this.versionId = versionId;
    return this;
  }

  @Override
  public CloudFunctionInfo set(String fieldName, Object value) {
    return (CloudFunctionInfo) super.set(fieldName, value);
  }

  @Override
  public CloudFunctionInfo clone() {
    return (CloudFunctionInfo) super.clone();
  }

}
