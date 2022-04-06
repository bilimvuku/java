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

package com.google.api.services.androidpublisher.model;

/**
 * Selector for a device group. A selector consists of a set of conditions on the device that should
 * all match (logical AND) to determine a device group eligibility. For instance, if a selector
 * specifies RAM conditions, device model inclusion and device model exclusion, a device is
 * considered to match if: device matches RAM conditions AND device matches one of the included
 * device models AND device doesn't match excluded device models
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DeviceSelector extends com.google.api.client.json.GenericJson {

  /**
   * Conditions on the device's RAM.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeviceRam deviceRam;

  /**
   * Device models excluded by this selector, even if they match all other conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceId> excludedDeviceIds;

  static {
    // hack to force ProGuard to consider DeviceId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeviceId.class);
  }

  /**
   * A device that has any of these system features is excluded by this selector, even if it matches
   * all other conditions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SystemFeature> forbiddenSystemFeatures;

  /**
   * Device models included by this selector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceId> includedDeviceIds;

  static {
    // hack to force ProGuard to consider DeviceId used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeviceId.class);
  }

  /**
   * A device needs to have all these system features to be included by the selector.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SystemFeature> requiredSystemFeatures;

  /**
   * Conditions on the device's RAM.
   * @return value or {@code null} for none
   */
  public DeviceRam getDeviceRam() {
    return deviceRam;
  }

  /**
   * Conditions on the device's RAM.
   * @param deviceRam deviceRam or {@code null} for none
   */
  public DeviceSelector setDeviceRam(DeviceRam deviceRam) {
    this.deviceRam = deviceRam;
    return this;
  }

  /**
   * Device models excluded by this selector, even if they match all other conditions.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceId> getExcludedDeviceIds() {
    return excludedDeviceIds;
  }

  /**
   * Device models excluded by this selector, even if they match all other conditions.
   * @param excludedDeviceIds excludedDeviceIds or {@code null} for none
   */
  public DeviceSelector setExcludedDeviceIds(java.util.List<DeviceId> excludedDeviceIds) {
    this.excludedDeviceIds = excludedDeviceIds;
    return this;
  }

  /**
   * A device that has any of these system features is excluded by this selector, even if it matches
   * all other conditions.
   * @return value or {@code null} for none
   */
  public java.util.List<SystemFeature> getForbiddenSystemFeatures() {
    return forbiddenSystemFeatures;
  }

  /**
   * A device that has any of these system features is excluded by this selector, even if it matches
   * all other conditions.
   * @param forbiddenSystemFeatures forbiddenSystemFeatures or {@code null} for none
   */
  public DeviceSelector setForbiddenSystemFeatures(java.util.List<SystemFeature> forbiddenSystemFeatures) {
    this.forbiddenSystemFeatures = forbiddenSystemFeatures;
    return this;
  }

  /**
   * Device models included by this selector.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceId> getIncludedDeviceIds() {
    return includedDeviceIds;
  }

  /**
   * Device models included by this selector.
   * @param includedDeviceIds includedDeviceIds or {@code null} for none
   */
  public DeviceSelector setIncludedDeviceIds(java.util.List<DeviceId> includedDeviceIds) {
    this.includedDeviceIds = includedDeviceIds;
    return this;
  }

  /**
   * A device needs to have all these system features to be included by the selector.
   * @return value or {@code null} for none
   */
  public java.util.List<SystemFeature> getRequiredSystemFeatures() {
    return requiredSystemFeatures;
  }

  /**
   * A device needs to have all these system features to be included by the selector.
   * @param requiredSystemFeatures requiredSystemFeatures or {@code null} for none
   */
  public DeviceSelector setRequiredSystemFeatures(java.util.List<SystemFeature> requiredSystemFeatures) {
    this.requiredSystemFeatures = requiredSystemFeatures;
    return this;
  }

  @Override
  public DeviceSelector set(String fieldName, Object value) {
    return (DeviceSelector) super.set(fieldName, value);
  }

  @Override
  public DeviceSelector clone() {
    return (DeviceSelector) super.clone();
  }

}