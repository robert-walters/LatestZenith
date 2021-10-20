Feature: FE Permissions - Role Based - Client Contact - Remove Client Contact

  @test
  Scenario: Successful removes candidate
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "vstone@digitalzenith.io"
    When User enters their Password as "Cyb0rg!!"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "LungaTwo"
    And User clicks on client contact scrollable
    Then User clicks on the client item


    And User clicks on Three Dots button
    #Then clicks on unlink Candidate button
