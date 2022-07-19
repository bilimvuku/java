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

package com.google.api.services.dataplex.v1.model;

/**
 * Execution related settings, like retry and service_account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1TaskExecutionSpec extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The arguments to pass to the task. The args can use placeholders of the format
   * ${placeholder} as part of key/value string. These will be interpolated before passing the args
   * to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional
   * args, set the key as TASK_ARGS. The value should be a comma-separated string of all the
   * positional arguments. To use a delimiter other than comma, refer to
   * https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being
   * present in the args, then TASK_ARGS will be passed as the last argument.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> args;

  /**
   * Optional. The Cloud KMS key to use for encryption, of the form:
   * projects/{project_number}/locations/{location_id}/keyRings/{key-ring-name}/cryptoKeys/{key-
   * name}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Optional. The maximum duration after which the job execution is expired.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxJobExecutionLifetime;

  /**
   * Optional. The project in which jobs are run. By default, the project containing the Lake is
   * used. If a project is provided, the executionspec.service_account must belong to this same
   * project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String project;

  /**
   * Required. Service account to use to execute a task. If not provided, the default Compute
   * service account for the project is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. The arguments to pass to the task. The args can use placeholders of the format
   * ${placeholder} as part of key/value string. These will be interpolated before passing the args
   * to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional
   * args, set the key as TASK_ARGS. The value should be a comma-separated string of all the
   * positional arguments. To use a delimiter other than comma, refer to
   * https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being
   * present in the args, then TASK_ARGS will be passed as the last argument.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getArgs() {
    return args;
  }

  /**
   * Optional. The arguments to pass to the task. The args can use placeholders of the format
   * ${placeholder} as part of key/value string. These will be interpolated before passing the args
   * to the driver. Currently supported placeholders: - ${task_id} - ${job_time} To pass positional
   * args, set the key as TASK_ARGS. The value should be a comma-separated string of all the
   * positional arguments. To use a delimiter other than comma, refer to
   * https://cloud.google.com/sdk/gcloud/reference/topic/escaping. In case of other keys being
   * present in the args, then TASK_ARGS will be passed as the last argument.
   * @param args args or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionSpec setArgs(java.util.Map<String, java.lang.String> args) {
    this.args = args;
    return this;
  }

  /**
   * Optional. The Cloud KMS key to use for encryption, of the form:
   * projects/{project_number}/locations/{location_id}/keyRings/{key-ring-name}/cryptoKeys/{key-
   * name}.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Optional. The Cloud KMS key to use for encryption, of the form:
   * projects/{project_number}/locations/{location_id}/keyRings/{key-ring-name}/cryptoKeys/{key-
   * name}.
   * @param kmsKey kmsKey or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionSpec setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * Optional. The maximum duration after which the job execution is expired.
   * @return value or {@code null} for none
   */
  public String getMaxJobExecutionLifetime() {
    return maxJobExecutionLifetime;
  }

  /**
   * Optional. The maximum duration after which the job execution is expired.
   * @param maxJobExecutionLifetime maxJobExecutionLifetime or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionSpec setMaxJobExecutionLifetime(String maxJobExecutionLifetime) {
    this.maxJobExecutionLifetime = maxJobExecutionLifetime;
    return this;
  }

  /**
   * Optional. The project in which jobs are run. By default, the project containing the Lake is
   * used. If a project is provided, the executionspec.service_account must belong to this same
   * project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProject() {
    return project;
  }

  /**
   * Optional. The project in which jobs are run. By default, the project containing the Lake is
   * used. If a project is provided, the executionspec.service_account must belong to this same
   * project.
   * @param project project or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionSpec setProject(java.lang.String project) {
    this.project = project;
    return this;
  }

  /**
   * Required. Service account to use to execute a task. If not provided, the default Compute
   * service account for the project is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Required. Service account to use to execute a task. If not provided, the default Compute
   * service account for the project is used.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudDataplexV1TaskExecutionSpec setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1TaskExecutionSpec set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1TaskExecutionSpec) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1TaskExecutionSpec clone() {
    return (GoogleCloudDataplexV1TaskExecutionSpec) super.clone();
  }

}
