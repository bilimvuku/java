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

package com.google.api.services.adsense.v2.model;

/**
 * Representation of an ad unit. An ad unit represents a saved ad unit with a specific set of ad
 * settings that have been customized within an account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdSense Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdUnit extends com.google.api.client.json.GenericJson {

  /**
   * Required. Settings specific to content ads (AFC).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContentAdsSettings contentAdsSettings;

  /**
   * Required. Display name of the ad unit, as provided when the ad unit was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Resource name of the ad unit. Format:
   * accounts/{account}/adclients/{adclient}/adunits/{adunit}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Unique ID of the ad unit as used in the `AD_UNIT_ID` reporting dimension.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportingDimensionId;

  /**
   * State of the ad unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Settings specific to content ads (AFC).
   * @return value or {@code null} for none
   */
  public ContentAdsSettings getContentAdsSettings() {
    return contentAdsSettings;
  }

  /**
   * Required. Settings specific to content ads (AFC).
   * @param contentAdsSettings contentAdsSettings or {@code null} for none
   */
  public AdUnit setContentAdsSettings(ContentAdsSettings contentAdsSettings) {
    this.contentAdsSettings = contentAdsSettings;
    return this;
  }

  /**
   * Required. Display name of the ad unit, as provided when the ad unit was created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name of the ad unit, as provided when the ad unit was created.
   * @param displayName displayName or {@code null} for none
   */
  public AdUnit setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Resource name of the ad unit. Format:
   * accounts/{account}/adclients/{adclient}/adunits/{adunit}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of the ad unit. Format:
   * accounts/{account}/adclients/{adclient}/adunits/{adunit}
   * @param name name or {@code null} for none
   */
  public AdUnit setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Unique ID of the ad unit as used in the `AD_UNIT_ID` reporting dimension.
   * @return value or {@code null} for none
   */
  public java.lang.String getReportingDimensionId() {
    return reportingDimensionId;
  }

  /**
   * Output only. Unique ID of the ad unit as used in the `AD_UNIT_ID` reporting dimension.
   * @param reportingDimensionId reportingDimensionId or {@code null} for none
   */
  public AdUnit setReportingDimensionId(java.lang.String reportingDimensionId) {
    this.reportingDimensionId = reportingDimensionId;
    return this;
  }

  /**
   * State of the ad unit.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * State of the ad unit.
   * @param state state or {@code null} for none
   */
  public AdUnit setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public AdUnit set(String fieldName, Object value) {
    return (AdUnit) super.set(fieldName, value);
  }

  @Override
  public AdUnit clone() {
    return (AdUnit) super.clone();
  }

}
