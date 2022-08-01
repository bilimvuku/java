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

package com.google.api.services.artifactregistry.v1beta1.model;

/**
 * A hash of file content.
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
public final class Hash extends com.google.api.client.json.GenericJson {

  /**
   * The algorithm used to compute the hash value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The hash value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The algorithm used to compute the hash value.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The algorithm used to compute the hash value.
   * @param type type or {@code null} for none
   */
  public Hash setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The hash value.
   * @see #decodeValue()
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The hash value.
   * @see #getValue()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeValue() {
    return com.google.api.client.util.Base64.decodeBase64(value);
  }

  /**
   * The hash value.
   * @see #encodeValue()
   * @param value value or {@code null} for none
   */
  public Hash setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * The hash value.
   * @see #setValue()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Hash encodeValue(byte[] value) {
    this.value = com.google.api.client.util.Base64.encodeBase64URLSafeString(value);
    return this;
  }

  @Override
  public Hash set(String fieldName, Object value) {
    return (Hash) super.set(fieldName, value);
  }

  @Override
  public Hash clone() {
    return (Hash) super.clone();
  }

}
