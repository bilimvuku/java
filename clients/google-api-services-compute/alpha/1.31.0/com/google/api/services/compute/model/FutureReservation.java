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

package com.google.api.services.compute.model;

/**
 * Model definition for FutureReservation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FutureReservation extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] The creation timestamp for this future reservation in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the future
   * reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] A unique identifier for this future reservation. The server defines this
   * identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#futureReservation for future reservations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Name prefix for the reservations to be created at the time of delivery. The name prefix must
   * comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created
   * reservations name format will be -date-####.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namePrefix;

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * List of Projects/Folders to share with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShareSettings shareSettings;

  /**
   * Future Reservation configuration to indicate instance properties and total count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationSpecificSKUProperties specificSkuProperties;

  /**
   * [Output only] Status of the Future Reservation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationStatus status;

  /**
   * Time window for this Future Reservation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FutureReservationTimeWindow timeWindow;

  /**
   * [Output Only] URL of the Zone where this future reservation resides.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * [Output Only] The creation timestamp for this future reservation in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] The creation timestamp for this future reservation in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public FutureReservation setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the future
   * reservation.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the future
   * reservation.
   * @param description description or {@code null} for none
   */
  public FutureReservation setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] A unique identifier for this future reservation. The server defines this
   * identifier.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] A unique identifier for this future reservation. The server defines this
   * identifier.
   * @param id id or {@code null} for none
   */
  public FutureReservation setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#futureReservation for future reservations.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#futureReservation for future reservations.
   * @param kind kind or {@code null} for none
   */
  public FutureReservation setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the resource, provided by the client when initially creating the resource. The
   * resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name
   * must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`
   * which means the first character must be a lowercase letter, and all following characters must
   * be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public FutureReservation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Name prefix for the reservations to be created at the time of delivery. The name prefix must
   * comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created
   * reservations name format will be -date-####.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamePrefix() {
    return namePrefix;
  }

  /**
   * Name prefix for the reservations to be created at the time of delivery. The name prefix must
   * comply with RFC1035. Maximum allowed length for name prefix is 20. Automatically created
   * reservations name format will be -date-####.
   * @param namePrefix namePrefix or {@code null} for none
   */
  public FutureReservation setNamePrefix(java.lang.String namePrefix) {
    this.namePrefix = namePrefix;
    return this;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined fully-qualified URL for this resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public FutureReservation setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public FutureReservation setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * List of Projects/Folders to share with.
   * @return value or {@code null} for none
   */
  public ShareSettings getShareSettings() {
    return shareSettings;
  }

  /**
   * List of Projects/Folders to share with.
   * @param shareSettings shareSettings or {@code null} for none
   */
  public FutureReservation setShareSettings(ShareSettings shareSettings) {
    this.shareSettings = shareSettings;
    return this;
  }

  /**
   * Future Reservation configuration to indicate instance properties and total count.
   * @return value or {@code null} for none
   */
  public FutureReservationSpecificSKUProperties getSpecificSkuProperties() {
    return specificSkuProperties;
  }

  /**
   * Future Reservation configuration to indicate instance properties and total count.
   * @param specificSkuProperties specificSkuProperties or {@code null} for none
   */
  public FutureReservation setSpecificSkuProperties(FutureReservationSpecificSKUProperties specificSkuProperties) {
    this.specificSkuProperties = specificSkuProperties;
    return this;
  }

  /**
   * [Output only] Status of the Future Reservation
   * @return value or {@code null} for none
   */
  public FutureReservationStatus getStatus() {
    return status;
  }

  /**
   * [Output only] Status of the Future Reservation
   * @param status status or {@code null} for none
   */
  public FutureReservation setStatus(FutureReservationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Time window for this Future Reservation.
   * @return value or {@code null} for none
   */
  public FutureReservationTimeWindow getTimeWindow() {
    return timeWindow;
  }

  /**
   * Time window for this Future Reservation.
   * @param timeWindow timeWindow or {@code null} for none
   */
  public FutureReservation setTimeWindow(FutureReservationTimeWindow timeWindow) {
    this.timeWindow = timeWindow;
    return this;
  }

  /**
   * [Output Only] URL of the Zone where this future reservation resides.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * [Output Only] URL of the Zone where this future reservation resides.
   * @param zone zone or {@code null} for none
   */
  public FutureReservation setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public FutureReservation set(String fieldName, Object value) {
    return (FutureReservation) super.set(fieldName, value);
  }

  @Override
  public FutureReservation clone() {
    return (FutureReservation) super.clone();
  }

}
