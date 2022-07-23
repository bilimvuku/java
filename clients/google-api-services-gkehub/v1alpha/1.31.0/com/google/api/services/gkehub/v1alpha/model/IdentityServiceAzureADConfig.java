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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * Configuration for the AzureAD Auth flow.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IdentityServiceAzureADConfig extends com.google.api.client.json.GenericJson {

  /**
   * ID for the registered client application that makes authentication requests to the Azure AD
   * identity provider.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Input only. Unencrypted AzureAD client secret will be passed to the GKE Hub CLH.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSecret;

  /**
   * Output only. Encrypted AzureAD client secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encryptedClientSecret;

  /**
   * The redirect URL that kubectl uses for authorization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kubectlRedirectUri;

  /**
   * Kind of Azure AD account to be authenticated. Supported values are or for accounts belonging to
   * a specific tenant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenant;

  /**
   * ID for the registered client application that makes authentication requests to the Azure AD
   * identity provider.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * ID for the registered client application that makes authentication requests to the Azure AD
   * identity provider.
   * @param clientId clientId or {@code null} for none
   */
  public IdentityServiceAzureADConfig setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Input only. Unencrypted AzureAD client secret will be passed to the GKE Hub CLH.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSecret() {
    return clientSecret;
  }

  /**
   * Input only. Unencrypted AzureAD client secret will be passed to the GKE Hub CLH.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public IdentityServiceAzureADConfig setClientSecret(java.lang.String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Output only. Encrypted AzureAD client secret.
   * @see #decodeEncryptedClientSecret()
   * @return value or {@code null} for none
   */
  public java.lang.String getEncryptedClientSecret() {
    return encryptedClientSecret;
  }

  /**
   * Output only. Encrypted AzureAD client secret.
   * @see #getEncryptedClientSecret()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeEncryptedClientSecret() {
    return com.google.api.client.util.Base64.decodeBase64(encryptedClientSecret);
  }

  /**
   * Output only. Encrypted AzureAD client secret.
   * @see #encodeEncryptedClientSecret()
   * @param encryptedClientSecret encryptedClientSecret or {@code null} for none
   */
  public IdentityServiceAzureADConfig setEncryptedClientSecret(java.lang.String encryptedClientSecret) {
    this.encryptedClientSecret = encryptedClientSecret;
    return this;
  }

  /**
   * Output only. Encrypted AzureAD client secret.
   * @see #setEncryptedClientSecret()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public IdentityServiceAzureADConfig encodeEncryptedClientSecret(byte[] encryptedClientSecret) {
    this.encryptedClientSecret = com.google.api.client.util.Base64.encodeBase64URLSafeString(encryptedClientSecret);
    return this;
  }

  /**
   * The redirect URL that kubectl uses for authorization.
   * @return value or {@code null} for none
   */
  public java.lang.String getKubectlRedirectUri() {
    return kubectlRedirectUri;
  }

  /**
   * The redirect URL that kubectl uses for authorization.
   * @param kubectlRedirectUri kubectlRedirectUri or {@code null} for none
   */
  public IdentityServiceAzureADConfig setKubectlRedirectUri(java.lang.String kubectlRedirectUri) {
    this.kubectlRedirectUri = kubectlRedirectUri;
    return this;
  }

  /**
   * Kind of Azure AD account to be authenticated. Supported values are or for accounts belonging to
   * a specific tenant.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenant() {
    return tenant;
  }

  /**
   * Kind of Azure AD account to be authenticated. Supported values are or for accounts belonging to
   * a specific tenant.
   * @param tenant tenant or {@code null} for none
   */
  public IdentityServiceAzureADConfig setTenant(java.lang.String tenant) {
    this.tenant = tenant;
    return this;
  }

  @Override
  public IdentityServiceAzureADConfig set(String fieldName, Object value) {
    return (IdentityServiceAzureADConfig) super.set(fieldName, value);
  }

  @Override
  public IdentityServiceAzureADConfig clone() {
    return (IdentityServiceAzureADConfig) super.clone();
  }

}
