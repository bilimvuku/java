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

package com.google.api.services.dlp.v2.model;

/**
 * Send a Pub/Sub message into the given Pub/Sub topic to connect other systems to data profile
 * generation. The message payload data will be the byte serialization of
 * `DataProfilePubSubMessage`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2PubSubNotification extends com.google.api.client.json.GenericJson {

  /**
   * How much data to include in the Pub/Sub message. If the user wishes to limit the size of the
   * message, they can use resource_name and fetch the profile fields they wish to. Per table
   * profile (not per column).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detailOfMessage;

  /**
   * The type of event that triggers a Pub/Sub. At most one `PubSubNotification` per EventType is
   * permitted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String event;

  /**
   * Conditions (e.g., data risk or sensitivity level) for triggering a Pub/Sub.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2DataProfilePubSubCondition pubsubCondition;

  /**
   * Cloud Pub/Sub topic to send notifications to. Format is projects/{project}/topics/{topic}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * How much data to include in the Pub/Sub message. If the user wishes to limit the size of the
   * message, they can use resource_name and fetch the profile fields they wish to. Per table
   * profile (not per column).
   * @return value or {@code null} for none
   */
  public java.lang.String getDetailOfMessage() {
    return detailOfMessage;
  }

  /**
   * How much data to include in the Pub/Sub message. If the user wishes to limit the size of the
   * message, they can use resource_name and fetch the profile fields they wish to. Per table
   * profile (not per column).
   * @param detailOfMessage detailOfMessage or {@code null} for none
   */
  public GooglePrivacyDlpV2PubSubNotification setDetailOfMessage(java.lang.String detailOfMessage) {
    this.detailOfMessage = detailOfMessage;
    return this;
  }

  /**
   * The type of event that triggers a Pub/Sub. At most one `PubSubNotification` per EventType is
   * permitted.
   * @return value or {@code null} for none
   */
  public java.lang.String getEvent() {
    return event;
  }

  /**
   * The type of event that triggers a Pub/Sub. At most one `PubSubNotification` per EventType is
   * permitted.
   * @param event event or {@code null} for none
   */
  public GooglePrivacyDlpV2PubSubNotification setEvent(java.lang.String event) {
    this.event = event;
    return this;
  }

  /**
   * Conditions (e.g., data risk or sensitivity level) for triggering a Pub/Sub.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2DataProfilePubSubCondition getPubsubCondition() {
    return pubsubCondition;
  }

  /**
   * Conditions (e.g., data risk or sensitivity level) for triggering a Pub/Sub.
   * @param pubsubCondition pubsubCondition or {@code null} for none
   */
  public GooglePrivacyDlpV2PubSubNotification setPubsubCondition(GooglePrivacyDlpV2DataProfilePubSubCondition pubsubCondition) {
    this.pubsubCondition = pubsubCondition;
    return this;
  }

  /**
   * Cloud Pub/Sub topic to send notifications to. Format is projects/{project}/topics/{topic}.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Cloud Pub/Sub topic to send notifications to. Format is projects/{project}/topics/{topic}.
   * @param topic topic or {@code null} for none
   */
  public GooglePrivacyDlpV2PubSubNotification setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2PubSubNotification set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2PubSubNotification) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2PubSubNotification clone() {
    return (GooglePrivacyDlpV2PubSubNotification) super.clone();
  }

}