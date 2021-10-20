Feature: Organisation - Location - Plus Button Middle - Add Location

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "Lunga"
    And User clicks on organisation scrollable
    Then User clicks on the organisation item

    When User clicks on the Location link
    And User clicks on the Location Plus button
    Then User enters the Location Name as "London"
    And User selects their Country
    #Then Clicks on Make this primary location
    When User enters their City as "Johannesburg"
#    When User clicks Create button







