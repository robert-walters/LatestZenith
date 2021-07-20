Feature: FE-Job-CreateActivity-ActivityModal

  @test
  Scenario: User Successful Edits a Job Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User click on the Menu button as "menu"
    Then User click on My Jobs link
    When User clicks on Job link item as "text"

    And User click on Activity link

    Then User clicks on the Job Plus button

    When User enters Job Activity Type
    And User searches for Main Client Contact Menu as "Billy"
    Then User selects Main Client Contact Menu Item
    When User clicks on Create Organisation Activity
