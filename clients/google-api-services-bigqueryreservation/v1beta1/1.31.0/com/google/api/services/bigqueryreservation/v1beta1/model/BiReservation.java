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

package com.google.api.services.bigqueryreservation.v1beta1.model;

/**
 * Represents a BI Reservation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Reservation API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BiReservation extends com.google.api.client.json.GenericJson {

  /**
   * The resource name of the singleton BI reservation. Reservation names have the form
   * `projects/{project_id}/locations/{location_id}/biReservation`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Size of a reservation, in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long size;

  /**
   * Output only. The last update timestamp of a reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The resource name of the singleton BI reservation. Reservation names have the form
   * `projects/{project_id}/locations/{location_id}/biReservation`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the singleton BI reservation. Reservation names have the form
   * `projects/{project_id}/locations/{location_id}/biReservation`.
   * @param name name or {@code null} for none
   */
  public BiReservation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Size of a reservation, in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSize() {
    return size;
  }

  /**
   * Size of a reservation, in bytes.
   * @param size size or {@code null} for none
   */
  public BiReservation setSize(java.lang.Long size) {
    this.size = size;
    return this;
  }

  /**
   * Output only. The last update timestamp of a reservation.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last update timestamp of a reservation.
   * @param updateTime updateTime or {@code null} for none
   */
  public BiReservation setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public BiReservation set(String fieldName, Object value) {
    return (BiReservation) super.set(fieldName, value);
  }

  @Override
  public BiReservation clone() {
    return (BiReservation) super.clone();
  }

}
