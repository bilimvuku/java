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

package com.google.api.services.beyondcorp.v1alpha.model;

/**
 * The basic ingress config for ClientGateways.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BeyondCorp API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Config extends com.google.api.client.json.GenericJson {

  /**
   * Required. The settings used to configure basic ClientGateways.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DestinationRoute> destinationRoutes;

  /**
   * Required. Immutable. The transport protocol used between the client and the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transportProtocol;

  /**
   * Required. The settings used to configure basic ClientGateways.
   * @return value or {@code null} for none
   */
  public java.util.List<DestinationRoute> getDestinationRoutes() {
    return destinationRoutes;
  }

  /**
   * Required. The settings used to configure basic ClientGateways.
   * @param destinationRoutes destinationRoutes or {@code null} for none
   */
  public Config setDestinationRoutes(java.util.List<DestinationRoute> destinationRoutes) {
    this.destinationRoutes = destinationRoutes;
    return this;
  }

  /**
   * Required. Immutable. The transport protocol used between the client and the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransportProtocol() {
    return transportProtocol;
  }

  /**
   * Required. Immutable. The transport protocol used between the client and the server.
   * @param transportProtocol transportProtocol or {@code null} for none
   */
  public Config setTransportProtocol(java.lang.String transportProtocol) {
    this.transportProtocol = transportProtocol;
    return this;
  }

  @Override
  public Config set(String fieldName, Object value) {
    return (Config) super.set(fieldName, value);
  }

  @Override
  public Config clone() {
    return (Config) super.clone();
  }

}
