Feature: FE: Job Create And View Activity

  @test
  Scenario: User Successful Edits a Job Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item

    And User click on Activity link

    Then User clicks on the Job Plus button

    When User enters Job Activity Type
    And User searches for Main Client Contact Menu as "Hans"
    Then User selects Main Client Contact Menu Item
    #When User clicks on Create Organisation Activity

