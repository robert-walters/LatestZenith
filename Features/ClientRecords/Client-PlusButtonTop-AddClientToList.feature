Feature: Client-PlusButtonTop-AddClientToList

  @test
  Scenario: Successful adds Client to list
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User selects Client link
    When User clicks Client link item as "text"

    When user clicks on the Plus Top button
    And User clicks on Add To List button
    Then Selects List item
#    When User clicks on Add button

