Feature: Job - Activity - Edit Activity

  @test
  Scenario: User Successful Edits a Job Activity
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    #And User click on Activity link
    And User clicks on the Activity Link Tab

    Then User click on Edit Activity link
    And User clicks on the Save button