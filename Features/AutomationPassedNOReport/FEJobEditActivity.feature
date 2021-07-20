Feature: FE: Job - Activity - Edit Activity

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
    When User clicks on a Job link item


    And User click on Activity link
    Then User click on Edit Activity link
    And User clicks on the Save button