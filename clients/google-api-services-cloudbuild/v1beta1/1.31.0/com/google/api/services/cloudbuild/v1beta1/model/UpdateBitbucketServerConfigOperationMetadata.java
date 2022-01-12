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
 * Metadata for `UpdateBitbucketServerConfig` operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateBitbucketServerConfigOperationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the BitbucketServerConfig to be updated. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bitbucketServerConfig;

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
   * The resource name of the BitbucketServerConfig to be updated. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getBitbucketServerConfig() {
    return bitbucketServerConfig;
  }

  /**
   * The resource name of the BitbucketServerConfig to be updated. Format:
   * `projects/{project}/locations/{location}/bitbucketServerConfigs/{id}`.
   * @param bitbucketServerConfig bitbucketServerConfig or {@code null} for none
   */
  public UpdateBitbucketServerConfigOperationMetadata setBitbucketServerConfig(java.lang.String bitbucketServerConfig) {
    this.bitbucketServerConfig = bitbucketServerConfig;
    return this;
  }

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
  public UpdateBitbucketServerConfigOperationMetadata setCompleteTime(String completeTime) {
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
  public UpdateBitbucketServerConfigOperationMetadata setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  @Override
  public UpdateBitbucketServerConfigOperationMetadata set(String fieldName, Object value) {
    return (UpdateBitbucketServerConfigOperationMetadata) super.set(fieldName, value);
  }

  @Override
  public UpdateBitbucketServerConfigOperationMetadata clone() {
    return (UpdateBitbucketServerConfigOperationMetadata) super.clone();
  }

}
