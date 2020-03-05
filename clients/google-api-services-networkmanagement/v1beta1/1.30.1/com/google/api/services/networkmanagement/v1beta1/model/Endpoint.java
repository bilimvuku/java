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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * Source or destination of the Connectivity Test.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Endpoint extends com.google.api.client.json.GenericJson {

  /**
   * A Compute Engine instance URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String instance;

  /**
   * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is
   * only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs
   * /load-balancing-overview).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ipAddress;

  /**
   * A Compute Engine network URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Type of the network where the endpoint is located. Applicable only to source endpoint, as
   * destination network type can be inferred from the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkType;

  /**
   * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Project ID where the endpoint is located. The Project ID can be derived from the URI if you
   * provide a VM instance or network URI. The following are two cases where you must provide the
   * project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2.
   * When you are using Shared VPC and the IP address that you provide is from the service project.
   * In this case, the network that the IP address resides in is defined in the host project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * A Compute Engine instance URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getInstance() {
    return instance;
  }

  /**
   * A Compute Engine instance URI.
   * @param instance instance or {@code null} for none
   */
  public Endpoint setInstance(java.lang.String instance) {
    this.instance = instance;
    return this;
  }

  /**
   * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is
   * only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs
   * /load-balancing-overview).
   * @return value or {@code null} for none
   */
  public java.lang.String getIpAddress() {
    return ipAddress;
  }

  /**
   * The IP address of the endpoint, which can be an external or internal IP. An IPv6 address is
   * only allowed when the test's destination is a [global load balancer VIP](/load-balancing/docs
   * /load-balancing-overview).
   * @param ipAddress ipAddress or {@code null} for none
   */
  public Endpoint setIpAddress(java.lang.String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * A Compute Engine network URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * A Compute Engine network URI.
   * @param network network or {@code null} for none
   */
  public Endpoint setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Type of the network where the endpoint is located. Applicable only to source endpoint, as
   * destination network type can be inferred from the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkType() {
    return networkType;
  }

  /**
   * Type of the network where the endpoint is located. Applicable only to source endpoint, as
   * destination network type can be inferred from the source.
   * @param networkType networkType or {@code null} for none
   */
  public Endpoint setNetworkType(java.lang.String networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * The IP protocol port of the endpoint. Only applicable when protocol is TCP or UDP.
   * @param port port or {@code null} for none
   */
  public Endpoint setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Project ID where the endpoint is located. The Project ID can be derived from the URI if you
   * provide a VM instance or network URI. The following are two cases where you must provide the
   * project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2.
   * When you are using Shared VPC and the IP address that you provide is from the service project.
   * In this case, the network that the IP address resides in is defined in the host project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Project ID where the endpoint is located. The Project ID can be derived from the URI if you
   * provide a VM instance or network URI. The following are two cases where you must provide the
   * project ID: 1. Only the IP address is specified, and the IP address is within a GCP project. 2.
   * When you are using Shared VPC and the IP address that you provide is from the service project.
   * In this case, the network that the IP address resides in is defined in the host project.
   * @param projectId projectId or {@code null} for none
   */
  public Endpoint setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  @Override
  public Endpoint set(String fieldName, Object value) {
    return (Endpoint) super.set(fieldName, value);
  }

  @Override
  public Endpoint clone() {
    return (Endpoint) super.clone();
  }

}
