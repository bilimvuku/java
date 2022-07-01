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

package com.google.api.services.firebaserules.v1.model;

/**
 * `Release` is a named reference to a `Ruleset`. Once a `Release` refers to a `Ruleset`, rules-
 * enabled services will be able to enforce the `Ruleset`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Release extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Time the release was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Format: `projects/{project_id}/releases/{release_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the
   * `Release` to be created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rulesetName;

  /**
   * Output only. Time the release was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. Time the release was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time the release was created.
   * @param createTime createTime or {@code null} for none
   */
  public Release setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Format: `projects/{project_id}/releases/{release_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Format: `projects/{project_id}/releases/{release_id}`
   * @param name name or {@code null} for none
   */
  public Release setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the
   * `Release` to be created.
   * @return value or {@code null} for none
   */
  public java.lang.String getRulesetName() {
    return rulesetName;
  }

  /**
   * Required. Name of the `Ruleset` referred to by this `Release`. The `Ruleset` must exist for the
   * `Release` to be created.
   * @param rulesetName rulesetName or {@code null} for none
   */
  public Release setRulesetName(java.lang.String rulesetName) {
    this.rulesetName = rulesetName;
    return this;
  }

  /**
   * Output only. Time the release was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Time the release was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Release setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Release set(String fieldName, Object value) {
    return (Release) super.set(fieldName, value);
  }

  @Override
  public Release clone() {
    return (Release) super.clone();
  }

}
