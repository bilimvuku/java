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

package com.google.api.services.healthcare.v1alpha2.model;

/**
 * A complete HL7v2 message. See http://www.hl7.org/implement/standards/index.cfm?ref=common for
 * details on the standard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Message extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The datetime when the message was created. Set by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Raw message bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String data;

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * The message type and trigger event for this message. MSH-9.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String messageType;

  /**
   * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Sto
   * res/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The parsed version of the raw message data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ParsedData parsedData;

  /**
   * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PatientId> patientIds;

  /**
   * The hospital that this message came from. MSH-4.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sendFacility;

  /**
   * The datetime the sending application sent this message. MSH-7.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String sendTime;

  /**
   * Output only. The datetime when the message was created. Set by the server.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The datetime when the message was created. Set by the server.
   * @param createTime createTime or {@code null} for none
   */
  public Message setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Raw message bytes.
   * @see #decodeData()
   * @return value or {@code null} for none
   */
  public java.lang.String getData() {
    return data;
  }

  /**
   * Raw message bytes.
   * @see #getData()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeData() {
    return com.google.api.client.util.Base64.decodeBase64(data);
  }

  /**
   * Raw message bytes.
   * @see #encodeData()
   * @param data data or {@code null} for none
   */
  public Message setData(java.lang.String data) {
    this.data = data;
    return this;
  }

  /**
   * Raw message bytes.
   * @see #setData()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Message encodeData(byte[] data) {
    this.data = com.google.api.client.util.Base64.encodeBase64URLSafeString(data);
    return this;
  }

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * User-supplied key-value pairs used to organize HL7v2 stores.
   *
   * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
   * bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}
   *
   * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of
   * maximum 128 bytes, and must conform to the following PCRE regular expression:
   * [\p{Ll}\p{Lo}\p{N}_-]{0,63}
   *
   * No more than 64 labels can be associated with a given store.
   * @param labels labels or {@code null} for none
   */
  public Message setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * The message type and trigger event for this message. MSH-9.
   * @return value or {@code null} for none
   */
  public java.lang.String getMessageType() {
    return messageType;
  }

  /**
   * The message type and trigger event for this message. MSH-9.
   * @param messageType messageType or {@code null} for none
   */
  public Message setMessageType(java.lang.String messageType) {
    this.messageType = messageType;
    return this;
  }

  /**
   * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Sto
   * res/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Sto
   * res/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
   * @param name name or {@code null} for none
   */
  public Message setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The parsed version of the raw message data.
   * @return value or {@code null} for none
   */
  public ParsedData getParsedData() {
    return parsedData;
  }

  /**
   * Output only. The parsed version of the raw message data.
   * @param parsedData parsedData or {@code null} for none
   */
  public Message setParsedData(ParsedData parsedData) {
    this.parsedData = parsedData;
    return this;
  }

  /**
   * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
   * @return value or {@code null} for none
   */
  public java.util.List<PatientId> getPatientIds() {
    return patientIds;
  }

  /**
   * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
   * @param patientIds patientIds or {@code null} for none
   */
  public Message setPatientIds(java.util.List<PatientId> patientIds) {
    this.patientIds = patientIds;
    return this;
  }

  /**
   * The hospital that this message came from. MSH-4.
   * @return value or {@code null} for none
   */
  public java.lang.String getSendFacility() {
    return sendFacility;
  }

  /**
   * The hospital that this message came from. MSH-4.
   * @param sendFacility sendFacility or {@code null} for none
   */
  public Message setSendFacility(java.lang.String sendFacility) {
    this.sendFacility = sendFacility;
    return this;
  }

  /**
   * The datetime the sending application sent this message. MSH-7.
   * @return value or {@code null} for none
   */
  public String getSendTime() {
    return sendTime;
  }

  /**
   * The datetime the sending application sent this message. MSH-7.
   * @param sendTime sendTime or {@code null} for none
   */
  public Message setSendTime(String sendTime) {
    this.sendTime = sendTime;
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
