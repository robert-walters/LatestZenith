Feature: FE & BE - Stage logic for outcome status - Rejected

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
    When User clicks on a Job link item

    Then User clicks on Job Checkbox
    When User selects Edit Activity button
    Then User clicks on Outcome menu
    And User select an Outcome item


#    When User click on the OK button