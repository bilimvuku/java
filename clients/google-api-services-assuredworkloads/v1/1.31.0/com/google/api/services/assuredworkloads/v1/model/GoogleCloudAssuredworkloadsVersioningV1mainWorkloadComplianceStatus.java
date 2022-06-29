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

package com.google.api.services.assuredworkloads.v1.model;

/**
 * Represents the Compliance Status of this workload
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Count of active Violations in the Workload.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer activeViolationCount;

  /**
   * Optional. Count of active Violations in the Workload.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getActiveViolationCount() {
    return activeViolationCount;
  }

  /**
   * Optional. Count of active Violations in the Workload.
   * @param activeViolationCount activeViolationCount or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus setActiveViolationCount(java.lang.Integer activeViolationCount) {
    this.activeViolationCount = activeViolationCount;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus clone() {
    return (GoogleCloudAssuredworkloadsVersioningV1mainWorkloadComplianceStatus) super.clone();
  }

}
