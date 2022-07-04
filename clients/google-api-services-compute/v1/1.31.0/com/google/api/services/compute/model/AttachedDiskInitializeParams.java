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

package com.google.api.services.compute.model;

/**
 * [Input Only] Specifies the parameters for a new disk that will be created alongside the new
 * instance. Use initialization parameters to create boot disks or local SSDs attached to the new
 * instance. This field is persisted and returned for instanceTemplate and not returned in the
 * context of instance. This property is mutually exclusive with the source property; you can only
 * define one or the other, but not both.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttachedDiskInitializeParams extends com.google.api.client.json.GenericJson {

  /**
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * An optional description. Provide this property when creating the disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a
   * disk with the same name already exists in the given region, the existing disk is attached to
   * the new instance and the new disk is not created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskName;

  /**
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a
   * sourceImage, which is required for boot disks, the default size is the size of the sourceImage.
   * If you do not specify a sourceImage, the default disk size is 500 GB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long diskSizeGb;

  /**
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-
   * standard, specified using the full URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a
   * full list of acceptable values, see Persistent disk types. If you define this field, you can
   * provide either the full or partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType -
   * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   * InstanceTemplate, this is the name of the disk type, not URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskType;

  /**
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   * field is only applicable for persistent disks.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> licenses;

  /**
   * Specifies which action to take on instance update with this disk. Default is to use the
   * existing disk.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String onUpdateAction;

  /**
   * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per
   * second that the disk can handle. Values must be between 10,000 and 120,000. For more details,
   * see the Extreme persistent disk documentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long provisionedIops;

  /**
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the
   * full or partial URL. For instance template, specify only the resource policy name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resourcePolicies;

  /**
   * The source image to create this disk. When creating a new instance, one of
   * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
   * except for local SSD. To create a disk with one of the public operating system images, specify
   * the image by its family name. For example, specify family/debian-9 to use the latest Debian 9
   * image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific
   * version of a public operating system image: projects/debian-cloud/global/images/debian-9
   * -stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image
   * name in the following format: global/images/my-custom-image You can also specify a custom image
   * by its image family, which returns the latest version of the image in that family. Replace the
   * image name with family/family-name: global/images/family/my-image-family If the source image is
   * deleted later, this field will not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceImage;

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key. Instance templates do not store customer-
   * supplied encryption keys, so you cannot create disks for instances in a managed instance group
   * if the source images are encrypted with your own keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceImageEncryptionKey;

  /**
   * The source snapshot to create this disk. When creating a new instance, one of
   * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
   * except for local SSD. To create a disk with a snapshot that you created, specify the snapshot
   * name in the following format: global/snapshots/my-backup If the source snapshot is deleted
   * later, this field will not be set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceSnapshot;

  /**
   * The customer-supplied encryption key of the source snapshot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomerEncryptionKey sourceSnapshotEncryptionKey;

  /**
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * The architecture of the attached disk. Valid values are arm64 or x86_64.
   * @param architecture architecture or {@code null} for none
   */
  public AttachedDiskInitializeParams setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * An optional description. Provide this property when creating the disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description. Provide this property when creating the disk.
   * @param description description or {@code null} for none
   */
  public AttachedDiskInitializeParams setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a
   * disk with the same name already exists in the given region, the existing disk is attached to
   * the new instance and the new disk is not created.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskName() {
    return diskName;
  }

  /**
   * Specifies the disk name. If not specified, the default is to use the name of the instance. If a
   * disk with the same name already exists in the given region, the existing disk is attached to
   * the new instance and the new disk is not created.
   * @param diskName diskName or {@code null} for none
   */
  public AttachedDiskInitializeParams setDiskName(java.lang.String diskName) {
    this.diskName = diskName;
    return this;
  }

  /**
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a
   * sourceImage, which is required for boot disks, the default size is the size of the sourceImage.
   * If you do not specify a sourceImage, the default disk size is 500 GB.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDiskSizeGb() {
    return diskSizeGb;
  }

  /**
   * Specifies the size of the disk in base-2 GB. The size must be at least 10 GB. If you specify a
   * sourceImage, which is required for boot disks, the default size is the size of the sourceImage.
   * If you do not specify a sourceImage, the default disk size is 500 GB.
   * @param diskSizeGb diskSizeGb or {@code null} for none
   */
  public AttachedDiskInitializeParams setDiskSizeGb(java.lang.Long diskSizeGb) {
    this.diskSizeGb = diskSizeGb;
    return this;
  }

  /**
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-
   * standard, specified using the full URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a
   * full list of acceptable values, see Persistent disk types. If you define this field, you can
   * provide either the full or partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType -
   * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   * InstanceTemplate, this is the name of the disk type, not URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskType() {
    return diskType;
  }

  /**
   * Specifies the disk type to use to create the instance. If not specified, the default is pd-
   * standard, specified using the full URL. For example:
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/pd-standard For a
   * full list of acceptable values, see Persistent disk types. If you define this field, you can
   * provide either the full or partial URL. For example, the following are valid values: -
   * https://www.googleapis.com/compute/v1/projects/project/zones/zone /diskTypes/diskType -
   * projects/project/zones/zone/diskTypes/diskType - zones/zone/diskTypes/diskType Note that for
   * InstanceTemplate, this is the name of the disk type, not URL.
   * @param diskType diskType or {@code null} for none
   */
  public AttachedDiskInitializeParams setDiskType(java.lang.String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   * field is only applicable for persistent disks.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this disk. These can be later modified by the disks.setLabels method. This
   * field is only applicable for persistent disks.
   * @param labels labels or {@code null} for none
   */
  public AttachedDiskInitializeParams setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLicenses() {
    return licenses;
  }

  /**
   * A list of publicly visible licenses. Reserved for Google's use.
   * @param licenses licenses or {@code null} for none
   */
  public AttachedDiskInitializeParams setLicenses(java.util.List<java.lang.String> licenses) {
    this.licenses = licenses;
    return this;
  }

  /**
   * Specifies which action to take on instance update with this disk. Default is to use the
   * existing disk.
   * @return value or {@code null} for none
   */
  public java.lang.String getOnUpdateAction() {
    return onUpdateAction;
  }

  /**
   * Specifies which action to take on instance update with this disk. Default is to use the
   * existing disk.
   * @param onUpdateAction onUpdateAction or {@code null} for none
   */
  public AttachedDiskInitializeParams setOnUpdateAction(java.lang.String onUpdateAction) {
    this.onUpdateAction = onUpdateAction;
    return this;
  }

  /**
   * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per
   * second that the disk can handle. Values must be between 10,000 and 120,000. For more details,
   * see the Extreme persistent disk documentation.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProvisionedIops() {
    return provisionedIops;
  }

  /**
   * Indicates how many IOPS to provision for the disk. This sets the number of I/O operations per
   * second that the disk can handle. Values must be between 10,000 and 120,000. For more details,
   * see the Extreme persistent disk documentation.
   * @param provisionedIops provisionedIops or {@code null} for none
   */
  public AttachedDiskInitializeParams setProvisionedIops(java.lang.Long provisionedIops) {
    this.provisionedIops = provisionedIops;
    return this;
  }

  /**
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the
   * full or partial URL. For instance template, specify only the resource policy name.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResourcePolicies() {
    return resourcePolicies;
  }

  /**
   * Resource policies applied to this disk for automatic snapshot creations. Specified using the
   * full or partial URL. For instance template, specify only the resource policy name.
   * @param resourcePolicies resourcePolicies or {@code null} for none
   */
  public AttachedDiskInitializeParams setResourcePolicies(java.util.List<java.lang.String> resourcePolicies) {
    this.resourcePolicies = resourcePolicies;
    return this;
  }

  /**
   * The source image to create this disk. When creating a new instance, one of
   * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
   * except for local SSD. To create a disk with one of the public operating system images, specify
   * the image by its family name. For example, specify family/debian-9 to use the latest Debian 9
   * image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific
   * version of a public operating system image: projects/debian-cloud/global/images/debian-9
   * -stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image
   * name in the following format: global/images/my-custom-image You can also specify a custom image
   * by its image family, which returns the latest version of the image in that family. Replace the
   * image name with family/family-name: global/images/family/my-image-family If the source image is
   * deleted later, this field will not be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceImage() {
    return sourceImage;
  }

  /**
   * The source image to create this disk. When creating a new instance, one of
   * initializeParams.sourceImage or initializeParams.sourceSnapshot or disks.source is required
   * except for local SSD. To create a disk with one of the public operating system images, specify
   * the image by its family name. For example, specify family/debian-9 to use the latest Debian 9
   * image: projects/debian-cloud/global/images/family/debian-9 Alternatively, use a specific
   * version of a public operating system image: projects/debian-cloud/global/images/debian-9
   * -stretch-vYYYYMMDD To create a disk with a custom image that you created, specify the image
   * name in the following format: global/images/my-custom-image You can also specify a custom image
   * by its image family, which returns the latest version of the image in that family. Replace the
   * image name with family/family-name: global/images/family/my-image-family If the source image is
   * deleted later, this field will not be set.
   * @param sourceImage sourceImage or {@code null} for none
   */
  public AttachedDiskInitializeParams setSourceImage(java.lang.String sourceImage) {
    this.sourceImage = sourceImage;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key. Instance templates do not store customer-
   * supplied encryption keys, so you cannot create disks for instances in a managed instance group
   * if the source images are encrypted with your own keys.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceImageEncryptionKey() {
    return sourceImageEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source image. Required if the source image is
   * protected by a customer-supplied encryption key. Instance templates do not store customer-
   * supplied encryption keys, so you cannot create disks for instances in a managed instance group
   * if the source images are encrypted with your own keys.
   * @param sourceImageEncryptionKey sourceImageEncryptionKey or {@code null} for none
   */
  public AttachedDiskInitializeParams setSourceImageEncryptionKey(CustomerEncryptionKey sourceImageEncryptionKey) {
    this.sourceImageEncryptionKey = sourceImageEncryptionKey;
    return this;
  }

  /**
   * The source snapshot to create this disk. When creating a new instance, one of
   * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
   * except for local SSD. To create a disk with a snapshot that you created, specify the snapshot
   * name in the following format: global/snapshots/my-backup If the source snapshot is deleted
   * later, this field will not be set.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceSnapshot() {
    return sourceSnapshot;
  }

  /**
   * The source snapshot to create this disk. When creating a new instance, one of
   * initializeParams.sourceSnapshot or initializeParams.sourceImage or disks.source is required
   * except for local SSD. To create a disk with a snapshot that you created, specify the snapshot
   * name in the following format: global/snapshots/my-backup If the source snapshot is deleted
   * later, this field will not be set.
   * @param sourceSnapshot sourceSnapshot or {@code null} for none
   */
  public AttachedDiskInitializeParams setSourceSnapshot(java.lang.String sourceSnapshot) {
    this.sourceSnapshot = sourceSnapshot;
    return this;
  }

  /**
   * The customer-supplied encryption key of the source snapshot.
   * @return value or {@code null} for none
   */
  public CustomerEncryptionKey getSourceSnapshotEncryptionKey() {
    return sourceSnapshotEncryptionKey;
  }

  /**
   * The customer-supplied encryption key of the source snapshot.
   * @param sourceSnapshotEncryptionKey sourceSnapshotEncryptionKey or {@code null} for none
   */
  public AttachedDiskInitializeParams setSourceSnapshotEncryptionKey(CustomerEncryptionKey sourceSnapshotEncryptionKey) {
    this.sourceSnapshotEncryptionKey = sourceSnapshotEncryptionKey;
    return this;
  }

  @Override
  public AttachedDiskInitializeParams set(String fieldName, Object value) {
    return (AttachedDiskInitializeParams) super.set(fieldName, value);
  }

  @Override
  public AttachedDiskInitializeParams clone() {
    return (AttachedDiskInitializeParams) super.clone();
  }

}
