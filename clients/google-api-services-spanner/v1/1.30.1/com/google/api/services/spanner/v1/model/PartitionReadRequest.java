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
 * The request for PartitionRead
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionReadRequest extends com.google.api.client.json.GenericJson {

  /**
   * The columns of table to be returned for each row matching this request.
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
   * names index keys in index. It is not an error for the `key_set` to name rows that do not exist
   * in the database. Read yields nothing for nonexistent rows.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KeySet keySet;

  /**
   * Additional options that affect how many partitions are created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PartitionOptions partitionOptions;

  /**
   * Required. The name of the table in the database to be read.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String table;

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionSelector transaction;

  /**
   * The columns of table to be returned for each row matching this request.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getColumns() {
    return columns;
  }

  /**
   * The columns of table to be returned for each row matching this request.
   * @param columns columns or {@code null} for none
   */
  public PartitionReadRequest setColumns(java.util.List<java.lang.String> columns) {
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
  public PartitionReadRequest setIndex(java.lang.String index) {
    this.index = index;
    return this;
  }

  /**
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the
   * rows in table to be yielded, unless index is present. If index is present, then key_set instead
   * names index keys in index. It is not an error for the `key_set` to name rows that do not exist
   * in the database. Read yields nothing for nonexistent rows.
   * @return value or {@code null} for none
   */
  public KeySet getKeySet() {
    return keySet;
  }

  /**
   * Required. `key_set` identifies the rows to be yielded. `key_set` names the primary keys of the
   * rows in table to be yielded, unless index is present. If index is present, then key_set instead
   * names index keys in index. It is not an error for the `key_set` to name rows that do not exist
   * in the database. Read yields nothing for nonexistent rows.
   * @param keySet keySet or {@code null} for none
   */
  public PartitionReadRequest setKeySet(KeySet keySet) {
    this.keySet = keySet;
    return this;
  }

  /**
   * Additional options that affect how many partitions are created.
   * @return value or {@code null} for none
   */
  public PartitionOptions getPartitionOptions() {
    return partitionOptions;
  }

  /**
   * Additional options that affect how many partitions are created.
   * @param partitionOptions partitionOptions or {@code null} for none
   */
  public PartitionReadRequest setPartitionOptions(PartitionOptions partitionOptions) {
    this.partitionOptions = partitionOptions;
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
  public PartitionReadRequest setTable(java.lang.String table) {
    this.table = table;
    return this;
  }

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * @return value or {@code null} for none
   */
  public TransactionSelector getTransaction() {
    return transaction;
  }

  /**
   * Read only snapshot transactions are supported, read/write and single use transactions are not.
   * @param transaction transaction or {@code null} for none
   */
  public PartitionReadRequest setTransaction(TransactionSelector transaction) {
    this.transaction = transaction;
    return this;
  }

  @Override
  public PartitionReadRequest set(String fieldName, Object value) {
    return (PartitionReadRequest) super.set(fieldName, value);
  }

  @Override
  public PartitionReadRequest clone() {
    return (PartitionReadRequest) super.clone();
  }

}
