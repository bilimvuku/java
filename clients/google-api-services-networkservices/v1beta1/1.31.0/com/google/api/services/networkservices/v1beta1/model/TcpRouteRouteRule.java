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
 * Specifies how to match traffic and how to route traffic when traffic is matched.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Services API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TcpRouteRouteRule extends com.google.api.client.json.GenericJson {

  /**
   * Required. The detailed rule defining how to route matched traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TcpRouteRouteAction action;

  /**
   * Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple
   * match types are "OR"ed for evaluation. If no routeMatch field is specified, this rule will
   * unconditionally match traffic.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TcpRouteRouteMatch> matches;

  static {
    // hack to force ProGuard to consider TcpRouteRouteMatch used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TcpRouteRouteMatch.class);
  }

  /**
   * Required. The detailed rule defining how to route matched traffic.
   * @return value or {@code null} for none
   */
  public TcpRouteRouteAction getAction() {
    return action;
  }

  /**
   * Required. The detailed rule defining how to route matched traffic.
   * @param action action or {@code null} for none
   */
  public TcpRouteRouteRule setAction(TcpRouteRouteAction action) {
    this.action = action;
    return this;
  }

  /**
   * Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple
   * match types are "OR"ed for evaluation. If no routeMatch field is specified, this rule will
   * unconditionally match traffic.
   * @return value or {@code null} for none
   */
  public java.util.List<TcpRouteRouteMatch> getMatches() {
    return matches;
  }

  /**
   * Optional. RouteMatch defines the predicate used to match requests to a given action. Multiple
   * match types are "OR"ed for evaluation. If no routeMatch field is specified, this rule will
   * unconditionally match traffic.
   * @param matches matches or {@code null} for none
   */
  public TcpRouteRouteRule setMatches(java.util.List<TcpRouteRouteMatch> matches) {
    this.matches = matches;
    return this;
  }

  @Override
  public TcpRouteRouteRule set(String fieldName, Object value) {
    return (TcpRouteRouteRule) super.set(fieldName, value);
  }

  @Override
  public TcpRouteRouteRule clone() {
    return (TcpRouteRouteRule) super.clone();
  }

}