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

package com.google.api.services.accesscontextmanager.v1beta.model;

/**
 * Specifies how APIs are allowed to communicate within the Service Perimeter.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VpcAccessibleServices extends com.google.api.client.json.GenericJson {

  /**
   * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction'
   * is True. You can specify a list of individual services, as well as include the 'RESTRICTED-
   * SERVICES' value, which automatically includes all of the services protected by the perimeter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> allowedServices;

  /**
   * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in
   * 'allowed_services'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableRestriction;

  /**
   * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction'
   * is True. You can specify a list of individual services, as well as include the 'RESTRICTED-
   * SERVICES' value, which automatically includes all of the services protected by the perimeter.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAllowedServices() {
    return allowedServices;
  }

  /**
   * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction'
   * is True. You can specify a list of individual services, as well as include the 'RESTRICTED-
   * SERVICES' value, which automatically includes all of the services protected by the perimeter.
   * @param allowedServices allowedServices or {@code null} for none
   */
  public VpcAccessibleServices setAllowedServices(java.util.List<java.lang.String> allowedServices) {
    this.allowedServices = allowedServices;
    return this;
  }

  /**
   * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in
   * 'allowed_services'.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableRestriction() {
    return enableRestriction;
  }

  /**
   * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in
   * 'allowed_services'.
   * @param enableRestriction enableRestriction or {@code null} for none
   */
  public VpcAccessibleServices setEnableRestriction(java.lang.Boolean enableRestriction) {
    this.enableRestriction = enableRestriction;
    return this;
  }

  @Override
  public VpcAccessibleServices set(String fieldName, Object value) {
    return (VpcAccessibleServices) super.set(fieldName, value);
  }

  @Override
  public VpcAccessibleServices clone() {
    return (VpcAccessibleServices) super.clone();
  }

}
