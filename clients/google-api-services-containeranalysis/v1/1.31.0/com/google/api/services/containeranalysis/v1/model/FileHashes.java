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

package com.google.api.services.containeranalysis.v1.model;

/**
 * Container message for hashes of byte content of files, used in source messages to verify
 * integrity of source input to the build.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FileHashes extends com.google.api.client.json.GenericJson {

  /**
   * Required. Collection of file hashes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Hash> fileHash;

  /**
   * Required. Collection of file hashes.
   * @return value or {@code null} for none
   */
  public java.util.List<Hash> getFileHash() {
    return fileHash;
  }

  /**
   * Required. Collection of file hashes.
   * @param fileHash fileHash or {@code null} for none
   */
  public FileHashes setFileHash(java.util.List<Hash> fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  @Override
  public FileHashes set(String fieldName, Object value) {
    return (FileHashes) super.set(fieldName, value);
  }

  @Override
  public FileHashes clone() {
    return (FileHashes) super.clone();
  }

}
