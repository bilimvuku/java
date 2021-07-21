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

package com.google.api.services.notebooks.v1.model;

/**
 * Optional. A list of features to enable on the guest operating system. Applicable only for
 * bootable images. Read [Enabling guest operating system
 * features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images
 * #guest-os-features) to see a list of available options. Guest OS features for boot disk.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RuntimeGuestOsFeature extends com.google.api.client.json.GenericJson {

  /**
   * The ID of a supported feature. Read [Enabling guest operating system
   * features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images
   * #guest-os-features) to see a list of available options. Valid values: *
   * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE *
   * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The ID of a supported feature. Read [Enabling guest operating system
   * features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images
   * #guest-os-features) to see a list of available options. Valid values: *
   * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE *
   * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The ID of a supported feature. Read [Enabling guest operating system
   * features](https://cloud.google.com/compute/docs/images/create-delete-deprecate-private-images
   * #guest-os-features) to see a list of available options. Valid values: *
   * FEATURE_TYPE_UNSPECIFIED * MULTI_IP_SUBNET * SECURE_BOOT * UEFI_COMPATIBLE *
   * VIRTIO_SCSI_MULTIQUEUE * WINDOWS
   * @param type type or {@code null} for none
   */
  public RuntimeGuestOsFeature setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public RuntimeGuestOsFeature set(String fieldName, Object value) {
    return (RuntimeGuestOsFeature) super.set(fieldName, value);
  }

  @Override
  public RuntimeGuestOsFeature clone() {
    return (RuntimeGuestOsFeature) super.clone();
  }

}
