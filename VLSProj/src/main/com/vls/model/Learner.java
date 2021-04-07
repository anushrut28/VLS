package com.vls.model;

class Learner {

  private int learnerId;
  private String firstName;
  private String dateOfBirth;
  private String email;

  public Learner() {

  }
  public Learner(final int arglearnerId) {
    this.learnerId = arglearnerId;
  }

  public Product(final int arglearnerId, final String argfirstName, final String argdateOfBirth, final String argemail) {
    this.learnerId = arglearnerId;
    this.firstName = argfirstName;
    this.dateOfBirth = argdateOfBirth;
    this.email = argemail;
  }

  public final int getLearnerId() {
    return learnerId;
  }

  public final void setLearnerId(int arglearnerId) {
    this.learnerId = arglearnerId;
  }

  public final String getFirstName() {
    return firstName;
  }

  public final void setFirstName(String argfirstName) {
    this.firstName = argfirstName;
  }

  public final String getDateOfBirth() {
    return dateOfBirth;
  }

  public final void setDateOfBirth(String argdateOfBirth) {
    this.dateOfBirth = argdateOfBirth;
  }

  public final String getEmail() {
    return email;
  }

  public final void setEmail(String argemail) {
    this.email = argemail;
  }

  @Override
  public String toString() {
    return "Learner [dateOfBirth=" + dateOfBirth + ", email=" + email + ", firstName=" + firstName + ", learnerId="
        + learnerId + "]";
  }
}
