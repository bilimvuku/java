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

package com.google.api.services.people.v1.model;

/**
 * A request to update an existing user contact group. All updated fields will be replaced.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateContactGroupRequest extends com.google.api.client.json.GenericJson {

  /**
   * Required. The contact group to update.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContactGroup contactGroup;

  /**
   * Optional. A field mask to restrict which fields on the group are returned. Defaults to
   * `metadata`, `groupType`, and `name` if not set or set to empty. Valid fields are: * clientData
   * * groupType * memberCount * metadata * name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String readGroupFields;

  /**
   * Optional. A field mask to restrict which fields on the group are updated. Multiple fields can
   * be specified by separating them with commas. Defaults to `name` if not set or set to empty.
   * Updated fields are replaced. Valid values are: * clientData * name
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateGroupFields;

  /**
   * Required. The contact group to update.
   * @return value or {@code null} for none
   */
  public ContactGroup getContactGroup() {
    return contactGroup;
  }

  /**
   * Required. The contact group to update.
   * @param contactGroup contactGroup or {@code null} for none
   */
  public UpdateContactGroupRequest setContactGroup(ContactGroup contactGroup) {
    this.contactGroup = contactGroup;
    return this;
  }

  /**
   * Optional. A field mask to restrict which fields on the group are returned. Defaults to
   * `metadata`, `groupType`, and `name` if not set or set to empty. Valid fields are: * clientData
   * * groupType * memberCount * metadata * name
   * @return value or {@code null} for none
   */
  public String getReadGroupFields() {
    return readGroupFields;
  }

  /**
   * Optional. A field mask to restrict which fields on the group are returned. Defaults to
   * `metadata`, `groupType`, and `name` if not set or set to empty. Valid fields are: * clientData
   * * groupType * memberCount * metadata * name
   * @param readGroupFields readGroupFields or {@code null} for none
   */
  public UpdateContactGroupRequest setReadGroupFields(String readGroupFields) {
    this.readGroupFields = readGroupFields;
    return this;
  }

  /**
   * Optional. A field mask to restrict which fields on the group are updated. Multiple fields can
   * be specified by separating them with commas. Defaults to `name` if not set or set to empty.
   * Updated fields are replaced. Valid values are: * clientData * name
   * @return value or {@code null} for none
   */
  public String getUpdateGroupFields() {
    return updateGroupFields;
  }

  /**
   * Optional. A field mask to restrict which fields on the group are updated. Multiple fields can
   * be specified by separating them with commas. Defaults to `name` if not set or set to empty.
   * Updated fields are replaced. Valid values are: * clientData * name
   * @param updateGroupFields updateGroupFields or {@code null} for none
   */
  public UpdateContactGroupRequest setUpdateGroupFields(String updateGroupFields) {
    this.updateGroupFields = updateGroupFields;
    return this;
  }

  @Override
  public UpdateContactGroupRequest set(String fieldName, Object value) {
    return (UpdateContactGroupRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateContactGroupRequest clone() {
    return (UpdateContactGroupRequest) super.clone();
  }

}
