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

package com.google.api.services.vault.v1.model;

/**
 * Additional options for exports
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExportOptions extends com.google.api.client.json.GenericJson {

  /**
   * Options for Drive exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DriveExportOptions driveOptions;

  /**
   * Options for Groups exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GroupsExportOptions groupsOptions;

  /**
   * Options for Chat exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HangoutsChatExportOptions hangoutsChatOptions;

  /**
   * Options for Gmail exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MailExportOptions mailOptions;

  /**
   * The requested data region for the export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * Options for Voice exports.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VoiceExportOptions voiceOptions;

  /**
   * Options for Drive exports.
   * @return value or {@code null} for none
   */
  public DriveExportOptions getDriveOptions() {
    return driveOptions;
  }

  /**
   * Options for Drive exports.
   * @param driveOptions driveOptions or {@code null} for none
   */
  public ExportOptions setDriveOptions(DriveExportOptions driveOptions) {
    this.driveOptions = driveOptions;
    return this;
  }

  /**
   * Options for Groups exports.
   * @return value or {@code null} for none
   */
  public GroupsExportOptions getGroupsOptions() {
    return groupsOptions;
  }

  /**
   * Options for Groups exports.
   * @param groupsOptions groupsOptions or {@code null} for none
   */
  public ExportOptions setGroupsOptions(GroupsExportOptions groupsOptions) {
    this.groupsOptions = groupsOptions;
    return this;
  }

  /**
   * Options for Chat exports.
   * @return value or {@code null} for none
   */
  public HangoutsChatExportOptions getHangoutsChatOptions() {
    return hangoutsChatOptions;
  }

  /**
   * Options for Chat exports.
   * @param hangoutsChatOptions hangoutsChatOptions or {@code null} for none
   */
  public ExportOptions setHangoutsChatOptions(HangoutsChatExportOptions hangoutsChatOptions) {
    this.hangoutsChatOptions = hangoutsChatOptions;
    return this;
  }

  /**
   * Options for Gmail exports.
   * @return value or {@code null} for none
   */
  public MailExportOptions getMailOptions() {
    return mailOptions;
  }

  /**
   * Options for Gmail exports.
   * @param mailOptions mailOptions or {@code null} for none
   */
  public ExportOptions setMailOptions(MailExportOptions mailOptions) {
    this.mailOptions = mailOptions;
    return this;
  }

  /**
   * The requested data region for the export.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * The requested data region for the export.
   * @param region region or {@code null} for none
   */
  public ExportOptions setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * Options for Voice exports.
   * @return value or {@code null} for none
   */
  public VoiceExportOptions getVoiceOptions() {
    return voiceOptions;
  }

  /**
   * Options for Voice exports.
   * @param voiceOptions voiceOptions or {@code null} for none
   */
  public ExportOptions setVoiceOptions(VoiceExportOptions voiceOptions) {
    this.voiceOptions = voiceOptions;
    return this;
  }

  @Override
  public ExportOptions set(String fieldName, Object value) {
    return (ExportOptions) super.set(fieldName, value);
  }

  @Override
  public ExportOptions clone() {
    return (ExportOptions) super.clone();
  }

}
