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

package com.google.api.services.retail.v2beta.model;

/**
 * UserEvent captures all metadata information Retail API needs to know about how end users interact
 * with customers' website.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2betaUserEvent extends com.google.api.client.json.GenericJson {

  /**
   * Extra user event features to include in the recommendation model. The key must be a UTF-8
   * encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is
   * returned. For product recommendation, an example of extra user information is traffic_channel,
   * i.e. how user arrives at the site. Users can arrive at the site by coming to the site directly,
   * or coming through Google search, and etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2betaCustomAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2betaCustomAttribute.class);
  }

  /**
   * Highly recommended for user events that are the result of PredictionService.Predict. This field
   * enables accurate attribution of recommendation model performance. The value must be a valid
   * PredictResponse.attribution_token for user events that are the result of
   * PredictionService.Predict. This token enables us to accurately attribute page view or purchase
   * back to the event and the particular predict response containing this clicked/purchased
   * product. If user clicks on product K in the recommendation results, pass
   * PredictResponse.attribution_token as a URL parameter to product K's page. When recording events
   * on product K's page, log the PredictResponse.attribution_token to this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributionToken;

  /**
   * The id or name of the associated shopping cart. This id is used to associate multiple items
   * added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `purchase-complete`, or `shopping-cart-page-view` events.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cartId;

  /**
   * Only required for UserEventService.ImportUserEvents method. Timestamp of when the user event
   * happened.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * Required. User event type. Allowed values are: * `add-to-cart`: Products being added to cart. *
   * `category-page-view`: Special pages such as sale or promotion pages viewed. * `completion`:
   * Completion query result showed/clicked. * `detail-page-view`: Products detail page viewed. *
   * `home-page-view`: Homepage viewed. * `promotion-offered`: Promotion is offered to a user. *
   * `promotion-not-offered`: Promotion is not offered to a user. * `purchase-complete`: User
   * finishing a purchase. * `search`: Product search. * `shopping-cart-page-view`: User viewing a
   * shopping cart.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventType;

  /**
   * A list of identifiers for the independent experiment groups this user event belongs to. This is
   * used to distinguish between user events associated with different experiment setups (e.g. using
   * Retail API, using different recommendation models).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> experimentIds;

  /**
   * The categories associated with a category page. To represent full path of category, use '>'
   * sign to separate different hierarchies. If '>' is part of the category name, please replace it
   * with other character(s). Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy: "pageCategories" : ["Sales >
   * 2017 Black Friday Deals"]. Required for `category-page-view` events. At least one of
   * search_query or page_categories is required for `search` events. Other event types should not
   * set this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> pageCategories;

  /**
   * A unique id of a web page view. This should be kept the same for all user events triggered from
   * the same pageview. For example, an item detail page view could trigger multiple events as the
   * user is browsing the page. The `pageViewId` property should be kept the same for all these
   * events so that they can be grouped together properly. When using the client side event
   * reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageViewId;

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `detail-page-view` * `purchase-complete` In a `search` event, this
   * field represents the products returned to the end user on the current page (the end user may
   * have not finished broswing the whole page yet). When a new page is returned to the end user,
   * after pagination/filtering/ordering even for the same query, a new `search` event with
   * different product_details is desired. The end user may have not finished broswing the whole
   * page yet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2betaProductDetail> productDetails;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2betaProductDetail used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2betaProductDetail.class);
  }

  /**
   * A transaction represents the entire purchase transaction. Required for `purchase-complete`
   * events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaPurchaseTransaction purchaseTransaction;

  /**
   * The referrer URL of the current page. When using the client side event reporting with
   * JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String referrerUri;

  /**
   * The user's search query. The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. At least one of search_query or
   * page_categories is required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String searchQuery;

  /**
   * Complete URL (window.location.href) of the user's current page. When using the client side
   * event reporting with JavaScript pixel and Google Tag Manager, this value is filled in
   * automatically. Maximum length 5,000 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * User information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2betaUserInfo userInfo;

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor log in/out of the website. The field
   * must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. The field should not contain PII or user-data. We recommend
   * to use Google Analystics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-
   * reference#clientId) for this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Extra user event features to include in the recommendation model. The key must be a UTF-8
   * encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is
   * returned. For product recommendation, an example of extra user information is traffic_channel,
   * i.e. how user arrives at the site. Users can arrive at the site by coming to the site directly,
   * or coming through Google search, and etc.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Extra user event features to include in the recommendation model. The key must be a UTF-8
   * encoded string with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is
   * returned. For product recommendation, an example of extra user information is traffic_channel,
   * i.e. how user arrives at the site. Users can arrive at the site by coming to the site directly,
   * or coming through Google search, and etc.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setAttributes(java.util.Map<String, GoogleCloudRetailV2betaCustomAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Highly recommended for user events that are the result of PredictionService.Predict. This field
   * enables accurate attribution of recommendation model performance. The value must be a valid
   * PredictResponse.attribution_token for user events that are the result of
   * PredictionService.Predict. This token enables us to accurately attribute page view or purchase
   * back to the event and the particular predict response containing this clicked/purchased
   * product. If user clicks on product K in the recommendation results, pass
   * PredictResponse.attribution_token as a URL parameter to product K's page. When recording events
   * on product K's page, log the PredictResponse.attribution_token to this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributionToken() {
    return attributionToken;
  }

  /**
   * Highly recommended for user events that are the result of PredictionService.Predict. This field
   * enables accurate attribution of recommendation model performance. The value must be a valid
   * PredictResponse.attribution_token for user events that are the result of
   * PredictionService.Predict. This token enables us to accurately attribute page view or purchase
   * back to the event and the particular predict response containing this clicked/purchased
   * product. If user clicks on product K in the recommendation results, pass
   * PredictResponse.attribution_token as a URL parameter to product K's page. When recording events
   * on product K's page, log the PredictResponse.attribution_token to this field.
   * @param attributionToken attributionToken or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setAttributionToken(java.lang.String attributionToken) {
    this.attributionToken = attributionToken;
    return this;
  }

  /**
   * The id or name of the associated shopping cart. This id is used to associate multiple items
   * added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `purchase-complete`, or `shopping-cart-page-view` events.
   * @return value or {@code null} for none
   */
  public java.lang.String getCartId() {
    return cartId;
  }

  /**
   * The id or name of the associated shopping cart. This id is used to associate multiple items
   * added or present in the cart before purchase. This can only be set for `add-to-cart`,
   * `purchase-complete`, or `shopping-cart-page-view` events.
   * @param cartId cartId or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setCartId(java.lang.String cartId) {
    this.cartId = cartId;
    return this;
  }

  /**
   * Only required for UserEventService.ImportUserEvents method. Timestamp of when the user event
   * happened.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * Only required for UserEventService.ImportUserEvents method. Timestamp of when the user event
   * happened.
   * @param eventTime eventTime or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * Required. User event type. Allowed values are: * `add-to-cart`: Products being added to cart. *
   * `category-page-view`: Special pages such as sale or promotion pages viewed. * `completion`:
   * Completion query result showed/clicked. * `detail-page-view`: Products detail page viewed. *
   * `home-page-view`: Homepage viewed. * `promotion-offered`: Promotion is offered to a user. *
   * `promotion-not-offered`: Promotion is not offered to a user. * `purchase-complete`: User
   * finishing a purchase. * `search`: Product search. * `shopping-cart-page-view`: User viewing a
   * shopping cart.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventType() {
    return eventType;
  }

  /**
   * Required. User event type. Allowed values are: * `add-to-cart`: Products being added to cart. *
   * `category-page-view`: Special pages such as sale or promotion pages viewed. * `completion`:
   * Completion query result showed/clicked. * `detail-page-view`: Products detail page viewed. *
   * `home-page-view`: Homepage viewed. * `promotion-offered`: Promotion is offered to a user. *
   * `promotion-not-offered`: Promotion is not offered to a user. * `purchase-complete`: User
   * finishing a purchase. * `search`: Product search. * `shopping-cart-page-view`: User viewing a
   * shopping cart.
   * @param eventType eventType or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setEventType(java.lang.String eventType) {
    this.eventType = eventType;
    return this;
  }

  /**
   * A list of identifiers for the independent experiment groups this user event belongs to. This is
   * used to distinguish between user events associated with different experiment setups (e.g. using
   * Retail API, using different recommendation models).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExperimentIds() {
    return experimentIds;
  }

  /**
   * A list of identifiers for the independent experiment groups this user event belongs to. This is
   * used to distinguish between user events associated with different experiment setups (e.g. using
   * Retail API, using different recommendation models).
   * @param experimentIds experimentIds or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setExperimentIds(java.util.List<java.lang.String> experimentIds) {
    this.experimentIds = experimentIds;
    return this;
  }

  /**
   * The categories associated with a category page. To represent full path of category, use '>'
   * sign to separate different hierarchies. If '>' is part of the category name, please replace it
   * with other character(s). Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy: "pageCategories" : ["Sales >
   * 2017 Black Friday Deals"]. Required for `category-page-view` events. At least one of
   * search_query or page_categories is required for `search` events. Other event types should not
   * set this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPageCategories() {
    return pageCategories;
  }

  /**
   * The categories associated with a category page. To represent full path of category, use '>'
   * sign to separate different hierarchies. If '>' is part of the category name, please replace it
   * with other character(s). Category pages include special pages such as sales or promotions. For
   * instance, a special sale page may have the category hierarchy: "pageCategories" : ["Sales >
   * 2017 Black Friday Deals"]. Required for `category-page-view` events. At least one of
   * search_query or page_categories is required for `search` events. Other event types should not
   * set this field. Otherwise, an INVALID_ARGUMENT error is returned.
   * @param pageCategories pageCategories or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setPageCategories(java.util.List<java.lang.String> pageCategories) {
    this.pageCategories = pageCategories;
    return this;
  }

  /**
   * A unique id of a web page view. This should be kept the same for all user events triggered from
   * the same pageview. For example, an item detail page view could trigger multiple events as the
   * user is browsing the page. The `pageViewId` property should be kept the same for all these
   * events so that they can be grouped together properly. When using the client side event
   * reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageViewId() {
    return pageViewId;
  }

  /**
   * A unique id of a web page view. This should be kept the same for all user events triggered from
   * the same pageview. For example, an item detail page view could trigger multiple events as the
   * user is browsing the page. The `pageViewId` property should be kept the same for all these
   * events so that they can be grouped together properly. When using the client side event
   * reporting with JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * @param pageViewId pageViewId or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setPageViewId(java.lang.String pageViewId) {
    this.pageViewId = pageViewId;
    return this;
  }

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `detail-page-view` * `purchase-complete` In a `search` event, this
   * field represents the products returned to the end user on the current page (the end user may
   * have not finished broswing the whole page yet). When a new page is returned to the end user,
   * after pagination/filtering/ordering even for the same query, a new `search` event with
   * different product_details is desired. The end user may have not finished broswing the whole
   * page yet.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2betaProductDetail> getProductDetails() {
    return productDetails;
  }

  /**
   * The main product details related to the event. This field is required for the following event
   * types: * `add-to-cart` * `detail-page-view` * `purchase-complete` In a `search` event, this
   * field represents the products returned to the end user on the current page (the end user may
   * have not finished broswing the whole page yet). When a new page is returned to the end user,
   * after pagination/filtering/ordering even for the same query, a new `search` event with
   * different product_details is desired. The end user may have not finished broswing the whole
   * page yet.
   * @param productDetails productDetails or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setProductDetails(java.util.List<GoogleCloudRetailV2betaProductDetail> productDetails) {
    this.productDetails = productDetails;
    return this;
  }

  /**
   * A transaction represents the entire purchase transaction. Required for `purchase-complete`
   * events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaPurchaseTransaction getPurchaseTransaction() {
    return purchaseTransaction;
  }

  /**
   * A transaction represents the entire purchase transaction. Required for `purchase-complete`
   * events. Other event types should not set this field. Otherwise, an INVALID_ARGUMENT error is
   * returned.
   * @param purchaseTransaction purchaseTransaction or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setPurchaseTransaction(GoogleCloudRetailV2betaPurchaseTransaction purchaseTransaction) {
    this.purchaseTransaction = purchaseTransaction;
    return this;
  }

  /**
   * The referrer URL of the current page. When using the client side event reporting with
   * JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * @return value or {@code null} for none
   */
  public java.lang.String getReferrerUri() {
    return referrerUri;
  }

  /**
   * The referrer URL of the current page. When using the client side event reporting with
   * JavaScript pixel and Google Tag Manager, this value is filled in automatically.
   * @param referrerUri referrerUri or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setReferrerUri(java.lang.String referrerUri) {
    this.referrerUri = referrerUri;
    return this;
  }

  /**
   * The user's search query. The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. At least one of search_query or
   * page_categories is required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * @return value or {@code null} for none
   */
  public java.lang.String getSearchQuery() {
    return searchQuery;
  }

  /**
   * The user's search query. The value must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. At least one of search_query or
   * page_categories is required for `search` events. Other event types should not set this field.
   * Otherwise, an INVALID_ARGUMENT error is returned.
   * @param searchQuery searchQuery or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setSearchQuery(java.lang.String searchQuery) {
    this.searchQuery = searchQuery;
    return this;
  }

  /**
   * Complete URL (window.location.href) of the user's current page. When using the client side
   * event reporting with JavaScript pixel and Google Tag Manager, this value is filled in
   * automatically. Maximum length 5,000 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Complete URL (window.location.href) of the user's current page. When using the client side
   * event reporting with JavaScript pixel and Google Tag Manager, this value is filled in
   * automatically. Maximum length 5,000 characters.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * User information.
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserInfo getUserInfo() {
    return userInfo;
  }

  /**
   * User information.
   * @param userInfo userInfo or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setUserInfo(GoogleCloudRetailV2betaUserInfo userInfo) {
    this.userInfo = userInfo;
    return this;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor log in/out of the website. The field
   * must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. The field should not contain PII or user-data. We recommend
   * to use Google Analystics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-
   * reference#clientId) for this field.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * Required. A unique identifier for tracking visitors. For example, this could be implemented
   * with an HTTP cookie, which should be able to uniquely identify a visitor on a single device.
   * This unique identifier should not change if the visitor log in/out of the website. The field
   * must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. The field should not contain PII or user-data. We recommend
   * to use Google Analystics [Client
   * ID](https://developers.google.com/analytics/devguides/collection/analyticsjs/field-
   * reference#clientId) for this field.
   * @param visitorId visitorId or {@code null} for none
   */
  public GoogleCloudRetailV2betaUserEvent setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public GoogleCloudRetailV2betaUserEvent set(String fieldName, Object value) {
    return (GoogleCloudRetailV2betaUserEvent) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2betaUserEvent clone() {
    return (GoogleCloudRetailV2betaUserEvent) super.clone();
  }

}
