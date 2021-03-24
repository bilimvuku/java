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

package com.google.api.services.directory.model;

/**
 * Info about failures
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Admin SDK API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FailureInfo extends com.google.api.client.json.GenericJson {

  /**
   * Canonical code for why the update failed to apply.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * Failure reason message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * Failed printer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Printer printer;

  /**
   * Id of a failed printer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String printerId;

  /**
   * Canonical code for why the update failed to apply.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * Canonical code for why the update failed to apply.
   * @param errorCode errorCode or {@code null} for none
   */
  public FailureInfo setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Failure reason message.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Failure reason message.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public FailureInfo setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Failed printer.
   * @return value or {@code null} for none
   */
  public Printer getPrinter() {
    return printer;
  }

  /**
   * Failed printer.
   * @param printer printer or {@code null} for none
   */
  public FailureInfo setPrinter(Printer printer) {
    this.printer = printer;
    return this;
  }

  /**
   * Id of a failed printer.
   * @return value or {@code null} for none
   */
  public java.lang.String getPrinterId() {
    return printerId;
  }

  /**
   * Id of a failed printer.
   * @param printerId printerId or {@code null} for none
   */
  public FailureInfo setPrinterId(java.lang.String printerId) {
    this.printerId = printerId;
    return this;
  }

  @Override
  public FailureInfo set(String fieldName, Object value) {
    return (FailureInfo) super.set(fieldName, value);
  }

  @Override
  public FailureInfo clone() {
    return (FailureInfo) super.clone();
  }

}
