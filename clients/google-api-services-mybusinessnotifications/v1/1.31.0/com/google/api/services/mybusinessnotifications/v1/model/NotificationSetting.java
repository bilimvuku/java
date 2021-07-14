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

package com.google.api.services.mybusinessnotifications.v1.model;

/**
 * A Google Pub/Sub topic where notifications can be published when a location is updated or has a
 * new review. There will be only one notification setting resource per-account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Notifications API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NotificationSetting extends com.google.api.client.json.GenericJson {

  /**
   * Required. The resource name this setting is for. This is of the form
   * `accounts/{account_id}/notifications/setting`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The types of notifications that will be sent to the Pub/Sub topic. To stop receiving
   * notifications entirely, use NotificationSettings.UpdateNotificationSetting with an empty
   * notification_types or set the pubsub_topic to an empty string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notificationTypes;

  /**
   * Optional. The Google Pub/Sub topic that will receive notifications when locations managed by
   * this account are updated. If unset, no notifications will be posted. The account mybusiness-
   * api-pubsub@system.gserviceaccount.com must have at least Publish permissions on the Pub/Sub
   * topic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pubsubTopic;

  /**
   * Required. The resource name this setting is for. This is of the form
   * `accounts/{account_id}/notifications/setting`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource name this setting is for. This is of the form
   * `accounts/{account_id}/notifications/setting`.
   * @param name name or {@code null} for none
   */
  public NotificationSetting setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The types of notifications that will be sent to the Pub/Sub topic. To stop receiving
   * notifications entirely, use NotificationSettings.UpdateNotificationSetting with an empty
   * notification_types or set the pubsub_topic to an empty string.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotificationTypes() {
    return notificationTypes;
  }

  /**
   * The types of notifications that will be sent to the Pub/Sub topic. To stop receiving
   * notifications entirely, use NotificationSettings.UpdateNotificationSetting with an empty
   * notification_types or set the pubsub_topic to an empty string.
   * @param notificationTypes notificationTypes or {@code null} for none
   */
  public NotificationSetting setNotificationTypes(java.util.List<java.lang.String> notificationTypes) {
    this.notificationTypes = notificationTypes;
    return this;
  }

  /**
   * Optional. The Google Pub/Sub topic that will receive notifications when locations managed by
   * this account are updated. If unset, no notifications will be posted. The account mybusiness-
   * api-pubsub@system.gserviceaccount.com must have at least Publish permissions on the Pub/Sub
   * topic.
   * @return value or {@code null} for none
   */
  public java.lang.String getPubsubTopic() {
    return pubsubTopic;
  }

  /**
   * Optional. The Google Pub/Sub topic that will receive notifications when locations managed by
   * this account are updated. If unset, no notifications will be posted. The account mybusiness-
   * api-pubsub@system.gserviceaccount.com must have at least Publish permissions on the Pub/Sub
   * topic.
   * @param pubsubTopic pubsubTopic or {@code null} for none
   */
  public NotificationSetting setPubsubTopic(java.lang.String pubsubTopic) {
    this.pubsubTopic = pubsubTopic;
    return this;
  }

  @Override
  public NotificationSetting set(String fieldName, Object value) {
    return (NotificationSetting) super.set(fieldName, value);
  }

  @Override
  public NotificationSetting clone() {
    return (NotificationSetting) super.clone();
  }

}
