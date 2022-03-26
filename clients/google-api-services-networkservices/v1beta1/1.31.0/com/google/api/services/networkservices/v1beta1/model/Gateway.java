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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * Gateway represents the configuration for a proxy, typically a load balancer. It captures the
 * ip:port over which the services are exposed by the proxy, along with any policy configurations.
 * Routes have reference to to Gateways to dictate how requests should be routed by this Gateway.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Gateway extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The timestamp when the resource was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Set of label tags associated with the Gateway resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Name of the Gateway resource. It matches pattern
   * `projects/locations/global/gateways/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. One or more ports that the Gateway must receive traffic on. The proxy binds to the
   * ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> ports;

  /**
   * Required. Immutable. Scope determines how configuration across multiple Gateway instances are
   * merged. The configuration for multiple Gateway instances with the same scope will be merged as
   * presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope
   * should start with a letter and can only have letters, numbers, hyphens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * Output only. Server-defined URL of this resource
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is
   * terminated. If empty, TLS termination is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serverTlsPolicy;

  /**
   * Immutable. The type of the customer managed gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The timestamp when the resource was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The timestamp when the resource was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp when the resource was created.
   * @param createTime createTime or {@code null} for none
   */
  public Gateway setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. A free-text description of the resource. Max length 1024 characters.
   * @param description description or {@code null} for none
   */
  public Gateway setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Set of label tags associated with the Gateway resource.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. Set of label tags associated with the Gateway resource.
   * @param labels labels or {@code null} for none
   */
  public Gateway setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Name of the Gateway resource. It matches pattern
   * `projects/locations/global/gateways/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the Gateway resource. It matches pattern
   * `projects/locations/global/gateways/`.
   * @param name name or {@code null} for none
   */
  public Gateway setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. One or more ports that the Gateway must receive traffic on. The proxy binds to the
   * ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getPorts() {
    return ports;
  }

  /**
   * Required. One or more ports that the Gateway must receive traffic on. The proxy binds to the
   * ports specified. Gateway listen on 0.0.0.0 on the ports specified below.
   * @param ports ports or {@code null} for none
   */
  public Gateway setPorts(java.util.List<java.lang.Integer> ports) {
    this.ports = ports;
    return this;
  }

  /**
   * Required. Immutable. Scope determines how configuration across multiple Gateway instances are
   * merged. The configuration for multiple Gateway instances with the same scope will be merged as
   * presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope
   * should start with a letter and can only have letters, numbers, hyphens.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * Required. Immutable. Scope determines how configuration across multiple Gateway instances are
   * merged. The configuration for multiple Gateway instances with the same scope will be merged as
   * presented as a single coniguration to the proxy/load balancer. Max length 64 characters. Scope
   * should start with a letter and can only have letters, numbers, hyphens.
   * @param scope scope or {@code null} for none
   */
  public Gateway setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Server-defined URL of this resource
   * @param selfLink selfLink or {@code null} for none
   */
  public Gateway setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is
   * terminated. If empty, TLS termination is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.String getServerTlsPolicy() {
    return serverTlsPolicy;
  }

  /**
   * Optional. A fully-qualified ServerTLSPolicy URL reference. Specifies how TLS traffic is
   * terminated. If empty, TLS termination is disabled.
   * @param serverTlsPolicy serverTlsPolicy or {@code null} for none
   */
  public Gateway setServerTlsPolicy(java.lang.String serverTlsPolicy) {
    this.serverTlsPolicy = serverTlsPolicy;
    return this;
  }

  /**
   * Immutable. The type of the customer managed gateway.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Immutable. The type of the customer managed gateway.
   * @param type type or {@code null} for none
   */
  public Gateway setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The timestamp when the resource was updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Gateway setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Gateway set(String fieldName, Object value) {
    return (Gateway) super.set(fieldName, value);
  }

  @Override
  public Gateway clone() {
    return (Gateway) super.clone();
  }

}