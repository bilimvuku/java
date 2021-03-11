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

package com.google.api.services.sqladmin.model;

/**
 * An Operation resource. For successful operations that return an Operation resource, only the
 * fields relevant to the operation are populated in the resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud SQL Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Operation extends com.google.api.client.json.GenericJson {

  /**
   * The context for backup operation, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BackupContext backupContext;

  /**
   * The time this operation finished in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * If errors occurred during processing of this operation, this field will be populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OperationErrors error;

  /**
   * The context for export operation, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExportContext exportContext;

  /**
   * The context for import operation, if applicable.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImportContext importContext;

  /**
   * The time this operation was enqueued in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String insertTime;

  /**
   * This is always *sql#operation*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of the operation. Valid values are: *CREATE* *DELETE* *UPDATE* *RESTART* *IMPORT*
   * *EXPORT* *BACKUP_VOLUME* *RESTORE_VOLUME* *CREATE_USER* *DELETE_USER* *CREATE_DATABASE*
   * *DELETE_DATABASE*
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * The URI of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * The time this operation actually started in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * The status of an operation. Valid values are: *PENDING* *RUNNING* *DONE*
   * *SQL_OPERATION_STATUS_UNSPECIFIED*
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * Name of the database instance related to this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetLink;

  /**
   * The project ID of the target instance related to this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetProject;

  /**
   * The email address of the user who initiated this operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String user;

  /**
   * The context for backup operation, if applicable.
   * @return value or {@code null} for none
   */
  public BackupContext getBackupContext() {
    return backupContext;
  }

  /**
   * The context for backup operation, if applicable.
   * @param backupContext backupContext or {@code null} for none
   */
  public Operation setBackupContext(BackupContext backupContext) {
    this.backupContext = backupContext;
    return this;
  }

  /**
   * The time this operation finished in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * The time this operation finished in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @param endTime endTime or {@code null} for none
   */
  public Operation setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * If errors occurred during processing of this operation, this field will be populated.
   * @return value or {@code null} for none
   */
  public OperationErrors getError() {
    return error;
  }

  /**
   * If errors occurred during processing of this operation, this field will be populated.
   * @param error error or {@code null} for none
   */
  public Operation setError(OperationErrors error) {
    this.error = error;
    return this;
  }

  /**
   * The context for export operation, if applicable.
   * @return value or {@code null} for none
   */
  public ExportContext getExportContext() {
    return exportContext;
  }

  /**
   * The context for export operation, if applicable.
   * @param exportContext exportContext or {@code null} for none
   */
  public Operation setExportContext(ExportContext exportContext) {
    this.exportContext = exportContext;
    return this;
  }

  /**
   * The context for import operation, if applicable.
   * @return value or {@code null} for none
   */
  public ImportContext getImportContext() {
    return importContext;
  }

  /**
   * The context for import operation, if applicable.
   * @param importContext importContext or {@code null} for none
   */
  public Operation setImportContext(ImportContext importContext) {
    this.importContext = importContext;
    return this;
  }

  /**
   * The time this operation was enqueued in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @return value or {@code null} for none
   */
  public String getInsertTime() {
    return insertTime;
  }

  /**
   * The time this operation was enqueued in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @param insertTime insertTime or {@code null} for none
   */
  public Operation setInsertTime(String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * This is always *sql#operation*.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always *sql#operation*.
   * @param kind kind or {@code null} for none
   */
  public Operation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * An identifier that uniquely identifies the operation. You can use this identifier to retrieve
   * the Operations resource that has information about the operation.
   * @param name name or {@code null} for none
   */
  public Operation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of the operation. Valid values are: *CREATE* *DELETE* *UPDATE* *RESTART* *IMPORT*
   * *EXPORT* *BACKUP_VOLUME* *RESTORE_VOLUME* *CREATE_USER* *DELETE_USER* *CREATE_DATABASE*
   * *DELETE_DATABASE*
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * The type of the operation. Valid values are: *CREATE* *DELETE* *UPDATE* *RESTART* *IMPORT*
   * *EXPORT* *BACKUP_VOLUME* *RESTORE_VOLUME* *CREATE_USER* *DELETE_USER* *CREATE_DATABASE*
   * *DELETE_DATABASE*
   * @param operationType operationType or {@code null} for none
   */
  public Operation setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * The URI of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * The URI of this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Operation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * The time this operation actually started in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * The time this operation actually started in UTC timezone in RFC 3339 format, for example
   * *2012-11-15T16:19:00.094Z*.
   * @param startTime startTime or {@code null} for none
   */
  public Operation setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * The status of an operation. Valid values are: *PENDING* *RUNNING* *DONE*
   * *SQL_OPERATION_STATUS_UNSPECIFIED*
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * The status of an operation. Valid values are: *PENDING* *RUNNING* *DONE*
   * *SQL_OPERATION_STATUS_UNSPECIFIED*
   * @param status status or {@code null} for none
   */
  public Operation setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * Name of the database instance related to this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetId() {
    return targetId;
  }

  /**
   * Name of the database instance related to this operation.
   * @param targetId targetId or {@code null} for none
   */
  public Operation setTargetId(java.lang.String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetLink() {
    return targetLink;
  }

  /**
   * @param targetLink targetLink or {@code null} for none
   */
  public Operation setTargetLink(java.lang.String targetLink) {
    this.targetLink = targetLink;
    return this;
  }

  /**
   * The project ID of the target instance related to this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetProject() {
    return targetProject;
  }

  /**
   * The project ID of the target instance related to this operation.
   * @param targetProject targetProject or {@code null} for none
   */
  public Operation setTargetProject(java.lang.String targetProject) {
    this.targetProject = targetProject;
    return this;
  }

  /**
   * The email address of the user who initiated this operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getUser() {
    return user;
  }

  /**
   * The email address of the user who initiated this operation.
   * @param user user or {@code null} for none
   */
  public Operation setUser(java.lang.String user) {
    this.user = user;
    return this;
  }

  @Override
  public Operation set(String fieldName, Object value) {
    return (Operation) super.set(fieldName, value);
  }

  @Override
  public Operation clone() {
    return (Operation) super.clone();
  }

}
