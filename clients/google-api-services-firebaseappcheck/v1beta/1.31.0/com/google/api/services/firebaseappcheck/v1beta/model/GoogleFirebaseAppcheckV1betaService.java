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

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * The enforcement configuration for a Firebase service supported by App Check.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaService extends com.google.api.client.json.GenericJson {

  /**
   * Required. The App Check enforcement mode for this service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enforcementMode;

  /**
   * Required. The relative resource name of the service configuration object, in the format: ```
   * projects/{project_number}/services/{service_id} ``` Note that the `service_id` element must be
   * a supported service ID. Currently, the following service IDs are supported: *
   * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) *
   * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com`
   * (Cloud Firestore)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The App Check enforcement mode for this service.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnforcementMode() {
    return enforcementMode;
  }

  /**
   * Required. The App Check enforcement mode for this service.
   * @param enforcementMode enforcementMode or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaService setEnforcementMode(java.lang.String enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * Required. The relative resource name of the service configuration object, in the format: ```
   * projects/{project_number}/services/{service_id} ``` Note that the `service_id` element must be
   * a supported service ID. Currently, the following service IDs are supported: *
   * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) *
   * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com`
   * (Cloud Firestore)
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The relative resource name of the service configuration object, in the format: ```
   * projects/{project_number}/services/{service_id} ``` Note that the `service_id` element must be
   * a supported service ID. Currently, the following service IDs are supported: *
   * `firebasestorage.googleapis.com` (Cloud Storage for Firebase) *
   * `firebasedatabase.googleapis.com` (Firebase Realtime Database) * `firestore.googleapis.com`
   * (Cloud Firestore)
   * @param name name or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaService set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaService) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaService clone() {
    return (GoogleFirebaseAppcheckV1betaService) super.clone();
  }

}
