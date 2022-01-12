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

package com.google.api.services.cloudbuild.v1.model;

/**
 * Response of BatchCreateBitbucketServerConnectedRepositories RPC method including all successfully
 * connected Bitbucket Server repositories.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Build API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchCreateBitbucketServerConnectedRepositoriesResponse extends com.google.api.client.json.GenericJson {

  /**
   * The connected Bitbucket Server repositories.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BitbucketServerConnectedRepository> bitbucketServerConnectedRepositories;

  /**
   * The connected Bitbucket Server repositories.
   * @return value or {@code null} for none
   */
  public java.util.List<BitbucketServerConnectedRepository> getBitbucketServerConnectedRepositories() {
    return bitbucketServerConnectedRepositories;
  }

  /**
   * The connected Bitbucket Server repositories.
   * @param bitbucketServerConnectedRepositories bitbucketServerConnectedRepositories or {@code null} for none
   */
  public BatchCreateBitbucketServerConnectedRepositoriesResponse setBitbucketServerConnectedRepositories(java.util.List<BitbucketServerConnectedRepository> bitbucketServerConnectedRepositories) {
    this.bitbucketServerConnectedRepositories = bitbucketServerConnectedRepositories;
    return this;
  }

  @Override
  public BatchCreateBitbucketServerConnectedRepositoriesResponse set(String fieldName, Object value) {
    return (BatchCreateBitbucketServerConnectedRepositoriesResponse) super.set(fieldName, value);
  }

  @Override
  public BatchCreateBitbucketServerConnectedRepositoriesResponse clone() {
    return (BatchCreateBitbucketServerConnectedRepositoriesResponse) super.clone();
  }

}
