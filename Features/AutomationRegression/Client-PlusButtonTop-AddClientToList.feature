Feature: Client-PlusButtonTop-AddClientToList

  @test
  Scenario: Successful adds Client to list
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
    #Then Selects List item
#    When User clicks on Add button

