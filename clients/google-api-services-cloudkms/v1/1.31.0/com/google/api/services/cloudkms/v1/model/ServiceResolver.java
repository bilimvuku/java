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

package com.google.api.services.cloudkms.v1.model;

/**
 * A ServiceResolver represents an EKM replica that can be reached within an EkmConnection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Key Management Service (KMS) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ServiceResolver extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The filter applied to the endpoints of the resolved service. If no filter is
   * specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the
   * filtered list for each request. For endpoint filter syntax and examples, see
   * https://cloud.google.com/service-
   * directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endpointFilter;

  /**
   * Required. The hostname of the EKM replica used at TLS and HTTP layers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hostname;

  /**
   * Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM
   * replica.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Certificate> serverCertificates;

  static {
    // hack to force ProGuard to consider Certificate used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Certificate.class);
  }

  /**
   * Required. The resource name of the Service Directory service pointing to an EKM replica, in the
   * format `projects/locations/namespaces/services`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceDirectoryService;

  /**
   * Optional. The filter applied to the endpoints of the resolved service. If no filter is
   * specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the
   * filtered list for each request. For endpoint filter syntax and examples, see
   * https://cloud.google.com/service-
   * directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndpointFilter() {
    return endpointFilter;
  }

  /**
   * Optional. The filter applied to the endpoints of the resolved service. If no filter is
   * specified, all endpoints will be considered. An endpoint will be chosen arbitrarily from the
   * filtered list for each request. For endpoint filter syntax and examples, see
   * https://cloud.google.com/service-
   * directory/docs/reference/rpc/google.cloud.servicedirectory.v1#resolveservicerequest.
   * @param endpointFilter endpointFilter or {@code null} for none
   */
  public ServiceResolver setEndpointFilter(java.lang.String endpointFilter) {
    this.endpointFilter = endpointFilter;
    return this;
  }

  /**
   * Required. The hostname of the EKM replica used at TLS and HTTP layers.
   * @return value or {@code null} for none
   */
  public java.lang.String getHostname() {
    return hostname;
  }

  /**
   * Required. The hostname of the EKM replica used at TLS and HTTP layers.
   * @param hostname hostname or {@code null} for none
   */
  public ServiceResolver setHostname(java.lang.String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM
   * replica.
   * @return value or {@code null} for none
   */
  public java.util.List<Certificate> getServerCertificates() {
    return serverCertificates;
  }

  /**
   * Required. A list of leaf server certificates used to authenticate HTTPS connections to the EKM
   * replica.
   * @param serverCertificates serverCertificates or {@code null} for none
   */
  public ServiceResolver setServerCertificates(java.util.List<Certificate> serverCertificates) {
    this.serverCertificates = serverCertificates;
    return this;
  }

  /**
   * Required. The resource name of the Service Directory service pointing to an EKM replica, in the
   * format `projects/locations/namespaces/services`.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceDirectoryService() {
    return serviceDirectoryService;
  }

  /**
   * Required. The resource name of the Service Directory service pointing to an EKM replica, in the
   * format `projects/locations/namespaces/services`.
   * @param serviceDirectoryService serviceDirectoryService or {@code null} for none
   */
  public ServiceResolver setServiceDirectoryService(java.lang.String serviceDirectoryService) {
    this.serviceDirectoryService = serviceDirectoryService;
    return this;
  }

  @Override
  public ServiceResolver set(String fieldName, Object value) {
    return (ServiceResolver) super.set(fieldName, value);
  }

  @Override
  public ServiceResolver clone() {
    return (ServiceResolver) super.clone();
  }

}
