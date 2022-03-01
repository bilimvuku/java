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

package com.google.api.services.networkmanagement.v1beta1.model;

/**
 * For display only. Metadata associated with an App Engine version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppEngineVersionInfo extends com.google.api.client.json.GenericJson {

  /**
   * Name of an App Engine version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * App Engine execution environment for a version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * Runtime of the App Engine version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String runtime;

  /**
   * URI of an App Engine version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Name of an App Engine version.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Name of an App Engine version.
   * @param displayName displayName or {@code null} for none
   */
  public AppEngineVersionInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * App Engine execution environment for a version.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * App Engine execution environment for a version.
   * @param environment environment or {@code null} for none
   */
  public AppEngineVersionInfo setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Runtime of the App Engine version.
   * @return value or {@code null} for none
   */
  public java.lang.String getRuntime() {
    return runtime;
  }

  /**
   * Runtime of the App Engine version.
   * @param runtime runtime or {@code null} for none
   */
  public AppEngineVersionInfo setRuntime(java.lang.String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * URI of an App Engine version.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI of an App Engine version.
   * @param uri uri or {@code null} for none
   */
  public AppEngineVersionInfo setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public AppEngineVersionInfo set(String fieldName, Object value) {
    return (AppEngineVersionInfo) super.set(fieldName, value);
  }

  @Override
  public AppEngineVersionInfo clone() {
    return (AppEngineVersionInfo) super.clone();
  }

}
