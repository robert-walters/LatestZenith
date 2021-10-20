Feature: Edit Candidate List

  @test
  Scenario: Candidate Successful Edited Candidate List
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User clicks on the Candidate List link
    When User clicks on a Personal List link as "NateAutomate"

    And User clicks the Edit button
    Then User enters the List new  Name as "New list name"

#    When User clicks the Update button