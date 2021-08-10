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
 * GitFileSource describes a file within a (possibly remote) code repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GitFileSource extends com.google.api.client.json.GenericJson {

  /**
   * The path of the file, with the repo root as the root of the path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String path;

  /**
   * See RepoType above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String repoType;

  /**
   * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename
   * (optional). This field respects the same syntax/resolution as described here: https://git-
   * scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation
   * originated is assumed to be the revision from which to read the specified path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revision;

  /**
   * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation
   * originated is assumed to be the repo from which to read the specified path.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * The path of the file, with the repo root as the root of the path.
   * @return value or {@code null} for none
   */
  public java.lang.String getPath() {
    return path;
  }

  /**
   * The path of the file, with the repo root as the root of the path.
   * @param path path or {@code null} for none
   */
  public GitFileSource setPath(java.lang.String path) {
    this.path = path;
    return this;
  }

  /**
   * See RepoType above.
   * @return value or {@code null} for none
   */
  public java.lang.String getRepoType() {
    return repoType;
  }

  /**
   * See RepoType above.
   * @param repoType repoType or {@code null} for none
   */
  public GitFileSource setRepoType(java.lang.String repoType) {
    this.repoType = repoType;
    return this;
  }

  /**
   * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename
   * (optional). This field respects the same syntax/resolution as described here: https://git-
   * scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation
   * originated is assumed to be the revision from which to read the specified path.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevision() {
    return revision;
  }

  /**
   * The branch, tag, arbitrary ref, or SHA version of the repo to use when resolving the filename
   * (optional). This field respects the same syntax/resolution as described here: https://git-
   * scm.com/docs/gitrevisions If unspecified, the revision from which the trigger invocation
   * originated is assumed to be the revision from which to read the specified path.
   * @param revision revision or {@code null} for none
   */
  public GitFileSource setRevision(java.lang.String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation
   * originated is assumed to be the repo from which to read the specified path.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * The URI of the repo (optional). If unspecified, the repo from which the trigger invocation
   * originated is assumed to be the repo from which to read the specified path.
   * @param uri uri or {@code null} for none
   */
  public GitFileSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GitFileSource set(String fieldName, Object value) {
    return (GitFileSource) super.set(fieldName, value);
  }

  @Override
  public GitFileSource clone() {
    return (GitFileSource) super.clone();
  }

}
