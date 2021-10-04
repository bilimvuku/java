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

package com.google.api.services.connectors.v1.model;

/**
 * Response message for ConnectorsService.ListRuntimeEntitySchemas.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListRuntimeEntitySchemasResponse extends com.google.api.client.json.GenericJson {

  /**
   * Next page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Runtime entity schemas.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<RuntimeEntitySchema> runtimeEntitySchemas;

  /**
   * Next page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Next page token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListRuntimeEntitySchemasResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Runtime entity schemas.
   * @return value or {@code null} for none
   */
  public java.util.List<RuntimeEntitySchema> getRuntimeEntitySchemas() {
    return runtimeEntitySchemas;
  }

  /**
   * Runtime entity schemas.
   * @param runtimeEntitySchemas runtimeEntitySchemas or {@code null} for none
   */
  public ListRuntimeEntitySchemasResponse setRuntimeEntitySchemas(java.util.List<RuntimeEntitySchema> runtimeEntitySchemas) {
    this.runtimeEntitySchemas = runtimeEntitySchemas;
    return this;
  }

  @Override
  public ListRuntimeEntitySchemasResponse set(String fieldName, Object value) {
    return (ListRuntimeEntitySchemasResponse) super.set(fieldName, value);
  }

  @Override
  public ListRuntimeEntitySchemasResponse clone() {
    return (ListRuntimeEntitySchemasResponse) super.clone();
  }

}
