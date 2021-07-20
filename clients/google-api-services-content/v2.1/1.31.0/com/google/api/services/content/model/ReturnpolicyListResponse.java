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

package com.google.api.services.content.model;

/**
 * Model definition for ReturnpolicyListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReturnpolicyListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnpolicyListResponse`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReturnPolicy> resources;

  static {
    // hack to force ProGuard to consider ReturnPolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ReturnPolicy.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnpolicyListResponse`".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#returnpolicyListResponse`".
   * @param kind kind or {@code null} for none
   */
  public ReturnpolicyListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ReturnPolicy> getResources() {
    return resources;
  }

  /**
   * @param resources resources or {@code null} for none
   */
  public ReturnpolicyListResponse setResources(java.util.List<ReturnPolicy> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public ReturnpolicyListResponse set(String fieldName, Object value) {
    return (ReturnpolicyListResponse) super.set(fieldName, value);
  }

  @Override
  public ReturnpolicyListResponse clone() {
    return (ReturnpolicyListResponse) super.clone();
  }

}
