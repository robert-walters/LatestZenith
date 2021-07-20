Feature: Client - Add Alert

  @test
  Scenario: Successful creates New list
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User selects Client link
    When User selects Client link item as "text"

    When user click on the Plus Top button
    Then Clicks on Add Alert
    Then User selects Type
    When User writes Reason as "Just a test"
    #When User clicks on button Add


