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

package com.google.api.services.admob.v1.model;

/**
 * Groups data available after report generation, for example, warnings and row counts. Always sent
 * as the last message in the stream response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the AdMob API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReportFooter extends com.google.api.client.json.GenericJson {

  /**
   * Total number of rows that matched the request.
   *
   * Warning: This count does NOT always match the number of rows in the response. Do not make that
   * assumption when processing the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long matchingRowCount;

  /**
   * Warnings associated with generation of the report.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReportWarning> warnings;

  /**
   * Total number of rows that matched the request.
   *
   * Warning: This count does NOT always match the number of rows in the response. Do not make that
   * assumption when processing the response.
   * @return value or {@code null} for none
   */
  public java.lang.Long getMatchingRowCount() {
    return matchingRowCount;
  }

  /**
   * Total number of rows that matched the request.
   *
   * Warning: This count does NOT always match the number of rows in the response. Do not make that
   * assumption when processing the response.
   * @param matchingRowCount matchingRowCount or {@code null} for none
   */
  public ReportFooter setMatchingRowCount(java.lang.Long matchingRowCount) {
    this.matchingRowCount = matchingRowCount;
    return this;
  }

  /**
   * Warnings associated with generation of the report.
   * @return value or {@code null} for none
   */
  public java.util.List<ReportWarning> getWarnings() {
    return warnings;
  }

  /**
   * Warnings associated with generation of the report.
   * @param warnings warnings or {@code null} for none
   */
  public ReportFooter setWarnings(java.util.List<ReportWarning> warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public ReportFooter set(String fieldName, Object value) {
    return (ReportFooter) super.set(fieldName, value);
  }

  @Override
  public ReportFooter clone() {
    return (ReportFooter) super.clone();
  }

}
