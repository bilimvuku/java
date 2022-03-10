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

package com.google.api.services.forms.v1.model;

/**
 * The submitted answer for a question.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Forms API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Answer extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The answers to a file upload question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FileUploadAnswers fileUploadAnswers;

  /**
   * Output only. The grade for the answer if the form was a quiz.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Grade grade;

  /**
   * Output only. The question's ID. See also Question.question_id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String questionId;

  /**
   * Output only. The specific answers as text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TextAnswers textAnswers;

  /**
   * Output only. The answers to a file upload question.
   * @return value or {@code null} for none
   */
  public FileUploadAnswers getFileUploadAnswers() {
    return fileUploadAnswers;
  }

  /**
   * Output only. The answers to a file upload question.
   * @param fileUploadAnswers fileUploadAnswers or {@code null} for none
   */
  public Answer setFileUploadAnswers(FileUploadAnswers fileUploadAnswers) {
    this.fileUploadAnswers = fileUploadAnswers;
    return this;
  }

  /**
   * Output only. The grade for the answer if the form was a quiz.
   * @return value or {@code null} for none
   */
  public Grade getGrade() {
    return grade;
  }

  /**
   * Output only. The grade for the answer if the form was a quiz.
   * @param grade grade or {@code null} for none
   */
  public Answer setGrade(Grade grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Output only. The question's ID. See also Question.question_id.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuestionId() {
    return questionId;
  }

  /**
   * Output only. The question's ID. See also Question.question_id.
   * @param questionId questionId or {@code null} for none
   */
  public Answer setQuestionId(java.lang.String questionId) {
    this.questionId = questionId;
    return this;
  }

  /**
   * Output only. The specific answers as text.
   * @return value or {@code null} for none
   */
  public TextAnswers getTextAnswers() {
    return textAnswers;
  }

  /**
   * Output only. The specific answers as text.
   * @param textAnswers textAnswers or {@code null} for none
   */
  public Answer setTextAnswers(TextAnswers textAnswers) {
    this.textAnswers = textAnswers;
    return this;
  }

  @Override
  public Answer set(String fieldName, Object value) {
    return (Answer) super.set(fieldName, value);
  }

  @Override
  public Answer clone() {
    return (Answer) super.clone();
  }

}
