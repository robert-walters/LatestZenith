Feature: Organisation -Add List

  @test
  Scenario: Successfully Edits Organisation list
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on Menu button as "menu"
    Then User select the Organisation List link


    And User clicks on Add List button
    Then User Enters new List Name as "Inspired New List"
#    When User clicks on Create Org List
