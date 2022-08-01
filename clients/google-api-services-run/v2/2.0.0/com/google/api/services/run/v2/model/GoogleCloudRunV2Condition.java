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
 * Defines a status condition for a resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2Condition extends com.google.api.client.json.GenericJson {

  /**
   * A reason for the execution condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String executionReason;

  /**
   * Last time the condition transitioned from one status to another.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastTransitionTime;

  /**
   * Human readable message indicating details about the current status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * A common (service-level) reason for this condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * A reason for the revision condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionReason;

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String severity;

  /**
   * State of the condition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * type is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting
   * Types common to all resources include: * "Ready": True when the Resource is ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * A reason for the execution condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getExecutionReason() {
    return executionReason;
  }

  /**
   * A reason for the execution condition.
   * @param executionReason executionReason or {@code null} for none
   */
  public GoogleCloudRunV2Condition setExecutionReason(java.lang.String executionReason) {
    this.executionReason = executionReason;
    return this;
  }

  /**
   * Last time the condition transitioned from one status to another.
   * @return value or {@code null} for none
   */
  public String getLastTransitionTime() {
    return lastTransitionTime;
  }

  /**
   * Last time the condition transitioned from one status to another.
   * @param lastTransitionTime lastTransitionTime or {@code null} for none
   */
  public GoogleCloudRunV2Condition setLastTransitionTime(String lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

  /**
   * Human readable message indicating details about the current status.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * Human readable message indicating details about the current status.
   * @param message message or {@code null} for none
   */
  public GoogleCloudRunV2Condition setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * A common (service-level) reason for this condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * A common (service-level) reason for this condition.
   * @param reason reason or {@code null} for none
   */
  public GoogleCloudRunV2Condition setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * A reason for the revision condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionReason() {
    return revisionReason;
  }

  /**
   * A reason for the revision condition.
   * @param revisionReason revisionReason or {@code null} for none
   */
  public GoogleCloudRunV2Condition setRevisionReason(java.lang.String revisionReason) {
    this.revisionReason = revisionReason;
    return this;
  }

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info
   * @return value or {@code null} for none
   */
  public java.lang.String getSeverity() {
    return severity;
  }

  /**
   * How to interpret failures of this condition, one of Error, Warning, Info
   * @param severity severity or {@code null} for none
   */
  public GoogleCloudRunV2Condition setSeverity(java.lang.String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * State of the condition.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the condition.
   * @param state state or {@code null} for none
   */
  public GoogleCloudRunV2Condition setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * type is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting
   * Types common to all resources include: * "Ready": True when the Resource is ready.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * type is used to communicate the status of the reconciliation process. See also:
   * https://github.com/knative/serving/blob/main/docs/spec/errors.md#error-conditions-and-reporting
   * Types common to all resources include: * "Ready": True when the Resource is ready.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRunV2Condition setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudRunV2Condition set(String fieldName, Object value) {
    return (GoogleCloudRunV2Condition) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2Condition clone() {
    return (GoogleCloudRunV2Condition) super.clone();
  }

}
