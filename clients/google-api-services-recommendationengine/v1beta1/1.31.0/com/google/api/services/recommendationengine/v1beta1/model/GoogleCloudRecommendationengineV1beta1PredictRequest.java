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

package com.google.api.services.recommendationengine.v1beta1.model;

/**
 * Request message for Predict method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Recommendations AI (Beta). For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRecommendationengineV1beta1PredictRequest extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Use dryRun mode for this prediction query. If set to true, a fake model will be used
   * that returns arbitrary catalog items. Note that the dryRun mode should only be used for testing
   * the API, or if the model is not ready.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean dryRun;

  /**
   * Optional. Filter for restricting prediction results. Accepts values for tags and the
   * `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions to items that match all
   * of the specified tags. Boolean operators `OR` and `NOT` are supported if the expression is
   * enclosed in parentheses, and must be separated from the tag values by a space. `-"tagA"` is
   * also supported and is equivalent to `NOT "tagA"`. Tag values must be double quoted UTF-8
   * encoded strings with a size limit of 1 KiB. * filterOutOfStockItems. Restricts predictions to
   * items that do not have a stockState value of OUT_OF_STOCK. Examples: * tag=("Red" OR "Blue")
   * tag="New-Arrival" tag=(NOT "promotional") * filterOutOfStockItems tag=(-"promotional") *
   * filterOutOfStockItems If your filter blocks all prediction results, nothing will be returned.
   * If you want generic (unfiltered) popular items to be returned instead, set `strictFiltering` to
   * false in `PredictRequest.params`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Optional. The labels for the predict request. * Label keys can contain lowercase letters,
   * digits and hyphens, must start with a letter, and must end with a letter or digit. * Non-zero
   * label values can contain lowercase letters, digits and hyphens, must start with a letter, and
   * must end with a letter or digit. * No more than 64 labels can be associated with a given
   * request. See https://goo.gl/xmQnxf for more information on and examples of labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. Maximum number of results to return per page. Set this property to the number of
   * prediction results required. If zero, the service will choose a reasonable default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer pageSize;

  /**
   * Optional. The previous PredictResponse.next_page_token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Optional. Additional domain specific parameters for the predictions. Allowed values: *
   * `returnCatalogItem`: Boolean. If set to true, the associated catalogItem object will be
   * returned in the `PredictResponse.PredictionResult.itemMetadata` object in the method response.
   * * `returnItemScore`: Boolean. If set to true, the prediction 'score' corresponding to each
   * returned item will be set in the `metadata` field in the prediction response. The given 'score'
   * indicates the probability of an item being clicked/purchased given the user's context and
   * history. * `strictFiltering`: Boolean. True by default. If set to false, the service will
   * return generic (unfiltered) popular items instead of empty if your filter blocks all prediction
   * results. * `priceRerankLevel`: String. Default empty. If set to be non-empty, then it needs to
   * be one of {'no-price-reranking', 'low-price-reranking', 'medium-price-reranking', 'high-price-
   * reranking'}. This gives request level control and adjust prediction results based on product
   * price. * `diversityLevel`: String. Default empty. If set to be non-empty, then it needs to be
   * one of {'no-diversity', 'low-diversity', 'medium-diversity', 'high-diversity', 'auto-
   * diversity'}. This gives request level control and adjust prediction results based on product
   * category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> params;

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRecommendationengineV1beta1UserEvent userEvent;

  /**
   * Optional. Use dryRun mode for this prediction query. If set to true, a fake model will be used
   * that returns arbitrary catalog items. Note that the dryRun mode should only be used for testing
   * the API, or if the model is not ready.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDryRun() {
    return dryRun;
  }

  /**
   * Optional. Use dryRun mode for this prediction query. If set to true, a fake model will be used
   * that returns arbitrary catalog items. Note that the dryRun mode should only be used for testing
   * the API, or if the model is not ready.
   * @param dryRun dryRun or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setDryRun(java.lang.Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * Optional. Filter for restricting prediction results. Accepts values for tags and the
   * `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions to items that match all
   * of the specified tags. Boolean operators `OR` and `NOT` are supported if the expression is
   * enclosed in parentheses, and must be separated from the tag values by a space. `-"tagA"` is
   * also supported and is equivalent to `NOT "tagA"`. Tag values must be double quoted UTF-8
   * encoded strings with a size limit of 1 KiB. * filterOutOfStockItems. Restricts predictions to
   * items that do not have a stockState value of OUT_OF_STOCK. Examples: * tag=("Red" OR "Blue")
   * tag="New-Arrival" tag=(NOT "promotional") * filterOutOfStockItems tag=(-"promotional") *
   * filterOutOfStockItems If your filter blocks all prediction results, nothing will be returned.
   * If you want generic (unfiltered) popular items to be returned instead, set `strictFiltering` to
   * false in `PredictRequest.params`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Optional. Filter for restricting prediction results. Accepts values for tags and the
   * `filterOutOfStockItems` flag. * Tag expressions. Restricts predictions to items that match all
   * of the specified tags. Boolean operators `OR` and `NOT` are supported if the expression is
   * enclosed in parentheses, and must be separated from the tag values by a space. `-"tagA"` is
   * also supported and is equivalent to `NOT "tagA"`. Tag values must be double quoted UTF-8
   * encoded strings with a size limit of 1 KiB. * filterOutOfStockItems. Restricts predictions to
   * items that do not have a stockState value of OUT_OF_STOCK. Examples: * tag=("Red" OR "Blue")
   * tag="New-Arrival" tag=(NOT "promotional") * filterOutOfStockItems tag=(-"promotional") *
   * filterOutOfStockItems If your filter blocks all prediction results, nothing will be returned.
   * If you want generic (unfiltered) popular items to be returned instead, set `strictFiltering` to
   * false in `PredictRequest.params`.
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Optional. The labels for the predict request. * Label keys can contain lowercase letters,
   * digits and hyphens, must start with a letter, and must end with a letter or digit. * Non-zero
   * label values can contain lowercase letters, digits and hyphens, must start with a letter, and
   * must end with a letter or digit. * No more than 64 labels can be associated with a given
   * request. See https://goo.gl/xmQnxf for more information on and examples of labels.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. The labels for the predict request. * Label keys can contain lowercase letters,
   * digits and hyphens, must start with a letter, and must end with a letter or digit. * Non-zero
   * label values can contain lowercase letters, digits and hyphens, must start with a letter, and
   * must end with a letter or digit. * No more than 64 labels can be associated with a given
   * request. See https://goo.gl/xmQnxf for more information on and examples of labels.
   * @param labels labels or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. Maximum number of results to return per page. Set this property to the number of
   * prediction results required. If zero, the service will choose a reasonable default.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPageSize() {
    return pageSize;
  }

  /**
   * Optional. Maximum number of results to return per page. Set this property to the number of
   * prediction results required. If zero, the service will choose a reasonable default.
   * @param pageSize pageSize or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setPageSize(java.lang.Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * Optional. The previous PredictResponse.next_page_token.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * Optional. The previous PredictResponse.next_page_token.
   * @param pageToken pageToken or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Optional. Additional domain specific parameters for the predictions. Allowed values: *
   * `returnCatalogItem`: Boolean. If set to true, the associated catalogItem object will be
   * returned in the `PredictResponse.PredictionResult.itemMetadata` object in the method response.
   * * `returnItemScore`: Boolean. If set to true, the prediction 'score' corresponding to each
   * returned item will be set in the `metadata` field in the prediction response. The given 'score'
   * indicates the probability of an item being clicked/purchased given the user's context and
   * history. * `strictFiltering`: Boolean. True by default. If set to false, the service will
   * return generic (unfiltered) popular items instead of empty if your filter blocks all prediction
   * results. * `priceRerankLevel`: String. Default empty. If set to be non-empty, then it needs to
   * be one of {'no-price-reranking', 'low-price-reranking', 'medium-price-reranking', 'high-price-
   * reranking'}. This gives request level control and adjust prediction results based on product
   * price. * `diversityLevel`: String. Default empty. If set to be non-empty, then it needs to be
   * one of {'no-diversity', 'low-diversity', 'medium-diversity', 'high-diversity', 'auto-
   * diversity'}. This gives request level control and adjust prediction results based on product
   * category.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getParams() {
    return params;
  }

  /**
   * Optional. Additional domain specific parameters for the predictions. Allowed values: *
   * `returnCatalogItem`: Boolean. If set to true, the associated catalogItem object will be
   * returned in the `PredictResponse.PredictionResult.itemMetadata` object in the method response.
   * * `returnItemScore`: Boolean. If set to true, the prediction 'score' corresponding to each
   * returned item will be set in the `metadata` field in the prediction response. The given 'score'
   * indicates the probability of an item being clicked/purchased given the user's context and
   * history. * `strictFiltering`: Boolean. True by default. If set to false, the service will
   * return generic (unfiltered) popular items instead of empty if your filter blocks all prediction
   * results. * `priceRerankLevel`: String. Default empty. If set to be non-empty, then it needs to
   * be one of {'no-price-reranking', 'low-price-reranking', 'medium-price-reranking', 'high-price-
   * reranking'}. This gives request level control and adjust prediction results based on product
   * price. * `diversityLevel`: String. Default empty. If set to be non-empty, then it needs to be
   * one of {'no-diversity', 'low-diversity', 'medium-diversity', 'high-diversity', 'auto-
   * diversity'}. This gives request level control and adjust prediction results based on product
   * category.
   * @param params params or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setParams(java.util.Map<String, java.lang.Object> params) {
    this.params = params;
    return this;
  }

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * @return value or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1UserEvent getUserEvent() {
    return userEvent;
  }

  /**
   * Required. Context about the user, what they are looking at and what action they took to trigger
   * the predict request. Note that this user event detail won't be ingested to userEvent logs.
   * Thus, a separate userEvent write request is required for event logging.
   * @param userEvent userEvent or {@code null} for none
   */
  public GoogleCloudRecommendationengineV1beta1PredictRequest setUserEvent(GoogleCloudRecommendationengineV1beta1UserEvent userEvent) {
    this.userEvent = userEvent;
    return this;
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictRequest set(String fieldName, Object value) {
    return (GoogleCloudRecommendationengineV1beta1PredictRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRecommendationengineV1beta1PredictRequest clone() {
    return (GoogleCloudRecommendationengineV1beta1PredictRequest) super.clone();
  }

}
