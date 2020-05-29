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

package com.google.api.services.youtube.model;

/**
 * Model definition for SponsorSnippet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API v3. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SponsorSnippet extends com.google.api.client.json.GenericJson {

  /**
   * The id of the channel being sponsored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelId;

  /**
   * The cumulative time a user has been a sponsor in months.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer cumulativeDurationMonths;

  /**
   * Details about the sponsor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ChannelProfileDetails sponsorDetails;

  /**
   * The date and time when the user became a sponsor. The value is specified in ISO 8601 (`YYYY-MM-
   * DDThh:mm:ss.sZ`) format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sponsorSince;

  /**
   * The id of the channel being sponsored.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelId() {
    return channelId;
  }

  /**
   * The id of the channel being sponsored.
   * @param channelId channelId or {@code null} for none
   */
  public SponsorSnippet setChannelId(java.lang.String channelId) {
    this.channelId = channelId;
    return this;
  }

  /**
   * The cumulative time a user has been a sponsor in months.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCumulativeDurationMonths() {
    return cumulativeDurationMonths;
  }

  /**
   * The cumulative time a user has been a sponsor in months.
   * @param cumulativeDurationMonths cumulativeDurationMonths or {@code null} for none
   */
  public SponsorSnippet setCumulativeDurationMonths(java.lang.Integer cumulativeDurationMonths) {
    this.cumulativeDurationMonths = cumulativeDurationMonths;
    return this;
  }

  /**
   * Details about the sponsor.
   * @return value or {@code null} for none
   */
  public ChannelProfileDetails getSponsorDetails() {
    return sponsorDetails;
  }

  /**
   * Details about the sponsor.
   * @param sponsorDetails sponsorDetails or {@code null} for none
   */
  public SponsorSnippet setSponsorDetails(ChannelProfileDetails sponsorDetails) {
    this.sponsorDetails = sponsorDetails;
    return this;
  }

  /**
   * The date and time when the user became a sponsor. The value is specified in ISO 8601 (`YYYY-MM-
   * DDThh:mm:ss.sZ`) format.
   * @return value or {@code null} for none
   */
  public java.lang.String getSponsorSince() {
    return sponsorSince;
  }

  /**
   * The date and time when the user became a sponsor. The value is specified in ISO 8601 (`YYYY-MM-
   * DDThh:mm:ss.sZ`) format.
   * @param sponsorSince sponsorSince or {@code null} for none
   */
  public SponsorSnippet setSponsorSince(java.lang.String sponsorSince) {
    this.sponsorSince = sponsorSince;
    return this;
  }

  @Override
  public SponsorSnippet set(String fieldName, Object value) {
    return (SponsorSnippet) super.set(fieldName, value);
  }

  @Override
  public SponsorSnippet clone() {
    return (SponsorSnippet) super.clone();
  }

}
