Feature: Candidate Record modals - Mandatory location field

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://dev.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    When User Clicks on Universal Plus Button
    And Clicks on Create Candidate Button
    Then User enters First Name as "Base"
    And User enters Family Name as "Lungas"
    Then User enters City as "London"
    And User clicks on Add Contacts button
    Then User Adds Mobile Contacts as "3848595043"
    And Enters Job Title as "Tester"


    And User selects Position Type
    Then User selects Position Type Item
    And User enters Desired Work Location as "London"
    #When User clicks on Create
    #Then User clicks on View button


