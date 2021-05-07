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

package com.google.api.services.cloudchannel.v1.model;

/**
 * Contact information for a customer account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1ContactInfo extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The customer account contact's display name, formatted as a combination of the
   * customer's first and last name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The customer account's contact email. Required for entitlements that create admin.google.com
   * accounts, and serves as the customer's username for those accounts.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String email;

  /**
   * The customer account contact's first name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstName;

  /**
   * The customer account contact's last name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lastName;

  /**
   * The customer account's contact phone number.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phone;

  /**
   * Optional. The customer account contact's job title.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Output only. The customer account contact's display name, formatted as a combination of the
   * customer's first and last name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Output only. The customer account contact's display name, formatted as a combination of the
   * customer's first and last name.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The customer account's contact email. Required for entitlements that create admin.google.com
   * accounts, and serves as the customer's username for those accounts.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmail() {
    return email;
  }

  /**
   * The customer account's contact email. Required for entitlements that create admin.google.com
   * accounts, and serves as the customer's username for those accounts.
   * @param email email or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setEmail(java.lang.String email) {
    this.email = email;
    return this;
  }

  /**
   * The customer account contact's first name.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstName() {
    return firstName;
  }

  /**
   * The customer account contact's first name.
   * @param firstName firstName or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setFirstName(java.lang.String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The customer account contact's last name.
   * @return value or {@code null} for none
   */
  public java.lang.String getLastName() {
    return lastName;
  }

  /**
   * The customer account contact's last name.
   * @param lastName lastName or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setLastName(java.lang.String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The customer account's contact phone number.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhone() {
    return phone;
  }

  /**
   * The customer account's contact phone number.
   * @param phone phone or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setPhone(java.lang.String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Optional. The customer account contact's job title.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Optional. The customer account contact's job title.
   * @param title title or {@code null} for none
   */
  public GoogleCloudChannelV1ContactInfo setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  @Override
  public GoogleCloudChannelV1ContactInfo set(String fieldName, Object value) {
    return (GoogleCloudChannelV1ContactInfo) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1ContactInfo clone() {
    return (GoogleCloudChannelV1ContactInfo) super.clone();
  }

}
