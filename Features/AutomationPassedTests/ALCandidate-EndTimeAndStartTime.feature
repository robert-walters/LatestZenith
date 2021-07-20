Feature: AL Candidate - End Time & Start Time

  @test
  Scenario: Candidate Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item

    And User clicks on Activity
    Then User clicks on the activity plus button
    #When User enters Position Type
    When User enters Activity Type
    Then User clicks on the Create button
