Feature: Fill out Conctact us form
  @TCcontactus
  Scenario Outline: Contact us scenario with different set of data
    Given user navigates to contact us website
    When User fills the form given sheetName "<Sheetname>" and rowNumber <RowNumber>
    Then user clicks Send Button
    And User verifies success full message "Your message has been succesfully sent to our team."
    Examples:
    |Sheetname| RowNumber|
    |contactus|     0         |
    |contactus |    1    |

    @TCDENEME
    Scenario: Contact us scenario with different set of d
      Given user navigates to contact us website
      When User fills the form given sheetName "<Strs>" and rowNumber "<row>"
      Then user clicks Send Button

