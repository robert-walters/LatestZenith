Feature: FE - Edit - Interview Rounds - Single Or Multi - Additional Round

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item

    When User clicks on Additional Rounds
    Then User click on Job Checkbox
    And User clicks Edit Activity link
#    When User clicks on Save
