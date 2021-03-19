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

package com.google.api.services.monitoring.v3.model;

/**
 * This message configures which resources and services to monitor for availability.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Monitoring API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UptimeCheckConfig extends com.google.api.client.json.GenericJson {

  /**
   * The content that is expected to appear in the data returned by the target server against which
   * the check is run. Currently, only the first entry in the content_matchers list is supported,
   * and additional entries will be ignored. This field is optional and should only be specified if
   * a content match is required as part of the/ Uptime check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ContentMatcher> contentMatchers;

  static {
    // hack to force ProGuard to consider ContentMatcher used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ContentMatcher.class);
  }

  /**
   * A human-friendly name for the Uptime check configuration. The display name should be unique
   * within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is
   * not enforced. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Contains information needed to make an HTTP or HTTPS check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HttpCheck httpCheck;

  /**
   * The internal checkers that this check will egress from. If is_internal is true and this list is
   * empty, the check will egress from all the InternalCheckers configured for the project that owns
   * this UptimeCheckConfig.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InternalChecker> internalCheckers;

  static {
    // hack to force ProGuard to consider InternalChecker used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(InternalChecker.class);
  }

  /**
   * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then
   * checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions'
   * when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isInternal;

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the
   * configuration. The following monitored resource types are valid for this field: uptime_url,
   * gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MonitoredResource monitoredResource;

  /**
   * A unique resource name for this Uptime check configuration. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is
   * the Workspace host project associated with the Uptime check.This field should be omitted when
   * creating the Uptime check configuration; on create, the resource name is assigned by the server
   * and included in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * How often, in seconds, the Uptime check is performed. Currently, the only supported values are
   * 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults
   * to 60s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String period;

  /**
   * The group resource associated with the configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResourceGroup resourceGroup;

  /**
   * The list of regions from which the check will be run. Some regions contain one location, and
   * others contain more than one. If this field is specified, enough regions must be provided to
   * include a minimum of 3 locations. Not specifying this field will result in Uptime checks
   * running from all available regions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> selectedRegions;

  /**
   * Contains information needed to make a TCP check.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TcpCheck tcpCheck;

  /**
   * The maximum amount of time to wait for the request to complete (must be between 1 and 60
   * seconds). Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timeout;

  /**
   * The content that is expected to appear in the data returned by the target server against which
   * the check is run. Currently, only the first entry in the content_matchers list is supported,
   * and additional entries will be ignored. This field is optional and should only be specified if
   * a content match is required as part of the/ Uptime check.
   * @return value or {@code null} for none
   */
  public java.util.List<ContentMatcher> getContentMatchers() {
    return contentMatchers;
  }

  /**
   * The content that is expected to appear in the data returned by the target server against which
   * the check is run. Currently, only the first entry in the content_matchers list is supported,
   * and additional entries will be ignored. This field is optional and should only be specified if
   * a content match is required as part of the/ Uptime check.
   * @param contentMatchers contentMatchers or {@code null} for none
   */
  public UptimeCheckConfig setContentMatchers(java.util.List<ContentMatcher> contentMatchers) {
    this.contentMatchers = contentMatchers;
    return this;
  }

  /**
   * A human-friendly name for the Uptime check configuration. The display name should be unique
   * within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is
   * not enforced. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * A human-friendly name for the Uptime check configuration. The display name should be unique
   * within a Stackdriver Workspace in order to make it easier to identify; however, uniqueness is
   * not enforced. Required.
   * @param displayName displayName or {@code null} for none
   */
  public UptimeCheckConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Contains information needed to make an HTTP or HTTPS check.
   * @return value or {@code null} for none
   */
  public HttpCheck getHttpCheck() {
    return httpCheck;
  }

  /**
   * Contains information needed to make an HTTP or HTTPS check.
   * @param httpCheck httpCheck or {@code null} for none
   */
  public UptimeCheckConfig setHttpCheck(HttpCheck httpCheck) {
    this.httpCheck = httpCheck;
    return this;
  }

  /**
   * The internal checkers that this check will egress from. If is_internal is true and this list is
   * empty, the check will egress from all the InternalCheckers configured for the project that owns
   * this UptimeCheckConfig.
   * @return value or {@code null} for none
   */
  public java.util.List<InternalChecker> getInternalCheckers() {
    return internalCheckers;
  }

  /**
   * The internal checkers that this check will egress from. If is_internal is true and this list is
   * empty, the check will egress from all the InternalCheckers configured for the project that owns
   * this UptimeCheckConfig.
   * @param internalCheckers internalCheckers or {@code null} for none
   */
  public UptimeCheckConfig setInternalCheckers(java.util.List<InternalChecker> internalCheckers) {
    this.internalCheckers = internalCheckers;
    return this;
  }

  /**
   * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then
   * checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions'
   * when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsInternal() {
    return isInternal;
  }

  /**
   * If this is true, then checks are made only from the 'internal_checkers'. If it is false, then
   * checks are made only from the 'selected_regions'. It is an error to provide 'selected_regions'
   * when is_internal is true, or to provide 'internal_checkers' when is_internal is false.
   * @param isInternal isInternal or {@code null} for none
   */
  public UptimeCheckConfig setIsInternal(java.lang.Boolean isInternal) {
    this.isInternal = isInternal;
    return this;
  }

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the
   * configuration. The following monitored resource types are valid for this field: uptime_url,
   * gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer
   * @return value or {@code null} for none
   */
  public MonitoredResource getMonitoredResource() {
    return monitoredResource;
  }

  /**
   * The monitored resource (https://cloud.google.com/monitoring/api/resources) associated with the
   * configuration. The following monitored resource types are valid for this field: uptime_url,
   * gce_instance, gae_app, aws_ec2_instance, aws_elb_load_balancer
   * @param monitoredResource monitoredResource or {@code null} for none
   */
  public UptimeCheckConfig setMonitoredResource(MonitoredResource monitoredResource) {
    this.monitoredResource = monitoredResource;
    return this;
  }

  /**
   * A unique resource name for this Uptime check configuration. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is
   * the Workspace host project associated with the Uptime check.This field should be omitted when
   * creating the Uptime check configuration; on create, the resource name is assigned by the server
   * and included in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A unique resource name for this Uptime check configuration. The format is:
   * projects/[PROJECT_ID_OR_NUMBER]/uptimeCheckConfigs/[UPTIME_CHECK_ID] [PROJECT_ID_OR_NUMBER] is
   * the Workspace host project associated with the Uptime check.This field should be omitted when
   * creating the Uptime check configuration; on create, the resource name is assigned by the server
   * and included in the response.
   * @param name name or {@code null} for none
   */
  public UptimeCheckConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * How often, in seconds, the Uptime check is performed. Currently, the only supported values are
   * 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults
   * to 60s.
   * @return value or {@code null} for none
   */
  public String getPeriod() {
    return period;
  }

  /**
   * How often, in seconds, the Uptime check is performed. Currently, the only supported values are
   * 60s (1 minute), 300s (5 minutes), 600s (10 minutes), and 900s (15 minutes). Optional, defaults
   * to 60s.
   * @param period period or {@code null} for none
   */
  public UptimeCheckConfig setPeriod(String period) {
    this.period = period;
    return this;
  }

  /**
   * The group resource associated with the configuration.
   * @return value or {@code null} for none
   */
  public ResourceGroup getResourceGroup() {
    return resourceGroup;
  }

  /**
   * The group resource associated with the configuration.
   * @param resourceGroup resourceGroup or {@code null} for none
   */
  public UptimeCheckConfig setResourceGroup(ResourceGroup resourceGroup) {
    this.resourceGroup = resourceGroup;
    return this;
  }

  /**
   * The list of regions from which the check will be run. Some regions contain one location, and
   * others contain more than one. If this field is specified, enough regions must be provided to
   * include a minimum of 3 locations. Not specifying this field will result in Uptime checks
   * running from all available regions.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSelectedRegions() {
    return selectedRegions;
  }

  /**
   * The list of regions from which the check will be run. Some regions contain one location, and
   * others contain more than one. If this field is specified, enough regions must be provided to
   * include a minimum of 3 locations. Not specifying this field will result in Uptime checks
   * running from all available regions.
   * @param selectedRegions selectedRegions or {@code null} for none
   */
  public UptimeCheckConfig setSelectedRegions(java.util.List<java.lang.String> selectedRegions) {
    this.selectedRegions = selectedRegions;
    return this;
  }

  /**
   * Contains information needed to make a TCP check.
   * @return value or {@code null} for none
   */
  public TcpCheck getTcpCheck() {
    return tcpCheck;
  }

  /**
   * Contains information needed to make a TCP check.
   * @param tcpCheck tcpCheck or {@code null} for none
   */
  public UptimeCheckConfig setTcpCheck(TcpCheck tcpCheck) {
    this.tcpCheck = tcpCheck;
    return this;
  }

  /**
   * The maximum amount of time to wait for the request to complete (must be between 1 and 60
   * seconds). Required.
   * @return value or {@code null} for none
   */
  public String getTimeout() {
    return timeout;
  }

  /**
   * The maximum amount of time to wait for the request to complete (must be between 1 and 60
   * seconds). Required.
   * @param timeout timeout or {@code null} for none
   */
  public UptimeCheckConfig setTimeout(String timeout) {
    this.timeout = timeout;
    return this;
  }

  @Override
  public UptimeCheckConfig set(String fieldName, Object value) {
    return (UptimeCheckConfig) super.set(fieldName, value);
  }

  @Override
  public UptimeCheckConfig clone() {
    return (UptimeCheckConfig) super.clone();
  }

}
