Feature: Data - Job Record

  Scenario: Successfully creates a Job Record
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    When User Clicks on Universal Plus Button
    And Clicks on Create Job Button
    Then User enters Job Title as "Lunga's Job"
    When User searches for Organisation Menu as "a"
    And User selects an Organisation Menu Item
    Then User searches for Location Menu as "e"
    When User selects Location Menu Item
    And User searches for Main Client Contact Menu as "LuClient"
    Then User selects Main Client Contact Menu Item
    When User clicks on selected Job Status Item

    And User clicks on Agreement Type menu
    Then User clicks on selected Agreement Type Item


    When User clicks on Exclusivity Type menu
    And User clicks on selected Exclusivity Type Item

    Then User clicks on Source Item
    When User clicks on selected Source Type Item

    And User clicks on Job Type Item
    Then User clicks on selected Job Type Item

    Then Click on Client Email button
    And User enters Link as "IT"
    And User enters the Background info as "This is just a test"
    Then Click on the Create button