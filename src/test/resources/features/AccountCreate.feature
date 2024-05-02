@Regression
Feature: Create an Account from home page.
  Background:

    Given Click on Create Primary Account button
@Positive
  Scenario: Create an Account

    And User validates page Title as Expected “Create Primary Account Holder”

  Scenario: Create an Account by filling up the form using List of Map Data Table
    When User fill out Create Account Form
      | email            |title  |firstName   |lastName|gender|maritalStatus|employmentStatus|dateOfBirth|
     |sunmoon@gmail.com  | Mr.   |Sun        |Moon   |Male  |Single     |Developer       |01/01/1999|

    When User click on Create Account Button
    And Validate user is on "Sign up your account"
    Then Email displayed as entered


@Negative
  Scenario: Create an account with existing email address
    When User creates account with existing email address
      | email            |title|firstName|lastName|gender|maritalStatus|employmentStatus|dateOfBirth|
      |johnsmith@gmail.com| Mr.  |Jonathan|Smith  |Male  |Single       |Engineer       |01/01/2000  |


    Then Click on Create Account Button
    Then Error message "Account with email johnsmith@gmail.com is exist"



