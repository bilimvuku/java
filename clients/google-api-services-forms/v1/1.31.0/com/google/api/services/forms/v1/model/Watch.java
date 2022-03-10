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

package com.google.api.services.forms.v1.model;

/**
 * A watch for events for a form. When the designated event happens, a notification will be
 * published to the specified target. The notification's attributes will include a `formId` key that
 * has the ID of the watched form and an `eventType` key that has the string of the type. Messages
 * are sent with at-least-once delivery and are only dropped in extraordinary circumstances.
 * Typically all notifications should be reliably delivered within a few seconds; however, in some
 * situations notifications may be delayed. A watch expires seven days after it is created unless it
 * is renewed with watches.renew
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Watch extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Timestamp of when this was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The most recent error type for an attempted delivery. To begin watching the form
   * again a call can be made to watches.renew which also clears this error information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorType;

  /**
   * Required. Which event type to watch for.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * Output only. Timestamp for when this will expire. Each watches.renew call resets this to seven
   * days in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * Output only. The ID of this watch. See notes on CreateWatchRequest.watch_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. The current state of the watch. Additional details about suspended watches can be
   * found by checking the `error_type`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. Where to send the notification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WatchTarget target;

  /**
   * Output only. Timestamp of when this was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Timestamp of when this was created.
   * @param createTime createTime or {@code null} for none
   */
  public Watch setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The most recent error type for an attempted delivery. To begin watching the form
   * again a call can be made to watches.renew which also clears this error information.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorType() {
    return errorType;
  }

  /**
   * Output only. The most recent error type for an attempted delivery. To begin watching the form
   * again a call can be made to watches.renew which also clears this error information.
   * @param errorType errorType or {@code null} for none
   */
  public Watch setErrorType(java.lang.String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Required. Which event type to watch for.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Required. Which event type to watch for.
   * @param eventType eventType or {@code null} for none
   */
  public Watch setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Output only. Timestamp for when this will expire. Each watches.renew call resets this to seven
   * days in the future.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Output only. Timestamp for when this will expire. Each watches.renew call resets this to seven
   * days in the future.
   * @param expireTime expireTime or {@code null} for none
   */
  public Watch setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * Output only. The ID of this watch. See notes on CreateWatchRequest.watch_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The ID of this watch. See notes on CreateWatchRequest.watch_id.
   * @param id id or {@code null} for none
   */
  public Watch setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. The current state of the watch. Additional details about suspended watches can be
   * found by checking the `error_type`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the watch. Additional details about suspended watches can be
   * found by checking the `error_type`.
   * @param state state or {@code null} for none
   */
  public Watch setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Required. Where to send the notification.
   * @return value or {@code null} for none
   */
  public WatchTarget getTarget() {
    return target;
  }

  /**
   * Required. Where to send the notification.
   * @param target target or {@code null} for none
   */
  public Watch setTarget(WatchTarget target) {
    this.target = target;
    return this;
  }

  @Override
  public Watch set(String fieldName, Object value) {
    return (Watch) super.set(fieldName, value);
  }

  @Override
  public Watch clone() {
    return (Watch) super.clone();
  }

}
