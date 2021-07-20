Feature: FE Permissions: Role Based - Organisation

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "vstone@digitalzenith.io"
    When User enters their Password as "Cyb0rg!!"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "Lunga"
    And User clicks on organisation scrollable
    Then User clicks on the organisation item


    And User selects on Plus Top button

    Then User selects Add Alert button

    Then User selects Type
    When User writes Reason as "Just a test"
    #When User click on button Add
