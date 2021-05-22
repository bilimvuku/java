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

package com.google.api.services.retail.v2alpha.model;

/**
 * Product captures all metadata information of items to be recommended or searched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Retail API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudRetailV2alphaProduct extends com.google.api.client.json.GenericJson {

  /**
   * Highly encouraged. Extra product attributes to be included. For example, for products, this
   * could include the store name, vendor, style, color, etc. These are very strong signals for
   * recommendation model, thus we highly recommend providing the attributes here. Features that can
   * take on one of a limited number of possible values. Two types of features can be set are:
   * Textual features. some examples would be the brand/maker of a product, or country of a
   * customer. Numerical features. Some examples would be the height/weight of a product, or age of
   * a customer. For example: `{ "vendor": {"text": ["vendor123", "vendor456"]}, "lengths_cm":
   * {"numbers":[2.3, 15.4]}, "heights_cm": {"numbers":[8.1, 6.4]} }`. This field needs to pass all
   * below criteria, otherwise an INVALID_ARGUMENT error is returned: * Max entries count: 200 by
   * default; 100 for Type.VARIANT. * The key must be a UTF-8 encoded string with a length limit of
   * 128 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, GoogleCloudRetailV2alphaCustomAttribute> attributes;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2alphaCustomAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2alphaCustomAttribute.class);
  }

  /**
   * The online availability of the Product. Default to Availability.IN_STOCK. Google Merchant
   * Center Property [availability](https://support.google.com/merchants/answer/6324448). Schema.org
   * Property [Offer.availability](https://schema.org/availability).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availability;

  /**
   * The available quantity of the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer availableQuantity;

  /**
   * The timestamp when this Product becomes available for recommendation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String availableTime;

  /**
   * Product categories. This field is repeated for supporting one product belonging to several
   * parallel categories. Strongly recommended using the full path for better search /
   * recommendation quality. To represent full path of category, use '>' sign to separate different
   * hierarchies. If '>' is part of the category name, please replace it with other character(s).
   * For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports
   * & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categories": [
   * "Shoes & Accessories > Shoes", "Sports & Fitness > Athletic Clothing > Shoes" ] Must be set for
   * Type.PRIMARY Product otherwise an INVALID_ARGUMENT error is returned. At most 250 values are
   * allowed per Product. Empty values are not allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * Google Merchant Center property google_product_category. Schema.org property [Product.category]
   * (https://schema.org/category). [mc_google_product_category]:
   * https://support.google.com/merchants/answer/6324436
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> categories;

  /**
   * Product description. This field must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [description](https://support.google.com/merchants/answer/6324468). schema.org property
   * [Product.description](https://schema.org/description).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Immutable. Product identifier, which is the final component of name. For example, this field is
   * "id_1", if name is
   * `projects/locations/global/catalogs/default_catalog/branches/default_branch/products/id_1`.
   * This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [id](https://support.google.com/merchants/answer/6324405). Schema.org Property
   * [Product.sku](https://schema.org/sku).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Product images for the product.Highly recommended to put the main image to the first. A maximum
   * of 300 images are allowed. Google Merchant Center property
   * [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudRetailV2alphaImage> images;

  static {
    // hack to force ProGuard to consider GoogleCloudRetailV2alphaImage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudRetailV2alphaImage.class);
  }

  /**
   * Immutable. Full resource name of the product, such as `projects/locations/global/catalogs/defau
   * lt_catalog/branches/default_branch/products/product_id`. The branch ID must be
   * "default_branch".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudRetailV2alphaPriceInfo priceInfo;

  /**
   * Variant group identifier. Must be an id, with the same parent branch with this product.
   * Otherwise, an error is thrown. For Type.PRIMARY Products, this field can only be empty or set
   * to the same value as id. For VARIANT Products, this field cannot be empty. A maximum of 2,000
   * products are allowed to share the same Type.PRIMARY Product. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center Property
   * [item_group_id](https://support.google.com/merchants/answer/6324507). Schema.org Property
   * [Product.inProductGroupWithID](https://schema.org/inProductGroupWithID). This field must be
   * enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primaryProductId;

  /**
   * Custom tags associated with the product. At most 250 values are allowed per Product. This value
   * must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. This tag can be used for filtering recommendation results
   * by passing the tag as part of the PredictRequest.filter. Google Merchant Center property
   * [custom_label_0–4](https://support.google.com/merchants/answer/6324473).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Required. Product title. This field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [title](https://support.google.com/merchants/answer/6324415). Schema.org property
   * [Product.name](https://schema.org/name).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Immutable. The type of the product. Default to
   * Catalog.product_level_config.ingestion_product_type if unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Canonical URL directly linking to the product detail page. It is strongly recommended to
   * provide a valid uri for the product, otherwise the service performance could be significantly
   * degraded. This field must be a UTF-8 encoded string with a length limit of 5,000 characters.
   * Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [link](https://support.google.com/merchants/answer/6324416). Schema.org property
   * [Offer.url](https://schema.org/url).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Highly encouraged. Extra product attributes to be included. For example, for products, this
   * could include the store name, vendor, style, color, etc. These are very strong signals for
   * recommendation model, thus we highly recommend providing the attributes here. Features that can
   * take on one of a limited number of possible values. Two types of features can be set are:
   * Textual features. some examples would be the brand/maker of a product, or country of a
   * customer. Numerical features. Some examples would be the height/weight of a product, or age of
   * a customer. For example: `{ "vendor": {"text": ["vendor123", "vendor456"]}, "lengths_cm":
   * {"numbers":[2.3, 15.4]}, "heights_cm": {"numbers":[8.1, 6.4]} }`. This field needs to pass all
   * below criteria, otherwise an INVALID_ARGUMENT error is returned: * Max entries count: 200 by
   * default; 100 for Type.VARIANT. * The key must be a UTF-8 encoded string with a length limit of
   * 128 characters.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, GoogleCloudRetailV2alphaCustomAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Highly encouraged. Extra product attributes to be included. For example, for products, this
   * could include the store name, vendor, style, color, etc. These are very strong signals for
   * recommendation model, thus we highly recommend providing the attributes here. Features that can
   * take on one of a limited number of possible values. Two types of features can be set are:
   * Textual features. some examples would be the brand/maker of a product, or country of a
   * customer. Numerical features. Some examples would be the height/weight of a product, or age of
   * a customer. For example: `{ "vendor": {"text": ["vendor123", "vendor456"]}, "lengths_cm":
   * {"numbers":[2.3, 15.4]}, "heights_cm": {"numbers":[8.1, 6.4]} }`. This field needs to pass all
   * below criteria, otherwise an INVALID_ARGUMENT error is returned: * Max entries count: 200 by
   * default; 100 for Type.VARIANT. * The key must be a UTF-8 encoded string with a length limit of
   * 128 characters.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setAttributes(java.util.Map<String, GoogleCloudRetailV2alphaCustomAttribute> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * The online availability of the Product. Default to Availability.IN_STOCK. Google Merchant
   * Center Property [availability](https://support.google.com/merchants/answer/6324448). Schema.org
   * Property [Offer.availability](https://schema.org/availability).
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailability() {
    return availability;
  }

  /**
   * The online availability of the Product. Default to Availability.IN_STOCK. Google Merchant
   * Center Property [availability](https://support.google.com/merchants/answer/6324448). Schema.org
   * Property [Offer.availability](https://schema.org/availability).
   * @param availability availability or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setAvailability(java.lang.String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * The available quantity of the item.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAvailableQuantity() {
    return availableQuantity;
  }

  /**
   * The available quantity of the item.
   * @param availableQuantity availableQuantity or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setAvailableQuantity(java.lang.Integer availableQuantity) {
    this.availableQuantity = availableQuantity;
    return this;
  }

  /**
   * The timestamp when this Product becomes available for recommendation.
   * @return value or {@code null} for none
   */
  public String getAvailableTime() {
    return availableTime;
  }

  /**
   * The timestamp when this Product becomes available for recommendation.
   * @param availableTime availableTime or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setAvailableTime(String availableTime) {
    this.availableTime = availableTime;
    return this;
  }

  /**
   * Product categories. This field is repeated for supporting one product belonging to several
   * parallel categories. Strongly recommended using the full path for better search /
   * recommendation quality. To represent full path of category, use '>' sign to separate different
   * hierarchies. If '>' is part of the category name, please replace it with other character(s).
   * For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports
   * & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categories": [
   * "Shoes & Accessories > Shoes", "Sports & Fitness > Athletic Clothing > Shoes" ] Must be set for
   * Type.PRIMARY Product otherwise an INVALID_ARGUMENT error is returned. At most 250 values are
   * allowed per Product. Empty values are not allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * Google Merchant Center property google_product_category. Schema.org property [Product.category]
   * (https://schema.org/category). [mc_google_product_category]:
   * https://support.google.com/merchants/answer/6324436
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCategories() {
    return categories;
  }

  /**
   * Product categories. This field is repeated for supporting one product belonging to several
   * parallel categories. Strongly recommended using the full path for better search /
   * recommendation quality. To represent full path of category, use '>' sign to separate different
   * hierarchies. If '>' is part of the category name, please replace it with other character(s).
   * For example, if a shoes product belongs to both ["Shoes & Accessories" -> "Shoes"] and ["Sports
   * & Fitness" -> "Athletic Clothing" -> "Shoes"], it could be represented as: "categories": [
   * "Shoes & Accessories > Shoes", "Sports & Fitness > Athletic Clothing > Shoes" ] Must be set for
   * Type.PRIMARY Product otherwise an INVALID_ARGUMENT error is returned. At most 250 values are
   * allowed per Product. Empty values are not allowed. Each value must be a UTF-8 encoded string
   * with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * Google Merchant Center property google_product_category. Schema.org property [Product.category]
   * (https://schema.org/category). [mc_google_product_category]:
   * https://support.google.com/merchants/answer/6324436
   * @param categories categories or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setCategories(java.util.List<java.lang.String> categories) {
    this.categories = categories;
    return this;
  }

  /**
   * Product description. This field must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [description](https://support.google.com/merchants/answer/6324468). schema.org property
   * [Product.description](https://schema.org/description).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Product description. This field must be a UTF-8 encoded string with a length limit of 5,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [description](https://support.google.com/merchants/answer/6324468). schema.org property
   * [Product.description](https://schema.org/description).
   * @param description description or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Immutable. Product identifier, which is the final component of name. For example, this field is
   * "id_1", if name is
   * `projects/locations/global/catalogs/default_catalog/branches/default_branch/products/id_1`.
   * This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [id](https://support.google.com/merchants/answer/6324405). Schema.org Property
   * [Product.sku](https://schema.org/sku).
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Immutable. Product identifier, which is the final component of name. For example, this field is
   * "id_1", if name is
   * `projects/locations/global/catalogs/default_catalog/branches/default_branch/products/id_1`.
   * This field must be a UTF-8 encoded string with a length limit of 128 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [id](https://support.google.com/merchants/answer/6324405). Schema.org Property
   * [Product.sku](https://schema.org/sku).
   * @param id id or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Product images for the product.Highly recommended to put the main image to the first. A maximum
   * of 300 images are allowed. Google Merchant Center property
   * [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudRetailV2alphaImage> getImages() {
    return images;
  }

  /**
   * Product images for the product.Highly recommended to put the main image to the first. A maximum
   * of 300 images are allowed. Google Merchant Center property
   * [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property
   * [Product.image](https://schema.org/image).
   * @param images images or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setImages(java.util.List<GoogleCloudRetailV2alphaImage> images) {
    this.images = images;
    return this;
  }

  /**
   * Immutable. Full resource name of the product, such as `projects/locations/global/catalogs/defau
   * lt_catalog/branches/default_branch/products/product_id`. The branch ID must be
   * "default_branch".
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. Full resource name of the product, such as `projects/locations/global/catalogs/defau
   * lt_catalog/branches/default_branch/products/product_id`. The branch ID must be
   * "default_branch".
   * @param name name or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * @return value or {@code null} for none
   */
  public GoogleCloudRetailV2alphaPriceInfo getPriceInfo() {
    return priceInfo;
  }

  /**
   * Product price and cost information. Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371).
   * @param priceInfo priceInfo or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setPriceInfo(GoogleCloudRetailV2alphaPriceInfo priceInfo) {
    this.priceInfo = priceInfo;
    return this;
  }

  /**
   * Variant group identifier. Must be an id, with the same parent branch with this product.
   * Otherwise, an error is thrown. For Type.PRIMARY Products, this field can only be empty or set
   * to the same value as id. For VARIANT Products, this field cannot be empty. A maximum of 2,000
   * products are allowed to share the same Type.PRIMARY Product. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center Property
   * [item_group_id](https://support.google.com/merchants/answer/6324507). Schema.org Property
   * [Product.inProductGroupWithID](https://schema.org/inProductGroupWithID). This field must be
   * enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimaryProductId() {
    return primaryProductId;
  }

  /**
   * Variant group identifier. Must be an id, with the same parent branch with this product.
   * Otherwise, an error is thrown. For Type.PRIMARY Products, this field can only be empty or set
   * to the same value as id. For VARIANT Products, this field cannot be empty. A maximum of 2,000
   * products are allowed to share the same Type.PRIMARY Product. Otherwise, an INVALID_ARGUMENT
   * error is returned. Google Merchant Center Property
   * [item_group_id](https://support.google.com/merchants/answer/6324507). Schema.org Property
   * [Product.inProductGroupWithID](https://schema.org/inProductGroupWithID). This field must be
   * enabled before it can be used. [Learn more](/recommendations-ai/docs/catalog#item-group-id).
   * @param primaryProductId primaryProductId or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setPrimaryProductId(java.lang.String primaryProductId) {
    this.primaryProductId = primaryProductId;
    return this;
  }

  /**
   * Custom tags associated with the product. At most 250 values are allowed per Product. This value
   * must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. This tag can be used for filtering recommendation results
   * by passing the tag as part of the PredictRequest.filter. Google Merchant Center property
   * [custom_label_0–4](https://support.google.com/merchants/answer/6324473).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Custom tags associated with the product. At most 250 values are allowed per Product. This value
   * must be a UTF-8 encoded string with a length limit of 1,000 characters. Otherwise, an
   * INVALID_ARGUMENT error is returned. This tag can be used for filtering recommendation results
   * by passing the tag as part of the PredictRequest.filter. Google Merchant Center property
   * [custom_label_0–4](https://support.google.com/merchants/answer/6324473).
   * @param tags tags or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Required. Product title. This field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [title](https://support.google.com/merchants/answer/6324415). Schema.org property
   * [Product.name](https://schema.org/name).
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Required. Product title. This field must be a UTF-8 encoded string with a length limit of 1,000
   * characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [title](https://support.google.com/merchants/answer/6324415). Schema.org property
   * [Product.name](https://schema.org/name).
   * @param title title or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Immutable. The type of the product. Default to
   * Catalog.product_level_config.ingestion_product_type if unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Immutable. The type of the product. Default to
   * Catalog.product_level_config.ingestion_product_type if unset.
   * @param type type or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Canonical URL directly linking to the product detail page. It is strongly recommended to
   * provide a valid uri for the product, otherwise the service performance could be significantly
   * degraded. This field must be a UTF-8 encoded string with a length limit of 5,000 characters.
   * Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [link](https://support.google.com/merchants/answer/6324416). Schema.org property
   * [Offer.url](https://schema.org/url).
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * Canonical URL directly linking to the product detail page. It is strongly recommended to
   * provide a valid uri for the product, otherwise the service performance could be significantly
   * degraded. This field must be a UTF-8 encoded string with a length limit of 5,000 characters.
   * Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property
   * [link](https://support.google.com/merchants/answer/6324416). Schema.org property
   * [Offer.url](https://schema.org/url).
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudRetailV2alphaProduct setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudRetailV2alphaProduct set(String fieldName, Object value) {
    return (GoogleCloudRetailV2alphaProduct) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudRetailV2alphaProduct clone() {
    return (GoogleCloudRetailV2alphaProduct) super.clone();
  }

}
