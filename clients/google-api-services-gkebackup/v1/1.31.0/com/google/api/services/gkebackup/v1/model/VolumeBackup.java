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

package com.google.api.services.gkebackup.v1.model;

/**
 * Represents the backup of a specific persistent volume as a component of a Backup - both the
 * record of the operation and a pointer to the underlying storage-specific artifacts. Next id: 14
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup for GKE API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VolumeBackup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. [Output Only] The timestamp when the associated underlying volume backup operation
   * completes - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String completeTime;

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The minimum size of the disk to which this VolumeBackup can be restored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeBytes;

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a volume backup from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform volume backup
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetVolumeBackup', and systems are expected to put that etag in the request to
   * `UpdateVolumeBackup` to ensure that their change will be applied to the same version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. The format used for the volume backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Output only. [Output Only] The full name of the VolumeBackup resource. Format:
   * projects/locations/backupPlans/backups/volumeBackups Note that the last segment of the name
   * will have the format: 'pvc-'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. A reference to the source Kubernetes PVC from which this VolumeBackup was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NamespacedName sourcePvc;

  /**
   * Output only. The current state of this VolumeBackup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. A human readable message explaining why the VolumeBackup is in its current state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stateMessage;

  /**
   * Output only. The aggregate size of the underlying artifacts associated with this VolumeBackup
   * in the backup storage. This may change over time when multiple backups of the same volume share
   * the same backup storage location. In particular, this is likely to increase in size when the
   * immediately preceding backup of the same volume is deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageBytes;

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. A storage system-specific opaque handle to the underlying volume backup. This
   * field is interpreted by the volume backup and restore drivers running in the GKE cluster and
   * not by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String volumeBackupHandle;

  /**
   * Output only. [Output Only] The timestamp when the associated underlying volume backup operation
   * completes - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @return value or {@code null} for none
   */
  public String getCompleteTime() {
    return completeTime;
  }

  /**
   * Output only. [Output Only] The timestamp when the associated underlying volume backup operation
   * completes - can be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @param completeTime completeTime or {@code null} for none
   */
  public VolumeBackup setCompleteTime(String completeTime) {
    this.completeTime = completeTime;
    return this;
  }

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was created - can be
   * converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @param createTime createTime or {@code null} for none
   */
  public VolumeBackup setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The minimum size of the disk to which this VolumeBackup can be restored.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeBytes() {
    return diskSizeBytes;
  }

  /**
   * Output only. The minimum size of the disk to which this VolumeBackup can be restored.
   * @param diskSizeBytes diskSizeBytes or {@code null} for none
   */
  public VolumeBackup setDiskSizeBytes(java.lang.Long diskSizeBytes) {
    this.diskSizeBytes = diskSizeBytes;
    return this;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a volume backup from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform volume backup
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetVolumeBackup', and systems are expected to put that etag in the request to
   * `UpdateVolumeBackup` to ensure that their change will be applied to the same version.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. `etag` is used for optimistic concurrency control as a way to help prevent
   * simultaneous updates of a volume backup from overwriting each other. It is strongly suggested
   * that systems make use of the `etag` in the read-modify-write cycle to perform volume backup
   * updates in order to avoid race conditions: An `etag` is returned in the response to
   * `GetVolumeBackup', and systems are expected to put that etag in the request to
   * `UpdateVolumeBackup` to ensure that their change will be applied to the same version.
   * @param etag etag or {@code null} for none
   */
  public VolumeBackup setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. The format used for the volume backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Output only. The format used for the volume backup.
   * @param format format or {@code null} for none
   */
  public VolumeBackup setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Output only. [Output Only] The full name of the VolumeBackup resource. Format:
   * projects/locations/backupPlans/backups/volumeBackups Note that the last segment of the name
   * will have the format: 'pvc-'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. [Output Only] The full name of the VolumeBackup resource. Format:
   * projects/locations/backupPlans/backups/volumeBackups Note that the last segment of the name
   * will have the format: 'pvc-'.
   * @param name name or {@code null} for none
   */
  public VolumeBackup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. A reference to the source Kubernetes PVC from which this VolumeBackup was created.
   * @return value or {@code null} for none
   */
  public NamespacedName getSourcePvc() {
    return sourcePvc;
  }

  /**
   * Output only. A reference to the source Kubernetes PVC from which this VolumeBackup was created.
   * @param sourcePvc sourcePvc or {@code null} for none
   */
  public VolumeBackup setSourcePvc(NamespacedName sourcePvc) {
    this.sourcePvc = sourcePvc;
    return this;
  }

  /**
   * Output only. The current state of this VolumeBackup.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this VolumeBackup.
   * @param state state or {@code null} for none
   */
  public VolumeBackup setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. A human readable message explaining why the VolumeBackup is in its current state.
   * @return value or {@code null} for none
   */
  public java.lang.String getStateMessage() {
    return stateMessage;
  }

  /**
   * Output only. A human readable message explaining why the VolumeBackup is in its current state.
   * @param stateMessage stateMessage or {@code null} for none
   */
  public VolumeBackup setStateMessage(java.lang.String stateMessage) {
    this.stateMessage = stateMessage;
    return this;
  }

  /**
   * Output only. The aggregate size of the underlying artifacts associated with this VolumeBackup
   * in the backup storage. This may change over time when multiple backups of the same volume share
   * the same backup storage location. In particular, this is likely to increase in size when the
   * immediately preceding backup of the same volume is deleted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageBytes() {
    return storageBytes;
  }

  /**
   * Output only. The aggregate size of the underlying artifacts associated with this VolumeBackup
   * in the backup storage. This may change over time when multiple backups of the same volume share
   * the same backup storage location. In particular, this is likely to increase in size when the
   * immediately preceding backup of the same volume is deleted.
   * @param storageBytes storageBytes or {@code null} for none
   */
  public VolumeBackup setStorageBytes(java.lang.Long storageBytes) {
    this.storageBytes = storageBytes;
    return this;
  }

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. [Output Only] Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * @param uid uid or {@code null} for none
   */
  public VolumeBackup setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. [Output Only] The timestamp when this VolumeBackup resource was last updated - can
   * be converted to and from [RFC3339](https://www.ietf.org/rfc/rfc3339.txt)
   * @param updateTime updateTime or {@code null} for none
   */
  public VolumeBackup setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Output only. A storage system-specific opaque handle to the underlying volume backup. This
   * field is interpreted by the volume backup and restore drivers running in the GKE cluster and
   * not by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getVolumeBackupHandle() {
    return volumeBackupHandle;
  }

  /**
   * Output only. A storage system-specific opaque handle to the underlying volume backup. This
   * field is interpreted by the volume backup and restore drivers running in the GKE cluster and
   * not by the service.
   * @param volumeBackupHandle volumeBackupHandle or {@code null} for none
   */
  public VolumeBackup setVolumeBackupHandle(java.lang.String volumeBackupHandle) {
    this.volumeBackupHandle = volumeBackupHandle;
    return this;
  }

  @Override
  public VolumeBackup set(String fieldName, Object value) {
    return (VolumeBackup) super.set(fieldName, value);
  }

  @Override
  public VolumeBackup clone() {
    return (VolumeBackup) super.clone();
  }

}