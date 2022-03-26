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

package com.google.api.services.networkservices.v1beta1.model;

/**
 * RouteMatch defines specifications used to match requests. If multiple match types are set, this
 * RouteMatch will match if ALL type of matches are matched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HttpRouteRouteMatch extends com.google.api.client.json.GenericJson {

  /**
   * The HTTP request path value should exactly match this value. Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fullPathMatch;

  /**
   * Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be
   * matched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpRouteHeaderMatch> headers;

  static {
    // hack to force ProGuard to consider HttpRouteHeaderMatch used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpRouteHeaderMatch.class);
  }

  /**
   * Specifies if prefix_match and full_path_match matches are case sensitive. The default value is
   * false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean ignoreCase;

  /**
   * The HTTP request path value must begin with specified prefix_match. prefix_match must begin
   * with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prefixMatch;

  /**
   * Specifies a list of query parameters to match against. ALL of the query parameters must be
   * matched.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<HttpRouteQueryParameterMatch> queryParameters;

  static {
    // hack to force ProGuard to consider HttpRouteQueryParameterMatch used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(HttpRouteQueryParameterMatch.class);
  }

  /**
   * The HTTP request path value must satisfy the regular expression specified by regex_match after
   * removing any query parameters and anchor supplied with the original URL. For regular expression
   * grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regexMatch;

  /**
   * The HTTP request path value should exactly match this value. Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getFullPathMatch() {
    return fullPathMatch;
  }

  /**
   * The HTTP request path value should exactly match this value. Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * @param fullPathMatch fullPathMatch or {@code null} for none
   */
  public HttpRouteRouteMatch setFullPathMatch(java.lang.String fullPathMatch) {
    this.fullPathMatch = fullPathMatch;
    return this;
  }

  /**
   * Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be
   * matched.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpRouteHeaderMatch> getHeaders() {
    return headers;
  }

  /**
   * Specifies a list of HTTP request headers to match against. ALL of the supplied headers must be
   * matched.
   * @param headers headers or {@code null} for none
   */
  public HttpRouteRouteMatch setHeaders(java.util.List<HttpRouteHeaderMatch> headers) {
    this.headers = headers;
    return this;
  }

  /**
   * Specifies if prefix_match and full_path_match matches are case sensitive. The default value is
   * false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIgnoreCase() {
    return ignoreCase;
  }

  /**
   * Specifies if prefix_match and full_path_match matches are case sensitive. The default value is
   * false.
   * @param ignoreCase ignoreCase or {@code null} for none
   */
  public HttpRouteRouteMatch setIgnoreCase(java.lang.Boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
    return this;
  }

  /**
   * The HTTP request path value must begin with specified prefix_match. prefix_match must begin
   * with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrefixMatch() {
    return prefixMatch;
  }

  /**
   * The HTTP request path value must begin with specified prefix_match. prefix_match must begin
   * with a /. Only one of full_path_match, prefix_match, or regex_match should be used.
   * @param prefixMatch prefixMatch or {@code null} for none
   */
  public HttpRouteRouteMatch setPrefixMatch(java.lang.String prefixMatch) {
    this.prefixMatch = prefixMatch;
    return this;
  }

  /**
   * Specifies a list of query parameters to match against. ALL of the query parameters must be
   * matched.
   * @return value or {@code null} for none
   */
  public java.util.List<HttpRouteQueryParameterMatch> getQueryParameters() {
    return queryParameters;
  }

  /**
   * Specifies a list of query parameters to match against. ALL of the query parameters must be
   * matched.
   * @param queryParameters queryParameters or {@code null} for none
   */
  public HttpRouteRouteMatch setQueryParameters(java.util.List<HttpRouteQueryParameterMatch> queryParameters) {
    this.queryParameters = queryParameters;
    return this;
  }

  /**
   * The HTTP request path value must satisfy the regular expression specified by regex_match after
   * removing any query parameters and anchor supplied with the original URL. For regular expression
   * grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegexMatch() {
    return regexMatch;
  }

  /**
   * The HTTP request path value must satisfy the regular expression specified by regex_match after
   * removing any query parameters and anchor supplied with the original URL. For regular expression
   * grammar, please see https://github.com/google/re2/wiki/Syntax Only one of full_path_match,
   * prefix_match, or regex_match should be used.
   * @param regexMatch regexMatch or {@code null} for none
   */
  public HttpRouteRouteMatch setRegexMatch(java.lang.String regexMatch) {
    this.regexMatch = regexMatch;
    return this;
  }

  @Override
  public HttpRouteRouteMatch set(String fieldName, Object value) {
    return (HttpRouteRouteMatch) super.set(fieldName, value);
  }

  @Override
  public HttpRouteRouteMatch clone() {
    return (HttpRouteRouteMatch) super.clone();
  }

}