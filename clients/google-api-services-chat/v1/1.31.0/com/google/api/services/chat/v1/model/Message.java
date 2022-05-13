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
 * A message in Google Chat.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Message extends com.google.api.client.json.GenericJson {

  /**
   * Input only. Parameters that a Chat app can use to configure how its response is posted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ActionResponse actionResponse;

  /**
   * Output only. Annotations associated with the text in this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Annotation> annotations;

  static {
    // hack to force ProGuard to consider Annotation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Annotation.class);
  }

  /**
   * Plain-text body of the message with all Chat app mentions stripped out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String argumentText;

  /**
   * User uploaded attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Attachment> attachment;

  static {
    // hack to force ProGuard to consider Attachment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Attachment.class);
  }

  /**
   * Rich, formatted and interactive cards that can be used to display UI elements such as:
   * formatted texts, buttons, clickable images. Cards are normally displayed below the plain-text
   * body of the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Card> cards;

  static {
    // hack to force ProGuard to consider Card used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Card.class);
  }

  /**
   * Output only. The time at which the message was created in Google Chat server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A plain-text description of the message's cards, used when the actual cards cannot be displayed
   * (e.g. mobile notifications).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fallbackText;

  /**
   * Output only. The time at which the message was last updated in Google Chat server. If the
   * message was never updated, this field will be same as create_time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String lastUpdateTime;

  /**
   * Output only. A URL in `spaces.messages.text` that matches a link preview pattern. For more
   * information, refer to [Preview links](https://developers.google.com/chat/how-tos/preview-
   * links).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MatchedUrl matchedUrl;

  /**
   * Resource name in the form `spaces/messages`. Example:
   * `spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The user who created the message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User sender;

  /**
   * Output only. Slash command information, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SlashCommand slashCommand;

  /**
   * The space the message belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Space space;

  /**
   * Plain-text body of the message. The first link to an image, video, web page, or other preview-
   * able item generates a preview chip.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * The thread the message belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Thread thread;

  /**
   * Input only. Parameters that a Chat app can use to configure how its response is posted.
   * @return value or {@code null} for none
   */
  public ActionResponse getActionResponse() {
    return actionResponse;
  }

  /**
   * Input only. Parameters that a Chat app can use to configure how its response is posted.
   * @param actionResponse actionResponse or {@code null} for none
   */
  public Message setActionResponse(ActionResponse actionResponse) {
    this.actionResponse = actionResponse;
    return this;
  }

  /**
   * Output only. Annotations associated with the text in this message.
   * @return value or {@code null} for none
   */
  public java.util.List<Annotation> getAnnotations() {
    return annotations;
  }

  /**
   * Output only. Annotations associated with the text in this message.
   * @param annotations annotations or {@code null} for none
   */
  public Message setAnnotations(java.util.List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Plain-text body of the message with all Chat app mentions stripped out.
   * @return value or {@code null} for none
   */
  public java.lang.String getArgumentText() {
    return argumentText;
  }

  /**
   * Plain-text body of the message with all Chat app mentions stripped out.
   * @param argumentText argumentText or {@code null} for none
   */
  public Message setArgumentText(java.lang.String argumentText) {
    this.argumentText = argumentText;
    return this;
  }

  /**
   * User uploaded attachment.
   * @return value or {@code null} for none
   */
  public java.util.List<Attachment> getAttachment() {
    return attachment;
  }

  /**
   * User uploaded attachment.
   * @param attachment attachment or {@code null} for none
   */
  public Message setAttachment(java.util.List<Attachment> attachment) {
    this.attachment = attachment;
    return this;
  }

  /**
   * Rich, formatted and interactive cards that can be used to display UI elements such as:
   * formatted texts, buttons, clickable images. Cards are normally displayed below the plain-text
   * body of the message.
   * @return value or {@code null} for none
   */
  public java.util.List<Card> getCards() {
    return cards;
  }

  /**
   * Rich, formatted and interactive cards that can be used to display UI elements such as:
   * formatted texts, buttons, clickable images. Cards are normally displayed below the plain-text
   * body of the message.
   * @param cards cards or {@code null} for none
   */
  public Message setCards(java.util.List<Card> cards) {
    this.cards = cards;
    return this;
  }

  /**
   * Output only. The time at which the message was created in Google Chat server.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the message was created in Google Chat server.
   * @param createTime createTime or {@code null} for none
   */
  public Message setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A plain-text description of the message's cards, used when the actual cards cannot be displayed
   * (e.g. mobile notifications).
   * @return value or {@code null} for none
   */
  public java.lang.String getFallbackText() {
    return fallbackText;
  }

  /**
   * A plain-text description of the message's cards, used when the actual cards cannot be displayed
   * (e.g. mobile notifications).
   * @param fallbackText fallbackText or {@code null} for none
   */
  public Message setFallbackText(java.lang.String fallbackText) {
    this.fallbackText = fallbackText;
    return this;
  }

  /**
   * Output only. The time at which the message was last updated in Google Chat server. If the
   * message was never updated, this field will be same as create_time.
   * @return value or {@code null} for none
   */
  public String getLastUpdateTime() {
    return lastUpdateTime;
  }

  /**
   * Output only. The time at which the message was last updated in Google Chat server. If the
   * message was never updated, this field will be same as create_time.
   * @param lastUpdateTime lastUpdateTime or {@code null} for none
   */
  public Message setLastUpdateTime(String lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

  /**
   * Output only. A URL in `spaces.messages.text` that matches a link preview pattern. For more
   * information, refer to [Preview links](https://developers.google.com/chat/how-tos/preview-
   * links).
   * @return value or {@code null} for none
   */
  public MatchedUrl getMatchedUrl() {
    return matchedUrl;
  }

  /**
   * Output only. A URL in `spaces.messages.text` that matches a link preview pattern. For more
   * information, refer to [Preview links](https://developers.google.com/chat/how-tos/preview-
   * links).
   * @param matchedUrl matchedUrl or {@code null} for none
   */
  public Message setMatchedUrl(MatchedUrl matchedUrl) {
    this.matchedUrl = matchedUrl;
    return this;
  }

  /**
   * Resource name in the form `spaces/messages`. Example:
   * `spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name in the form `spaces/messages`. Example:
   * `spaces/AAAAAAAAAAA/messages/BBBBBBBBBBB.BBBBBBBBBBB`
   * @param name name or {@code null} for none
   */
  public Message setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The user who created the message.
   * @return value or {@code null} for none
   */
  public User getSender() {
    return sender;
  }

  /**
   * Output only. The user who created the message.
   * @param sender sender or {@code null} for none
   */
  public Message setSender(User sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Output only. Slash command information, if applicable.
   * @return value or {@code null} for none
   */
  public SlashCommand getSlashCommand() {
    return slashCommand;
  }

  /**
   * Output only. Slash command information, if applicable.
   * @param slashCommand slashCommand or {@code null} for none
   */
  public Message setSlashCommand(SlashCommand slashCommand) {
    this.slashCommand = slashCommand;
    return this;
  }

  /**
   * The space the message belongs to.
   * @return value or {@code null} for none
   */
  public Space getSpace() {
    return space;
  }

  /**
   * The space the message belongs to.
   * @param space space or {@code null} for none
   */
  public Message setSpace(Space space) {
    this.space = space;
    return this;
  }

  /**
   * Plain-text body of the message. The first link to an image, video, web page, or other preview-
   * able item generates a preview chip.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Plain-text body of the message. The first link to an image, video, web page, or other preview-
   * able item generates a preview chip.
   * @param text text or {@code null} for none
   */
  public Message setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * The thread the message belongs to.
   * @return value or {@code null} for none
   */
  public Thread getThread() {
    return thread;
  }

  /**
   * The thread the message belongs to.
   * @param thread thread or {@code null} for none
   */
  public Message setThread(Thread thread) {
    this.thread = thread;
    return this;
  }

  @Override
  public Message set(String fieldName, Object value) {
    return (Message) super.set(fieldName, value);
  }

  @Override
  public Message clone() {
    return (Message) super.clone();
  }

}
