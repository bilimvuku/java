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

package com.google.api.services.spanner.v1.model;

/**
 * Encryption configuration for a Cloud Spanner database.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EncryptionConfig extends com.google.api.client.json.GenericJson {

  /**
   * The Cloud KMS key to be used for encrypting and decrypting the database. Values are of the form
   * `projects//locations//keyRings//cryptoKeys/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * The Cloud KMS key to be used for encrypting and decrypting the database. Values are of the form
   * `projects//locations//keyRings//cryptoKeys/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The Cloud KMS key to be used for encrypting and decrypting the database. Values are of the form
   * `projects//locations//keyRings//cryptoKeys/`.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public EncryptionConfig setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  @Override
  public EncryptionConfig set(String fieldName, Object value) {
    return (EncryptionConfig) super.set(fieldName, value);
  }

  @Override
  public EncryptionConfig clone() {
    return (EncryptionConfig) super.clone();
  }

}
