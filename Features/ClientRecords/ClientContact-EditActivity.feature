Feature: Client - Activity - Edit Activity

  @test
  Scenario: Client Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User selects Client link
    When User selects Client link item as "text"

    And User click on Edit Activity link
#    And User clicks on the Save button
