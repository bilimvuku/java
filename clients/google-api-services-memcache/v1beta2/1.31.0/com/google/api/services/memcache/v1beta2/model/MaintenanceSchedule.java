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

package com.google.api.services.memcache.v1beta2.model;

/**
 * Upcoming maintenance schedule.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Memorystore for Memcached API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MaintenanceSchedule extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Output only. The deadline that the maintenance schedule start time can not go beyond, including
   * reschedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String scheduleDeadlineTime;

  /**
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. The end time of any upcoming scheduled maintenance for this instance.
   * @param endTime endTime or {@code null} for none
   */
  public MaintenanceSchedule setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Output only. The deadline that the maintenance schedule start time can not go beyond, including
   * reschedule.
   * @return value or {@code null} for none
   */
  public String getScheduleDeadlineTime() {
    return scheduleDeadlineTime;
  }

  /**
   * Output only. The deadline that the maintenance schedule start time can not go beyond, including
   * reschedule.
   * @param scheduleDeadlineTime scheduleDeadlineTime or {@code null} for none
   */
  public MaintenanceSchedule setScheduleDeadlineTime(String scheduleDeadlineTime) {
    this.scheduleDeadlineTime = scheduleDeadlineTime;
    return this;
  }

  /**
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. The start time of any upcoming scheduled maintenance for this instance.
   * @param startTime startTime or {@code null} for none
   */
  public MaintenanceSchedule setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public MaintenanceSchedule set(String fieldName, Object value) {
    return (MaintenanceSchedule) super.set(fieldName, value);
  }

  @Override
  public MaintenanceSchedule clone() {
    return (MaintenanceSchedule) super.clone();
  }

}
