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
 * Basic details about a comment, such as its author and text.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommentSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommentSnippetAuthorChannelId authorChannelId;

  /**
   * Link to the author's YouTube channel, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorChannelUrl;

  /**
   * The name of the user who posted the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorDisplayName;

  /**
   * The URL for the avatar of the user who posted the comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorProfileImageUrl;

  /**
   * Whether the current viewer can rate this comment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canRate;

  /**
   * The id of the corresponding YouTube channel. In case of a channel comment this is the channel
   * the comment refers to. In case of a video comment it's the video's channel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The total number of likes this comment has received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long likeCount;

  /**
   * The comment's moderation status. Will not be set if the comments were requested through the id
   * filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String moderationStatus;

  /**
   * The unique id of the parent comment, only set for replies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentId;

  /**
   * The date and time when the comment was orignally published. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publishedAt;

  /**
   * The comment's text. The format is either plain text or HTML dependent on what has been
   * requested. Even the plain text representation may differ from the text originally posted in
   * that it may replace video links with video titles etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textDisplay;

  /**
   * The comment's original raw text as initially posted or last updated. The original text will
   * only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is
   * the comment's author.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String textOriginal;

  /**
   * The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String updatedAt;

  /**
   * The ID of the video the comment refers to, if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String videoId;

  /**
   * The rating the viewer has given to this comment. For the time being this will never return
   * RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String viewerRating;

  /**
   * @return value or {@code null} for none
   */
  public CommentSnippetAuthorChannelId getAuthorChannelId() {
    return authorChannelId;
  }

  /**
   * @param authorChannelId authorChannelId or {@code null} for none
   */
  public CommentSnippet setAuthorChannelId(CommentSnippetAuthorChannelId authorChannelId) {
    this.authorChannelId = authorChannelId;
    return this;
  }

  /**
   * Link to the author's YouTube channel, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorChannelUrl() {
    return authorChannelUrl;
  }

  /**
   * Link to the author's YouTube channel, if any.
   * @param authorChannelUrl authorChannelUrl or {@code null} for none
   */
  public CommentSnippet setAuthorChannelUrl(java.lang.String authorChannelUrl) {
    this.authorChannelUrl = authorChannelUrl;
    return this;
  }

  /**
   * The name of the user who posted the comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorDisplayName() {
    return authorDisplayName;
  }

  /**
   * The name of the user who posted the comment.
   * @param authorDisplayName authorDisplayName or {@code null} for none
   */
  public CommentSnippet setAuthorDisplayName(java.lang.String authorDisplayName) {
    this.authorDisplayName = authorDisplayName;
    return this;
  }

  /**
   * The URL for the avatar of the user who posted the comment.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorProfileImageUrl() {
    return authorProfileImageUrl;
  }

  /**
   * The URL for the avatar of the user who posted the comment.
   * @param authorProfileImageUrl authorProfileImageUrl or {@code null} for none
   */
  public CommentSnippet setAuthorProfileImageUrl(java.lang.String authorProfileImageUrl) {
    this.authorProfileImageUrl = authorProfileImageUrl;
    return this;
  }

  /**
   * Whether the current viewer can rate this comment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanRate() {
    return canRate;
  }

  /**
   * Whether the current viewer can rate this comment.
   * @param canRate canRate or {@code null} for none
   */
  public CommentSnippet setCanRate(java.lang.Boolean canRate) {
    this.canRate = canRate;
    return this;
  }

  /**
   * The id of the corresponding YouTube channel. In case of a channel comment this is the channel
   * the comment refers to. In case of a video comment it's the video's channel.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The id of the corresponding YouTube channel. In case of a channel comment this is the channel
   * the comment refers to. In case of a video comment it's the video's channel.
   * @param channelId channelId or {@code null} for none
   */
  public CommentSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The total number of likes this comment has received.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLikeCount() {
    return likeCount;
  }

  /**
   * The total number of likes this comment has received.
   * @param likeCount likeCount or {@code null} for none
   */
  public CommentSnippet setLikeCount(java.lang.Long likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  /**
   * The comment's moderation status. Will not be set if the comments were requested through the id
   * filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getModerationStatus() {
    return moderationStatus;
  }

  /**
   * The comment's moderation status. Will not be set if the comments were requested through the id
   * filter.
   * @param moderationStatus moderationStatus or {@code null} for none
   */
  public CommentSnippet setModerationStatus(java.lang.String moderationStatus) {
    this.moderationStatus = moderationStatus;
    return this;
  }

  /**
   * The unique id of the parent comment, only set for replies.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentId() {
    return parentId;
  }

  /**
   * The unique id of the parent comment, only set for replies.
   * @param parentId parentId or {@code null} for none
   */
  public CommentSnippet setParentId(java.lang.String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The date and time when the comment was orignally published. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getPublishedAt() {
    return publishedAt;
  }

  /**
   * The date and time when the comment was orignally published. The value is specified in ISO 8601
   * (YYYY-MM-DDThh:mm:ss.sZ) format.
   * @param publishedAt publishedAt or {@code null} for none
   */
  public CommentSnippet setPublishedAt(java.lang.String publishedAt) {
    this.publishedAt = publishedAt;
    return this;
  }

  /**
   * The comment's text. The format is either plain text or HTML dependent on what has been
   * requested. Even the plain text representation may differ from the text originally posted in
   * that it may replace video links with video titles etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextDisplay() {
    return textDisplay;
  }

  /**
   * The comment's text. The format is either plain text or HTML dependent on what has been
   * requested. Even the plain text representation may differ from the text originally posted in
   * that it may replace video links with video titles etc.
   * @param textDisplay textDisplay or {@code null} for none
   */
  public CommentSnippet setTextDisplay(java.lang.String textDisplay) {
    this.textDisplay = textDisplay;
    return this;
  }

  /**
   * The comment's original raw text as initially posted or last updated. The original text will
   * only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is
   * the comment's author.
   * @return value or {@code null} for none
   */
  public java.lang.String getTextOriginal() {
    return textOriginal;
  }

  /**
   * The comment's original raw text as initially posted or last updated. The original text will
   * only be returned if it is accessible to the viewer, which is only guaranteed if the viewer is
   * the comment's author.
   * @param textOriginal textOriginal or {@code null} for none
   */
  public CommentSnippet setTextOriginal(java.lang.String textOriginal) {
    this.textOriginal = textOriginal;
    return this;
  }

  /**
   * The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getUpdatedAt() {
    return updatedAt;
  }

  /**
   * The date and time when was last updated . The value is specified in ISO 8601 (YYYY-MM-
   * DDThh:mm:ss.sZ) format.
   * @param updatedAt updatedAt or {@code null} for none
   */
  public CommentSnippet setUpdatedAt(java.lang.String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The ID of the video the comment refers to, if any.
   * @return value or {@code null} for none
   */
  public java.lang.String getVideoId() {
    return videoId;
  }

  /**
   * The ID of the video the comment refers to, if any.
   * @param videoId videoId or {@code null} for none
   */
  public CommentSnippet setVideoId(java.lang.String videoId) {
    this.videoId = videoId;
    return this;
  }

  /**
   * The rating the viewer has given to this comment. For the time being this will never return
   * RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
   * @return value or {@code null} for none
   */
  public java.lang.String getViewerRating() {
    return viewerRating;
  }

  /**
   * The rating the viewer has given to this comment. For the time being this will never return
   * RATE_TYPE_DISLIKE and instead return RATE_TYPE_NONE. This may change in the future.
   * @param viewerRating viewerRating or {@code null} for none
   */
  public CommentSnippet setViewerRating(java.lang.String viewerRating) {
    this.viewerRating = viewerRating;
    return this;
  }

  @Override
  public CommentSnippet set(String fieldName, Object value) {
    return (CommentSnippet) super.set(fieldName, value);
  }

  @Override
  public CommentSnippet clone() {
    return (CommentSnippet) super.clone();
  }

}
