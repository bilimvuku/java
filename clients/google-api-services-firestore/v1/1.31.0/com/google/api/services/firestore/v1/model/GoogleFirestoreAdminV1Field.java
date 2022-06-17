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

package com.google.api.services.firestore.v1.model;

/**
 * Represents a single field in the database. Fields are grouped by their "Collection Group", which
 * represent all collections in the database with the same id.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirestoreAdminV1Field extends com.google.api.client.json.GenericJson {

  /**
   * The index configuration for this field. If unset, field indexing will revert to the
   * configuration defined by the `ancestor_field`. To explicitly remove all indexes for this field,
   * specify an index config with an empty list of indexes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1IndexConfig indexConfig;

  /**
   * Required. A field name of the form `projects/{project_id}/databases/{database_id}/collectionGro
   * ups/{collection_id}/fields/{field_path}` A field path may be a simple field name, e.g.
   * `address` or a path to fields within map_value , e.g. `address.city`, or a special field path.
   * The only valid special field is `*`, which represents any field. Field paths may be quoted
   * using ` (backtick). The only character that needs to be escaped within a quoted field path is
   * the backtick character itself, escaped using a backslash. Special characters in field paths
   * that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic
   * characters. Examples: (Note: Comments here are written in markdown syntax, so there is an
   * additional layer of backticks to represent a code block) `\`address.city\`` represents a field
   * named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field
   * named `*`, not any field. A special `Field` contains the default indexing settings for all
   * fields. This field's resource name is:
   * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields` Indexes
   * defined on this `Field` will be applied to all fields which do not have their own `Field` index
   * configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The TTL configuration for this `Field`. Setting or unsetting this will enable or disable the
   * TTL for documents that have this `Field`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleFirestoreAdminV1TtlConfig ttlConfig;

  /**
   * The index configuration for this field. If unset, field indexing will revert to the
   * configuration defined by the `ancestor_field`. To explicitly remove all indexes for this field,
   * specify an index config with an empty list of indexes.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1IndexConfig getIndexConfig() {
    return indexConfig;
  }

  /**
   * The index configuration for this field. If unset, field indexing will revert to the
   * configuration defined by the `ancestor_field`. To explicitly remove all indexes for this field,
   * specify an index config with an empty list of indexes.
   * @param indexConfig indexConfig or {@code null} for none
   */
  public GoogleFirestoreAdminV1Field setIndexConfig(GoogleFirestoreAdminV1IndexConfig indexConfig) {
    this.indexConfig = indexConfig;
    return this;
  }

  /**
   * Required. A field name of the form `projects/{project_id}/databases/{database_id}/collectionGro
   * ups/{collection_id}/fields/{field_path}` A field path may be a simple field name, e.g.
   * `address` or a path to fields within map_value , e.g. `address.city`, or a special field path.
   * The only valid special field is `*`, which represents any field. Field paths may be quoted
   * using ` (backtick). The only character that needs to be escaped within a quoted field path is
   * the backtick character itself, escaped using a backslash. Special characters in field paths
   * that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic
   * characters. Examples: (Note: Comments here are written in markdown syntax, so there is an
   * additional layer of backticks to represent a code block) `\`address.city\`` represents a field
   * named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field
   * named `*`, not any field. A special `Field` contains the default indexing settings for all
   * fields. This field's resource name is:
   * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields` Indexes
   * defined on this `Field` will be applied to all fields which do not have their own `Field` index
   * configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. A field name of the form `projects/{project_id}/databases/{database_id}/collectionGro
   * ups/{collection_id}/fields/{field_path}` A field path may be a simple field name, e.g.
   * `address` or a path to fields within map_value , e.g. `address.city`, or a special field path.
   * The only valid special field is `*`, which represents any field. Field paths may be quoted
   * using ` (backtick). The only character that needs to be escaped within a quoted field path is
   * the backtick character itself, escaped using a backslash. Special characters in field paths
   * that must be quoted include: `*`, `.`, ``` (backtick), `[`, `]`, as well as any ascii symbolic
   * characters. Examples: (Note: Comments here are written in markdown syntax, so there is an
   * additional layer of backticks to represent a code block) `\`address.city\`` represents a field
   * named `address.city`, not the map key `city` in the field `address`. `\`*\`` represents a field
   * named `*`, not any field. A special `Field` contains the default indexing settings for all
   * fields. This field's resource name is:
   * `projects/{project_id}/databases/{database_id}/collectionGroups/__default__/fields` Indexes
   * defined on this `Field` will be applied to all fields which do not have their own `Field` index
   * configuration.
   * @param name name or {@code null} for none
   */
  public GoogleFirestoreAdminV1Field setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The TTL configuration for this `Field`. Setting or unsetting this will enable or disable the
   * TTL for documents that have this `Field`.
   * @return value or {@code null} for none
   */
  public GoogleFirestoreAdminV1TtlConfig getTtlConfig() {
    return ttlConfig;
  }

  /**
   * The TTL configuration for this `Field`. Setting or unsetting this will enable or disable the
   * TTL for documents that have this `Field`.
   * @param ttlConfig ttlConfig or {@code null} for none
   */
  public GoogleFirestoreAdminV1Field setTtlConfig(GoogleFirestoreAdminV1TtlConfig ttlConfig) {
    this.ttlConfig = ttlConfig;
    return this;
  }

  @Override
  public GoogleFirestoreAdminV1Field set(String fieldName, Object value) {
    return (GoogleFirestoreAdminV1Field) super.set(fieldName, value);
  }

  @Override
  public GoogleFirestoreAdminV1Field clone() {
    return (GoogleFirestoreAdminV1Field) super.clone();
  }

}
