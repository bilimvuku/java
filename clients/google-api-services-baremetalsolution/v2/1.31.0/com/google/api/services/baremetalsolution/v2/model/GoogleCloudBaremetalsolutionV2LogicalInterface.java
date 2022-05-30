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

package com.google.api.services.baremetalsolution.v2.model;

/**
 * Each logical interface represents a logical abstraction of the underlying physical interface (for
 * eg. bond, nic) of the instance. Each logical interface can effectively map to multiple network-IP
 * pairs and still be mapped to one underlying physical interface.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudBaremetalsolutionV2LogicalInterface extends com.google.api.client.json.GenericJson {

  /**
   * The index of the logical interface mapping to the index of the hardware bond or nic on the
   * chosen network template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer interfaceIndex;

  /**
   * List of logical network interfaces within a logical interface.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LogicalNetworkInterface> logicalNetworkInterfaces;

  /**
   * Interface name. This is of syntax or and forms part of the network template name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The index of the logical interface mapping to the index of the hardware bond or nic on the
   * chosen network template.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInterfaceIndex() {
    return interfaceIndex;
  }

  /**
   * The index of the logical interface mapping to the index of the hardware bond or nic on the
   * chosen network template.
   * @param interfaceIndex interfaceIndex or {@code null} for none
   */
  public GoogleCloudBaremetalsolutionV2LogicalInterface setInterfaceIndex(java.lang.Integer interfaceIndex) {
    this.interfaceIndex = interfaceIndex;
    return this;
  }

  /**
   * List of logical network interfaces within a logical interface.
   * @return value or {@code null} for none
   */
  public java.util.List<LogicalNetworkInterface> getLogicalNetworkInterfaces() {
    return logicalNetworkInterfaces;
  }

  /**
   * List of logical network interfaces within a logical interface.
   * @param logicalNetworkInterfaces logicalNetworkInterfaces or {@code null} for none
   */
  public GoogleCloudBaremetalsolutionV2LogicalInterface setLogicalNetworkInterfaces(java.util.List<LogicalNetworkInterface> logicalNetworkInterfaces) {
    this.logicalNetworkInterfaces = logicalNetworkInterfaces;
    return this;
  }

  /**
   * Interface name. This is of syntax or and forms part of the network template name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Interface name. This is of syntax or and forms part of the network template name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudBaremetalsolutionV2LogicalInterface setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudBaremetalsolutionV2LogicalInterface set(String fieldName, Object value) {
    return (GoogleCloudBaremetalsolutionV2LogicalInterface) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudBaremetalsolutionV2LogicalInterface clone() {
    return (GoogleCloudBaremetalsolutionV2LogicalInterface) super.clone();
  }

}
