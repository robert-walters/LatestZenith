Feature: FE - Edit - Offer/Placed - Single/Multi Candidate

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    And User clicks on Offer link
    Then User clicks on Job Checkbox
    When User clicks Edit Activity link
    When User enters Activity Notes as "Candidate two offered a position"
#    When User clicks on Save