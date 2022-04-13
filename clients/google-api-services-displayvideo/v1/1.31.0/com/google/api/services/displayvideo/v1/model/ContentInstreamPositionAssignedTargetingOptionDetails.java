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

package com.google.api.services.displayvideo.v1.model;

/**
 * Assigned content instream position targeting option details. This will be populated in the
 * content_instream_position_details field when targeting_type is
 * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Display & Video 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContentInstreamPositionAssignedTargetingOptionDetails extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The ad type to target. Only applicable to insertion order targeting and new line
   * items supporting the specified ad type will inherit this targeting option by default. Possible
   * values are: * `AD_TYPE_VIDEO`, the setting will be inherited by new line item when
   * line_item_type is `LINE_ITEM_TYPE_VIDEO_DEFAULT`. * `AD_TYPE_AUDIO`, the setting will be
   * inherited by new line item when line_item_type is `LINE_ITEM_TYPE_AUDIO_DEFAULT`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String adType;

  /**
   * The content instream position for video or audio ads. Output only in v1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentInstreamPosition;

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetingOptionId;

  /**
   * Output only. The ad type to target. Only applicable to insertion order targeting and new line
   * items supporting the specified ad type will inherit this targeting option by default. Possible
   * values are: * `AD_TYPE_VIDEO`, the setting will be inherited by new line item when
   * line_item_type is `LINE_ITEM_TYPE_VIDEO_DEFAULT`. * `AD_TYPE_AUDIO`, the setting will be
   * inherited by new line item when line_item_type is `LINE_ITEM_TYPE_AUDIO_DEFAULT`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAdType() {
    return adType;
  }

  /**
   * Output only. The ad type to target. Only applicable to insertion order targeting and new line
   * items supporting the specified ad type will inherit this targeting option by default. Possible
   * values are: * `AD_TYPE_VIDEO`, the setting will be inherited by new line item when
   * line_item_type is `LINE_ITEM_TYPE_VIDEO_DEFAULT`. * `AD_TYPE_AUDIO`, the setting will be
   * inherited by new line item when line_item_type is `LINE_ITEM_TYPE_AUDIO_DEFAULT`.
   * @param adType adType or {@code null} for none
   */
  public ContentInstreamPositionAssignedTargetingOptionDetails setAdType(java.lang.String adType) {
    this.adType = adType;
    return this;
  }

  /**
   * The content instream position for video or audio ads. Output only in v1.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentInstreamPosition() {
    return contentInstreamPosition;
  }

  /**
   * The content instream position for video or audio ads. Output only in v1.
   * @param contentInstreamPosition contentInstreamPosition or {@code null} for none
   */
  public ContentInstreamPositionAssignedTargetingOptionDetails setContentInstreamPosition(java.lang.String contentInstreamPosition) {
    this.contentInstreamPosition = contentInstreamPosition;
    return this;
  }

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetingOptionId() {
    return targetingOptionId;
  }

  /**
   * Required. The targeting_option_id field when targeting_type is
   * `TARGETING_TYPE_CONTENT_INSTREAM_POSITION`.
   * @param targetingOptionId targetingOptionId or {@code null} for none
   */
  public ContentInstreamPositionAssignedTargetingOptionDetails setTargetingOptionId(java.lang.String targetingOptionId) {
    this.targetingOptionId = targetingOptionId;
    return this;
  }

  @Override
  public ContentInstreamPositionAssignedTargetingOptionDetails set(String fieldName, Object value) {
    return (ContentInstreamPositionAssignedTargetingOptionDetails) super.set(fieldName, value);
  }

  @Override
  public ContentInstreamPositionAssignedTargetingOptionDetails clone() {
    return (ContentInstreamPositionAssignedTargetingOptionDetails) super.clone();
  }

}
