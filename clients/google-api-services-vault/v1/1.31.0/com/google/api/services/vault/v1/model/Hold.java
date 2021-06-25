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
 * A hold. A hold prevents the specified Google Workspace service from purging data for specific
 * accounts or all members of an organizational unit. To work with Vault resources, the account must
 * have the [required Vault privileges] (https://support.google.com/vault/answer/2799699) and access
 * to the matter. To access a matter, the account must have created the matter, have the matter
 * shared with them, or have the **View All Matters** privilege.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the G Suite Vault API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Hold extends com.google.api.client.json.GenericJson {

  /**
   * If set, the hold applies to the specified accounts and **orgUnit** must be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HeldAccount> accounts;

  static {
    // hack to force ProGuard to consider HeldAccount used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HeldAccount.class);
  }

  /**
   * The service to be searched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String corpus;

  /**
   * The unique immutable ID of the hold. Assigned during creation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String holdId;

  /**
   * The name of the hold.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * If set, the hold applies to all members of the organizational unit and **accounts** must be
   * empty. This property is mutable. For Groups holds, set **accounts**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HeldOrgUnit orgUnit;

  /**
   * Service-specific options. If set, **CorpusQuery** must match **CorpusType**.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CorpusQuery query;

  /**
   * The last time this hold was modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * If set, the hold applies to the specified accounts and **orgUnit** must be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<HeldAccount> getAccounts() {
    return accounts;
  }

  /**
   * If set, the hold applies to the specified accounts and **orgUnit** must be empty.
   * @param accounts accounts or {@code null} for none
   */
  public Hold setAccounts(java.util.List<HeldAccount> accounts) {
    this.accounts = accounts;
    return this;
  }

  /**
   * The service to be searched.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorpus() {
    return corpus;
  }

  /**
   * The service to be searched.
   * @param corpus corpus or {@code null} for none
   */
  public Hold setCorpus(java.lang.String corpus) {
    this.corpus = corpus;
    return this;
  }

  /**
   * The unique immutable ID of the hold. Assigned during creation.
   * @return value or {@code null} for none
   */
  public java.lang.String getHoldId() {
    return holdId;
  }

  /**
   * The unique immutable ID of the hold. Assigned during creation.
   * @param holdId holdId or {@code null} for none
   */
  public Hold setHoldId(java.lang.String holdId) {
    this.holdId = holdId;
    return this;
  }

  /**
   * The name of the hold.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the hold.
   * @param name name or {@code null} for none
   */
  public Hold setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * If set, the hold applies to all members of the organizational unit and **accounts** must be
   * empty. This property is mutable. For Groups holds, set **accounts**.
   * @return value or {@code null} for none
   */
  public HeldOrgUnit getOrgUnit() {
    return orgUnit;
  }

  /**
   * If set, the hold applies to all members of the organizational unit and **accounts** must be
   * empty. This property is mutable. For Groups holds, set **accounts**.
   * @param orgUnit orgUnit or {@code null} for none
   */
  public Hold setOrgUnit(HeldOrgUnit orgUnit) {
    this.orgUnit = orgUnit;
    return this;
  }

  /**
   * Service-specific options. If set, **CorpusQuery** must match **CorpusType**.
   * @return value or {@code null} for none
   */
  public CorpusQuery getQuery() {
    return query;
  }

  /**
   * Service-specific options. If set, **CorpusQuery** must match **CorpusType**.
   * @param query query or {@code null} for none
   */
  public Hold setQuery(CorpusQuery query) {
    this.query = query;
    return this;
  }

  /**
   * The last time this hold was modified.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * The last time this hold was modified.
   * @param updateTime updateTime or {@code null} for none
   */
  public Hold setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Hold set(String fieldName, Object value) {
    return (Hold) super.set(fieldName, value);
  }

  @Override
  public Hold clone() {
    return (Hold) super.clone();
  }

}
