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
 * Packages are named collections of versions.
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
public final class ArtifactRegistryPackage extends com.google.api.client.json.GenericJson {

  /**
   * The time when the package was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The display name of the package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The name of the package, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1". If the package ID part contains slashes, the
   * slashes are escaped.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The time when the package was last updated. This includes publishing a new version of the
   * package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The time when the package was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time when the package was created.
   * @param createTime createTime or {@code null} for none
   */
  public ArtifactRegistryPackage setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The display name of the package.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the package.
   * @param displayName displayName or {@code null} for none
   */
  public ArtifactRegistryPackage setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The name of the package, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1". If the package ID part contains slashes, the
   * slashes are escaped.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the package, for example: "projects/p1/locations/us-
   * central1/repositories/repo1/packages/pkg1". If the package ID part contains slashes, the
   * slashes are escaped.
   * @param name name or {@code null} for none
   */
  public ArtifactRegistryPackage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The time when the package was last updated. This includes publishing a new version of the
   * package.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The time when the package was last updated. This includes publishing a new version of the
   * package.
   * @param updateTime updateTime or {@code null} for none
   */
  public ArtifactRegistryPackage setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public ArtifactRegistryPackage set(String fieldName, Object value) {
    return (ArtifactRegistryPackage) super.set(fieldName, value);
  }

  @Override
  public ArtifactRegistryPackage clone() {
    return (ArtifactRegistryPackage) super.clone();
  }

}
