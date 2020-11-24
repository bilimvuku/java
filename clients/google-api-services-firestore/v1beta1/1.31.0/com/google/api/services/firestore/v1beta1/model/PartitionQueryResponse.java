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
 * The response for Firestore.PartitionQuery.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PartitionQueryResponse extends com.google.api.client.json.GenericJson {

  /**
   * A page token that may be used to request an additional set of results, up to the number
   * specified by `partition_count` in the PartitionQuery request. If blank, there are no more
   * results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Partition results. Each partition is a split point that can be used by RunQuery as a starting
   * or end point for the query results. The RunQuery requests must be made with the same query
   * supplied to this PartitionQuery request. The partition cursors will be ordered according to
   * same ordering as the results of the query supplied to PartitionQuery. For example, if a
   * PartitionQuery request returns partition cursors A and B, running the following three queries
   * will return the entire result set of the original query: * query, end_at A * query, start_at A,
   * end_at B * query, start_at B An empty result may indicate that the query has too few results to
   * be partitioned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Cursor> partitions;

  static {
    // hack to force ProGuard to consider Cursor used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Cursor.class);
  }

  /**
   * A page token that may be used to request an additional set of results, up to the number
   * specified by `partition_count` in the PartitionQuery request. If blank, there are no more
   * results.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A page token that may be used to request an additional set of results, up to the number
   * specified by `partition_count` in the PartitionQuery request. If blank, there are no more
   * results.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public PartitionQueryResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Partition results. Each partition is a split point that can be used by RunQuery as a starting
   * or end point for the query results. The RunQuery requests must be made with the same query
   * supplied to this PartitionQuery request. The partition cursors will be ordered according to
   * same ordering as the results of the query supplied to PartitionQuery. For example, if a
   * PartitionQuery request returns partition cursors A and B, running the following three queries
   * will return the entire result set of the original query: * query, end_at A * query, start_at A,
   * end_at B * query, start_at B An empty result may indicate that the query has too few results to
   * be partitioned.
   * @return value or {@code null} for none
   */
  public java.util.List<Cursor> getPartitions() {
    return partitions;
  }

  /**
   * Partition results. Each partition is a split point that can be used by RunQuery as a starting
   * or end point for the query results. The RunQuery requests must be made with the same query
   * supplied to this PartitionQuery request. The partition cursors will be ordered according to
   * same ordering as the results of the query supplied to PartitionQuery. For example, if a
   * PartitionQuery request returns partition cursors A and B, running the following three queries
   * will return the entire result set of the original query: * query, end_at A * query, start_at A,
   * end_at B * query, start_at B An empty result may indicate that the query has too few results to
   * be partitioned.
   * @param partitions partitions or {@code null} for none
   */
  public PartitionQueryResponse setPartitions(java.util.List<Cursor> partitions) {
    this.partitions = partitions;
    return this;
  }

  @Override
  public PartitionQueryResponse set(String fieldName, Object value) {
    return (PartitionQueryResponse) super.set(fieldName, value);
  }

  @Override
  public PartitionQueryResponse clone() {
    return (PartitionQueryResponse) super.clone();
  }

}
