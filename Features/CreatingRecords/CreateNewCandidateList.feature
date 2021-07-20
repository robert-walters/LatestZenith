Feature: Create Candidate List

  Scenario: Candidate Successful Adds New List
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    When User clicks on search button
    Then User clicks on the universal Plus button
    And User clicks on List
    When User clicks on Candidate
    Then User enters List Name as "New Candidate List 3"
    And User click on the Create button

