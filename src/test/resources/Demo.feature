Feature: Payment Gateway functional test
    @BuyingProduct_TC2 @BuyingProduct
  Scenario: Verify that user can buy a product
      Given The user wants to go to Payment Gateway Website
      When The user wants to buy an elephant toy
      Then The user wants to provide payment information
      Then The user wants to click on pay now button
      Then The user wants to verify message is successfull

      #First step  is go to website
  #Second step is choose quantity and click on buy now button
  #Thirs step we will provide all required information
  #Fourth step - we will verify if we can see success message
    #end to end step

    @TC111
    Scenario: Verify that user can buy multiple products
        Given  The user wants to go to Payment Gateway Website
        When  The user wants to buy elephant toy as "5"
        Then user wants to enter Credit Card Number as "1234567887654321"
        And The user wants to enter Expiration month as "11"
        And The user wants to enter Expiration Year as "2028"
        And The user wants to enter CVV Code as "177"
        And The user wants to click on pay now button
        Then The user wants to verify message as "Payment successfull!"

        @TC123
    Scenario: Verify that user can buy multiple products
        Given  The user wants to go to Payment Gateway Website
        When  The user wants to buy elephant toy as "5"
        Then user wants to enter Credit Card Number as followings
        |CreditNumber|12345678943210000|
        And The user wants to enter Expiration month as "11"
        And The user wants to enter Expiration Year as "2028"
        And The user wants to enter CVV Code as "177"
        And The user wants to click on pay now button
        Then The user wants to verify message as "Payment successfull!"


            @TC200
    Scenario: Verify that user can buy multiple products
        Given  The user wants to go to Payment Gateway Website
        When  The user wants to buy elephant toy as "5"
        Then user wants to enter Card Informations as
            |CreditNumber|12345678943210000| 11| 2023| 231|
      #here i used parameter as List<List>   but List < List <String>> would be less confusing for future steps
        And The user wants to click on pay now button
        Then The user wants to verify message as "Payment successfull!"

            @TC200LISTstrings
    Scenario: Verify that user can buy multiple products
        Given  The user wants to go to Payment Gateway Website
        When  The user wants to buy elephant toy as "5"
        Then user wants to enter Card Informations as is
            |CreditNumber|12345678943210000| 11| 2023| 231|
            |CreditNumber|01010678943210000| 09| 2025| 999|
      #here i used parameter as List<List>   but List < List <String>> would be less confusing for future steps
        And The user wants to click on pay now button
        Then The user wants to verify message as "Payment successfull!"


                 #this is where we add data driven testing  like multi datas trying with TestScenarioOutline

         @TestScenarioOutline
          Scenario Outline: Verify that user can buy multiple products
              Given The user wants to go to Payment Gateway Website
              When The user wants to buy elephant toy as "<quantity>"
              Then The user wants enter Card information "<CreditCardNumber>" "<ExpirationMonth>" "<Year>" "<CVV>"
              Examples:
                  |CreditCardNumber|ExpirationMonth|Year|CVV|quantity|
                  |12345678943210000| 11| 2023| 231| 1               |
                  |01010678943210000| 09| 2025| 999|2                |
                  |11111178943210000| 09| 2019| 000|3                |
            # but we cant use steps after examples files it gives parse error   also empty value will be takes as null and will keep working