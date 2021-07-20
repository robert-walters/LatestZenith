Feature: Candidate - Career - Add New Role

  @test
  Scenario: Candidate Successful Adds New Role
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks on Candidate item

    When User clicks on Career
    Then User clicks on the current roles plus button
    And User enters Job Tile as "Auditor"
    When User enters Position Type
    Then User enters Salary rate "200"
    And User selects Pay Period
#    When User looks up for Organisation Menu as "Lunga"
    #Then User selects desired an Organisation Menu Item
#    When User clicks Add button
  