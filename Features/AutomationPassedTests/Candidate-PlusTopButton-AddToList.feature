Feature: Candidate - Plus Button Top - Add To List

  @test
  Scenario: The user successfully adds candidate to List
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item

    When user clicks on the Plus Top button
    And User clicks on Add To List button
    Then User selects a List
#    When User clicks on Add candidate to list

