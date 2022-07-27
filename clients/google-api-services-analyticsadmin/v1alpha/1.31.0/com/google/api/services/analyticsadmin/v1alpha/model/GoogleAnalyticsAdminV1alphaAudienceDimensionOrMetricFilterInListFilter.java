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

package com.google.api.services.analyticsadmin.v1alpha.model;

/**
 * A filter for a string dimension that matches a particular list of options.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Analytics Admin API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If true, the match is case-sensitive. If false, the match is case-insensitive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean caseSensitive;

  /**
   * Required. The list of possible string values to match against. Must be non-empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> values;

  /**
   * Optional. If true, the match is case-sensitive. If false, the match is case-insensitive.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCaseSensitive() {
    return caseSensitive;
  }

  /**
   * Optional. If true, the match is case-sensitive. If false, the match is case-insensitive.
   * @param caseSensitive caseSensitive or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter setCaseSensitive(java.lang.Boolean caseSensitive) {
    this.caseSensitive = caseSensitive;
    return this;
  }

  /**
   * Required. The list of possible string values to match against. Must be non-empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getValues() {
    return values;
  }

  /**
   * Required. The list of possible string values to match against. Must be non-empty.
   * @param values values or {@code null} for none
   */
  public GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter setValues(java.util.List<java.lang.String> values) {
    this.values = values;
    return this;
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter set(String fieldName, Object value) {
    return (GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter) super.set(fieldName, value);
  }

  @Override
  public GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter clone() {
    return (GoogleAnalyticsAdminV1alphaAudienceDimensionOrMetricFilterInListFilter) super.clone();
  }

}
