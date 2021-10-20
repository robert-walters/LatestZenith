Feature: FE - Implement Pagination To Transition To Offer Stage - Single or Multi

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    Then User clicks on Additional Rounds
    And User selects all checkboxes

    Then User clicks on Change Stage link

    When User clicks on link Offer
    And User clicks on Offer Date
    Then User selects Date
    When User enter Salary as "70000"
    And User enters Activity Notes as "Candidate offered a position"

    Then User clicks on Save and Continue button

#    When User enter Salary as "55000"
#    And User enters Activity Notes as "Candidate two offered a position"

#    Then User clicks on Save and Continue button