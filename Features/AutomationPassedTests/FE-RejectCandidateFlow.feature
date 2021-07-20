Feature: FE - Reject candidate flow

  @test
  Scenario: User Successful Edits a Job Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    Then User click on Job Checkbox

    And User clicks on the Reject button
    #When User enters Activity Notes as "This candidate has been rejected"
    #Then User select an Outcome date
    #And User clicks on the Save
