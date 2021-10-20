Feature: Organisation - Linked Jobs - Subsidiary Organisation

  @test
  Scenario: Successful creates Parent Organisation
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on open search button
    When User searches for client contact as "Lunga"
    And User clicks on organisation scrollable
    Then User clicks on the organisation item

    Then User clicks on Linked Jobs link
    When User clicks on Subsidiary Plus button

#    When User looks for Organisation Menu as "De"
#    And User clicks an Organisation Menu Items

#    Then User clicks on Select to create Subsidiary Organisation

