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
 * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build
 * whenever a Bitbucket Server event is received.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BitbucketServerTriggerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The BitbucketServerConfig specified in the bitbucket_server_config_resource field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BitbucketServerConfig bitbucketServerConfig;

  /**
   * Required. The Bitbucket server config resource that this trigger config maps to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bitbucketServerConfigResource;

  /**
   * Required. Key of the project that the repo is in. For example: The key for
   * http://mybitbucket.server/projects/TEST/repos/test-repo is "TEST".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectKey;

  /**
   * Filter to match changes in pull requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PullRequestFilter pullRequest;

  /**
   * Filter to match changes in refs like branches, tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PushFilter push;

  /**
   * Required. Slug of the repository. A repository slug is a URL-friendly version of a repository
   * name, automatically generated by Bitbucket for use in the URL. For example, if the repository
   * name is 'test repo', in the URL it would become 'test-repo' as in
   * http://mybitbucket.server/projects/TEST/repos/test-repo.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repoSlug;

  /**
   * Output only. The BitbucketServerConfig specified in the bitbucket_server_config_resource field.
   * @return value or {@code null} for none
   */
  public BitbucketServerConfig getBitbucketServerConfig() {
    return bitbucketServerConfig;
  }

  /**
   * Output only. The BitbucketServerConfig specified in the bitbucket_server_config_resource field.
   * @param bitbucketServerConfig bitbucketServerConfig or {@code null} for none
   */
  public BitbucketServerTriggerConfig setBitbucketServerConfig(BitbucketServerConfig bitbucketServerConfig) {
    this.bitbucketServerConfig = bitbucketServerConfig;
    return this;
  }

  /**
   * Required. The Bitbucket server config resource that this trigger config maps to.
   * @return value or {@code null} for none
   */
  public java.lang.String getBitbucketServerConfigResource() {
    return bitbucketServerConfigResource;
  }

  /**
   * Required. The Bitbucket server config resource that this trigger config maps to.
   * @param bitbucketServerConfigResource bitbucketServerConfigResource or {@code null} for none
   */
  public BitbucketServerTriggerConfig setBitbucketServerConfigResource(java.lang.String bitbucketServerConfigResource) {
    this.bitbucketServerConfigResource = bitbucketServerConfigResource;
    return this;
  }

  /**
   * Required. Key of the project that the repo is in. For example: The key for
   * http://mybitbucket.server/projects/TEST/repos/test-repo is "TEST".
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectKey() {
    return projectKey;
  }

  /**
   * Required. Key of the project that the repo is in. For example: The key for
   * http://mybitbucket.server/projects/TEST/repos/test-repo is "TEST".
   * @param projectKey projectKey or {@code null} for none
   */
  public BitbucketServerTriggerConfig setProjectKey(java.lang.String projectKey) {
    this.projectKey = projectKey;
    return this;
  }

  /**
   * Filter to match changes in pull requests.
   * @return value or {@code null} for none
   */
  public PullRequestFilter getPullRequest() {
    return pullRequest;
  }

  /**
   * Filter to match changes in pull requests.
   * @param pullRequest pullRequest or {@code null} for none
   */
  public BitbucketServerTriggerConfig setPullRequest(PullRequestFilter pullRequest) {
    this.pullRequest = pullRequest;
    return this;
  }

  /**
   * Filter to match changes in refs like branches, tags.
   * @return value or {@code null} for none
   */
  public PushFilter getPush() {
    return push;
  }

  /**
   * Filter to match changes in refs like branches, tags.
   * @param push push or {@code null} for none
   */
  public BitbucketServerTriggerConfig setPush(PushFilter push) {
    this.push = push;
    return this;
  }

  /**
   * Required. Slug of the repository. A repository slug is a URL-friendly version of a repository
   * name, automatically generated by Bitbucket for use in the URL. For example, if the repository
   * name is 'test repo', in the URL it would become 'test-repo' as in
   * http://mybitbucket.server/projects/TEST/repos/test-repo.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepoSlug() {
    return repoSlug;
  }

  /**
   * Required. Slug of the repository. A repository slug is a URL-friendly version of a repository
   * name, automatically generated by Bitbucket for use in the URL. For example, if the repository
   * name is 'test repo', in the URL it would become 'test-repo' as in
   * http://mybitbucket.server/projects/TEST/repos/test-repo.
   * @param repoSlug repoSlug or {@code null} for none
   */
  public BitbucketServerTriggerConfig setRepoSlug(java.lang.String repoSlug) {
    this.repoSlug = repoSlug;
    return this;
  }

  @Override
  public BitbucketServerTriggerConfig set(String fieldName, Object value) {
    return (BitbucketServerTriggerConfig) super.set(fieldName, value);
  }

  @Override
  public BitbucketServerTriggerConfig clone() {
    return (BitbucketServerTriggerConfig) super.clone();
  }

}
