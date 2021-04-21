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

package com.google.api.services.serviceusage.v1beta1.model;

/**
 * A quota override
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Usage API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuotaOverride extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the ancestor that requested the override. For example:
   * `organizations/12345` or `folders/67890`. Used by admin overrides only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adminOverrideAncestor;

  /**
   * If this map is nonempty, then this override applies only to specific values for dimensions
   * defined in the limit unit. For example, an override on a limit with the unit
   * `1/{project}/{region}` could contain an entry with the key `region` and the value `us-east-1`;
   * the override is only applied to quota consumed in that region. This map has the following
   * restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string
   * appearing in `{brackets}` in the unit (besides `{project}` or `{user}`) is a defined key. *
   * `project` is not a valid key; the project is already specified in the parent resource name. *
   * `user` is not a valid key; the API does not support quota overrides that apply only to a
   * specific user. * If `region` appears as a key, its value must be a valid Cloud region. * If
   * `zone` appears as a key, its value must be a valid Cloud zone. * If any valid key other than
   * `region` or `zone` appears in the map, then all valid keys other than `region` or `zone` must
   * also appear in the map.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> dimensions;

  /**
   * The name of the metric to which this override applies. An example name would be:
   * `compute.googleapis.com/cpus`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metric;

  /**
   * The resource name of the override. This name is generated by the server when the override is
   * created. Example names would be: `projects/123/services/compute.googleapis.com/consumerQuotaMet
   * rics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d` `project
   * s/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits
   * /%2Fproject%2Fregion/consumerOverrides/4a3f2c1d` The resource name is intended to be opaque and
   * should not be parsed for its component strings, since its representation could change in the
   * future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long overrideValue;

  /**
   * The limit unit of the limit to which this override applies. An example unit would be:
   * `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this
   * example; the literal characters `{` and `}` occur in the string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * The resource name of the ancestor that requested the override. For example:
   * `organizations/12345` or `folders/67890`. Used by admin overrides only.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdminOverrideAncestor() {
    return adminOverrideAncestor;
  }

  /**
   * The resource name of the ancestor that requested the override. For example:
   * `organizations/12345` or `folders/67890`. Used by admin overrides only.
   * @param adminOverrideAncestor adminOverrideAncestor or {@code null} for none
   */
  public QuotaOverride setAdminOverrideAncestor(java.lang.String adminOverrideAncestor) {
    this.adminOverrideAncestor = adminOverrideAncestor;
    return this;
  }

  /**
   * If this map is nonempty, then this override applies only to specific values for dimensions
   * defined in the limit unit. For example, an override on a limit with the unit
   * `1/{project}/{region}` could contain an entry with the key `region` and the value `us-east-1`;
   * the override is only applied to quota consumed in that region. This map has the following
   * restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string
   * appearing in `{brackets}` in the unit (besides `{project}` or `{user}`) is a defined key. *
   * `project` is not a valid key; the project is already specified in the parent resource name. *
   * `user` is not a valid key; the API does not support quota overrides that apply only to a
   * specific user. * If `region` appears as a key, its value must be a valid Cloud region. * If
   * `zone` appears as a key, its value must be a valid Cloud zone. * If any valid key other than
   * `region` or `zone` appears in the map, then all valid keys other than `region` or `zone` must
   * also appear in the map.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * If this map is nonempty, then this override applies only to specific values for dimensions
   * defined in the limit unit. For example, an override on a limit with the unit
   * `1/{project}/{region}` could contain an entry with the key `region` and the value `us-east-1`;
   * the override is only applied to quota consumed in that region. This map has the following
   * restrictions: * Keys that are not defined in the limit's unit are not valid keys. Any string
   * appearing in `{brackets}` in the unit (besides `{project}` or `{user}`) is a defined key. *
   * `project` is not a valid key; the project is already specified in the parent resource name. *
   * `user` is not a valid key; the API does not support quota overrides that apply only to a
   * specific user. * If `region` appears as a key, its value must be a valid Cloud region. * If
   * `zone` appears as a key, its value must be a valid Cloud zone. * If any valid key other than
   * `region` or `zone` appears in the map, then all valid keys other than `region` or `zone` must
   * also appear in the map.
   * @param dimensions dimensions or {@code null} for none
   */
  public QuotaOverride setDimensions(java.util.Map<String, java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * The name of the metric to which this override applies. An example name would be:
   * `compute.googleapis.com/cpus`
   * @return value or {@code null} for none
   */
  public java.lang.String getMetric() {
    return metric;
  }

  /**
   * The name of the metric to which this override applies. An example name would be:
   * `compute.googleapis.com/cpus`
   * @param metric metric or {@code null} for none
   */
  public QuotaOverride setMetric(java.lang.String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * The resource name of the override. This name is generated by the server when the override is
   * created. Example names would be: `projects/123/services/compute.googleapis.com/consumerQuotaMet
   * rics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d` `project
   * s/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits
   * /%2Fproject%2Fregion/consumerOverrides/4a3f2c1d` The resource name is intended to be opaque and
   * should not be parsed for its component strings, since its representation could change in the
   * future.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the override. This name is generated by the server when the override is
   * created. Example names would be: `projects/123/services/compute.googleapis.com/consumerQuotaMet
   * rics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion/adminOverrides/4a3f2c1d` `project
   * s/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits
   * /%2Fproject%2Fregion/consumerOverrides/4a3f2c1d` The resource name is intended to be opaque and
   * should not be parsed for its component strings, since its representation could change in the
   * future.
   * @param name name or {@code null} for none
   */
  public QuotaOverride setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
   * @return value or {@code null} for none
   */
  public java.lang.Long getOverrideValue() {
    return overrideValue;
  }

  /**
   * The overriding quota limit value. Can be any nonnegative integer, or -1 (unlimited quota).
   * @param overrideValue overrideValue or {@code null} for none
   */
  public QuotaOverride setOverrideValue(java.lang.Long overrideValue) {
    this.overrideValue = overrideValue;
    return this;
  }

  /**
   * The limit unit of the limit to which this override applies. An example unit would be:
   * `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this
   * example; the literal characters `{` and `}` occur in the string.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * The limit unit of the limit to which this override applies. An example unit would be:
   * `1/{project}/{region}` Note that `{project}` and `{region}` are not placeholders in this
   * example; the literal characters `{` and `}` occur in the string.
   * @param unit unit or {@code null} for none
   */
  public QuotaOverride setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  @Override
  public QuotaOverride set(String fieldName, Object value) {
    return (QuotaOverride) super.set(fieldName, value);
  }

  @Override
  public QuotaOverride clone() {
    return (QuotaOverride) super.clone();
  }

}
