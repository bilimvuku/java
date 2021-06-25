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
 * The results count for each account.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AccountCount extends com.google.api.client.json.GenericJson {

  /**
   * Account owner.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserInfo account;

  /**
   * The number of results (messages or files) found for this account.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long count;

  /**
   * Account owner.
   * @return value or {@code null} for none
   */
  public UserInfo getAccount() {
    return account;
  }

  /**
   * Account owner.
   * @param account account or {@code null} for none
   */
  public AccountCount setAccount(UserInfo account) {
    this.account = account;
    return this;
  }

  /**
   * The number of results (messages or files) found for this account.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCount() {
    return count;
  }

  /**
   * The number of results (messages or files) found for this account.
   * @param count count or {@code null} for none
   */
  public AccountCount setCount(java.lang.Long count) {
    this.count = count;
    return this;
  }

  @Override
  public AccountCount set(String fieldName, Object value) {
    return (AccountCount) super.set(fieldName, value);
  }

  @Override
  public AccountCount clone() {
    return (AccountCount) super.clone();
  }

}
