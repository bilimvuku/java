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

package com.google.api.services.tagmanager.model;

/**
 * Represents a Google Tag Manager Tag.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Tag Manager API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Tag extends com.google.api.client.json.GenericJson {

  /**
   * GTM Account ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String accountId;

  /**
   * Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> blockingRuleId;

  /**
   * Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire.
   * @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> blockingTriggerId;

  /**
   * Consent settings of a tag. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TagConsentSetting consentSettings;

  /**
   * GTM Container ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String containerId;

  /**
   * The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever
   * the tag is modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Firing rule IDs. A tag will fire when any of the listed rules are true and all of its
   * blockingRuleIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> firingRuleId;

  /**
   * Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its
   * blockingTriggerIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> firingTriggerId;

  /**
   * If set to true, this tag will only fire in the live environment (e.g. not in preview or debug
   * mode). @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean liveOnly;

  /**
   * A map of key-value pairs of tag metadata to be included in the event data for tag monitoring.
   * Notes: - This parameter must be type MAP. - Each parameter in the map are type TEMPLATE,
   * however cannot contain variable references. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter monitoringMetadata;

  /**
   * If non-empty, then the tag display name will be included in the monitoring metadata map using
   * the key specified. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String monitoringMetadataTagNameKey;

  /**
   * Tag display name. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User notes on how to apply this tag in the container. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notes;

  /**
   * The tag's parameters. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Parameter> parameter;

  static {
    // hack to force ProGuard to consider Parameter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Parameter.class);
  }

  /**
   * Parent folder id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parentFolderId;

  /**
   * GTM Tag's API relative path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * Indicates whether the tag is paused, which prevents the tag from firing. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean paused;

  /**
   * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority.
   * Tags with higher numeric value fire first. A tag's priority can be a positive or negative
   * value. The default value is 0. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Parameter priority;

  /**
   * The end timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scheduleEndMs;

  /**
   * The start timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long scheduleStartMs;

  /**
   * The list of setup tags. Currently we only allow one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SetupTag> setupTag;

  static {
    // hack to force ProGuard to consider SetupTag used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SetupTag.class);
  }

  /**
   * Option to fire this tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagFiringOption;

  /**
   * The Tag ID uniquely identifies the GTM Tag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagId;

  /**
   * Auto generated link to the tag manager UI
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tagManagerUrl;

  /**
   * The list of teardown tags. Currently we only allow one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TeardownTag> teardownTag;

  /**
   * GTM Tag Type. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * GTM Workspace ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String workspaceId;

  /**
   * GTM Account ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getAccountId() {
    return accountId;
  }

  /**
   * GTM Account ID.
   * @param accountId accountId or {@code null} for none
   */
  public Tag setAccountId(java.lang.String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBlockingRuleId() {
    return blockingRuleId;
  }

  /**
   * Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param blockingRuleId blockingRuleId or {@code null} for none
   */
  public Tag setBlockingRuleId(java.util.List<java.lang.String> blockingRuleId) {
    this.blockingRuleId = blockingRuleId;
    return this;
  }

  /**
   * Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire.
   * @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getBlockingTriggerId() {
    return blockingTriggerId;
  }

  /**
   * Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire.
   * @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param blockingTriggerId blockingTriggerId or {@code null} for none
   */
  public Tag setBlockingTriggerId(java.util.List<java.lang.String> blockingTriggerId) {
    this.blockingTriggerId = blockingTriggerId;
    return this;
  }

  /**
   * Consent settings of a tag. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public TagConsentSetting getConsentSettings() {
    return consentSettings;
  }

  /**
   * Consent settings of a tag. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * @param consentSettings consentSettings or {@code null} for none
   */
  public Tag setConsentSettings(TagConsentSetting consentSettings) {
    this.consentSettings = consentSettings;
    return this;
  }

  /**
   * GTM Container ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getContainerId() {
    return containerId;
  }

  /**
   * GTM Container ID.
   * @param containerId containerId or {@code null} for none
   */
  public Tag setContainerId(java.lang.String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever
   * the tag is modified.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever
   * the tag is modified.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Tag setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Firing rule IDs. A tag will fire when any of the listed rules are true and all of its
   * blockingRuleIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFiringRuleId() {
    return firingRuleId;
  }

  /**
   * Firing rule IDs. A tag will fire when any of the listed rules are true and all of its
   * blockingRuleIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param firingRuleId firingRuleId or {@code null} for none
   */
  public Tag setFiringRuleId(java.util.List<java.lang.String> firingRuleId) {
    this.firingRuleId = firingRuleId;
    return this;
  }

  /**
   * Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its
   * blockingTriggerIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFiringTriggerId() {
    return firingTriggerId;
  }

  /**
   * Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its
   * blockingTriggerIds (if any specified) are false. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param firingTriggerId firingTriggerId or {@code null} for none
   */
  public Tag setFiringTriggerId(java.util.List<java.lang.String> firingTriggerId) {
    this.firingTriggerId = firingTriggerId;
    return this;
  }

  /**
   * If set to true, this tag will only fire in the live environment (e.g. not in preview or debug
   * mode). @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLiveOnly() {
    return liveOnly;
  }

  /**
   * If set to true, this tag will only fire in the live environment (e.g. not in preview or debug
   * mode). @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param liveOnly liveOnly or {@code null} for none
   */
  public Tag setLiveOnly(java.lang.Boolean liveOnly) {
    this.liveOnly = liveOnly;
    return this;
  }

  /**
   * A map of key-value pairs of tag metadata to be included in the event data for tag monitoring.
   * Notes: - This parameter must be type MAP. - Each parameter in the map are type TEMPLATE,
   * however cannot contain variable references. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public Parameter getMonitoringMetadata() {
    return monitoringMetadata;
  }

  /**
   * A map of key-value pairs of tag metadata to be included in the event data for tag monitoring.
   * Notes: - This parameter must be type MAP. - Each parameter in the map are type TEMPLATE,
   * however cannot contain variable references. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param monitoringMetadata monitoringMetadata or {@code null} for none
   */
  public Tag setMonitoringMetadata(Parameter monitoringMetadata) {
    this.monitoringMetadata = monitoringMetadata;
    return this;
  }

  /**
   * If non-empty, then the tag display name will be included in the monitoring metadata map using
   * the key specified. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.String getMonitoringMetadataTagNameKey() {
    return monitoringMetadataTagNameKey;
  }

  /**
   * If non-empty, then the tag display name will be included in the monitoring metadata map using
   * the key specified. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param monitoringMetadataTagNameKey monitoringMetadataTagNameKey or {@code null} for none
   */
  public Tag setMonitoringMetadataTagNameKey(java.lang.String monitoringMetadataTagNameKey) {
    this.monitoringMetadataTagNameKey = monitoringMetadataTagNameKey;
    return this;
  }

  /**
   * Tag display name. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Tag display name. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param name name or {@code null} for none
   */
  public Tag setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User notes on how to apply this tag in the container. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.String getNotes() {
    return notes;
  }

  /**
   * User notes on how to apply this tag in the container. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param notes notes or {@code null} for none
   */
  public Tag setNotes(java.lang.String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * The tag's parameters. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.util.List<Parameter> getParameter() {
    return parameter;
  }

  /**
   * The tag's parameters. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param parameter parameter or {@code null} for none
   */
  public Tag setParameter(java.util.List<Parameter> parameter) {
    this.parameter = parameter;
    return this;
  }

  /**
   * Parent folder id.
   * @return value or {@code null} for none
   */
  public java.lang.String getParentFolderId() {
    return parentFolderId;
  }

  /**
   * Parent folder id.
   * @param parentFolderId parentFolderId or {@code null} for none
   */
  public Tag setParentFolderId(java.lang.String parentFolderId) {
    this.parentFolderId = parentFolderId;
    return this;
  }

  /**
   * GTM Tag's API relative path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * GTM Tag's API relative path.
   * @param path path or {@code null} for none
   */
  public Tag setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * Indicates whether the tag is paused, which prevents the tag from firing. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPaused() {
    return paused;
  }

  /**
   * Indicates whether the tag is paused, which prevents the tag from firing. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param paused paused or {@code null} for none
   */
  public Tag setPaused(java.lang.Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority.
   * Tags with higher numeric value fire first. A tag's priority can be a positive or negative
   * value. The default value is 0. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public Parameter getPriority() {
    return priority;
  }

  /**
   * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority.
   * Tags with higher numeric value fire first. A tag's priority can be a positive or negative
   * value. The default value is 0. @mutable tagmanager.accounts.containers.workspaces.tags.create
   * @mutable tagmanager.accounts.containers.workspaces.tags.update
   * @param priority priority or {@code null} for none
   */
  public Tag setPriority(Parameter priority) {
    this.priority = priority;
    return this;
  }

  /**
   * The end timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.Long getScheduleEndMs() {
    return scheduleEndMs;
  }

  /**
   * The end timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param scheduleEndMs scheduleEndMs or {@code null} for none
   */
  public Tag setScheduleEndMs(java.lang.Long scheduleEndMs) {
    this.scheduleEndMs = scheduleEndMs;
    return this;
  }

  /**
   * The start timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.Long getScheduleStartMs() {
    return scheduleStartMs;
  }

  /**
   * The start timestamp in milliseconds to schedule a tag. @mutable
   * tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param scheduleStartMs scheduleStartMs or {@code null} for none
   */
  public Tag setScheduleStartMs(java.lang.Long scheduleStartMs) {
    this.scheduleStartMs = scheduleStartMs;
    return this;
  }

  /**
   * The list of setup tags. Currently we only allow one.
   * @return value or {@code null} for none
   */
  public java.util.List<SetupTag> getSetupTag() {
    return setupTag;
  }

  /**
   * The list of setup tags. Currently we only allow one.
   * @param setupTag setupTag or {@code null} for none
   */
  public Tag setSetupTag(java.util.List<SetupTag> setupTag) {
    this.setupTag = setupTag;
    return this;
  }

  /**
   * Option to fire this tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagFiringOption() {
    return tagFiringOption;
  }

  /**
   * Option to fire this tag.
   * @param tagFiringOption tagFiringOption or {@code null} for none
   */
  public Tag setTagFiringOption(java.lang.String tagFiringOption) {
    this.tagFiringOption = tagFiringOption;
    return this;
  }

  /**
   * The Tag ID uniquely identifies the GTM Tag.
   * @return value or {@code null} for none
   */
  public java.lang.String getTagId() {
    return tagId;
  }

  /**
   * The Tag ID uniquely identifies the GTM Tag.
   * @param tagId tagId or {@code null} for none
   */
  public Tag setTagId(java.lang.String tagId) {
    this.tagId = tagId;
    return this;
  }

  /**
   * Auto generated link to the tag manager UI
   * @return value or {@code null} for none
   */
  public java.lang.String getTagManagerUrl() {
    return tagManagerUrl;
  }

  /**
   * Auto generated link to the tag manager UI
   * @param tagManagerUrl tagManagerUrl or {@code null} for none
   */
  public Tag setTagManagerUrl(java.lang.String tagManagerUrl) {
    this.tagManagerUrl = tagManagerUrl;
    return this;
  }

  /**
   * The list of teardown tags. Currently we only allow one.
   * @return value or {@code null} for none
   */
  public java.util.List<TeardownTag> getTeardownTag() {
    return teardownTag;
  }

  /**
   * The list of teardown tags. Currently we only allow one.
   * @param teardownTag teardownTag or {@code null} for none
   */
  public Tag setTeardownTag(java.util.List<TeardownTag> teardownTag) {
    this.teardownTag = teardownTag;
    return this;
  }

  /**
   * GTM Tag Type. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * GTM Tag Type. @mutable tagmanager.accounts.containers.workspaces.tags.create @mutable
   * tagmanager.accounts.containers.workspaces.tags.update
   * @param type type or {@code null} for none
   */
  public Tag setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * GTM Workspace ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorkspaceId() {
    return workspaceId;
  }

  /**
   * GTM Workspace ID.
   * @param workspaceId workspaceId or {@code null} for none
   */
  public Tag setWorkspaceId(java.lang.String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  @Override
  public Tag set(String fieldName, Object value) {
    return (Tag) super.set(fieldName, value);
  }

  @Override
  public Tag clone() {
    return (Tag) super.clone();
  }

}
