Feature: We are testing background keyword in this file
  Background: The user wants to go to OramgeHRM Website

    Given The user wants to go to OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button




    @ParameterizedDashboard   @Regression
    Scenario: Login to Orange HRM with Parameterized message
    And the user wants to verify that browser landed on "dashboard"

    @TestDataDriven
    Scenario Outline: Adding a new employee - different format
    And The user wants to verify that browser landed on Dashboard
    And The user wants to go to Admin Module
    Then The user wants to go to Natonalities Section
    And The user wants to click on add new nationality
    Then The user wants to add new nationalities as "<Nationalities>"

   Examples:
   | Nationalities |
   |Aramaic      |
   |American     |
   |Italian      |
   |Haitian      |
   |French       |


   @TC12 @Regression @Smoke
   Scenario: Login to Orange HRM

    And The user wants to verify that browser landed on Dashboard
