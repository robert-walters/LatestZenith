Feature: FE - Add candidate to Job - Transition to Longlist

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    And User enters their Username as "jjonzz@digitalzenith.io"
    Then User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    And User click on the Menu button as "menu"
    Then User click on My Jobs link
    When User clicks on Job link item as "text"

    And User clicks on Job Checkbox
#    Then User clicks on Change Stage link
#
#    When User clicks on link Short List
#    And User clicks on left pane Short List

