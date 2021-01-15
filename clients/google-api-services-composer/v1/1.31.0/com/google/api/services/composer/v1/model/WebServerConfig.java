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
 * The configuration settings for the Airflow web server App Engine instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WebServerConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Machine type on which Airflow web server is running. It has to be one of:
   * composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified,
   * composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web
   * server parameters were manually changed to a non-standard values.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Optional. Machine type on which Airflow web server is running. It has to be one of:
   * composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified,
   * composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web
   * server parameters were manually changed to a non-standard values.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Optional. Machine type on which Airflow web server is running. It has to be one of:
   * composer-n1-webserver-2, composer-n1-webserver-4 or composer-n1-webserver-8. If not specified,
   * composer-n1-webserver-2 will be used. Value custom is returned only in response, if Airflow web
   * server parameters were manually changed to a non-standard values.
   * @param machineType machineType or {@code null} for none
   */
  public WebServerConfig setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  @Override
  public WebServerConfig set(String fieldName, Object value) {
    return (WebServerConfig) super.set(fieldName, value);
  }

  @Override
  public WebServerConfig clone() {
    return (WebServerConfig) super.clone();
  }

}
