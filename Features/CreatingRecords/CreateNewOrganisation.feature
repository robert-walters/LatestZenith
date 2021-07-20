Feature: Organisation - Location - Plus Button Middle - Add Location

  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User Clicks on Universal Plus Button
    Then User clicks on Organisation
    When User enters an Organisation Name as "Lu QA Organisation"
    And User enters Location Name as "Soweto"
    Then User selects Country
    When User enter City as "Johannesburg"
    When User clicks the Create button

