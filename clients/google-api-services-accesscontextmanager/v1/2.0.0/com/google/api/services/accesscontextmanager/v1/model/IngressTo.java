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

package com.google.api.services.accesscontextmanager.v1.model;

/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on
 * information about the ApiOperation intended to be performed on the target resource of the
 * request. The request must satisfy what is defined in `operations` AND `resources` in order to
 * match.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Access Context Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IngressTo extends com.google.api.client.json.GenericJson {

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in corresponding
   * IngressFrom in this ServicePerimeter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ApiOperation> operations;

  static {
    // hack to force ProGuard to consider ApiOperation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ApiOperation.class);
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, protected by this
   * ServicePerimeter that are allowed to be accessed by sources defined in the corresponding
   * IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter
   * are allowed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> resources;

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in corresponding
   * IngressFrom in this ServicePerimeter.
   * @return value or {@code null} for none
   */
  public java.util.List<ApiOperation> getOperations() {
    return operations;
  }

  /**
   * A list of ApiOperations allowed to be performed by the sources specified in corresponding
   * IngressFrom in this ServicePerimeter.
   * @param operations operations or {@code null} for none
   */
  public IngressTo setOperations(java.util.List<ApiOperation> operations) {
    this.operations = operations;
    return this;
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, protected by this
   * ServicePerimeter that are allowed to be accessed by sources defined in the corresponding
   * IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter
   * are allowed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getResources() {
    return resources;
  }

  /**
   * A list of resources, currently only projects in the form `projects/`, protected by this
   * ServicePerimeter that are allowed to be accessed by sources defined in the corresponding
   * IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter
   * are allowed.
   * @param resources resources or {@code null} for none
   */
  public IngressTo setResources(java.util.List<java.lang.String> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public IngressTo set(String fieldName, Object value) {
    return (IngressTo) super.set(fieldName, value);
  }

  @Override
  public IngressTo clone() {
    return (IngressTo) super.clone();
  }

}
