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

package com.google.api.services.run.v2.model;

/**
 * The secret's value will be presented as the content of a file whose name is defined in the item
 * path. If no items are defined, the name of the file is the secret.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2SecretVolumeSource extends com.google.api.client.json.GenericJson {

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this
   * setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is
   * an integer representation of the mode bits. So, the octal integer value should look exactly as
   * the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to
   * 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10).
   * For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in
   * conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set. This might be in conflict with other options that affect the file mode,
   * like fsGroup, and as a result, other mode bits could be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer defaultMode;

  /**
   * If unspecified, the volume will expose a file whose name is the secret, relative to
   * VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud
   * Secret Manager and the path will be the name of the file exposed in the volume. When items are
   * defined, they must specify a path and a version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2VersionToPath> items;

  /**
   * Required. The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in
   * the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secret;

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this
   * setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is
   * an integer representation of the mode bits. So, the octal integer value should look exactly as
   * the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to
   * 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10).
   * For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in
   * conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set. This might be in conflict with other options that affect the file mode,
   * like fsGroup, and as a result, other mode bits could be set.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDefaultMode() {
    return defaultMode;
  }

  /**
   * Integer representation of mode bits to use on created files by default. Must be a value between
   * 0000 and 0777 (octal), defaulting to 0644. Directories within the path are not affected by this
   * setting. Notes * Internally, a umask of 0222 will be applied to any non-zero value. * This is
   * an integer representation of the mode bits. So, the octal integer value should look exactly as
   * the chmod numeric notation with a leading zero. Some examples: for chmod 777 (a=rwx), set to
   * 0777 (octal) or 511 (base-10). For chmod 640 (u=rw,g=r), set to 0640 (octal) or 416 (base-10).
   * For chmod 755 (u=rwx,g=rx,o=rx), set to 0755 (octal) or 493 (base-10). * This might be in
   * conflict with other options that affect the file mode, like fsGroup, and the result can be
   * other mode bits set. This might be in conflict with other options that affect the file mode,
   * like fsGroup, and as a result, other mode bits could be set.
   * @param defaultMode defaultMode or {@code null} for none
   */
  public GoogleCloudRunV2SecretVolumeSource setDefaultMode(java.lang.Integer defaultMode) {
    this.defaultMode = defaultMode;
    return this;
  }

  /**
   * If unspecified, the volume will expose a file whose name is the secret, relative to
   * VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud
   * Secret Manager and the path will be the name of the file exposed in the volume. When items are
   * defined, they must specify a path and a version.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2VersionToPath> getItems() {
    return items;
  }

  /**
   * If unspecified, the volume will expose a file whose name is the secret, relative to
   * VolumeMount.mount_path. If specified, the key will be used as the version to fetch from Cloud
   * Secret Manager and the path will be the name of the file exposed in the volume. When items are
   * defined, they must specify a path and a version.
   * @param items items or {@code null} for none
   */
  public GoogleCloudRunV2SecretVolumeSource setItems(java.util.List<GoogleCloudRunV2VersionToPath> items) {
    this.items = items;
    return this;
  }

  /**
   * Required. The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in
   * the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
   * @return value or {@code null} for none
   */
  public java.lang.String getSecret() {
    return secret;
  }

  /**
   * Required. The name of the secret in Cloud Secret Manager. Format: {secret} if the secret is in
   * the same project. projects/{project}/secrets/{secret} if the secret is in a different project.
   * @param secret secret or {@code null} for none
   */
  public GoogleCloudRunV2SecretVolumeSource setSecret(java.lang.String secret) {
    this.secret = secret;
    return this;
  }

  @Override
  public GoogleCloudRunV2SecretVolumeSource set(String fieldName, Object value) {
    return (GoogleCloudRunV2SecretVolumeSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2SecretVolumeSource clone() {
    return (GoogleCloudRunV2SecretVolumeSource) super.clone();
  }

}
