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

package com.google.api.services.run.v1alpha1.model;

/**
 * Not supported by Cloud Run GRPCAction describes an action involving a GRPC port.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GRPCAction extends com.google.api.client.json.GenericJson {

  /**
   * Port number of the gRPC service. Number must be in the range 1 to 65535.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Service is the name of the service to place in the gRPC HealthCheckRequest (see
   * https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the
   * default behavior is defined by gRPC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String service;

  /**
   * Port number of the gRPC service. Number must be in the range 1 to 65535.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Port number of the gRPC service. Number must be in the range 1 to 65535.
   * @param port port or {@code null} for none
   */
  public GRPCAction setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Service is the name of the service to place in the gRPC HealthCheckRequest (see
   * https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the
   * default behavior is defined by gRPC.
   * @return value or {@code null} for none
   */
  public java.lang.String getService() {
    return service;
  }

  /**
   * Service is the name of the service to place in the gRPC HealthCheckRequest (see
   * https://github.com/grpc/grpc/blob/master/doc/health-checking.md). If this is not specified, the
   * default behavior is defined by gRPC.
   * @param service service or {@code null} for none
   */
  public GRPCAction setService(java.lang.String service) {
    this.service = service;
    return this;
  }

  @Override
  public GRPCAction set(String fieldName, Object value) {
    return (GRPCAction) super.set(fieldName, value);
  }

  @Override
  public GRPCAction clone() {
    return (GRPCAction) super.clone();
  }

}
