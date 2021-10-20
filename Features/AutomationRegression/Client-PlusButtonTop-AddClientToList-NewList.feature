Feature: Client-PlusButtonTop-AddClientToList-NewList

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


    When user clicks on the Plus Top button
    And User clicks on Add To List button
    Then User clicks on New List
    When user enters the new List Name "New List Demo"
    And User clicks on create new list