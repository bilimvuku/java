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
 * A set of device tiers. A tier set determines what variation of app content gets served to a
 * specific device, for device-targeted content. You should assign a priority level to each tier,
 * which determines the ordering by which they are evaluated by Play. See the documentation of
 * DeviceTier.level for more details.
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
public final class DeviceTierSet extends com.google.api.client.json.GenericJson {

  /**
   * Device tiers belonging to the set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeviceTier> deviceTiers;

  static {
    // hack to force ProGuard to consider DeviceTier used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DeviceTier.class);
  }

  /**
   * Device tiers belonging to the set.
   * @return value or {@code null} for none
   */
  public java.util.List<DeviceTier> getDeviceTiers() {
    return deviceTiers;
  }

  /**
   * Device tiers belonging to the set.
   * @param deviceTiers deviceTiers or {@code null} for none
   */
  public DeviceTierSet setDeviceTiers(java.util.List<DeviceTier> deviceTiers) {
    this.deviceTiers = deviceTiers;
    return this;
  }

  @Override
  public DeviceTierSet set(String fieldName, Object value) {
    return (DeviceTierSet) super.set(fieldName, value);
  }

  @Override
  public DeviceTierSet clone() {
    return (DeviceTierSet) super.clone();
  }

}