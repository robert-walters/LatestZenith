Feature: FE Permissions - Role Based - Client Contact - Add Alert

  @test
  Scenario: Successful creates New list
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "vstone@digitalzenith.io"
    When User enters their Password as "Cyb0rg!!"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "LungaTwo"
    And User clicks on client contact scrollable
    Then User clicks on the client item


    When user click on the Plus Top button
    Then Clicks on Add Alert
    Then User selects Type
    When User writes Reason as "Just a test"
#    When User clicks on button Add


