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

package com.google.api.services.eventarc.v1beta1.model;

/**
 * Represents a Pub/Sub transport.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Pubsub extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a
   * transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subscription;

  /**
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport
   * for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an
   * existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only.
   * The topic you provide here will not be deleted by Eventarc at trigger deletion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topic;

  /**
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a
   * transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSubscription() {
    return subscription;
  }

  /**
   * Output only. The name of the Pub/Sub subscription created and managed by Eventarc system as a
   * transport for the event delivery. Format:
   * `projects/{PROJECT_ID}/subscriptions/{SUBSCRIPTION_NAME}`.
   * @param subscription subscription or {@code null} for none
   */
  public Pubsub setSubscription(java.lang.String subscription) {
    this.subscription = subscription;
    return this;
  }

  /**
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport
   * for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an
   * existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only.
   * The topic you provide here will not be deleted by Eventarc at trigger deletion.
   * @return value or {@code null} for none
   */
  public java.lang.String getTopic() {
    return topic;
  }

  /**
   * Optional. The name of the Pub/Sub topic created and managed by Eventarc system as a transport
   * for the event delivery. Format: `projects/{PROJECT_ID}/topics/{TOPIC_NAME}`. You may set an
   * existing topic for triggers of the type `google.cloud.pubsub.topic.v1.messagePublished` only.
   * The topic you provide here will not be deleted by Eventarc at trigger deletion.
   * @param topic topic or {@code null} for none
   */
  public Pubsub setTopic(java.lang.String topic) {
    this.topic = topic;
    return this;
  }

  @Override
  public Pubsub set(String fieldName, Object value) {
    return (Pubsub) super.set(fieldName, value);
  }

  @Override
  public Pubsub clone() {
    return (Pubsub) super.clone();
  }

}
