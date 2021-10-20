Feature: Jobs - Add Alert

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    And Click on the Plus Top button
    Then User clicks on  add Alert

    Then User select Type
    Then User select Type Item
    When User writes a Reason as "Just a test"
    And User select Expiry Date
    Then User click on button OK
    When User clicks on button Add

