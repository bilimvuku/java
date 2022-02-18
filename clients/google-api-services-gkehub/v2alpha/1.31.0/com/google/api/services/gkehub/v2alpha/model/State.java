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

package com.google.api.services.gkehub.v2alpha.model;

/**
 * High-level state of a MembershipFeature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class State extends com.google.api.client.json.GenericJson {

  /**
   * The high-level, machine-readable status of this MembershipFeature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * A human-readable description of the current status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The time this status and any related Feature-specific details were updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The high-level, machine-readable status of this MembershipFeature.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The high-level, machine-readable status of this MembershipFeature.
   * @param code code or {@code null} for none
   */
  public State setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * A human-readable description of the current status.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A human-readable description of the current status.
   * @param description description or {@code null} for none
   */
  public State setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The time this status and any related Feature-specific details were updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time this status and any related Feature-specific details were updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public State setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public State set(String fieldName, Object value) {
    return (State) super.set(fieldName, value);
  }

  @Override
  public State clone() {
    return (State) super.clone();
  }

}
