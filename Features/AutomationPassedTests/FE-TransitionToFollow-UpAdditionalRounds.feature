Feature: FE-TransitionToFollow-UpAdditionalRounds

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    Then User clicks on CV Sent link
    And User selects all checkboxes

    Then User clicks on Change Stage link
    And User clicks on First Round link

    #Then User enters Activity Notes as "Candidate transitioned to 2nd round"

    #When User clicks on Save and Continue button






