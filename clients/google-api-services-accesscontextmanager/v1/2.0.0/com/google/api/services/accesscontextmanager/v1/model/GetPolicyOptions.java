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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * Encapsulates settings provided to GetIamPolicy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GetPolicyOptions extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The maximum policy version that will be used to format the policy. Valid values are
   * 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with
   * any conditional role bindings must specify version 3. Policies with no conditional role
   * bindings may specify any valid value or leave the field unset. The policy in the response might
   * use the policy version that you specified, or it might use a lower policy version. For example,
   * if you specify version 3, but the policy has no conditional role bindings, the response uses
   * version 1. To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer requestedPolicyVersion;

  /**
   * Optional. The maximum policy version that will be used to format the policy. Valid values are
   * 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with
   * any conditional role bindings must specify version 3. Policies with no conditional role
   * bindings may specify any valid value or leave the field unset. The policy in the response might
   * use the policy version that you specified, or it might use a lower policy version. For example,
   * if you specify version 3, but the policy has no conditional role bindings, the response uses
   * version 1. To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRequestedPolicyVersion() {
    return requestedPolicyVersion;
  }

  /**
   * Optional. The maximum policy version that will be used to format the policy. Valid values are
   * 0, 1, and 3. Requests specifying an invalid value will be rejected. Requests for policies with
   * any conditional role bindings must specify version 3. Policies with no conditional role
   * bindings may specify any valid value or leave the field unset. The policy in the response might
   * use the policy version that you specified, or it might use a lower policy version. For example,
   * if you specify version 3, but the policy has no conditional role bindings, the response uses
   * version 1. To learn which resources support conditions in their IAM policies, see the [IAM
   * documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
   * @param requestedPolicyVersion requestedPolicyVersion or {@code null} for none
   */
  public GetPolicyOptions setRequestedPolicyVersion(java.lang.Integer requestedPolicyVersion) {
    this.requestedPolicyVersion = requestedPolicyVersion;
    return this;
  }

  @Override
  public GetPolicyOptions set(String fieldName, Object value) {
    return (GetPolicyOptions) super.set(fieldName, value);
  }

  @Override
  public GetPolicyOptions clone() {
    return (GetPolicyOptions) super.clone();
  }

}
