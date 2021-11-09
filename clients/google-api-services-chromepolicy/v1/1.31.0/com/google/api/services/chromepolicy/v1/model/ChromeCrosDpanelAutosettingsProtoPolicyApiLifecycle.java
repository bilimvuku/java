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

package com.google.api.services.chromepolicy.v1.model;

/**
 * Model definition for ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Chrome Policy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle extends com.google.api.client.json.GenericJson {

  /**
   * Description about current life cycle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * End supporting date for current policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleTypeDate endSupport;

  /**
   * Indicate current life cycle stage of the policy API.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String policyApiLifecycleStage;

  /**
   * Description about current life cycle.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description about current life cycle.
   * @param description description or {@code null} for none
   */
  public ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * End supporting date for current policy.
   * @return value or {@code null} for none
   */
  public GoogleTypeDate getEndSupport() {
    return endSupport;
  }

  /**
   * End supporting date for current policy.
   * @param endSupport endSupport or {@code null} for none
   */
  public ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle setEndSupport(GoogleTypeDate endSupport) {
    this.endSupport = endSupport;
    return this;
  }

  /**
   * Indicate current life cycle stage of the policy API.
   * @return value or {@code null} for none
   */
  public java.lang.String getPolicyApiLifecycleStage() {
    return policyApiLifecycleStage;
  }

  /**
   * Indicate current life cycle stage of the policy API.
   * @param policyApiLifecycleStage policyApiLifecycleStage or {@code null} for none
   */
  public ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle setPolicyApiLifecycleStage(java.lang.String policyApiLifecycleStage) {
    this.policyApiLifecycleStage = policyApiLifecycleStage;
    return this;
  }

  @Override
  public ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle set(String fieldName, Object value) {
    return (ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle) super.set(fieldName, value);
  }

  @Override
  public ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle clone() {
    return (ChromeCrosDpanelAutosettingsProtoPolicyApiLifecycle) super.clone();
  }

}
