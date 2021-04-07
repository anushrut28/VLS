package com.vls.model;

public class Quora {
  private int questionId;
  private int learnerId;
  private String question;
  private String askedBy;
  private String askedOn;
  private String answer;
  private String answerBy;
  private String answeredOn;

  public Quora() {

  }

  public Quora(final int argquestionId, final int arglearnerId, final String argquestion, final String argaskedBy,
      final String argaskedOn, final String arganswer, final String arganswerBy, final String argansweredOn) {
    this.questionId = argquestionId;
    this.learnerId = arglearnerId;
    this.question = argquestion;
    this.askedBy = argaskedBy;
    this.askedOn = argaskedOn;
    this.answer = arganswer;
    this.answerBy = arganswerBy;
    this.answeredOn = argansweredOn;
  }

  public final int getQuestionId() {
    return questionId;
  }

  public final void setQuestionId(final int argquestionId) {
    this.questionId = argquestionId;
  }

  public final int getLearnerId() {
    return learnerId;
  }

  public final void setLearnerId(final int arglearnerId) {
    this.learnerId = arglearnerId;
  }

  public final String getQuestion() {
    return question;
  }

  public final void setQuestion(final String argquestion) {
    this.question = argquestion;
  }

  public final String getAskedBy() {
    return askedBy;
  }

  public final void setAskedBy(final String argaskedBy) {
    this.askedBy = argaskedBy;
  }

  public final String getAskedOn() {
    return askedOn;
  }

  public final void setAskedOn(final String argaskedOn) {
    this.askedOn = argaskedOn;
  }

  public final String getAnswer() {
    return answer;
  }

  public final void setAnswer(final String arganswer) {
    this.answer = arganswer;
  }

  public final String getAnswerBy() {
    return answerBy;
  }

  public final void setAnswerBy(final String arganswerBy) {
    this.answerBy = arganswerBy;
  }

  public final String getAnsweredOn() {
    return answeredOn;
  }

  public final void setAnsweredOn(final String argansweredOn) {
    this.answeredOn = argansweredOn;
  }

  @Override
  public String toString() {
    return "Quora [answer=" + answer + ", answerBy=" + answerBy + ", answeredOn=" + answeredOn + ", askedBy=" + askedBy
        + ", askedOn=" + askedOn + ", learnerId=" + learnerId + ", question=" + question + ", questionId=" + questionId
        + "]";
  }
}
