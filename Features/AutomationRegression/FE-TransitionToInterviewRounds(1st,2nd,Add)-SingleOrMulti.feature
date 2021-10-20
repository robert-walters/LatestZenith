Feature: FE-TransitionToInterviewRounds(1st,2nd,Add)-SingleOrMulti

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User clicks on a Job link item

    And User clicks on CV Sent link
    Then User clicks on Job Checkbox
    When User clicks on Change Stage link

    And User clicks on First Round link

    Then User enters Activity Notes as "Candidate transitioned to 2nd round"

    When User clicks on Save and Continue button
    #And User clicks on Save and Continue button

