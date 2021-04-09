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

package com.google.api.services.vault.v1.model;

/**
 * An export To work with Vault resources, the account must have the [required Vault privileges]
 * (https://support.google.com/vault/answer/2799699) and access to the matter. To access a matter,
 * the account must have created the matter, have the matter shared with them, or have the **View
 * All Matters** privilege.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Export extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Export sink for cloud storage files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudStorageSink cloudStorageSink;

  /**
   * Output only. The time when the export was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Advanced options of the export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExportOptions exportOptions;

  /**
   * Output only. The generated export ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Output only. The matter ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String matterId;

  /**
   * The export name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The search query being exported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Query query;

  /**
   * Output only. The requester of the export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserInfo requester;

  /**
   * Output only. Export statistics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExportStats stats;

  /**
   * Output only. The export status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Output only. Export sink for cloud storage files.
   * @return value or {@code null} for none
   */
  public CloudStorageSink getCloudStorageSink() {
    return cloudStorageSink;
  }

  /**
   * Output only. Export sink for cloud storage files.
   * @param cloudStorageSink cloudStorageSink or {@code null} for none
   */
  public Export setCloudStorageSink(CloudStorageSink cloudStorageSink) {
    this.cloudStorageSink = cloudStorageSink;
    return this;
  }

  /**
   * Output only. The time when the export was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the export was created.
   * @param createTime createTime or {@code null} for none
   */
  public Export setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Advanced options of the export.
   * @return value or {@code null} for none
   */
  public ExportOptions getExportOptions() {
    return exportOptions;
  }

  /**
   * Advanced options of the export.
   * @param exportOptions exportOptions or {@code null} for none
   */
  public Export setExportOptions(ExportOptions exportOptions) {
    this.exportOptions = exportOptions;
    return this;
  }

  /**
   * Output only. The generated export ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. The generated export ID.
   * @param id id or {@code null} for none
   */
  public Export setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. The matter ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getMatterId() {
    return matterId;
  }

  /**
   * Output only. The matter ID.
   * @param matterId matterId or {@code null} for none
   */
  public Export setMatterId(java.lang.String matterId) {
    this.matterId = matterId;
    return this;
  }

  /**
   * The export name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The export name.
   * @param name name or {@code null} for none
   */
  public Export setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The search query being exported.
   * @return value or {@code null} for none
   */
  public Query getQuery() {
    return query;
  }

  /**
   * The search query being exported.
   * @param query query or {@code null} for none
   */
  public Export setQuery(Query query) {
    this.query = query;
    return this;
  }

  /**
   * Output only. The requester of the export.
   * @return value or {@code null} for none
   */
  public UserInfo getRequester() {
    return requester;
  }

  /**
   * Output only. The requester of the export.
   * @param requester requester or {@code null} for none
   */
  public Export setRequester(UserInfo requester) {
    this.requester = requester;
    return this;
  }

  /**
   * Output only. Export statistics.
   * @return value or {@code null} for none
   */
  public ExportStats getStats() {
    return stats;
  }

  /**
   * Output only. Export statistics.
   * @param stats stats or {@code null} for none
   */
  public Export setStats(ExportStats stats) {
    this.stats = stats;
    return this;
  }

  /**
   * Output only. The export status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * Output only. The export status.
   * @param status status or {@code null} for none
   */
  public Export setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public Export set(String fieldName, Object value) {
    return (Export) super.set(fieldName, value);
  }

  @Override
  public Export clone() {
    return (Export) super.clone();
  }

}
