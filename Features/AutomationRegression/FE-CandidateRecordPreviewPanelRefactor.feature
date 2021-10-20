Feature: FE - Candidate Record Preview Panel Refactor

  @test
  Scenario: User Successful Edits a Job Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User clicks on a Job link item


    Then User clicks on the candidate
    And User clicks on the Expand button
    When User clicks on the Back button
    Then User clicks on the X button to exit



