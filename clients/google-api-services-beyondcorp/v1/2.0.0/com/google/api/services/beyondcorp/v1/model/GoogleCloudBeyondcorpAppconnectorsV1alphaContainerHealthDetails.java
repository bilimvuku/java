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
 * ContainerHealthDetails reflects the health details of a container.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails extends com.google.api.client.json.GenericJson {

  /**
   * The version of the current config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentConfigVersion;

  /**
   * The latest error message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMsg;

  /**
   * The version of the expected config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String expectedConfigVersion;

  /**
   * The extended status. Such as ExitCode, StartedAt, FinishedAt, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> extendedStatus;

  /**
   * The version of the current config.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentConfigVersion() {
    return currentConfigVersion;
  }

  /**
   * The version of the current config.
   * @param currentConfigVersion currentConfigVersion or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails setCurrentConfigVersion(java.lang.String currentConfigVersion) {
    this.currentConfigVersion = currentConfigVersion;
    return this;
  }

  /**
   * The latest error message.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMsg() {
    return errorMsg;
  }

  /**
   * The latest error message.
   * @param errorMsg errorMsg or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails setErrorMsg(java.lang.String errorMsg) {
    this.errorMsg = errorMsg;
    return this;
  }

  /**
   * The version of the expected config.
   * @return value or {@code null} for none
   */
  public java.lang.String getExpectedConfigVersion() {
    return expectedConfigVersion;
  }

  /**
   * The version of the expected config.
   * @param expectedConfigVersion expectedConfigVersion or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails setExpectedConfigVersion(java.lang.String expectedConfigVersion) {
    this.expectedConfigVersion = expectedConfigVersion;
    return this;
  }

  /**
   * The extended status. Such as ExitCode, StartedAt, FinishedAt, etc.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getExtendedStatus() {
    return extendedStatus;
  }

  /**
   * The extended status. Such as ExitCode, StartedAt, FinishedAt, etc.
   * @param extendedStatus extendedStatus or {@code null} for none
   */
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails setExtendedStatus(java.util.Map<String, java.lang.String> extendedStatus) {
    this.extendedStatus = extendedStatus;
    return this;
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails set(String fieldName, Object value) {
    return (GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails clone() {
    return (GoogleCloudBeyondcorpAppconnectorsV1alphaContainerHealthDetails) super.clone();
  }

}
