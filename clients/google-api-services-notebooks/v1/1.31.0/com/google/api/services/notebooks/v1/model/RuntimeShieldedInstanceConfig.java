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
 * A set of Shielded Instance options. Check [Images using supported Shielded VM
 * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm). Not all
 * combinations are valid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RuntimeShieldedInstanceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Defines whether the instance has integrity monitoring enabled. Enables monitoring and
   * attestation of the boot integrity of the instance. The attestation is performed against the
   * integrity policy baseline. This baseline is initially derived from the implicitly trusted boot
   * image when the instance is created. Enabled by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableIntegrityMonitoring;

  /**
   * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system
   * only runs authentic software by verifying the digital signature of all boot components, and
   * halting the boot process if signature verification fails. Disabled by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableSecureBoot;

  /**
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableVtpm;

  /**
   * Defines whether the instance has integrity monitoring enabled. Enables monitoring and
   * attestation of the boot integrity of the instance. The attestation is performed against the
   * integrity policy baseline. This baseline is initially derived from the implicitly trusted boot
   * image when the instance is created. Enabled by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableIntegrityMonitoring() {
    return enableIntegrityMonitoring;
  }

  /**
   * Defines whether the instance has integrity monitoring enabled. Enables monitoring and
   * attestation of the boot integrity of the instance. The attestation is performed against the
   * integrity policy baseline. This baseline is initially derived from the implicitly trusted boot
   * image when the instance is created. Enabled by default.
   * @param enableIntegrityMonitoring enableIntegrityMonitoring or {@code null} for none
   */
  public RuntimeShieldedInstanceConfig setEnableIntegrityMonitoring(java.lang.Boolean enableIntegrityMonitoring) {
    this.enableIntegrityMonitoring = enableIntegrityMonitoring;
    return this;
  }

  /**
   * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system
   * only runs authentic software by verifying the digital signature of all boot components, and
   * halting the boot process if signature verification fails. Disabled by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableSecureBoot() {
    return enableSecureBoot;
  }

  /**
   * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system
   * only runs authentic software by verifying the digital signature of all boot components, and
   * halting the boot process if signature verification fails. Disabled by default.
   * @param enableSecureBoot enableSecureBoot or {@code null} for none
   */
  public RuntimeShieldedInstanceConfig setEnableSecureBoot(java.lang.Boolean enableSecureBoot) {
    this.enableSecureBoot = enableSecureBoot;
    return this;
  }

  /**
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableVtpm() {
    return enableVtpm;
  }

  /**
   * Defines whether the instance has the vTPM enabled. Enabled by default.
   * @param enableVtpm enableVtpm or {@code null} for none
   */
  public RuntimeShieldedInstanceConfig setEnableVtpm(java.lang.Boolean enableVtpm) {
    this.enableVtpm = enableVtpm;
    return this;
  }

  @Override
  public RuntimeShieldedInstanceConfig set(String fieldName, Object value) {
    return (RuntimeShieldedInstanceConfig) super.set(fieldName, value);
  }

  @Override
  public RuntimeShieldedInstanceConfig clone() {
    return (RuntimeShieldedInstanceConfig) super.clone();
  }

}
