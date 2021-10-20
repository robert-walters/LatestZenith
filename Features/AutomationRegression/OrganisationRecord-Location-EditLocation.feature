Feature: Organisation - Location - Edit Location

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

    When User clicks on Locations Tab
    Then User clicks on the Three Dots to Edit Location
    When User clicks on Edit Location
    Then User clicks on the OK button
    And User enters Address Line One as "45 Apple Street"
    Then User enters Province as "EC"
    When User enters the Post Code as "1234"
    And Clicks on radio button Make this primary location
#    And User clicks on to the Save button






