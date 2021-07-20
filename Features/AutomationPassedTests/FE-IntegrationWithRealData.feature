Feature: FE - Integration with real data

  @test
  Scenario: Successful integrates with real data
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    And User enters their Username as "jjonzz@digitalzenith.io"
    Then User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item

    And User clicks on Offer link