@Regression
Feature: Plan Page

  Background: Logging in to the Customer Service Portal
  Description: Before user can manage plans, user needs to log in to the portal with correct credentials.
    Given Click on Login button
    When Enter Username Value "supervisor" and Password Value "tek_supervisor"
    And  Click on Sign In Button
    Then User navigated to Customer Service Portal
    When Click on Plans Button

  Scenario: Validate Plans Data
  Description: user should see 4 rows of data.
    Then Validate 4 rows of data are present

  @Plan_2
  Scenario: Validate Create Date is today's date in (EST Time zone) and Date Expire is a day after
  Description: user should see that the create date is today's date and the expire date is a day after to ensure that plans are up-to-date.
    Then Validate create date is today's date in EST Time zone
    Then Validate expire date is a day after today's date