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

package com.google.api.services.slides.v1;

/**
 * Available OAuth 2.0 scopes for use with the Google Slides API.
 *
 * @since 1.4
 */
public class SlidesScopes {

  /** See, edit, create, and delete all of your Google Drive files. */
  public static final String DRIVE = "https://www.googleapis.com/auth/drive";

  /** See, edit, create, and delete only the specific Google Drive files you use with this app. */
  public static final String DRIVE_FILE = "https://www.googleapis.com/auth/drive.file";

  /** See and download all your Google Drive files. */
  public static final String DRIVE_READONLY = "https://www.googleapis.com/auth/drive.readonly";

  /** See, edit, create, and delete all your Google Slides presentations. */
  public static final String PRESENTATIONS = "https://www.googleapis.com/auth/presentations";

  /** See all your Google Slides presentations. */
  public static final String PRESENTATIONS_READONLY = "https://www.googleapis.com/auth/presentations.readonly";

  /** See, edit, create, and delete all your Google Sheets spreadsheets. */
  public static final String SPREADSHEETS = "https://www.googleapis.com/auth/spreadsheets";

  /** See all your Google Sheets spreadsheets. */
  public static final String SPREADSHEETS_READONLY = "https://www.googleapis.com/auth/spreadsheets.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(DRIVE);
    set.add(DRIVE_FILE);
    set.add(DRIVE_READONLY);
    set.add(PRESENTATIONS);
    set.add(PRESENTATIONS_READONLY);
    set.add(SPREADSHEETS);
    set.add(SPREADSHEETS_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private SlidesScopes() {
  }
}
