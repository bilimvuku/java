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

package com.google.api.services.mybusinessaccountmanagement.v1.model;

/**
 * Response message for Accounts.ListAccounts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the My Business Account Management API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListAccountsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A collection of accounts to which the user has access. The personal account of the user doing
   * the query will always be the first item of the result, unless it is filtered out.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Account> accounts;

  static {
    // hack to force ProGuard to consider Account used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Account.class);
  }

  /**
   * If the number of accounts exceeds the requested page size, this field is populated with a token
   * to fetch the next page of accounts on a subsequent call to `accounts.list`. If there are no
   * more accounts, this field is not present in the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * A collection of accounts to which the user has access. The personal account of the user doing
   * the query will always be the first item of the result, unless it is filtered out.
   * @return value or {@code null} for none
   */
  public java.util.List<Account> getAccounts() {
    return accounts;
  }

  /**
   * A collection of accounts to which the user has access. The personal account of the user doing
   * the query will always be the first item of the result, unless it is filtered out.
   * @param accounts accounts or {@code null} for none
   */
  public ListAccountsResponse setAccounts(java.util.List<Account> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * If the number of accounts exceeds the requested page size, this field is populated with a token
   * to fetch the next page of accounts on a subsequent call to `accounts.list`. If there are no
   * more accounts, this field is not present in the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If the number of accounts exceeds the requested page size, this field is populated with a token
   * to fetch the next page of accounts on a subsequent call to `accounts.list`. If there are no
   * more accounts, this field is not present in the response.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListAccountsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public ListAccountsResponse set(String fieldName, Object value) {
    return (ListAccountsResponse) super.set(fieldName, value);
  }

  @Override
  public ListAccountsResponse clone() {
    return (ListAccountsResponse) super.clone();
  }

}
