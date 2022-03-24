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
 * Status of program and region.
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
public final class ShoppingAdsProgramStatusRegionStatus extends com.google.api.client.json.GenericJson {

  /**
   * Date your `eligibilityStatus` will become `DISAPPROVED`. Only visible when your
   * `eligibilityStatus` is `WARNING`. In [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DD`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String disapprovalDate;

  /**
   * Eligibility status of the Shopping Ads program.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eligibilityStatus;

  /**
   * Must be fixed to be eligible for review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> onboardingIssues;

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> regionCodes;

  /**
   * If a program is eligible for review in a specific region. Only visible if `eligibilityStatus`
   * is `DISAPPROVED`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewEligibilityStatus;

  /**
   * Review ineligibility reason if account is not eligible for review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewIneligibilityReason;

  /**
   * Reason a program in a specific region isn’t eligible for review. Only visible if
   * `reviewEligibilityStatus` is `INELIGIBLE`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reviewIneligibilityReasonDescription;

  /**
   * Additional information for ineligibility. If `reviewIneligibilityReason` is
   * `IN_COOLDOWN_PERIOD`, a timestamp for the end of the cooldown period is provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShoppingAdsProgramStatusReviewIneligibilityReasonDetails reviewIneligibilityReasonDetails;

  /**
   * Issues evaluated in the review process. Fix all issues before requesting a review.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> reviewIssues;

  /**
   * Date your `eligibilityStatus` will become `DISAPPROVED`. Only visible when your
   * `eligibilityStatus` is `WARNING`. In [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DD`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisapprovalDate() {
    return disapprovalDate;
  }

  /**
   * Date your `eligibilityStatus` will become `DISAPPROVED`. Only visible when your
   * `eligibilityStatus` is `WARNING`. In [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format:
   * `YYYY-MM-DD`.
   * @param disapprovalDate disapprovalDate or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setDisapprovalDate(java.lang.String disapprovalDate) {
    this.disapprovalDate = disapprovalDate;
    return this;
  }

  /**
   * Eligibility status of the Shopping Ads program.
   * @return value or {@code null} for none
   */
  public java.lang.String getEligibilityStatus() {
    return eligibilityStatus;
  }

  /**
   * Eligibility status of the Shopping Ads program.
   * @param eligibilityStatus eligibilityStatus or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setEligibilityStatus(java.lang.String eligibilityStatus) {
    this.eligibilityStatus = eligibilityStatus;
    return this;
  }

  /**
   * Must be fixed to be eligible for review.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOnboardingIssues() {
    return onboardingIssues;
  }

  /**
   * Must be fixed to be eligible for review.
   * @param onboardingIssues onboardingIssues or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setOnboardingIssues(java.util.List<java.lang.String> onboardingIssues) {
    this.onboardingIssues = onboardingIssues;
    return this;
  }

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getRegionCodes() {
    return regionCodes;
  }

  /**
   * The two-letter [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) codes for
   * all the regions with the same `eligibilityStatus` and `reviewEligibility`.
   * @param regionCodes regionCodes or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setRegionCodes(java.util.List<java.lang.String> regionCodes) {
    this.regionCodes = regionCodes;
    return this;
  }

  /**
   * If a program is eligible for review in a specific region. Only visible if `eligibilityStatus`
   * is `DISAPPROVED`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewEligibilityStatus() {
    return reviewEligibilityStatus;
  }

  /**
   * If a program is eligible for review in a specific region. Only visible if `eligibilityStatus`
   * is `DISAPPROVED`.
   * @param reviewEligibilityStatus reviewEligibilityStatus or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewEligibilityStatus(java.lang.String reviewEligibilityStatus) {
    this.reviewEligibilityStatus = reviewEligibilityStatus;
    return this;
  }

  /**
   * Review ineligibility reason if account is not eligible for review.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewIneligibilityReason() {
    return reviewIneligibilityReason;
  }

  /**
   * Review ineligibility reason if account is not eligible for review.
   * @param reviewIneligibilityReason reviewIneligibilityReason or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReason(java.lang.String reviewIneligibilityReason) {
    this.reviewIneligibilityReason = reviewIneligibilityReason;
    return this;
  }

  /**
   * Reason a program in a specific region isn’t eligible for review. Only visible if
   * `reviewEligibilityStatus` is `INELIGIBLE`.
   * @return value or {@code null} for none
   */
  public java.lang.String getReviewIneligibilityReasonDescription() {
    return reviewIneligibilityReasonDescription;
  }

  /**
   * Reason a program in a specific region isn’t eligible for review. Only visible if
   * `reviewEligibilityStatus` is `INELIGIBLE`.
   * @param reviewIneligibilityReasonDescription reviewIneligibilityReasonDescription or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReasonDescription(java.lang.String reviewIneligibilityReasonDescription) {
    this.reviewIneligibilityReasonDescription = reviewIneligibilityReasonDescription;
    return this;
  }

  /**
   * Additional information for ineligibility. If `reviewIneligibilityReason` is
   * `IN_COOLDOWN_PERIOD`, a timestamp for the end of the cooldown period is provided.
   * @return value or {@code null} for none
   */
  public ShoppingAdsProgramStatusReviewIneligibilityReasonDetails getReviewIneligibilityReasonDetails() {
    return reviewIneligibilityReasonDetails;
  }

  /**
   * Additional information for ineligibility. If `reviewIneligibilityReason` is
   * `IN_COOLDOWN_PERIOD`, a timestamp for the end of the cooldown period is provided.
   * @param reviewIneligibilityReasonDetails reviewIneligibilityReasonDetails or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIneligibilityReasonDetails(ShoppingAdsProgramStatusReviewIneligibilityReasonDetails reviewIneligibilityReasonDetails) {
    this.reviewIneligibilityReasonDetails = reviewIneligibilityReasonDetails;
    return this;
  }

  /**
   * Issues evaluated in the review process. Fix all issues before requesting a review.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getReviewIssues() {
    return reviewIssues;
  }

  /**
   * Issues evaluated in the review process. Fix all issues before requesting a review.
   * @param reviewIssues reviewIssues or {@code null} for none
   */
  public ShoppingAdsProgramStatusRegionStatus setReviewIssues(java.util.List<java.lang.String> reviewIssues) {
    this.reviewIssues = reviewIssues;
    return this;
  }

  @Override
  public ShoppingAdsProgramStatusRegionStatus set(String fieldName, Object value) {
    return (ShoppingAdsProgramStatusRegionStatus) super.set(fieldName, value);
  }

  @Override
  public ShoppingAdsProgramStatusRegionStatus clone() {
    return (ShoppingAdsProgramStatusRegionStatus) super.clone();
  }

}
