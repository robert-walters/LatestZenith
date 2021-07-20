Feature: Candidate - Summary - Add Qualification

  Scenario: Candidate Successful Adds Qualification
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    When User clicks on search button
    Then Searches for Candidate name as "Lu"
    And User clicks on Candidate "Lee"
    When User clicks on the middle plus button
    Then User enters Qualification Name "Computer Engineering"
    And User enters name of Institution "UNISA"
    When User selects Date Issued
    Then User enters achieved Grade "B"
    And User clicks on Create button