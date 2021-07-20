Feature: Organisation - Edit List

  @test
  Scenario: Successfully Edits Organisation list
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User clicks on the Menu button as "menu"
    And User clicks on Organisation list
    When User selects an Organisation list item

    Then User clicks on the Edit button
    When User edits List Name as "New Test"
#    And User clicks on Update edited organisation