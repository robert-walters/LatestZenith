Feature: FE- Direct transitions to Shortlist stage

  @test
  Scenario: Candidate Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    And User enters their Password as "MartianM@nhunt3r"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item




    And User clicks on the activity plus button
    #When User enters Position Type
    When User enters Activity Type
#    Then User clicks on the Create button


