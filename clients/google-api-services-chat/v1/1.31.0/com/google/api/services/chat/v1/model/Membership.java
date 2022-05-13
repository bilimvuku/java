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

package com.google.api.services.chat.v1.model;

/**
 * Represents a membership relation in Google Chat, such as whether a user or Chat app is invited
 * to, part of, or absent from a space.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Membership extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time of the membership, such as when a member joined or was invited
   * to join a space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * A Google Chat user or app. Format: `users/{user}` or `users/app` When `users/{user}`,
   * represents a [person](https://developers.google.com/people/api/rest/v1/people) in the People
   * API or a [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in
   * the Admin SDK Directory API. When `users/app`, represents a Chat app creating membership for
   * itself.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private User member;

  /**
   * Resource name of the membership. Format: spaces/{space}/members/{member}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. State of the membership.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The creation time of the membership, such as when a member joined or was invited
   * to join a space.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time of the membership, such as when a member joined or was invited
   * to join a space.
   * @param createTime createTime or {@code null} for none
   */
  public Membership setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * A Google Chat user or app. Format: `users/{user}` or `users/app` When `users/{user}`,
   * represents a [person](https://developers.google.com/people/api/rest/v1/people) in the People
   * API or a [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in
   * the Admin SDK Directory API. When `users/app`, represents a Chat app creating membership for
   * itself.
   * @return value or {@code null} for none
   */
  public User getMember() {
    return member;
  }

  /**
   * A Google Chat user or app. Format: `users/{user}` or `users/app` When `users/{user}`,
   * represents a [person](https://developers.google.com/people/api/rest/v1/people) in the People
   * API or a [user](https://developers.google.com/admin-sdk/directory/reference/rest/v1/users) in
   * the Admin SDK Directory API. When `users/app`, represents a Chat app creating membership for
   * itself.
   * @param member member or {@code null} for none
   */
  public Membership setMember(User member) {
    this.member = member;
    return this;
  }

  /**
   * Resource name of the membership. Format: spaces/{space}/members/{member}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource name of the membership. Format: spaces/{space}/members/{member}
   * @param name name or {@code null} for none
   */
  public Membership setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. State of the membership.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. State of the membership.
   * @param state state or {@code null} for none
   */
  public Membership setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Membership set(String fieldName, Object value) {
    return (Membership) super.set(fieldName, value);
  }

  @Override
  public Membership clone() {
    return (Membership) super.clone();
  }

}
