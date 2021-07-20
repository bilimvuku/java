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

package com.google.api.services.content.model;

/**
 * Regional inventory resource. contains the regional name and all attributes which are overridden
 * for the specified region.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RegionalInventory extends com.google.api.client.json.GenericJson {

  /**
   * The availability of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String availability;

  /**
   * A list of custom (merchant-provided) attributes. It can also be used for submitting any
   * attribute of the feed specification in its generic form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<CustomAttribute> customAttributes;

  static {
    // hack to force ProGuard to consider CustomAttribute used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(CustomAttribute.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#regionalInventory`".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The price of the product.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price price;

  /**
   * The ID uniquely identifying each region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regionId;

  /**
   * The sale price of the product. Mandatory if `sale_price_effective_date` is defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price salePrice;

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String salePriceEffectiveDate;

  /**
   * The availability of the product.
   * @return value or {@code null} for none
   */
  public java.lang.String getAvailability() {
    return availability;
  }

  /**
   * The availability of the product.
   * @param availability availability or {@code null} for none
   */
  public RegionalInventory setAvailability(java.lang.String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * A list of custom (merchant-provided) attributes. It can also be used for submitting any
   * attribute of the feed specification in its generic form.
   * @return value or {@code null} for none
   */
  public java.util.List<CustomAttribute> getCustomAttributes() {
    return customAttributes;
  }

  /**
   * A list of custom (merchant-provided) attributes. It can also be used for submitting any
   * attribute of the feed specification in its generic form.
   * @param customAttributes customAttributes or {@code null} for none
   */
  public RegionalInventory setCustomAttributes(java.util.List<CustomAttribute> customAttributes) {
    this.customAttributes = customAttributes;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#regionalInventory`".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "`content#regionalInventory`".
   * @param kind kind or {@code null} for none
   */
  public RegionalInventory setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The price of the product.
   * @return value or {@code null} for none
   */
  public Price getPrice() {
    return price;
  }

  /**
   * The price of the product.
   * @param price price or {@code null} for none
   */
  public RegionalInventory setPrice(Price price) {
    this.price = price;
    return this;
  }

  /**
   * The ID uniquely identifying each region.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegionId() {
    return regionId;
  }

  /**
   * The ID uniquely identifying each region.
   * @param regionId regionId or {@code null} for none
   */
  public RegionalInventory setRegionId(java.lang.String regionId) {
    this.regionId = regionId;
    return this;
  }

  /**
   * The sale price of the product. Mandatory if `sale_price_effective_date` is defined.
   * @return value or {@code null} for none
   */
  public Price getSalePrice() {
    return salePrice;
  }

  /**
   * The sale price of the product. Mandatory if `sale_price_effective_date` is defined.
   * @param salePrice salePrice or {@code null} for none
   */
  public RegionalInventory setSalePrice(Price salePrice) {
    this.salePrice = salePrice;
    return this;
  }

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * @return value or {@code null} for none
   */
  public java.lang.String getSalePriceEffectiveDate() {
    return salePriceEffectiveDate;
  }

  /**
   * A date range represented by a pair of ISO 8601 dates separated by a space, comma, or slash.
   * Both dates might be specified as 'null' if undecided.
   * @param salePriceEffectiveDate salePriceEffectiveDate or {@code null} for none
   */
  public RegionalInventory setSalePriceEffectiveDate(java.lang.String salePriceEffectiveDate) {
    this.salePriceEffectiveDate = salePriceEffectiveDate;
    return this;
  }

  @Override
  public RegionalInventory set(String fieldName, Object value) {
    return (RegionalInventory) super.set(fieldName, value);
  }

  @Override
  public RegionalInventory clone() {
    return (RegionalInventory) super.clone();
  }

}
