Feature : Login to Gmail, Google search
     Scenario: Verify that login to gmail positive credentials is successful
    Given The user wants to go to Google
    When  The user wants to click on Gmail
    Then  The user wants to verify that Gmail page is opened successfully
    And   The user wants to clicl on Sign in button
    And   The user wants to enter correct email adress
    And   The user wants to enter correct password
    And   The user wants to login button
    Then  The user wants to verify that Signing was successful


     Scenario: Verify that user is able to search in emails
      Given The user wants to go to Google
      When  The user wants to click on Gmail
      Then  The user wants to verify that Gmail page is opened successfully
      And   The user wants to clicl on Sign in button
      And   The user wants to enter correct email adress
      And   The user wants to enter correct password
      And   The user wants to login button
      Then  The user wants to verify that Signing was successful
      And   The user wants to search for Renastech in emails
      Then  The user wants to verify that search was successful

    # Usually we use Then keyword where there is some Verification

      #make a search on Google for Renastech and click on first related website and make sure website opened successfully
     Scenario: Verify that user is able to search Renastech on Google and go to Website
    Given The user wants to go to Google
    When  The user wants to search Renastech on Google Search box
    Then  The user wants to click on Search Button
    And   The user user wants to click on first related Website
    Then  The user wants to verify that Related Website is opened Succesfully

    # each step is sentence sensitive. So you need to pass exact same step to use it in another scenario
     Scenario: Verify that the user is able to go to renastech by clicking  I'm Feeling Lucky Button
      Given The user wants to go to Google
      When The user wants to search for Renastech
      And The user wants to click on I'm Feeling Lucky button
      Then The user wants to verify that Browser is directed to Renastech.com

      # you can use steps here when providing details on how to reproduce a bug in a Jira Ticket

        #This is framework Is Cucumber BDD with Junit for assertion
       # The tools that we use in this framework
       #Selenium -- Automation tool for web browser
     #Junit -- this is fpr testing framework. For Asssertion ? instead of Junit we can use TestNG as well
     # Cucumber -- type of Framework


