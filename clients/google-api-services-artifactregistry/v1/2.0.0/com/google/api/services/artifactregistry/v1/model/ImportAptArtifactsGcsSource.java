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

package com.google.api.services.artifactregistry.v1.model;

/**
 * Google Cloud Storage location where the artifacts currently reside.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImportAptArtifactsGcsSource extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> uris;

  /**
   * Supports URI wildcards for matching multiple objects from a single URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean useWildcards;

  /**
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUris() {
    return uris;
  }

  /**
   * Cloud Storage paths URI (e.g., gs://my_bucket//my_object).
   * @param uris uris or {@code null} for none
   */
  public ImportAptArtifactsGcsSource setUris(java.util.List<java.lang.String> uris) {
    this.uris = uris;
    return this;
  }

  /**
   * Supports URI wildcards for matching multiple objects from a single URI.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUseWildcards() {
    return useWildcards;
  }

  /**
   * Supports URI wildcards for matching multiple objects from a single URI.
   * @param useWildcards useWildcards or {@code null} for none
   */
  public ImportAptArtifactsGcsSource setUseWildcards(java.lang.Boolean useWildcards) {
    this.useWildcards = useWildcards;
    return this;
  }

  @Override
  public ImportAptArtifactsGcsSource set(String fieldName, Object value) {
    return (ImportAptArtifactsGcsSource) super.set(fieldName, value);
  }

  @Override
  public ImportAptArtifactsGcsSource clone() {
    return (ImportAptArtifactsGcsSource) super.clone();
  }

}
