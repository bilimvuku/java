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
 * A Dataproc OSS metric.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Metric extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Specify one or more available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for
   * the metric course (for the SPARK metric source, any Spark metric
   * (https://spark.apache.org/docs/latest/monitoring.html#metrics) can be specified).Provide
   * metrics in the following format: METRIC_SOURCE: INSTANCE:GROUP:METRIC Use camelcase as
   * appropriate.Examples: yarn:ResourceManager:QueueMetrics:AppsCompleted
   * spark:driver:DAGScheduler:job.allJobs
   * sparkHistoryServer:JVM:Memory:NonHeapMemoryUsage.committed
   * hiveserver2:JVM:Memory:NonHeapMemoryUsage.used Notes: Only the specified overridden metrics
   * will be collected for the metric source. For example, if one or more spark:executive metrics
   * are listed as metric overrides, other SPARK metrics will not be collected. The collection of
   * the default metrics for other OSS metric sources is unaffected. For example, if both SPARK andd
   * YARN metric sources are enabled, and overrides are provided for Spark metrics only, all default
   * YARN metrics will be collected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> metricOverrides;

  /**
   * Required. Default metrics are collected unless metricOverrides are specified for the metric
   * source (see Available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) for more
   * information).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricSource;

  /**
   * Optional. Specify one or more available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for
   * the metric course (for the SPARK metric source, any Spark metric
   * (https://spark.apache.org/docs/latest/monitoring.html#metrics) can be specified).Provide
   * metrics in the following format: METRIC_SOURCE: INSTANCE:GROUP:METRIC Use camelcase as
   * appropriate.Examples: yarn:ResourceManager:QueueMetrics:AppsCompleted
   * spark:driver:DAGScheduler:job.allJobs
   * sparkHistoryServer:JVM:Memory:NonHeapMemoryUsage.committed
   * hiveserver2:JVM:Memory:NonHeapMemoryUsage.used Notes: Only the specified overridden metrics
   * will be collected for the metric source. For example, if one or more spark:executive metrics
   * are listed as metric overrides, other SPARK metrics will not be collected. The collection of
   * the default metrics for other OSS metric sources is unaffected. For example, if both SPARK andd
   * YARN metric sources are enabled, and overrides are provided for Spark metrics only, all default
   * YARN metrics will be collected.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMetricOverrides() {
    return metricOverrides;
  }

  /**
   * Optional. Specify one or more available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) to collect for
   * the metric course (for the SPARK metric source, any Spark metric
   * (https://spark.apache.org/docs/latest/monitoring.html#metrics) can be specified).Provide
   * metrics in the following format: METRIC_SOURCE: INSTANCE:GROUP:METRIC Use camelcase as
   * appropriate.Examples: yarn:ResourceManager:QueueMetrics:AppsCompleted
   * spark:driver:DAGScheduler:job.allJobs
   * sparkHistoryServer:JVM:Memory:NonHeapMemoryUsage.committed
   * hiveserver2:JVM:Memory:NonHeapMemoryUsage.used Notes: Only the specified overridden metrics
   * will be collected for the metric source. For example, if one or more spark:executive metrics
   * are listed as metric overrides, other SPARK metrics will not be collected. The collection of
   * the default metrics for other OSS metric sources is unaffected. For example, if both SPARK andd
   * YARN metric sources are enabled, and overrides are provided for Spark metrics only, all default
   * YARN metrics will be collected.
   * @param metricOverrides metricOverrides or {@code null} for none
   */
  public Metric setMetricOverrides(java.util.List<java.lang.String> metricOverrides) {
    this.metricOverrides = metricOverrides;
    return this;
  }

  /**
   * Required. Default metrics are collected unless metricOverrides are specified for the metric
   * source (see Available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) for more
   * information).
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricSource() {
    return metricSource;
  }

  /**
   * Required. Default metrics are collected unless metricOverrides are specified for the metric
   * source (see Available OSS metrics
   * (https://cloud.google.com/dataproc/docs/guides/monitoring#available_oss_metrics) for more
   * information).
   * @param metricSource metricSource or {@code null} for none
   */
  public Metric setMetricSource(java.lang.String metricSource) {
    this.metricSource = metricSource;
    return this;
  }

  @Override
  public Metric set(String fieldName, Object value) {
    return (Metric) super.set(fieldName, value);
  }

  @Override
  public Metric clone() {
    return (Metric) super.clone();
  }

}
