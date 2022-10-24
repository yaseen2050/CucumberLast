Feature: This feature is about login functionality of Amazon
  # This is how we comment on feature files
#Gherkin language
  # Given,When,Then,But

  #Testrail and Zephyr Scale are two test case management tools.We dont need to use them if we use a CucumberBDD Framework

  #This is a positive scenario / happy path
  Scenario: Login to Amazon with Correct Username and Correct Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter correct username
    Then The user wamts to enter correct password
    And The user wants to click on login button

# this is a negative scenario // boundry test
    Scenario: Login to Amazon with correct username and inccorrect password
      Given : The user wants to go to Amazon's Website
      When The user want to enter correct username
      Then The user wants to enter incorrect password
      And The user wants to click on Login button
      And The user wants to verify that login was unsuccessful


      #This is a negative scenario
  Scenario: Login to Amazon with Incorrect Username and Incorrect Password
    Given The user wants to go to Amazon's Website
    When The user wants to enter Incorrect username
    Then The user wants to enter Correct password
    And the user wants to click on login button
    And The user wants to verify that login was unsuccessful
