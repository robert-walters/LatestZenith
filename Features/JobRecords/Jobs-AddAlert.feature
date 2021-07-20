Feature: Jobs - Add Alert

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User click on the Menu button as "menu"
    Then User click on My Jobs link
    When User clicks on Job link item as "text"

    And Click on the Plus Top button as "text"
    Then User clicks on  add Alert

    Then User selects Type
    When User writes Reason as "Just a test"
#    And User select Expiry Date
#    Then User click on button OK
    When User clicks on button Add

