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

package com.google.api.services.dialogflow.v3beta1.model;

/**
 * Changelogs represents a change made to a given agent.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Dialogflow API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDialogflowCxV3beta1Changelog extends com.google.api.client.json.GenericJson {

  /**
   * The action of the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String action;

  /**
   * The timestamp of the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The affected resource display name of the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The unique identifier of the changelog. Format: `projects//locations//agents//changelogs/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The affected resource name of the change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resource;

  /**
   * The affected resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Email address of the authenticated user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String userEmail;

  /**
   * The action of the change.
   * @return value or {@code null} for none
   */
  public java.lang.String getAction() {
    return action;
  }

  /**
   * The action of the change.
   * @param action action or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setAction(java.lang.String action) {
    this.action = action;
    return this;
  }

  /**
   * The timestamp of the change.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The timestamp of the change.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The affected resource display name of the change.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The affected resource display name of the change.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The unique identifier of the changelog. Format: `projects//locations//agents//changelogs/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The unique identifier of the changelog. Format: `projects//locations//agents//changelogs/`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The affected resource name of the change.
   * @return value or {@code null} for none
   */
  public java.lang.String getResource() {
    return resource;
  }

  /**
   * The affected resource name of the change.
   * @param resource resource or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setResource(java.lang.String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The affected resource type.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The affected resource type.
   * @param type type or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Email address of the authenticated user.
   * @return value or {@code null} for none
   */
  public java.lang.String getUserEmail() {
    return userEmail;
  }

  /**
   * Email address of the authenticated user.
   * @param userEmail userEmail or {@code null} for none
   */
  public GoogleCloudDialogflowCxV3beta1Changelog setUserEmail(java.lang.String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Changelog set(String fieldName, Object value) {
    return (GoogleCloudDialogflowCxV3beta1Changelog) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDialogflowCxV3beta1Changelog clone() {
    return (GoogleCloudDialogflowCxV3beta1Changelog) super.clone();
  }

}
