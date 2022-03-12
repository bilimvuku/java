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

package com.google.api.services.composer.v1.model;

/**
 * The configuration of Cloud SQL instance that is used by the Apache Airflow software.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DatabaseConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Cloud SQL machine type used by Airflow database. It has to be one of:
   * db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified,
   * db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. Cloud SQL machine type used by Airflow database. It has to be one of:
   * db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified,
   * db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Optional. Cloud SQL machine type used by Airflow database. It has to be one of:
   * db-n1-standard-2, db-n1-standard-4, db-n1-standard-8 or db-n1-standard-16. If not specified,
   * db-n1-standard-2 will be used. Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * @param machineType machineType or {@code null} for none
   */
  public DatabaseConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  @Override
  public DatabaseConfig set(String fieldName, Object value) {
    return (DatabaseConfig) super.set(fieldName, value);
  }

  @Override
  public DatabaseConfig clone() {
    return (DatabaseConfig) super.clone();
  }

}
