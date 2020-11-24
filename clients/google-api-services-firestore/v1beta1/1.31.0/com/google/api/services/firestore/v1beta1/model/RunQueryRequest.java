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

package com.google.api.services.firestore.v1beta1.model;

/**
 * The request for Firestore.RunQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RunQueryRequest extends com.google.api.client.json.GenericJson {

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TransactionOptions newTransaction;

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readTime;

  /**
   * A structured query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StructuredQuery structuredQuery;

  /**
   * Reads documents in a transaction.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transaction;

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * @return value or {@code null} for none
   */
  public TransactionOptions getNewTransaction() {
    return newTransaction;
  }

  /**
   * Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new
   * transaction ID will be returned as the first response in the stream.
   * @param newTransaction newTransaction or {@code null} for none
   */
  public RunQueryRequest setNewTransaction(TransactionOptions newTransaction) {
    this.newTransaction = newTransaction;
    return this;
  }

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * @return value or {@code null} for none
   */
  public String getReadTime() {
    return readTime;
  }

  /**
   * Reads documents as they were at the given time. This may not be older than 270 seconds.
   * @param readTime readTime or {@code null} for none
   */
  public RunQueryRequest setReadTime(String readTime) {
    this.readTime = readTime;
    return this;
  }

  /**
   * A structured query.
   * @return value or {@code null} for none
   */
  public StructuredQuery getStructuredQuery() {
    return structuredQuery;
  }

  /**
   * A structured query.
   * @param structuredQuery structuredQuery or {@code null} for none
   */
  public RunQueryRequest setStructuredQuery(StructuredQuery structuredQuery) {
    this.structuredQuery = structuredQuery;
    return this;
  }

  /**
   * Reads documents in a transaction.
   * @see #decodeTransaction()
   * @return value or {@code null} for none
   */
  public java.lang.String getTransaction() {
    return transaction;
  }

  /**
   * Reads documents in a transaction.
   * @see #getTransaction()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeTransaction() {
    return com.google.api.client.util.Base64.decodeBase64(transaction);
  }

  /**
   * Reads documents in a transaction.
   * @see #encodeTransaction()
   * @param transaction transaction or {@code null} for none
   */
  public RunQueryRequest setTransaction(java.lang.String transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Reads documents in a transaction.
   * @see #setTransaction()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public RunQueryRequest encodeTransaction(byte[] transaction) {
    this.transaction = com.google.api.client.util.Base64.encodeBase64URLSafeString(transaction);
    return this;
  }

  @Override
  public RunQueryRequest set(String fieldName, Object value) {
    return (RunQueryRequest) super.set(fieldName, value);
  }

  @Override
  public RunQueryRequest clone() {
    return (RunQueryRequest) super.clone();
  }

}
