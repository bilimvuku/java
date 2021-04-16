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

package com.google.api.services.directory.model;

/**
 * Defines an assignment of a role.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RoleAssignment extends com.google.api.client.json.GenericJson {

  /**
   * The unique ID of the user this role is assigned to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String assignedTo;

  /**
   * ETag of the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The type of the API resource. This is always `admin#directory#roleAssignment`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * If the role is restricted to an organization unit, this contains the ID for the organization
   * unit the exercise of this role is restricted to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orgUnitId;

  /**
   * ID of this roleAssignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long roleAssignmentId;

  /**
   * The ID of the role that is assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long roleId;

  /**
   * The scope in which this role is assigned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scopeType;

  /**
   * The unique ID of the user this role is assigned to.
   * @return value or {@code null} for none
   */
  public java.lang.String getAssignedTo() {
    return assignedTo;
  }

  /**
   * The unique ID of the user this role is assigned to.
   * @param assignedTo assignedTo or {@code null} for none
   */
  public RoleAssignment setAssignedTo(java.lang.String assignedTo) {
    this.assignedTo = assignedTo;
    return this;
  }

  /**
   * ETag of the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * ETag of the resource.
   * @param etag etag or {@code null} for none
   */
  public RoleAssignment setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roleAssignment`.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The type of the API resource. This is always `admin#directory#roleAssignment`.
   * @param kind kind or {@code null} for none
   */
  public RoleAssignment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * If the role is restricted to an organization unit, this contains the ID for the organization
   * unit the exercise of this role is restricted to.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrgUnitId() {
    return orgUnitId;
  }

  /**
   * If the role is restricted to an organization unit, this contains the ID for the organization
   * unit the exercise of this role is restricted to.
   * @param orgUnitId orgUnitId or {@code null} for none
   */
  public RoleAssignment setOrgUnitId(java.lang.String orgUnitId) {
    this.orgUnitId = orgUnitId;
    return this;
  }

  /**
   * ID of this roleAssignment.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRoleAssignmentId() {
    return roleAssignmentId;
  }

  /**
   * ID of this roleAssignment.
   * @param roleAssignmentId roleAssignmentId or {@code null} for none
   */
  public RoleAssignment setRoleAssignmentId(java.lang.Long roleAssignmentId) {
    this.roleAssignmentId = roleAssignmentId;
    return this;
  }

  /**
   * The ID of the role that is assigned.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRoleId() {
    return roleId;
  }

  /**
   * The ID of the role that is assigned.
   * @param roleId roleId or {@code null} for none
   */
  public RoleAssignment setRoleId(java.lang.Long roleId) {
    this.roleId = roleId;
    return this;
  }

  /**
   * The scope in which this role is assigned.
   * @return value or {@code null} for none
   */
  public java.lang.String getScopeType() {
    return scopeType;
  }

  /**
   * The scope in which this role is assigned.
   * @param scopeType scopeType or {@code null} for none
   */
  public RoleAssignment setScopeType(java.lang.String scopeType) {
    this.scopeType = scopeType;
    return this;
  }

  @Override
  public RoleAssignment set(String fieldName, Object value) {
    return (RoleAssignment) super.set(fieldName, value);
  }

  @Override
  public RoleAssignment clone() {
    return (RoleAssignment) super.clone();
  }

}
