Feature: FE-Organisation-CreateActivity-ActivityModal

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "Lunga"
    And User clicks on organisation scrollable
    Then User clicks on the organisation item

    And User clicks on Activity
    Then User clicks on organisation activity plus button
    When User enters organisation Activity Type
    And User searches for Main Client Contact Menu as "sarah Barber"
    Then User selects Main Client Contact Menu Item
    When User clicks on Create Organisation Activity

