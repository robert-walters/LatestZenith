Feature: Client - Information - Plus Button Middle - Add New Position

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    And User clicks on the Menu button as "menu"
    Then User selects Client link
    When User selects Client link item as "text"

    And User clicks on Information link

    When User clicks on Position History Plus button

    Then User enter Job Title as "IT Grad"

    When User searches for Organisation Menu as "a"
    And User selects an Organisation Menu Item

    Then User search for Location Menu as "HQ"
    When User select Location Menu Item
    Then User selects Duration
    And User clicks on OK
#    When User clicks on Current at this role (Blocker)
    And Clicks on Current Position Contact Details Plus
    Then Click on Mobile Phone
    When Enter Mobile Phone as "09847412"
    And Clicks on the Create button


