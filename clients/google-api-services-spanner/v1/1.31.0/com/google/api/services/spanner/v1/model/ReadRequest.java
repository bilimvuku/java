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

package com.google.api.services.spanner.v1.model;

/**
 * The request for Read and StreamingRead.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReadRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The columns of table to be returned for each row matching this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> columns;

  /**
   * If non-empty, the name of an index on table. This index is used instead of the table primary
   * key when interpreting key_set and sorting result rows. See key_set for further information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String index;

  /**
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the
   * rows in table to be yielded, unless index is present. If index is present, then key_set instead
   * names index keys in index. If the partition_token field is empty, rows are yielded in table
   * primary key order (if index is empty) or index key order (if index is non-empty). If the
   * partition_token field is not empty, rows will be yielded in an unspecified order. It is not an
   * error for the `key_set` to name rows that do not exist in the database. Read yields nothing for
   * nonexistent rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KeySet keySet;

  /**
   * If greater than zero, only the first `limit` rows are yielded. If `limit` is zero, the default
   * is no limit. A limit cannot be specified if `partition_token` is set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long limit;

  /**
   * If present, results will be restricted to the specified partition previously created using
   * PartitionRead(). There must be an exact match for the values of fields common to this message
   * and the PartitionReadRequest message used to create this partition_token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String partitionToken;

  /**
   * Common options for this request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestOptions requestOptions;

  /**
   * If this request is resuming a previously interrupted read, `resume_token` should be copied from
   * the last PartialResultSet yielded before the interruption. Doing this enables the new read to
   * resume where the last read left off. The rest of the request parameters must exactly match the
   * request that yielded this token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resumeToken;

  /**
   * Required. The name of the table in the database to be read.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String table;

  /**
   * The transaction to use. If none is provided, the default is a temporary read-only transaction
   * with strong concurrency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionSelector transaction;

  /**
   * Required. The columns of table to be returned for each row matching this request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getColumns() {
    return columns;
  }

  /**
   * Required. The columns of table to be returned for each row matching this request.
   * @param columns columns or {@code null} for none
   */
  public ReadRequest setColumns(java.util.List<java.lang.String> columns) {
    this.columns = columns;
    return this;
  }

  /**
   * If non-empty, the name of an index on table. This index is used instead of the table primary
   * key when interpreting key_set and sorting result rows. See key_set for further information.
   * @return value or {@code null} for none
   */
  public java.lang.String getIndex() {
    return index;
  }

  /**
   * If non-empty, the name of an index on table. This index is used instead of the table primary
   * key when interpreting key_set and sorting result rows. See key_set for further information.
   * @param index index or {@code null} for none
   */
  public ReadRequest setIndex(java.lang.String index) {
    this.index = index;
    return this;
  }

  /**
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the
   * rows in table to be yielded, unless index is present. If index is present, then key_set instead
   * names index keys in index. If the partition_token field is empty, rows are yielded in table
   * primary key order (if index is empty) or index key order (if index is non-empty). If the
   * partition_token field is not empty, rows will be yielded in an unspecified order. It is not an
   * error for the `key_set` to name rows that do not exist in the database. Read yields nothing for
   * nonexistent rows.
   * @return value or {@code null} for none
   */
  public KeySet getKeySet() {
    return keySet;
  }

  /**
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the
   * rows in table to be yielded, unless index is present. If index is present, then key_set instead
   * names index keys in index. If the partition_token field is empty, rows are yielded in table
   * primary key order (if index is empty) or index key order (if index is non-empty). If the
   * partition_token field is not empty, rows will be yielded in an unspecified order. It is not an
   * error for the `key_set` to name rows that do not exist in the database. Read yields nothing for
   * nonexistent rows.
   * @param keySet keySet or {@code null} for none
   */
  public ReadRequest setKeySet(KeySet keySet) {
    this.keySet = keySet;
    return this;
  }

  /**
   * If greater than zero, only the first `limit` rows are yielded. If `limit` is zero, the default
   * is no limit. A limit cannot be specified if `partition_token` is set.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLimit() {
    return limit;
  }

  /**
   * If greater than zero, only the first `limit` rows are yielded. If `limit` is zero, the default
   * is no limit. A limit cannot be specified if `partition_token` is set.
   * @param limit limit or {@code null} for none
   */
  public ReadRequest setLimit(java.lang.Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * If present, results will be restricted to the specified partition previously created using
   * PartitionRead(). There must be an exact match for the values of fields common to this message
   * and the PartitionReadRequest message used to create this partition_token.
   * @see #decodePartitionToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getPartitionToken() {
    return partitionToken;
  }

  /**
   * If present, results will be restricted to the specified partition previously created using
   * PartitionRead(). There must be an exact match for the values of fields common to this message
   * and the PartitionReadRequest message used to create this partition_token.
   * @see #getPartitionToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePartitionToken() {
    return com.google.api.client.util.Base64.decodeBase64(partitionToken);
  }

  /**
   * If present, results will be restricted to the specified partition previously created using
   * PartitionRead(). There must be an exact match for the values of fields common to this message
   * and the PartitionReadRequest message used to create this partition_token.
   * @see #encodePartitionToken()
   * @param partitionToken partitionToken or {@code null} for none
   */
  public ReadRequest setPartitionToken(java.lang.String partitionToken) {
    this.partitionToken = partitionToken;
    return this;
  }

  /**
   * If present, results will be restricted to the specified partition previously created using
   * PartitionRead(). There must be an exact match for the values of fields common to this message
   * and the PartitionReadRequest message used to create this partition_token.
   * @see #setPartitionToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ReadRequest encodePartitionToken(byte[] partitionToken) {
    this.partitionToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(partitionToken);
    return this;
  }

  /**
   * Common options for this request.
   * @return value or {@code null} for none
   */
  public RequestOptions getRequestOptions() {
    return requestOptions;
  }

  /**
   * Common options for this request.
   * @param requestOptions requestOptions or {@code null} for none
   */
  public ReadRequest setRequestOptions(RequestOptions requestOptions) {
    this.requestOptions = requestOptions;
    return this;
  }

  /**
   * If this request is resuming a previously interrupted read, `resume_token` should be copied from
   * the last PartialResultSet yielded before the interruption. Doing this enables the new read to
   * resume where the last read left off. The rest of the request parameters must exactly match the
   * request that yielded this token.
   * @see #decodeResumeToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getResumeToken() {
    return resumeToken;
  }

  /**
   * If this request is resuming a previously interrupted read, `resume_token` should be copied from
   * the last PartialResultSet yielded before the interruption. Doing this enables the new read to
   * resume where the last read left off. The rest of the request parameters must exactly match the
   * request that yielded this token.
   * @see #getResumeToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeResumeToken() {
    return com.google.api.client.util.Base64.decodeBase64(resumeToken);
  }

  /**
   * If this request is resuming a previously interrupted read, `resume_token` should be copied from
   * the last PartialResultSet yielded before the interruption. Doing this enables the new read to
   * resume where the last read left off. The rest of the request parameters must exactly match the
   * request that yielded this token.
   * @see #encodeResumeToken()
   * @param resumeToken resumeToken or {@code null} for none
   */
  public ReadRequest setResumeToken(java.lang.String resumeToken) {
    this.resumeToken = resumeToken;
    return this;
  }

  /**
   * If this request is resuming a previously interrupted read, `resume_token` should be copied from
   * the last PartialResultSet yielded before the interruption. Doing this enables the new read to
   * resume where the last read left off. The rest of the request parameters must exactly match the
   * request that yielded this token.
   * @see #setResumeToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public ReadRequest encodeResumeToken(byte[] resumeToken) {
    this.resumeToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(resumeToken);
    return this;
  }

  /**
   * Required. The name of the table in the database to be read.
   * @return value or {@code null} for none
   */
  public java.lang.String getTable() {
    return table;
  }

  /**
   * Required. The name of the table in the database to be read.
   * @param table table or {@code null} for none
   */
  public ReadRequest setTable(java.lang.String table) {
    this.table = table;
    return this;
  }

  /**
   * The transaction to use. If none is provided, the default is a temporary read-only transaction
   * with strong concurrency.
   * @return value or {@code null} for none
   */
  public TransactionSelector getTransaction() {
    return transaction;
  }

  /**
   * The transaction to use. If none is provided, the default is a temporary read-only transaction
   * with strong concurrency.
   * @param transaction transaction or {@code null} for none
   */
  public ReadRequest setTransaction(TransactionSelector transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public ReadRequest set(String fieldName, Object value) {
    return (ReadRequest) super.set(fieldName, value);
  }

  @Override
  public ReadRequest clone() {
    return (ReadRequest) super.clone();
  }

}
