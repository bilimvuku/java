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

package com.google.api.services.domains.v1beta1.model;

/**
 * Request for the `ImportDomain` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Domains API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportDomainRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domainName;

  /**
   * Set of labels associated with the `Registration`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomainName() {
    return domainName;
  }

  /**
   * Required. The domain name. Unicode domain names must be expressed in Punycode format.
   * @param domainName domainName or {@code null} for none
   */
  public ImportDomainRequest setDomainName(java.lang.String domainName) {
    this.domainName = domainName;
    return this;
  }

  /**
   * Set of labels associated with the `Registration`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Set of labels associated with the `Registration`.
   * @param labels labels or {@code null} for none
   */
  public ImportDomainRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  @Override
  public ImportDomainRequest set(String fieldName, Object value) {
    return (ImportDomainRequest) super.set(fieldName, value);
  }

  @Override
  public ImportDomainRequest clone() {
    return (ImportDomainRequest) super.clone();
  }

}
