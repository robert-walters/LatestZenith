Feature: FE - Grid View - Offer/Placed

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

    And User clicks on Offer link
