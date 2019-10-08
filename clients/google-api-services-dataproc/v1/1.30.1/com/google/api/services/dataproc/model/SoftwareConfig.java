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

package com.google.api.services.dataproc.model;

/**
 * Specifies the selection and config of software inside the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SoftwareConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The version of software inside the cluster. It must be one of the supported Cloud
   * Dataproc Versions, such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * "preview" version. If unspecified, it defaults to the latest Debian version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageVersion;

  /**
   * Optional. The set of components to activate on the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> optionalComponents;

  /**
   * Optional. The properties to set on daemon config files.Property keys are specified in
   * prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes
   * and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp:
   * distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig:
   * pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster
   * properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> properties;

  /**
   * Optional. The version of software inside the cluster. It must be one of the supported Cloud
   * Dataproc Versions, such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * "preview" version. If unspecified, it defaults to the latest Debian version.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageVersion() {
    return imageVersion;
  }

  /**
   * Optional. The version of software inside the cluster. It must be one of the supported Cloud
   * Dataproc Versions, such as "1.2" (including a subminor version, such as "1.2.29"), or the
   * "preview" version. If unspecified, it defaults to the latest Debian version.
   * @param imageVersion imageVersion or {@code null} for none
   */
  public SoftwareConfig setImageVersion(java.lang.String imageVersion) {
    this.imageVersion = imageVersion;
    return this;
  }

  /**
   * Optional. The set of components to activate on the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOptionalComponents() {
    return optionalComponents;
  }

  /**
   * Optional. The set of components to activate on the cluster.
   * @param optionalComponents optionalComponents or {@code null} for none
   */
  public SoftwareConfig setOptionalComponents(java.util.List<java.lang.String> optionalComponents) {
    this.optionalComponents = optionalComponents;
    return this;
  }

  /**
   * Optional. The properties to set on daemon config files.Property keys are specified in
   * prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes
   * and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp:
   * distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig:
   * pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster
   * properties.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getProperties() {
    return properties;
  }

  /**
   * Optional. The properties to set on daemon config files.Property keys are specified in
   * prefix:property format, for example core:hadoop.tmp.dir. The following are supported prefixes
   * and their mappings: capacity-scheduler: capacity-scheduler.xml core: core-site.xml distcp:
   * distcp-default.xml hdfs: hdfs-site.xml hive: hive-site.xml mapred: mapred-site.xml pig:
   * pig.properties spark: spark-defaults.conf yarn: yarn-site.xmlFor more information, see Cluster
   * properties.
   * @param properties properties or {@code null} for none
   */
  public SoftwareConfig setProperties(java.util.Map<String, java.lang.String> properties) {
    this.properties = properties;
    return this;
  }

  @Override
  public SoftwareConfig set(String fieldName, Object value) {
    return (SoftwareConfig) super.set(fieldName, value);
  }

  @Override
  public SoftwareConfig clone() {
    return (SoftwareConfig) super.clone();
  }

}
