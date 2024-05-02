@Regression
Feature: Create an Account from home page.

  Background:
    When Click on Login button

    @PositiveTest
    Scenario: User login with Valid CSR credentials
      When Enter Username Value "supervisor" and Password Value "tek_supervisor"
      Then User navigated to Customer Service Portal


      @NegativeTest
      Scenario Outline: Login with invalid credentials
        Description: when user enters invalid credentials will get error message
        When Enter Username Value "<Username>" and Password Value "<password>"
        And Click on Sign In Button
        Then Validate login error message "<ErrorMessage>"
        Examples:
        |Username     |password         |ErrorMessage|
        |supervisor20 |tek_supervisor  | ERROR User supervisor20 not found|
        |supervisor   |tek_supervisor20|  ERROR Password not matched      |



