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

package com.google.api.services.run.v2.model;

/**
 * Response message containing a list of Jobs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRunV2ListJobsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The resulting list of Jobs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRunV2Job> jobs;

  static {
    // hack to force ProGuard to consider GoogleCloudRunV2Job used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRunV2Job.class);
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListJobs request to
   * continue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The resulting list of Jobs.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRunV2Job> getJobs() {
    return jobs;
  }

  /**
   * The resulting list of Jobs.
   * @param jobs jobs or {@code null} for none
   */
  public GoogleCloudRunV2ListJobsResponse setJobs(java.util.List<GoogleCloudRunV2Job> jobs) {
    this.jobs = jobs;
    return this;
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListJobs request to
   * continue.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * A token indicating there are more items than page_size. Use it in the next ListJobs request to
   * continue.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public GoogleCloudRunV2ListJobsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  @Override
  public GoogleCloudRunV2ListJobsResponse set(String fieldName, Object value) {
    return (GoogleCloudRunV2ListJobsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRunV2ListJobsResponse clone() {
    return (GoogleCloudRunV2ListJobsResponse) super.clone();
  }

}
