@Regression
Feature: Profile Functionality

  Background:
    Given Click on Login Button
    When Enter Username Value "supervisor" and Password Value "tek_supervisor"
    And Click on Sign In Button
    And Click on profile button on top right corner

  Scenario: Validate information in Profile
    Then Validate STATUS "Active" USER TYPE "CSR" FULL NAME "Supervisor" USER NAME "supervisor" AUTHORITIES "admin"


  Scenario: Validate Home page after click on Logout Button in profile
    When Click on Logout Button
    Then Validate Lets get you started text on Home Page