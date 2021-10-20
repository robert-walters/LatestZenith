Feature: FE-Edit-CVSentModal-SingleOrMulti

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
    When User click on a Job link item



    And User clicks on CV Sent link
    Then User clicks on Job Checkbox
    When User clicks Edit Activity link

    And User enters Client Contact as "Jerry Lee"
    Then User selects an Client Contact Menu Item

    When User enters Activity Notes as "Candidate two offered a position"

#    And User selects an Outcome
#    Then User selects an Outcome date
    #When User clicks on Save