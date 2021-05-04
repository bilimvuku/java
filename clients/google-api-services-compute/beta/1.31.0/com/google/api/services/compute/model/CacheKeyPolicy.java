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
 * Message containing what to include in the cache key for a request for Cloud CDN.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CacheKeyPolicy extends com.google.api.client.json.GenericJson {

  /**
   * If true, requests to different hosts will be cached separately.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeHost;

  /**
   * Allows HTTP request headers (by name) to be used in the cache key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeHttpHeaders;

  /**
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in
   * the cache key Cloud CDN generates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> includeNamedCookies;

  /**
   * If true, http and https requests will be cached separately.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeProtocol;

  /**
   * If true, include query string parameters in the cache key according to query_string_whitelist
   * and query_string_blacklist. If neither is set, the entire query string will be included. If
   * false, the query string will be excluded from the cache key entirely.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean includeQueryString;

  /**
   * Names of query string parameters to exclude in cache keys. All other parameters will be
   * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> queryStringBlacklist;

  /**
   * Names of query string parameters to include in cache keys. All other parameters will be
   * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> queryStringWhitelist;

  /**
   * If true, requests to different hosts will be cached separately.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeHost() {
    return includeHost;
  }

  /**
   * If true, requests to different hosts will be cached separately.
   * @param includeHost includeHost or {@code null} for none
   */
  public CacheKeyPolicy setIncludeHost(java.lang.Boolean includeHost) {
    this.includeHost = includeHost;
    return this;
  }

  /**
   * Allows HTTP request headers (by name) to be used in the cache key.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeHttpHeaders() {
    return includeHttpHeaders;
  }

  /**
   * Allows HTTP request headers (by name) to be used in the cache key.
   * @param includeHttpHeaders includeHttpHeaders or {@code null} for none
   */
  public CacheKeyPolicy setIncludeHttpHeaders(java.util.List<java.lang.String> includeHttpHeaders) {
    this.includeHttpHeaders = includeHttpHeaders;
    return this;
  }

  /**
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in
   * the cache key Cloud CDN generates.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIncludeNamedCookies() {
    return includeNamedCookies;
  }

  /**
   * Allows HTTP cookies (by name) to be used in the cache key. The name=value pair will be used in
   * the cache key Cloud CDN generates.
   * @param includeNamedCookies includeNamedCookies or {@code null} for none
   */
  public CacheKeyPolicy setIncludeNamedCookies(java.util.List<java.lang.String> includeNamedCookies) {
    this.includeNamedCookies = includeNamedCookies;
    return this;
  }

  /**
   * If true, http and https requests will be cached separately.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeProtocol() {
    return includeProtocol;
  }

  /**
   * If true, http and https requests will be cached separately.
   * @param includeProtocol includeProtocol or {@code null} for none
   */
  public CacheKeyPolicy setIncludeProtocol(java.lang.Boolean includeProtocol) {
    this.includeProtocol = includeProtocol;
    return this;
  }

  /**
   * If true, include query string parameters in the cache key according to query_string_whitelist
   * and query_string_blacklist. If neither is set, the entire query string will be included. If
   * false, the query string will be excluded from the cache key entirely.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIncludeQueryString() {
    return includeQueryString;
  }

  /**
   * If true, include query string parameters in the cache key according to query_string_whitelist
   * and query_string_blacklist. If neither is set, the entire query string will be included. If
   * false, the query string will be excluded from the cache key entirely.
   * @param includeQueryString includeQueryString or {@code null} for none
   */
  public CacheKeyPolicy setIncludeQueryString(java.lang.Boolean includeQueryString) {
    this.includeQueryString = includeQueryString;
    return this;
  }

  /**
   * Names of query string parameters to exclude in cache keys. All other parameters will be
   * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQueryStringBlacklist() {
    return queryStringBlacklist;
  }

  /**
   * Names of query string parameters to exclude in cache keys. All other parameters will be
   * included. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * @param queryStringBlacklist queryStringBlacklist or {@code null} for none
   */
  public CacheKeyPolicy setQueryStringBlacklist(java.util.List<java.lang.String> queryStringBlacklist) {
    this.queryStringBlacklist = queryStringBlacklist;
    return this;
  }

  /**
   * Names of query string parameters to include in cache keys. All other parameters will be
   * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getQueryStringWhitelist() {
    return queryStringWhitelist;
  }

  /**
   * Names of query string parameters to include in cache keys. All other parameters will be
   * excluded. Either specify query_string_whitelist or query_string_blacklist, not both. '&' and
   * '=' will be percent encoded and not treated as delimiters.
   * @param queryStringWhitelist queryStringWhitelist or {@code null} for none
   */
  public CacheKeyPolicy setQueryStringWhitelist(java.util.List<java.lang.String> queryStringWhitelist) {
    this.queryStringWhitelist = queryStringWhitelist;
    return this;
  }

  @Override
  public CacheKeyPolicy set(String fieldName, Object value) {
    return (CacheKeyPolicy) super.set(fieldName, value);
  }

  @Override
  public CacheKeyPolicy clone() {
    return (CacheKeyPolicy) super.clone();
  }

}
