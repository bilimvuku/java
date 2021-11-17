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

package com.google.api.services.clouddeploy.v1.model;

/**
 * The artifacts produced by a target render operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deploy API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetArtifact extends com.google.api.client.json.GenericJson {

  /**
   * Output only. URI of a directory containing the artifacts. This contains deployment
   * configuration used by Skaffold during a rollout, and all paths are relative to this location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String artifactUri;

  /**
   * Output only. File path of the rendered manifest relative to the URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manifestPath;

  /**
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String skaffoldConfigPath;

  /**
   * Output only. URI of a directory containing the artifacts. This contains deployment
   * configuration used by Skaffold during a rollout, and all paths are relative to this location.
   * @return value or {@code null} for none
   */
  public java.lang.String getArtifactUri() {
    return artifactUri;
  }

  /**
   * Output only. URI of a directory containing the artifacts. This contains deployment
   * configuration used by Skaffold during a rollout, and all paths are relative to this location.
   * @param artifactUri artifactUri or {@code null} for none
   */
  public TargetArtifact setArtifactUri(java.lang.String artifactUri) {
    this.artifactUri = artifactUri;
    return this;
  }

  /**
   * Output only. File path of the rendered manifest relative to the URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getManifestPath() {
    return manifestPath;
  }

  /**
   * Output only. File path of the rendered manifest relative to the URI.
   * @param manifestPath manifestPath or {@code null} for none
   */
  public TargetArtifact setManifestPath(java.lang.String manifestPath) {
    this.manifestPath = manifestPath;
    return this;
  }

  /**
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getSkaffoldConfigPath() {
    return skaffoldConfigPath;
  }

  /**
   * Output only. File path of the resolved Skaffold configuration relative to the URI.
   * @param skaffoldConfigPath skaffoldConfigPath or {@code null} for none
   */
  public TargetArtifact setSkaffoldConfigPath(java.lang.String skaffoldConfigPath) {
    this.skaffoldConfigPath = skaffoldConfigPath;
    return this;
  }

  @Override
  public TargetArtifact set(String fieldName, Object value) {
    return (TargetArtifact) super.set(fieldName, value);
  }

  @Override
  public TargetArtifact clone() {
    return (TargetArtifact) super.clone();
  }

}
