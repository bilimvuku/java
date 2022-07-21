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

package com.google.api.services.bigquerydatatransfer.v1.model;

/**
 * Represents a data transfer configuration. A transfer configuration contains all metadata needed
 * to perform a data transfer. For example, `destination_dataset_id` specifies where data should be
 * stored. When a new transfer configuration is created, the specified `destination_dataset_id` is
 * created when needed and shared with the appropriate data source service account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery Data Transfer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TransferConfig extends com.google.api.client.json.GenericJson {

  /**
   * The number of days to look back to automatically refresh the data. For example, if
   * `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10,
   * today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports
   * the feature. Set the value to 0 to use the default value.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dataRefreshWindowDays;

  /**
   * Data source ID. This cannot be changed once data transfer is created. The full list of
   * available data source IDs can be returned through an API call: https://cloud.google.com
   * /bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataSourceId;

  /**
   * Output only. Region in which BigQuery dataset is located.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String datasetRegion;

  /**
   * The BigQuery target dataset id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationDatasetId;

  /**
   * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * User specified display name for the data transfer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Email notifications will be sent according to these preferences to the email address of the
   * user who owns this transfer config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EmailPreferences emailPreferences;

  /**
   * The resource name of the transfer config. Transfer config names have the form
   * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is
   * usually a uuid, even though it is not guaranteed or required. The name is ignored when creating
   * a transfer config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Next time when data transfer will run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nextRunTime;

  /**
   * Pub/Sub topic where notifications will be sent after transfer runs associated with this
   * transfer config finish. The format for specifying a pubsub topic is:
   * `projects/{project}/topics/{topic}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationPubsubTopic;

  /**
   * Output only. Information about the user whose credentials are used to transfer data. Populated
   * only for `transferConfigs.get` requests. In case the user information is not available, this
   * field will not be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserInfo ownerInfo;

  /**
   * Parameters specific to each data source. For more information see the bq tab in the 'Setting up
   * a data transfer' section for each data source. For example the parameters for Cloud Storage
   * transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-
   * transfer#bq
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> params;

  /**
   * Data transfer schedule. If the data source does not support a custom schedule, this should be
   * empty. If it is empty, the default value for the data source will be used. The specified times
   * are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of
   * jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format
   * here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-
   * yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on
   * the data source; refer to the documentation for your data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schedule;

  /**
   * Options customizing the data transfer schedule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScheduleOptions scheduleOptions;

  /**
   * Output only. State of the most recently updated transfer run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Data transfer modification time. Ignored by server on input.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Deprecated. Unique ID of the user on whose behalf transfer is done.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long userId;

  /**
   * The number of days to look back to automatically refresh the data. For example, if
   * `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10,
   * today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports
   * the feature. Set the value to 0 to use the default value.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDataRefreshWindowDays() {
    return dataRefreshWindowDays;
  }

  /**
   * The number of days to look back to automatically refresh the data. For example, if
   * `data_refresh_window_days = 10`, then every day BigQuery reingests data for [today-10,
   * today-1], rather than ingesting data for just [today-1]. Only valid if the data source supports
   * the feature. Set the value to 0 to use the default value.
   * @param dataRefreshWindowDays dataRefreshWindowDays or {@code null} for none
   */
  public TransferConfig setDataRefreshWindowDays(java.lang.Integer dataRefreshWindowDays) {
    this.dataRefreshWindowDays = dataRefreshWindowDays;
    return this;
  }

  /**
   * Data source ID. This cannot be changed once data transfer is created. The full list of
   * available data source IDs can be returned through an API call: https://cloud.google.com
   * /bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
   * @return value or {@code null} for none
   */
  public java.lang.String getDataSourceId() {
    return dataSourceId;
  }

  /**
   * Data source ID. This cannot be changed once data transfer is created. The full list of
   * available data source IDs can be returned through an API call: https://cloud.google.com
   * /bigquery-transfer/docs/reference/datatransfer/rest/v1/projects.locations.dataSources/list
   * @param dataSourceId dataSourceId or {@code null} for none
   */
  public TransferConfig setDataSourceId(java.lang.String dataSourceId) {
    this.dataSourceId = dataSourceId;
    return this;
  }

  /**
   * Output only. Region in which BigQuery dataset is located.
   * @return value or {@code null} for none
   */
  public java.lang.String getDatasetRegion() {
    return datasetRegion;
  }

  /**
   * Output only. Region in which BigQuery dataset is located.
   * @param datasetRegion datasetRegion or {@code null} for none
   */
  public TransferConfig setDatasetRegion(java.lang.String datasetRegion) {
    this.datasetRegion = datasetRegion;
    return this;
  }

  /**
   * The BigQuery target dataset id.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationDatasetId() {
    return destinationDatasetId;
  }

  /**
   * The BigQuery target dataset id.
   * @param destinationDatasetId destinationDatasetId or {@code null} for none
   */
  public TransferConfig setDestinationDatasetId(java.lang.String destinationDatasetId) {
    this.destinationDatasetId = destinationDatasetId;
    return this;
  }

  /**
   * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Is this config disabled. When set to true, no runs are scheduled for a given transfer.
   * @param disabled disabled or {@code null} for none
   */
  public TransferConfig setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * User specified display name for the data transfer.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * User specified display name for the data transfer.
   * @param displayName displayName or {@code null} for none
   */
  public TransferConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Email notifications will be sent according to these preferences to the email address of the
   * user who owns this transfer config.
   * @return value or {@code null} for none
   */
  public EmailPreferences getEmailPreferences() {
    return emailPreferences;
  }

  /**
   * Email notifications will be sent according to these preferences to the email address of the
   * user who owns this transfer config.
   * @param emailPreferences emailPreferences or {@code null} for none
   */
  public TransferConfig setEmailPreferences(EmailPreferences emailPreferences) {
    this.emailPreferences = emailPreferences;
    return this;
  }

  /**
   * The resource name of the transfer config. Transfer config names have the form
   * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is
   * usually a uuid, even though it is not guaranteed or required. The name is ignored when creating
   * a transfer config.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The resource name of the transfer config. Transfer config names have the form
   * `projects/{project_id}/locations/{region}/transferConfigs/{config_id}`. Where `config_id` is
   * usually a uuid, even though it is not guaranteed or required. The name is ignored when creating
   * a transfer config.
   * @param name name or {@code null} for none
   */
  public TransferConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Next time when data transfer will run.
   * @return value or {@code null} for none
   */
  public String getNextRunTime() {
    return nextRunTime;
  }

  /**
   * Output only. Next time when data transfer will run.
   * @param nextRunTime nextRunTime or {@code null} for none
   */
  public TransferConfig setNextRunTime(String nextRunTime) {
    this.nextRunTime = nextRunTime;
    return this;
  }

  /**
   * Pub/Sub topic where notifications will be sent after transfer runs associated with this
   * transfer config finish. The format for specifying a pubsub topic is:
   * `projects/{project}/topics/{topic}`
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationPubsubTopic() {
    return notificationPubsubTopic;
  }

  /**
   * Pub/Sub topic where notifications will be sent after transfer runs associated with this
   * transfer config finish. The format for specifying a pubsub topic is:
   * `projects/{project}/topics/{topic}`
   * @param notificationPubsubTopic notificationPubsubTopic or {@code null} for none
   */
  public TransferConfig setNotificationPubsubTopic(java.lang.String notificationPubsubTopic) {
    this.notificationPubsubTopic = notificationPubsubTopic;
    return this;
  }

  /**
   * Output only. Information about the user whose credentials are used to transfer data. Populated
   * only for `transferConfigs.get` requests. In case the user information is not available, this
   * field will not be populated.
   * @return value or {@code null} for none
   */
  public UserInfo getOwnerInfo() {
    return ownerInfo;
  }

  /**
   * Output only. Information about the user whose credentials are used to transfer data. Populated
   * only for `transferConfigs.get` requests. In case the user information is not available, this
   * field will not be populated.
   * @param ownerInfo ownerInfo or {@code null} for none
   */
  public TransferConfig setOwnerInfo(UserInfo ownerInfo) {
    this.ownerInfo = ownerInfo;
    return this;
  }

  /**
   * Parameters specific to each data source. For more information see the bq tab in the 'Setting up
   * a data transfer' section for each data source. For example the parameters for Cloud Storage
   * transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-
   * transfer#bq
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParams() {
    return params;
  }

  /**
   * Parameters specific to each data source. For more information see the bq tab in the 'Setting up
   * a data transfer' section for each data source. For example the parameters for Cloud Storage
   * transfers are listed here: https://cloud.google.com/bigquery-transfer/docs/cloud-storage-
   * transfer#bq
   * @param params params or {@code null} for none
   */
  public TransferConfig setParams(java.util.Map<String, java.lang.Object> params) {
    this.params = params;
    return this;
  }

  /**
   * Data transfer schedule. If the data source does not support a custom schedule, this should be
   * empty. If it is empty, the default value for the data source will be used. The specified times
   * are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of
   * jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format
   * here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-
   * yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on
   * the data source; refer to the documentation for your data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getSchedule() {
    return schedule;
  }

  /**
   * Data transfer schedule. If the data source does not support a custom schedule, this should be
   * empty. If it is empty, the default value for the data source will be used. The specified times
   * are in UTC. Examples of valid format: `1st,3rd monday of month 15:30`, `every wed,fri of
   * jan,jun 13:15`, and `first sunday of quarter 00:00`. See more explanation about the format
   * here: https://cloud.google.com/appengine/docs/flexible/python/scheduling-jobs-with-cron-
   * yaml#the_schedule_format NOTE: The minimum interval time between recurring transfers depends on
   * the data source; refer to the documentation for your data source.
   * @param schedule schedule or {@code null} for none
   */
  public TransferConfig setSchedule(java.lang.String schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Options customizing the data transfer schedule.
   * @return value or {@code null} for none
   */
  public ScheduleOptions getScheduleOptions() {
    return scheduleOptions;
  }

  /**
   * Options customizing the data transfer schedule.
   * @param scheduleOptions scheduleOptions or {@code null} for none
   */
  public TransferConfig setScheduleOptions(ScheduleOptions scheduleOptions) {
    this.scheduleOptions = scheduleOptions;
    return this;
  }

  /**
   * Output only. State of the most recently updated transfer run.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the most recently updated transfer run.
   * @param state state or {@code null} for none
   */
  public TransferConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Data transfer modification time. Ignored by server on input.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Data transfer modification time. Ignored by server on input.
   * @param updateTime updateTime or {@code null} for none
   */
  public TransferConfig setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Deprecated. Unique ID of the user on whose behalf transfer is done.
   * @return value or {@code null} for none
   */
  public java.lang.Long getUserId() {
    return userId;
  }

  /**
   * Deprecated. Unique ID of the user on whose behalf transfer is done.
   * @param userId userId or {@code null} for none
   */
  public TransferConfig setUserId(java.lang.Long userId) {
    this.userId = userId;
    return this;
  }

  @Override
  public TransferConfig set(String fieldName, Object value) {
    return (TransferConfig) super.set(fieldName, value);
  }

  @Override
  public TransferConfig clone() {
    return (TransferConfig) super.clone();
  }

}
