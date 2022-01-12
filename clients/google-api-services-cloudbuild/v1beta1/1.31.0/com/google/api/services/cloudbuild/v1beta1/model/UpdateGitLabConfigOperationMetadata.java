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

package com.google.api.services.cloudbuild.v1beta1.model;

/**
 * Metadata for `UpdateGitLabConfig` operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateGitLabConfigOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Time the operation was completed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completeTime;

  /**
   * Time the operation was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The resource name of the GitLabConfig to be created. Format:
   * `projects/{project}/locations/{location}/gitlabConfigs/{id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gitlabConfig;

  /**
   * Time the operation was completed.
   * @return value or {@code null} for none
   */
  public String getCompleteTime() {
    return completeTime;
  }

  /**
   * Time the operation was completed.
   * @param completeTime completeTime or {@code null} for none
   */
  public UpdateGitLabConfigOperationMetadata setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * Time the operation was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Time the operation was created.
   * @param createTime createTime or {@code null} for none
   */
  public UpdateGitLabConfigOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The resource name of the GitLabConfig to be created. Format:
   * `projects/{project}/locations/{location}/gitlabConfigs/{id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getGitlabConfig() {
    return gitlabConfig;
  }

  /**
   * The resource name of the GitLabConfig to be created. Format:
   * `projects/{project}/locations/{location}/gitlabConfigs/{id}`.
   * @param gitlabConfig gitlabConfig or {@code null} for none
   */
  public UpdateGitLabConfigOperationMetadata setGitlabConfig(java.lang.String gitlabConfig) {
    this.gitlabConfig = gitlabConfig;
    return this;
  }

  @Override
  public UpdateGitLabConfigOperationMetadata set(String fieldName, Object value) {
    return (UpdateGitLabConfigOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public UpdateGitLabConfigOperationMetadata clone() {
    return (UpdateGitLabConfigOperationMetadata) super.clone();
  }

}
