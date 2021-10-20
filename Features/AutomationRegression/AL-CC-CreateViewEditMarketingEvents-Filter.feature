Feature: AL-CC-CreateViewEditMarketingEvents-Filter

  @test
  Scenario: Candidate Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "LungaTwo"
    And User clicks on client contact scrollable
    Then User clicks on the client item

    Then User clicks on Activity

    And User clicks on the Filter Activities button
    When User clicks on the Marketing radio button