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
 * Details of a build occurrence.
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
public final class BuildOccurrence extends com.google.api.client.json.GenericJson {

  /**
   * In-toto Provenance representation as defined in spec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InTotoProvenance intotoProvenance;

  /**
   * Required. The actual provenance for the build.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildProvenance provenance;

  /**
   * Serialized JSON representation of the provenance, used in generating the build signature in the
   * corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provenanceBytes;

  /**
   * In-toto Provenance representation as defined in spec.
   * @return value or {@code null} for none
   */
  public InTotoProvenance getIntotoProvenance() {
    return intotoProvenance;
  }

  /**
   * In-toto Provenance representation as defined in spec.
   * @param intotoProvenance intotoProvenance or {@code null} for none
   */
  public BuildOccurrence setIntotoProvenance(InTotoProvenance intotoProvenance) {
    this.intotoProvenance = intotoProvenance;
    return this;
  }

  /**
   * Required. The actual provenance for the build.
   * @return value or {@code null} for none
   */
  public BuildProvenance getProvenance() {
    return provenance;
  }

  /**
   * Required. The actual provenance for the build.
   * @param provenance provenance or {@code null} for none
   */
  public BuildOccurrence setProvenance(BuildProvenance provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Serialized JSON representation of the provenance, used in generating the build signature in the
   * corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvenanceBytes() {
    return provenanceBytes;
  }

  /**
   * Serialized JSON representation of the provenance, used in generating the build signature in the
   * corresponding build note. After verifying the signature, `provenance_bytes` can be unmarshalled
   * and compared to the provenance to confirm that it is unchanged. A base64-encoded string
   * representation of the provenance bytes is used for the signature in order to interoperate with
   * openssl which expects this format for signature verification. The serialized form is captured
   * both to avoid ambiguity in how the provenance is marshalled to json as well to prevent
   * incompatibilities with future changes.
   * @param provenanceBytes provenanceBytes or {@code null} for none
   */
  public BuildOccurrence setProvenanceBytes(java.lang.String provenanceBytes) {
    this.provenanceBytes = provenanceBytes;
    return this;
  }

  @Override
  public BuildOccurrence set(String fieldName, Object value) {
    return (BuildOccurrence) super.set(fieldName, value);
  }

  @Override
  public BuildOccurrence clone() {
    return (BuildOccurrence) super.clone();
  }

}
