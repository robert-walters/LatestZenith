Feature: Candidate - Summary - Add Qualification

  Scenario: Candidate Successful Adds Qualification
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item

    When User clicks on the middle plus button
    Then User enters Qualification Name "Computer Engineering"
    And User enters name of Institution "UNISA"
    When User selects Date Issued
    Then User enters achieved Grade "B"
    #And User clicks on Create button