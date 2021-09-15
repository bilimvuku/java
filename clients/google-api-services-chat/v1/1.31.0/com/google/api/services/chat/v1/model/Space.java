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

package com.google.api.services.chat.v1.model;

/**
 * A space in Google Chat. Spaces are conversations between two or more users or 1:1 messages
 * between a user and a Chat bot.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Space extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The display name (only if the space is of type `ROOM`). Please note that this
   * field might not be populated in direct messages between humans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Resource name of the space, in the form "spaces". Example: spaces/AAAAMpdlehYs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether the space is a DM between a bot and a single human.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean singleUserBotDm;

  /**
   * Whether the messages are threaded in this space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean threaded;

  /**
   * Output only. The type of a space. This is deprecated. Use `single_user_bot_dm` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Output only. The display name (only if the space is of type `ROOM`). Please note that this
   * field might not be populated in direct messages between humans.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The display name (only if the space is of type `ROOM`). Please note that this
   * field might not be populated in direct messages between humans.
   * @param displayName displayName or {@code null} for none
   */
  public Space setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource name of the space, in the form "spaces". Example: spaces/AAAAMpdlehYs
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the space, in the form "spaces". Example: spaces/AAAAMpdlehYs
   * @param name name or {@code null} for none
   */
  public Space setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether the space is a DM between a bot and a single human.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSingleUserBotDm() {
    return singleUserBotDm;
  }

  /**
   * Whether the space is a DM between a bot and a single human.
   * @param singleUserBotDm singleUserBotDm or {@code null} for none
   */
  public Space setSingleUserBotDm(java.lang.Boolean singleUserBotDm) {
    this.singleUserBotDm = singleUserBotDm;
    return this;
  }

  /**
   * Whether the messages are threaded in this space.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getThreaded() {
    return threaded;
  }

  /**
   * Whether the messages are threaded in this space.
   * @param threaded threaded or {@code null} for none
   */
  public Space setThreaded(java.lang.Boolean threaded) {
    this.threaded = threaded;
    return this;
  }

  /**
   * Output only. The type of a space. This is deprecated. Use `single_user_bot_dm` instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Output only. The type of a space. This is deprecated. Use `single_user_bot_dm` instead.
   * @param type type or {@code null} for none
   */
  public Space setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Space set(String fieldName, Object value) {
    return (Space) super.set(fieldName, value);
  }

  @Override
  public Space clone() {
    return (Space) super.clone();
  }

}
