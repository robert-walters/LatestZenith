Feature: FE - Edit - Interview Rounds - Single Or Multi

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    Then User clicks on First Round link button
    Then User clicks on Job Checkbox
    When User clicks Edit Activity link
    Then User clicks on Save

