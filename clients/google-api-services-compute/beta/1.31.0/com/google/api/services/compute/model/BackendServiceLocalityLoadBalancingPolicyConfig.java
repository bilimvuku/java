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

package com.google.api.services.compute.model;

/**
 * Container for either a built-in LB policy supported by gRPC or Envoy or a custom one implemented
 * by the end user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BackendServiceLocalityLoadBalancingPolicyConfig extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy customPolicy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackendServiceLocalityLoadBalancingPolicyConfigPolicy policy;

  /**
   * @return value or {@code null} for none
   */
  public BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy getCustomPolicy() {
    return customPolicy;
  }

  /**
   * @param customPolicy customPolicy or {@code null} for none
   */
  public BackendServiceLocalityLoadBalancingPolicyConfig setCustomPolicy(BackendServiceLocalityLoadBalancingPolicyConfigCustomPolicy customPolicy) {
    this.customPolicy = customPolicy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public BackendServiceLocalityLoadBalancingPolicyConfigPolicy getPolicy() {
    return policy;
  }

  /**
   * @param policy policy or {@code null} for none
   */
  public BackendServiceLocalityLoadBalancingPolicyConfig setPolicy(BackendServiceLocalityLoadBalancingPolicyConfigPolicy policy) {
    this.policy = policy;
    return this;
  }

  @Override
  public BackendServiceLocalityLoadBalancingPolicyConfig set(String fieldName, Object value) {
    return (BackendServiceLocalityLoadBalancingPolicyConfig) super.set(fieldName, value);
  }

  @Override
  public BackendServiceLocalityLoadBalancingPolicyConfig clone() {
    return (BackendServiceLocalityLoadBalancingPolicyConfig) super.clone();
  }

}
