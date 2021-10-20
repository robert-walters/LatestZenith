Feature: FE: Candidate Edit Activity Log Activity

  @test
  Scenario: Candidate Successful Adds New Activity
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item


    And User click on Edit Activity link

#    Then User search for Organisation Menu as "a"
#    When User select an Organisation Menu Items
    And  User selects an Client Contact Menu
#    When User selects an Client Contact item

    #And User clicks on the Save button

