Feature: Client - Link Candidate

  @test
  Scenario: Successful creates New list
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User selects Client link
    When User selects Client link item as "text"

    And User clicks on the Top Three Dots
    Then User clicks on Link Candidate
#    When User search for Organisation Menu as "a"
#    And User select an Organisation Menu Items
    When User enters Candidate "Vee"
    And User clicks on select
