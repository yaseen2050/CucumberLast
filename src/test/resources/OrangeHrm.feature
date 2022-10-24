Feature: Functional testing on Orange HRM
  @TC12 @Regression @Smoke
  Scenario: Login to Orange HRM
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard


  @ParameterizedDashboard   @Regression
  Scenario: Login to Orange HRM with Parameterized message
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And the user wants to verify that browser landed on "dashboard"




  @TC1234
  Scenario: Adding a new employee - different format
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    Then The user wants to click on PIM Module
    And The user wants to go to Add Employee Page
    Then The user wants to add employee's first and last name as following
      |FirstName| Shahnaz |
      |LastName| Renastech|
    # this method automaticly will be as map data and when you create method for this step take Map<String,String> map  as parameter
    Then The user wants to add login details as following
    |UserName|    Gokhan|
    |Password|  Renastech123!|
    |status  |  Disabled      |


    @TestDataDriven
  Scenario Outline: Adding a new employee - different format
    Given The user wants to go to OrangeHRM Website
    When The user wants to enter username and password
    Then The user wants to click on Login button
    And The user wants to verify that browser landed on Dashboard
    And The user wants to go to Admin Module
    Then The user wants to go to Natonalities Section
    And The user wants to click on add new nationality
    Then The user wants to add new nationalities as "<Nationalities>"
    #s
    Examples:
      | Nationalities |
      |Aramaic      |
      |American     |
      |Italian      |
      |Haitian      |
      |French       |


