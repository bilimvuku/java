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

package com.google.api.services.transcoder.v1beta1.model;

/**
 * Audio preprocessing configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Transcoder API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Audio extends com.google.api.client.json.GenericJson {

  /**
   * Enable boosting high frequency components. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean highBoost;

  /**
   * Enable boosting low frequency components. The default is `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean lowBoost;

  /**
   * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a
   * value between -24 and 0 (the default), where: * -24 is the Advanced Television Systems
   * Committee (ATSC A/85) standard * -23 is the EU R128 broadcast standard * -19 is the prior
   * standard for online mono audio * -18 is the ReplayGain standard * -16 is the prior standard for
   * stereo audio * -14 is the new online audio standard recommended by Spotify, as well as Amazon
   * Echo * 0 disables normalization
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lufs;

  /**
   * Enable boosting high frequency components. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHighBoost() {
    return highBoost;
  }

  /**
   * Enable boosting high frequency components. The default is `false`.
   * @param highBoost highBoost or {@code null} for none
   */
  public Audio setHighBoost(java.lang.Boolean highBoost) {
    this.highBoost = highBoost;
    return this;
  }

  /**
   * Enable boosting low frequency components. The default is `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getLowBoost() {
    return lowBoost;
  }

  /**
   * Enable boosting low frequency components. The default is `false`.
   * @param lowBoost lowBoost or {@code null} for none
   */
  public Audio setLowBoost(java.lang.Boolean lowBoost) {
    this.lowBoost = lowBoost;
    return this;
  }

  /**
   * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a
   * value between -24 and 0 (the default), where: * -24 is the Advanced Television Systems
   * Committee (ATSC A/85) standard * -23 is the EU R128 broadcast standard * -19 is the prior
   * standard for online mono audio * -18 is the ReplayGain standard * -16 is the prior standard for
   * stereo audio * -14 is the new online audio standard recommended by Spotify, as well as Amazon
   * Echo * 0 disables normalization
   * @return value or {@code null} for none
   */
  public java.lang.Double getLufs() {
    return lufs;
  }

  /**
   * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a
   * value between -24 and 0 (the default), where: * -24 is the Advanced Television Systems
   * Committee (ATSC A/85) standard * -23 is the EU R128 broadcast standard * -19 is the prior
   * standard for online mono audio * -18 is the ReplayGain standard * -16 is the prior standard for
   * stereo audio * -14 is the new online audio standard recommended by Spotify, as well as Amazon
   * Echo * 0 disables normalization
   * @param lufs lufs or {@code null} for none
   */
  public Audio setLufs(java.lang.Double lufs) {
    this.lufs = lufs;
    return this;
  }

  @Override
  public Audio set(String fieldName, Object value) {
    return (Audio) super.set(fieldName, value);
  }

  @Override
  public Audio clone() {
    return (Audio) super.clone();
  }

}
