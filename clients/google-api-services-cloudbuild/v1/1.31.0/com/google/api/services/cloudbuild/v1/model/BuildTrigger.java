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

package com.google.api.services.cloudbuild.v1.model;

/**
 * Configuration for an automated build in response to source repository changes.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildTrigger extends com.google.api.client.json.GenericJson {

  /**
   * Configuration for manual approval to start a build invocation of this BuildTrigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ApprovalConfig approvalConfig;

  /**
   * Autodetect build configuration. The following precedence is used (case insensitive): 1.
   * cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for
   * GitHub App Triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autodetect;

  /**
   * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build
   * whenever a Bitbucket Server event is received.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BitbucketServerTriggerConfig bitbucketServerTriggerConfig;

  /**
   * Contents of the build template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Build build;

  /**
   * Output only. Time when the trigger was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Human-readable description of this trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * If true, the trigger will never automatically execute a build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * EventType allows the user to explicitly set the type of event to which this BuildTrigger should
   * respond. This field will be validated against the rest of the configuration if it is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filename;

  /**
   * A Common Expression Language string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * The file source describing the local or remote Build template.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitFileSource gitFileSource;

  /**
   * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a
   * GitHub event is received. Mutually exclusive with `trigger_template`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitHubEventsConfig github;

  /**
   * Output only. Unique identifier of the trigger.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files
   * and changed files are both empty, then they are not used to determine whether or not to trigger
   * a build. If ignored_files is not empty, then we ignore any files that match any of the
   * ignored_file globs. If the change has no files that are outside of the ignored_files globs,
   * then we do not trigger a build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ignoredFiles;

  /**
   * If any of the files altered in the commit pass the ignored_files filter and included_files is
   * empty, then as far as this filter is concerned, we should trigger the build. If any of the
   * files altered in the commit pass the ignored_files filter and included_files is not empty, then
   * we make sure that at least one of those files matches a included_files glob. If not, then we do
   * not trigger a build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includedFiles;

  /**
   * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet
   * the following requirements: + They must contain only alphanumeric characters and dashes. + They
   * can be 1-64 characters long. + They must begin and end with an alphanumeric character.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub
   * message is published.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PubsubConfig pubsubConfig;

  /**
   * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`,
   * where {trigger} is a unique identifier generated by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * The service account used for all user-controlled operations including UpdateBuildTrigger,
   * RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard
   * Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
   * Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * The repo and ref of the repository from which to build. This field is used only for those
   * triggers that do not respond to SCM events. Triggers that respond to such events build source
   * at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub,
   * Manual, and Cron triggers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GitRepoSource sourceToBuild;

  /**
   * Substitutions for Build resource. The keys must match the following regular expression:
   * `^_[A-Z0-9_]+$`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> substitutions;

  /**
   * Tags for annotation of a `BuildTrigger`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Template describing the types of source changes to trigger a build. Branch and tag names in
   * trigger templates are interpreted as regular expressions. Any branch or tag change that matches
   * that regular expression will trigger a build. Mutually exclusive with `github`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepoSource triggerTemplate;

  /**
   * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook
   * is sent to a trigger's webhook URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WebhookConfig webhookConfig;

  /**
   * Configuration for manual approval to start a build invocation of this BuildTrigger.
   * @return value or {@code null} for none
   */
  public ApprovalConfig getApprovalConfig() {
    return approvalConfig;
  }

  /**
   * Configuration for manual approval to start a build invocation of this BuildTrigger.
   * @param approvalConfig approvalConfig or {@code null} for none
   */
  public BuildTrigger setApprovalConfig(ApprovalConfig approvalConfig) {
    this.approvalConfig = approvalConfig;
    return this;
  }

  /**
   * Autodetect build configuration. The following precedence is used (case insensitive): 1.
   * cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for
   * GitHub App Triggers.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutodetect() {
    return autodetect;
  }

  /**
   * Autodetect build configuration. The following precedence is used (case insensitive): 1.
   * cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for
   * GitHub App Triggers.
   * @param autodetect autodetect or {@code null} for none
   */
  public BuildTrigger setAutodetect(java.lang.Boolean autodetect) {
    this.autodetect = autodetect;
    return this;
  }

  /**
   * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build
   * whenever a Bitbucket Server event is received.
   * @return value or {@code null} for none
   */
  public BitbucketServerTriggerConfig getBitbucketServerTriggerConfig() {
    return bitbucketServerTriggerConfig;
  }

  /**
   * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build
   * whenever a Bitbucket Server event is received.
   * @param bitbucketServerTriggerConfig bitbucketServerTriggerConfig or {@code null} for none
   */
  public BuildTrigger setBitbucketServerTriggerConfig(BitbucketServerTriggerConfig bitbucketServerTriggerConfig) {
    this.bitbucketServerTriggerConfig = bitbucketServerTriggerConfig;
    return this;
  }

  /**
   * Contents of the build template.
   * @return value or {@code null} for none
   */
  public Build getBuild() {
    return build;
  }

  /**
   * Contents of the build template.
   * @param build build or {@code null} for none
   */
  public BuildTrigger setBuild(Build build) {
    this.build = build;
    return this;
  }

  /**
   * Output only. Time when the trigger was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Time when the trigger was created.
   * @param createTime createTime or {@code null} for none
   */
  public BuildTrigger setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Human-readable description of this trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Human-readable description of this trigger.
   * @param description description or {@code null} for none
   */
  public BuildTrigger setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * If true, the trigger will never automatically execute a build.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * If true, the trigger will never automatically execute a build.
   * @param disabled disabled or {@code null} for none
   */
  public BuildTrigger setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * EventType allows the user to explicitly set the type of event to which this BuildTrigger should
   * respond. This field will be validated against the rest of the configuration if it is set.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * EventType allows the user to explicitly set the type of event to which this BuildTrigger should
   * respond. This field will be validated against the rest of the configuration if it is set.
   * @param eventType eventType or {@code null} for none
   */
  public BuildTrigger setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
   * @return value or {@code null} for none
   */
  public java.lang.String getFilename() {
    return filename;
  }

  /**
   * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
   * @param filename filename or {@code null} for none
   */
  public BuildTrigger setFilename(java.lang.String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * A Common Expression Language string.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * A Common Expression Language string.
   * @param filter filter or {@code null} for none
   */
  public BuildTrigger setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * The file source describing the local or remote Build template.
   * @return value or {@code null} for none
   */
  public GitFileSource getGitFileSource() {
    return gitFileSource;
  }

  /**
   * The file source describing the local or remote Build template.
   * @param gitFileSource gitFileSource or {@code null} for none
   */
  public BuildTrigger setGitFileSource(GitFileSource gitFileSource) {
    this.gitFileSource = gitFileSource;
    return this;
  }

  /**
   * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a
   * GitHub event is received. Mutually exclusive with `trigger_template`.
   * @return value or {@code null} for none
   */
  public GitHubEventsConfig getGithub() {
    return github;
  }

  /**
   * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a
   * GitHub event is received. Mutually exclusive with `trigger_template`.
   * @param github github or {@code null} for none
   */
  public BuildTrigger setGithub(GitHubEventsConfig github) {
    this.github = github;
    return this;
  }

  /**
   * Output only. Unique identifier of the trigger.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. Unique identifier of the trigger.
   * @param id id or {@code null} for none
   */
  public BuildTrigger setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files
   * and changed files are both empty, then they are not used to determine whether or not to trigger
   * a build. If ignored_files is not empty, then we ignore any files that match any of the
   * ignored_file globs. If the change has no files that are outside of the ignored_files globs,
   * then we do not trigger a build.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIgnoredFiles() {
    return ignoredFiles;
  }

  /**
   * ignored_files and included_files are file glob matches using
   * https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files
   * and changed files are both empty, then they are not used to determine whether or not to trigger
   * a build. If ignored_files is not empty, then we ignore any files that match any of the
   * ignored_file globs. If the change has no files that are outside of the ignored_files globs,
   * then we do not trigger a build.
   * @param ignoredFiles ignoredFiles or {@code null} for none
   */
  public BuildTrigger setIgnoredFiles(java.util.List<java.lang.String> ignoredFiles) {
    this.ignoredFiles = ignoredFiles;
    return this;
  }

  /**
   * If any of the files altered in the commit pass the ignored_files filter and included_files is
   * empty, then as far as this filter is concerned, we should trigger the build. If any of the
   * files altered in the commit pass the ignored_files filter and included_files is not empty, then
   * we make sure that at least one of those files matches a included_files glob. If not, then we do
   * not trigger a build.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludedFiles() {
    return includedFiles;
  }

  /**
   * If any of the files altered in the commit pass the ignored_files filter and included_files is
   * empty, then as far as this filter is concerned, we should trigger the build. If any of the
   * files altered in the commit pass the ignored_files filter and included_files is not empty, then
   * we make sure that at least one of those files matches a included_files glob. If not, then we do
   * not trigger a build.
   * @param includedFiles includedFiles or {@code null} for none
   */
  public BuildTrigger setIncludedFiles(java.util.List<java.lang.String> includedFiles) {
    this.includedFiles = includedFiles;
    return this;
  }

  /**
   * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet
   * the following requirements: + They must contain only alphanumeric characters and dashes. + They
   * can be 1-64 characters long. + They must begin and end with an alphanumeric character.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet
   * the following requirements: + They must contain only alphanumeric characters and dashes. + They
   * can be 1-64 characters long. + They must begin and end with an alphanumeric character.
   * @param name name or {@code null} for none
   */
  public BuildTrigger setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub
   * message is published.
   * @return value or {@code null} for none
   */
  public PubsubConfig getPubsubConfig() {
    return pubsubConfig;
  }

  /**
   * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub
   * message is published.
   * @param pubsubConfig pubsubConfig or {@code null} for none
   */
  public BuildTrigger setPubsubConfig(PubsubConfig pubsubConfig) {
    this.pubsubConfig = pubsubConfig;
    return this;
  }

  /**
   * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`,
   * where {trigger} is a unique identifier generated by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`,
   * where {trigger} is a unique identifier generated by the service.
   * @param resourceName resourceName or {@code null} for none
   */
  public BuildTrigger setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * The service account used for all user-controlled operations including UpdateBuildTrigger,
   * RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard
   * Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
   * Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account used for all user-controlled operations including UpdateBuildTrigger,
   * RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard
   * Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
   * Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public BuildTrigger setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * The repo and ref of the repository from which to build. This field is used only for those
   * triggers that do not respond to SCM events. Triggers that respond to such events build source
   * at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub,
   * Manual, and Cron triggers.
   * @return value or {@code null} for none
   */
  public GitRepoSource getSourceToBuild() {
    return sourceToBuild;
  }

  /**
   * The repo and ref of the repository from which to build. This field is used only for those
   * triggers that do not respond to SCM events. Triggers that respond to such events build source
   * at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub,
   * Manual, and Cron triggers.
   * @param sourceToBuild sourceToBuild or {@code null} for none
   */
  public BuildTrigger setSourceToBuild(GitRepoSource sourceToBuild) {
    this.sourceToBuild = sourceToBuild;
    return this;
  }

  /**
   * Substitutions for Build resource. The keys must match the following regular expression:
   * `^_[A-Z0-9_]+$`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getSubstitutions() {
    return substitutions;
  }

  /**
   * Substitutions for Build resource. The keys must match the following regular expression:
   * `^_[A-Z0-9_]+$`.
   * @param substitutions substitutions or {@code null} for none
   */
  public BuildTrigger setSubstitutions(java.util.Map<String, java.lang.String> substitutions) {
    this.substitutions = substitutions;
    return this;
  }

  /**
   * Tags for annotation of a `BuildTrigger`
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags for annotation of a `BuildTrigger`
   * @param tags tags or {@code null} for none
   */
  public BuildTrigger setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Template describing the types of source changes to trigger a build. Branch and tag names in
   * trigger templates are interpreted as regular expressions. Any branch or tag change that matches
   * that regular expression will trigger a build. Mutually exclusive with `github`.
   * @return value or {@code null} for none
   */
  public RepoSource getTriggerTemplate() {
    return triggerTemplate;
  }

  /**
   * Template describing the types of source changes to trigger a build. Branch and tag names in
   * trigger templates are interpreted as regular expressions. Any branch or tag change that matches
   * that regular expression will trigger a build. Mutually exclusive with `github`.
   * @param triggerTemplate triggerTemplate or {@code null} for none
   */
  public BuildTrigger setTriggerTemplate(RepoSource triggerTemplate) {
    this.triggerTemplate = triggerTemplate;
    return this;
  }

  /**
   * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook
   * is sent to a trigger's webhook URL.
   * @return value or {@code null} for none
   */
  public WebhookConfig getWebhookConfig() {
    return webhookConfig;
  }

  /**
   * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook
   * is sent to a trigger's webhook URL.
   * @param webhookConfig webhookConfig or {@code null} for none
   */
  public BuildTrigger setWebhookConfig(WebhookConfig webhookConfig) {
    this.webhookConfig = webhookConfig;
    return this;
  }

  @Override
  public BuildTrigger set(String fieldName, Object value) {
    return (BuildTrigger) super.set(fieldName, value);
  }

  @Override
  public BuildTrigger clone() {
    return (BuildTrigger) super.clone();
  }

}
