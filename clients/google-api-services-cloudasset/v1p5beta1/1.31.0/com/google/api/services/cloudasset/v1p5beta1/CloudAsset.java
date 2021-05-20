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

package com.google.api.services.cloudasset.v1p5beta1;

/**
 * Service definition for CloudAsset (v1p5beta1).
 *
 * <p>
 * The cloud asset API manages the history and inventory of cloud resources.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/asset-inventory/docs/quickstart" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudAssetRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudAsset extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.0 of the Cloud Asset API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudasset.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://cloudasset.mtls.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public CloudAsset(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudAsset(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Assets collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudAsset cloudasset = new CloudAsset(...);}
   *   {@code CloudAsset.Assets.List request = cloudasset.assets().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Assets assets() {
    return new Assets();
  }

  /**
   * The "assets" collection of methods.
   */
  public class Assets {

    /**
     * Lists assets with time and resource types and returns paged results in response.
     *
     * Create a request for the method "assets.list".
     *
     * This request holds the parameters needed by the cloudasset server.  After setting any optional
     * parameters, call the {@link List#execute()} method to invoke the remote operation.
     *
     * @param parent Required. Name of the organization or project the assets belong to. Format: "organizations
     *        /[organization-number]" (such as "organizations/123"), "projects/[project-id]" (such as
     *        "projects/my-project-id"), or "projects/[project-number]" (such as "projects/12345").
     * @return the request
     */
    public List list(java.lang.String parent) throws java.io.IOException {
      List result = new List(parent);
      initialize(result);
      return result;
    }

    public class List extends CloudAssetRequest<com.google.api.services.cloudasset.v1p5beta1.model.ListAssetsResponse> {

      private static final String REST_PATH = "v1p5beta1/{+parent}/assets";

      private final java.util.regex.Pattern PARENT_PATTERN =
          java.util.regex.Pattern.compile("^[^/]+/[^/]+$");

      /**
       * Lists assets with time and resource types and returns paged results in response.
       *
       * Create a request for the method "assets.list".
       *
       * This request holds the parameters needed by the the cloudasset server.  After setting any
       * optional parameters, call the {@link List#execute()} method to invoke the remote operation. <p>
       * {@link List#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
       * must be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param parent Required. Name of the organization or project the assets belong to. Format: "organizations
     *        /[organization-number]" (such as "organizations/123"), "projects/[project-id]" (such as
     *        "projects/my-project-id"), or "projects/[project-number]" (such as "projects/12345").
       * @since 1.13
       */
      protected List(java.lang.String parent) {
        super(CloudAsset.this, "GET", REST_PATH, null, com.google.api.services.cloudasset.v1p5beta1.model.ListAssetsResponse.class);
        this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
      }

      @Override
      public com.google.api.client.http.HttpResponse executeUsingHead() throws java.io.IOException {
        return super.executeUsingHead();
      }

      @Override
      public com.google.api.client.http.HttpRequest buildHttpRequestUsingHead() throws java.io.IOException {
        return super.buildHttpRequestUsingHead();
      }

      @Override
      public List set$Xgafv(java.lang.String $Xgafv) {
        return (List) super.set$Xgafv($Xgafv);
      }

      @Override
      public List setAccessToken(java.lang.String accessToken) {
        return (List) super.setAccessToken(accessToken);
      }

      @Override
      public List setAlt(java.lang.String alt) {
        return (List) super.setAlt(alt);
      }

      @Override
      public List setCallback(java.lang.String callback) {
        return (List) super.setCallback(callback);
      }

      @Override
      public List setFields(java.lang.String fields) {
        return (List) super.setFields(fields);
      }

      @Override
      public List setKey(java.lang.String key) {
        return (List) super.setKey(key);
      }

      @Override
      public List setOauthToken(java.lang.String oauthToken) {
        return (List) super.setOauthToken(oauthToken);
      }

      @Override
      public List setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (List) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public List setQuotaUser(java.lang.String quotaUser) {
        return (List) super.setQuotaUser(quotaUser);
      }

      @Override
      public List setUploadType(java.lang.String uploadType) {
        return (List) super.setUploadType(uploadType);
      }

      @Override
      public List setUploadProtocol(java.lang.String uploadProtocol) {
        return (List) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Required. Name of the organization or project the assets belong to. Format: "organizations
       * /[organization-number]" (such as "organizations/123"), "projects/[project-id]" (such as
       * "projects/my-project-id"), or "projects/[project-number]" (such as "projects/12345").
       */
      @com.google.api.client.util.Key
      private java.lang.String parent;

      /** Required. Name of the organization or project the assets belong to. Format: "organizations
     /[organization-number]" (such as "organizations/123"), "projects/[project-id]" (such as "projects
     /my-project-id"), or "projects/[project-number]" (such as "projects/12345").
       */
      public java.lang.String getParent() {
        return parent;
      }

      /**
       * Required. Name of the organization or project the assets belong to. Format: "organizations
       * /[organization-number]" (such as "organizations/123"), "projects/[project-id]" (such as
       * "projects/my-project-id"), or "projects/[project-number]" (such as "projects/12345").
       */
      public List setParent(java.lang.String parent) {
        if (!getSuppressPatternChecks()) {
          com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
              "Parameter parent must conform to the pattern " +
              "^[^/]+/[^/]+$");
        }
        this.parent = parent;
        return this;
      }

      /**
       * A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk".
       * Regular expression is also supported. For example: * "compute.googleapis.com.*" snapshots
       * resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots
       * resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose
       * asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for
       * all supported regular expression syntax. If the regular expression does not match any
       * supported asset type, an INVALID_ARGUMENT error will be returned. If specified, only
       * matching assets will be returned, otherwise, it will snapshot all asset types. See
       * [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-
       * inventory/docs/overview) for all supported asset types.
       */
      @com.google.api.client.util.Key
      private java.util.List<java.lang.String> assetTypes;

      /** A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk". Regular
     expression is also supported. For example: * "compute.googleapis.com.*" snapshots resources whose
     asset type starts with "compute.googleapis.com". * ".*Instance" snapshots resources whose asset
     type ends with "Instance". * ".*Instance.*" snapshots resources whose asset type contains
     "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for all supported regular
     expression syntax. If the regular expression does not match any supported asset type, an
     INVALID_ARGUMENT error will be returned. If specified, only matching assets will be returned,
     otherwise, it will snapshot all asset types. See [Introduction to Cloud Asset
     Inventory](https://cloud.google.com/asset-inventory/docs/overview) for all supported asset types.
       */
      public java.util.List<java.lang.String> getAssetTypes() {
        return assetTypes;
      }

      /**
       * A list of asset types to take a snapshot for. For example: "compute.googleapis.com/Disk".
       * Regular expression is also supported. For example: * "compute.googleapis.com.*" snapshots
       * resources whose asset type starts with "compute.googleapis.com". * ".*Instance" snapshots
       * resources whose asset type ends with "Instance". * ".*Instance.*" snapshots resources whose
       * asset type contains "Instance". See [RE2](https://github.com/google/re2/wiki/Syntax) for
       * all supported regular expression syntax. If the regular expression does not match any
       * supported asset type, an INVALID_ARGUMENT error will be returned. If specified, only
       * matching assets will be returned, otherwise, it will snapshot all asset types. See
       * [Introduction to Cloud Asset Inventory](https://cloud.google.com/asset-
       * inventory/docs/overview) for all supported asset types.
       */
      public List setAssetTypes(java.util.List<java.lang.String> assetTypes) {
        this.assetTypes = assetTypes;
        return this;
      }

      /** Asset content type. If not specified, no content but the asset name will be returned. */
      @com.google.api.client.util.Key
      private java.lang.String contentType;

      /** Asset content type. If not specified, no content but the asset name will be returned.
       */
      public java.lang.String getContentType() {
        return contentType;
      }

      /** Asset content type. If not specified, no content but the asset name will be returned. */
      public List setContentType(java.lang.String contentType) {
        this.contentType = contentType;
        return this;
      }

      /**
       * The maximum number of assets to be returned in a single response. Default is 100, minimum
       * is 1, and maximum is 1000.
       */
      @com.google.api.client.util.Key
      private java.lang.Integer pageSize;

      /** The maximum number of assets to be returned in a single response. Default is 100, minimum is 1, and
     maximum is 1000.
       */
      public java.lang.Integer getPageSize() {
        return pageSize;
      }

      /**
       * The maximum number of assets to be returned in a single response. Default is 100, minimum
       * is 1, and maximum is 1000.
       */
      public List setPageSize(java.lang.Integer pageSize) {
        this.pageSize = pageSize;
        return this;
      }

      /**
       * The `next_page_token` returned from the previous `ListAssetsResponse`, or unspecified for
       * the first `ListAssetsRequest`. It is a continuation of a prior `ListAssets` call, and the
       * API should return the next page of assets.
       */
      @com.google.api.client.util.Key
      private java.lang.String pageToken;

      /** The `next_page_token` returned from the previous `ListAssetsResponse`, or unspecified for the first
     `ListAssetsRequest`. It is a continuation of a prior `ListAssets` call, and the API should return
     the next page of assets.
       */
      public java.lang.String getPageToken() {
        return pageToken;
      }

      /**
       * The `next_page_token` returned from the previous `ListAssetsResponse`, or unspecified for
       * the first `ListAssetsRequest`. It is a continuation of a prior `ListAssets` call, and the
       * API should return the next page of assets.
       */
      public List setPageToken(java.lang.String pageToken) {
        this.pageToken = pageToken;
        return this;
      }

      /**
       * Timestamp to take an asset snapshot. This can only be set to a timestamp between the
       * current time and the current time minus 35 days (inclusive). If not specified, the current
       * time will be used. Due to delays in resource data collection and indexing, there is a
       * volatile window during which running the same query may get different results.
       */
      @com.google.api.client.util.Key
      private String readTime;

      /** Timestamp to take an asset snapshot. This can only be set to a timestamp between the current time
     and the current time minus 35 days (inclusive). If not specified, the current time will be used.
     Due to delays in resource data collection and indexing, there is a volatile window during which
     running the same query may get different results.
       */
      public String getReadTime() {
        return readTime;
      }

      /**
       * Timestamp to take an asset snapshot. This can only be set to a timestamp between the
       * current time and the current time minus 35 days (inclusive). If not specified, the current
       * time will be used. Due to delays in resource data collection and indexing, there is a
       * volatile window during which running the same query may get different results.
       */
      public List setReadTime(String readTime) {
        this.readTime = readTime;
        return this;
      }

      @Override
      public List set(String parameterName, Object value) {
        return (List) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link CloudAsset}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudAsset}. */
    @Override
    public CloudAsset build() {
      return new CloudAsset(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link CloudAssetRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudAssetRequestInitializer(
        CloudAssetRequestInitializer cloudassetRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudassetRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
