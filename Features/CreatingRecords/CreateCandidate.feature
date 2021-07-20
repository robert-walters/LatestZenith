Feature: Candidate - Candidate Review

  Scenario: A user successful creates a candidate
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "jjonzz@digitalzenith.io"
    When User enters their Password as "MartianM@nhunt3r"
    And User clicks on the SignIn button

    When User Clicks on Universal Plus Button
    And Clicks on Create Candidate Button
    Then User enters First Name as "Rose"
    And User enters Family Name as "Luvo"
    Then User enters City as "London"
    And User clicks on Add Contacts button
    Then User Adds Mobile Contacts as "982847429"
    And Enters Job Title as "Tester"

#    When User searches for Organisation Menu as "Amazon"
#    And User selects an Organisation Menu Item

    And User selects Position Type
    Then User selects Position Type Item
    And User enters Desired Work Location as "London"
#    When User clicks on Create
    #Then User clicks on View button


