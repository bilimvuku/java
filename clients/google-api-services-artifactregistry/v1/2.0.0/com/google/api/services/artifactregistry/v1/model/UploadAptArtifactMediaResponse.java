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
 * The response to upload an artifact.
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
public final class UploadAptArtifactMediaResponse extends com.google.api.client.json.GenericJson {

  /**
   * Operation to be returned to the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Operation operation;

  /**
   * Operation to be returned to the user.
   * @return value or {@code null} for none
   */
  public Operation getOperation() {
    return operation;
  }

  /**
   * Operation to be returned to the user.
   * @param operation operation or {@code null} for none
   */
  public UploadAptArtifactMediaResponse setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  @Override
  public UploadAptArtifactMediaResponse set(String fieldName, Object value) {
    return (UploadAptArtifactMediaResponse) super.set(fieldName, value);
  }

  @Override
  public UploadAptArtifactMediaResponse clone() {
    return (UploadAptArtifactMediaResponse) super.clone();
  }

}
