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

package com.google.api.services.youtube.model;

/**
 * Basic details about a caption track, such as its language and name.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CaptionSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The type of audio track associated with the caption track.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String audioTrackType;

  /**
   * The reason that YouTube failed to process the caption track. This property is only present if
   * the state property's value is failed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String failureReason;

  /**
   * Indicates whether YouTube synchronized the caption track to the audio track in the video. The
   * value will be true if a sync was explicitly requested when the caption track was uploaded. For
   * example, when calling the captions.insert or captions.update methods, you can set the sync
   * parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is
   * false, YouTube uses the time codes in the uploaded caption track to determine when to display
   * captions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAutoSynced;

  /**
   * Indicates whether the track contains closed captions for the deaf and hard of hearing. The
   * default value is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isCC;

  /**
   * Indicates whether the caption track is a draft. If the value is true, then the track is not
   * publicly visible. The default value is false. @mutable youtube.captions.insert
   * youtube.captions.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isDraft;

  /**
   * Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade
   * level for language learners. The default value is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isEasyReader;

  /**
   * Indicates whether the caption track uses large text for the vision-impaired. The default value
   * is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isLarge;

  /**
   * The language of the caption track. The property value is a BCP-47  language tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The date and time when the caption track was last updated. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastUpdated;

  /**
   * The name of the caption track. The name is intended to be visible to the user as an option
   * during playback.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The caption track's status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * The caption track's type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trackKind;

  /**
   * The ID that YouTube uses to uniquely identify the video associated with the caption track.
   * @mutable youtube.captions.insert
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * The type of audio track associated with the caption track.
   * @return value or {@code null} for none
   */
  public java.lang.String getAudioTrackType() {
    return audioTrackType;
  }

  /**
   * The type of audio track associated with the caption track.
   * @param audioTrackType audioTrackType or {@code null} for none
   */
  public CaptionSnippet setAudioTrackType(java.lang.String audioTrackType) {
    this.audioTrackType = audioTrackType;
    return this;
  }

  /**
   * The reason that YouTube failed to process the caption track. This property is only present if
   * the state property's value is failed.
   * @return value or {@code null} for none
   */
  public java.lang.String getFailureReason() {
    return failureReason;
  }

  /**
   * The reason that YouTube failed to process the caption track. This property is only present if
   * the state property's value is failed.
   * @param failureReason failureReason or {@code null} for none
   */
  public CaptionSnippet setFailureReason(java.lang.String failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * Indicates whether YouTube synchronized the caption track to the audio track in the video. The
   * value will be true if a sync was explicitly requested when the caption track was uploaded. For
   * example, when calling the captions.insert or captions.update methods, you can set the sync
   * parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is
   * false, YouTube uses the time codes in the uploaded caption track to determine when to display
   * captions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAutoSynced() {
    return isAutoSynced;
  }

  /**
   * Indicates whether YouTube synchronized the caption track to the audio track in the video. The
   * value will be true if a sync was explicitly requested when the caption track was uploaded. For
   * example, when calling the captions.insert or captions.update methods, you can set the sync
   * parameter to true to instruct YouTube to sync the uploaded track to the video. If the value is
   * false, YouTube uses the time codes in the uploaded caption track to determine when to display
   * captions.
   * @param isAutoSynced isAutoSynced or {@code null} for none
   */
  public CaptionSnippet setIsAutoSynced(java.lang.Boolean isAutoSynced) {
    this.isAutoSynced = isAutoSynced;
    return this;
  }

  /**
   * Indicates whether the track contains closed captions for the deaf and hard of hearing. The
   * default value is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsCC() {
    return isCC;
  }

  /**
   * Indicates whether the track contains closed captions for the deaf and hard of hearing. The
   * default value is false.
   * @param isCC isCC or {@code null} for none
   */
  public CaptionSnippet setIsCC(java.lang.Boolean isCC) {
    this.isCC = isCC;
    return this;
  }

  /**
   * Indicates whether the caption track is a draft. If the value is true, then the track is not
   * publicly visible. The default value is false. @mutable youtube.captions.insert
   * youtube.captions.update
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsDraft() {
    return isDraft;
  }

  /**
   * Indicates whether the caption track is a draft. If the value is true, then the track is not
   * publicly visible. The default value is false. @mutable youtube.captions.insert
   * youtube.captions.update
   * @param isDraft isDraft or {@code null} for none
   */
  public CaptionSnippet setIsDraft(java.lang.Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

  /**
   * Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade
   * level for language learners. The default value is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsEasyReader() {
    return isEasyReader;
  }

  /**
   * Indicates whether caption track is formatted for "easy reader," meaning it is at a third-grade
   * level for language learners. The default value is false.
   * @param isEasyReader isEasyReader or {@code null} for none
   */
  public CaptionSnippet setIsEasyReader(java.lang.Boolean isEasyReader) {
    this.isEasyReader = isEasyReader;
    return this;
  }

  /**
   * Indicates whether the caption track uses large text for the vision-impaired. The default value
   * is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsLarge() {
    return isLarge;
  }

  /**
   * Indicates whether the caption track uses large text for the vision-impaired. The default value
   * is false.
   * @param isLarge isLarge or {@code null} for none
   */
  public CaptionSnippet setIsLarge(java.lang.Boolean isLarge) {
    this.isLarge = isLarge;
    return this;
  }

  /**
   * The language of the caption track. The property value is a BCP-47  language tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The language of the caption track. The property value is a BCP-47  language tag.
   * @param language language or {@code null} for none
   */
  public CaptionSnippet setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * The date and time when the caption track was last updated. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastUpdated() {
    return lastUpdated;
  }

  /**
   * The date and time when the caption track was last updated. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @param lastUpdated lastUpdated or {@code null} for none
   */
  public CaptionSnippet setLastUpdated(java.lang.String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * The name of the caption track. The name is intended to be visible to the user as an option
   * during playback.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the caption track. The name is intended to be visible to the user as an option
   * during playback.
   * @param name name or {@code null} for none
   */
  public CaptionSnippet setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The caption track's status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The caption track's status.
   * @param status status or {@code null} for none
   */
  public CaptionSnippet setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * The caption track's type.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrackKind() {
    return trackKind;
  }

  /**
   * The caption track's type.
   * @param trackKind trackKind or {@code null} for none
   */
  public CaptionSnippet setTrackKind(java.lang.String trackKind) {
    this.trackKind = trackKind;
    return this;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video associated with the caption track.
   * @mutable youtube.captions.insert
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * The ID that YouTube uses to uniquely identify the video associated with the caption track.
   * @mutable youtube.captions.insert
   * @param videoId videoId or {@code null} for none
   */
  public CaptionSnippet setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  @Override
  public CaptionSnippet set(String fieldName, Object value) {
    return (CaptionSnippet) super.set(fieldName, value);
  }

  @Override
  public CaptionSnippet clone() {
    return (CaptionSnippet) super.clone();
  }

}
