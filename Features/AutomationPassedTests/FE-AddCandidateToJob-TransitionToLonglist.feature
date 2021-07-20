Feature: FE - Add candidate to Job - Transition to Longlist

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    And User enters their Username as "jjonzz@digitalzenith.io"
    Then User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User clicks on a Job link item


    And User clicks on Job Checkbox

    Then User clicks on Add to List or Job
    When User clicks on Add to Job
    And User selects a Job link item
    Then User clicks ADD
