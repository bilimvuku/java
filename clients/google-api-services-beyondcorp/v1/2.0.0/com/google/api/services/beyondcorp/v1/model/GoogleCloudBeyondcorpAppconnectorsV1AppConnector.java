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

package com.google.api.services.beyondcorp.v1.model;

/**
 * A BeyondCorp connector resource that represents an application facing component deployed proximal
 * to and with direct access to the application instances. It is used to establish connectivity
 * between the remote enterprise environment and GCP. It initiates connections to the applications
 * and can proxy the data from users over the connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpAppconnectorsV1AppConnector extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. An arbitrary user-provided name for the AppConnector. Cannot exceed 64 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Optional. Resource labels to represent user provided metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Unique resource name of the AppConnector. The name is ignored when creating a
   * AppConnector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Principal information about the Identity of the AppConnector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo principalInfo;

  /**
   * Optional. Resource info of the connector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudBeyondcorpAppconnectorsV1ResourceInfo resourceInfo;

  /**
   * Output only. The current state of the AppConnector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. Timestamp when the resource was last modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. An arbitrary user-provided name for the AppConnector. Cannot exceed 64 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. An arbitrary user-provided name for the AppConnector. Cannot exceed 64 characters.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Optional. Resource labels to represent user provided metadata.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Resource labels to represent user provided metadata.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Unique resource name of the AppConnector. The name is ignored when creating a
   * AppConnector.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique resource name of the AppConnector. The name is ignored when creating a
   * AppConnector.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Principal information about the Identity of the AppConnector.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo getPrincipalInfo() {
    return principalInfo;
  }

  /**
   * Required. Principal information about the Identity of the AppConnector.
   * @param principalInfo principalInfo or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setPrincipalInfo(GoogleCloudBeyondcorpAppconnectorsV1AppConnectorPrincipalInfo principalInfo) {
    this.principalInfo = principalInfo;
    return this;
  }

  /**
   * Optional. Resource info of the connector.
   * @return value or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1ResourceInfo getResourceInfo() {
    return resourceInfo;
  }

  /**
   * Optional. Resource info of the connector.
   * @param resourceInfo resourceInfo or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setResourceInfo(GoogleCloudBeyondcorpAppconnectorsV1ResourceInfo resourceInfo) {
    this.resourceInfo = resourceInfo;
    return this;
  }

  /**
   * Output only. The current state of the AppConnector.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the AppConnector.
   * @param state state or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. A unique identifier for the instance generated by the system.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when the resource was last modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpAppconnectorsV1AppConnector) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectorsV1AppConnector clone() {
    return (GoogleCloudBeyondcorpAppconnectorsV1AppConnector) super.clone();
  }

}
