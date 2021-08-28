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

package com.google.api.services.logging.v2.model;

/**
 * A field in TableSchema. The fields describe the static fields in the LogEntry. Any dynamic fields
 * generated by the customer in fields like labels and jsonPayload are not listed in the schema as
 * they use a native JSON type field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Logging API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableFieldSchema extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The field description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Optional. Describes the nested schema fields if the type property is set to RECORD.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableFieldSchema> fields;

  /**
   * Optional. The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * Required. The field name corresponding to fields in the LogEntry.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. The field data type. Possible values include: STRING INTEGER (or INT64) FLOAT (or
   * FLOAT64) BOOLEAN (or BOOL) TIMESTAMP RECORD (or STRUCT)Use of RECORD/STRUT indicates that the
   * field contains a nested schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Optional. The field description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Optional. The field description.
   * @param description description or {@code null} for none
   */
  public TableFieldSchema setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional. Describes the nested schema fields if the type property is set to RECORD.
   * @return value or {@code null} for none
   */
  public java.util.List<TableFieldSchema> getFields() {
    return fields;
  }

  /**
   * Optional. Describes the nested schema fields if the type property is set to RECORD.
   * @param fields fields or {@code null} for none
   */
  public TableFieldSchema setFields(java.util.List<TableFieldSchema> fields) {
    this.fields = fields;
    return this;
  }

  /**
   * Optional. The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Optional. The field mode. Possible values include NULLABLE, REQUIRED and REPEATED. The default
   * value is NULLABLE.
   * @param mode mode or {@code null} for none
   */
  public TableFieldSchema setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Required. The field name corresponding to fields in the LogEntry.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The field name corresponding to fields in the LogEntry.
   * @param name name or {@code null} for none
   */
  public TableFieldSchema setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. The field data type. Possible values include: STRING INTEGER (or INT64) FLOAT (or
   * FLOAT64) BOOLEAN (or BOOL) TIMESTAMP RECORD (or STRUCT)Use of RECORD/STRUT indicates that the
   * field contains a nested schema.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Required. The field data type. Possible values include: STRING INTEGER (or INT64) FLOAT (or
   * FLOAT64) BOOLEAN (or BOOL) TIMESTAMP RECORD (or STRUCT)Use of RECORD/STRUT indicates that the
   * field contains a nested schema.
   * @param type type or {@code null} for none
   */
  public TableFieldSchema setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public TableFieldSchema set(String fieldName, Object value) {
    return (TableFieldSchema) super.set(fieldName, value);
  }

  @Override
  public TableFieldSchema clone() {
    return (TableFieldSchema) super.clone();
  }

}
