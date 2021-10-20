Feature: Client - Add Alert

  @test
  Scenario: Successful creates New list
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "LungaTwo"
    And User clicks on client contact scrollable
    Then User clicks on the client item


    When user click on the Plus Top button
    Then Clicks on Add Alert
    Then User selects Type
    When User writes Reason as "Just a test"
    #When User clicks on button Add


