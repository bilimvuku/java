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

package com.google.api.services.baremetalsolution.v2.model;

/**
 * A reservation of one or more addresses in a network.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NetworkAddressReservation extends com.google.api.client.json.GenericJson {

  /**
   * The last address of this reservation block, inclusive. I.e., for cases when reservations are
   * only single addresses, end_address and start_address will be the same. Must be specified as a
   * single IPv4 address, e.g. 10.1.2.2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endAddress;

  /**
   * A note about this reservation, intended for human consumption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String note;

  /**
   * The first address of this reservation block. Must be specified as a single IPv4 address, e.g.
   * 10.1.2.2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startAddress;

  /**
   * The last address of this reservation block, inclusive. I.e., for cases when reservations are
   * only single addresses, end_address and start_address will be the same. Must be specified as a
   * single IPv4 address, e.g. 10.1.2.2.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndAddress() {
    return endAddress;
  }

  /**
   * The last address of this reservation block, inclusive. I.e., for cases when reservations are
   * only single addresses, end_address and start_address will be the same. Must be specified as a
   * single IPv4 address, e.g. 10.1.2.2.
   * @param endAddress endAddress or {@code null} for none
   */
  public NetworkAddressReservation setEndAddress(java.lang.String endAddress) {
    this.endAddress = endAddress;
    return this;
  }

  /**
   * A note about this reservation, intended for human consumption.
   * @return value or {@code null} for none
   */
  public java.lang.String getNote() {
    return note;
  }

  /**
   * A note about this reservation, intended for human consumption.
   * @param note note or {@code null} for none
   */
  public NetworkAddressReservation setNote(java.lang.String note) {
    this.note = note;
    return this;
  }

  /**
   * The first address of this reservation block. Must be specified as a single IPv4 address, e.g.
   * 10.1.2.2.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartAddress() {
    return startAddress;
  }

  /**
   * The first address of this reservation block. Must be specified as a single IPv4 address, e.g.
   * 10.1.2.2.
   * @param startAddress startAddress or {@code null} for none
   */
  public NetworkAddressReservation setStartAddress(java.lang.String startAddress) {
    this.startAddress = startAddress;
    return this;
  }

  @Override
  public NetworkAddressReservation set(String fieldName, Object value) {
    return (NetworkAddressReservation) super.set(fieldName, value);
  }

  @Override
  public NetworkAddressReservation clone() {
    return (NetworkAddressReservation) super.clone();
  }

}
