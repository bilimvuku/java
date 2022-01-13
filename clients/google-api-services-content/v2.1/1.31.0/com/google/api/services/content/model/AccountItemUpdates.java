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

package com.google.api.services.content.model;

/**
 * Turning on [item updates](https://support.google.com/merchants/answer/3246284) allows Google to
 * automatically update items for you. When item updates are on, Google uses the structured data
 * markup on the website and advanced data extractors to update the price and availability of the
 * items. When the item updates are off, items with mismatched data aren't shown.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountItemUpdates extends com.google.api.client.json.GenericJson {

  /**
   * Determines which attributes of the items should be automatically updated. If this field is not
   * present, then the settings will be deleted. If there are no settings for subaccount, they are
   * inherited from aggregator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AccountItemUpdatesSettings accountItemUpdatesSettings;

  /**
   * Output only. The effective value of allow_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean effectiveAllowAvailabilityUpdates;

  /**
   * Output only. The effective value of allow_price_updates. If account_item_updates_settings is
   * present, then this value is the same. Otherwise, it represents the inherited value of the
   * parent account. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean effectiveAllowPriceUpdates;

  /**
   * Output only. The effective value of allow_strict_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean effectiveAllowStrictAvailabilityUpdates;

  /**
   * Determines which attributes of the items should be automatically updated. If this field is not
   * present, then the settings will be deleted. If there are no settings for subaccount, they are
   * inherited from aggregator.
   * @return value or {@code null} for none
   */
  public AccountItemUpdatesSettings getAccountItemUpdatesSettings() {
    return accountItemUpdatesSettings;
  }

  /**
   * Determines which attributes of the items should be automatically updated. If this field is not
   * present, then the settings will be deleted. If there are no settings for subaccount, they are
   * inherited from aggregator.
   * @param accountItemUpdatesSettings accountItemUpdatesSettings or {@code null} for none
   */
  public AccountItemUpdates setAccountItemUpdatesSettings(AccountItemUpdatesSettings accountItemUpdatesSettings) {
    this.accountItemUpdatesSettings = accountItemUpdatesSettings;
    return this;
  }

  /**
   * Output only. The effective value of allow_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEffectiveAllowAvailabilityUpdates() {
    return effectiveAllowAvailabilityUpdates;
  }

  /**
   * Output only. The effective value of allow_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * @param effectiveAllowAvailabilityUpdates effectiveAllowAvailabilityUpdates or {@code null} for none
   */
  public AccountItemUpdates setEffectiveAllowAvailabilityUpdates(java.lang.Boolean effectiveAllowAvailabilityUpdates) {
    this.effectiveAllowAvailabilityUpdates = effectiveAllowAvailabilityUpdates;
    return this;
  }

  /**
   * Output only. The effective value of allow_price_updates. If account_item_updates_settings is
   * present, then this value is the same. Otherwise, it represents the inherited value of the
   * parent account. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEffectiveAllowPriceUpdates() {
    return effectiveAllowPriceUpdates;
  }

  /**
   * Output only. The effective value of allow_price_updates. If account_item_updates_settings is
   * present, then this value is the same. Otherwise, it represents the inherited value of the
   * parent account. Read-only.
   * @param effectiveAllowPriceUpdates effectiveAllowPriceUpdates or {@code null} for none
   */
  public AccountItemUpdates setEffectiveAllowPriceUpdates(java.lang.Boolean effectiveAllowPriceUpdates) {
    this.effectiveAllowPriceUpdates = effectiveAllowPriceUpdates;
    return this;
  }

  /**
   * Output only. The effective value of allow_strict_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEffectiveAllowStrictAvailabilityUpdates() {
    return effectiveAllowStrictAvailabilityUpdates;
  }

  /**
   * Output only. The effective value of allow_strict_availability_updates. If
   * account_item_updates_settings is present, then this value is the same. Otherwise, it represents
   * the inherited value of the parent account. Read-only.
   * @param effectiveAllowStrictAvailabilityUpdates effectiveAllowStrictAvailabilityUpdates or {@code null} for none
   */
  public AccountItemUpdates setEffectiveAllowStrictAvailabilityUpdates(java.lang.Boolean effectiveAllowStrictAvailabilityUpdates) {
    this.effectiveAllowStrictAvailabilityUpdates = effectiveAllowStrictAvailabilityUpdates;
    return this;
  }

  @Override
  public AccountItemUpdates set(String fieldName, Object value) {
    return (AccountItemUpdates) super.set(fieldName, value);
  }

  @Override
  public AccountItemUpdates clone() {
    return (AccountItemUpdates) super.clone();
  }

}
