Feature: Candidate-Personal-UpdateAddress

  Scenario: Candidate Successful Adds Qualification
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item

    When User clicks on Personal link
    #Then User clicks on Change button
    Then User clicks on Change button as "text"
    And Selects Country
    When User enters Address Line 1 "162 Anderson Street"
    Then User enters City name as "Johannesburg"
    And User enters Province name as "Gauteng"
    When User enters Post Code as "2001"
    Then User clicks on Save button
