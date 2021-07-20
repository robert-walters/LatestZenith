Feature: FE - Client Contact - Create And ViewActivity

  @test
  Scenario: Client Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "LungaTwo"
    And User clicks on client contact scrollable
    Then User clicks on the client item



    Then User clicks on Client Contact activity plus button
    When User enters organisation Activity Type
#    And User searches for Main Client Contact Menu as "Hans"
#    Then User selects Main Client Contact Menu Item
    When User clicks on Create Client Contact Activity
