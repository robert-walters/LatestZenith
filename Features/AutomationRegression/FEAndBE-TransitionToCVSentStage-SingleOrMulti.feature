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


    Then User clicks on Short list link

    And User selects all checkboxes

    Then User clicks on Change Stage link

    When User clicks on link Send CV

    And User clicks on Responsible User Menu

    Then User selects Responsible User Item

    And  User selects an Client Contact Menu
    When User selects an Client Contact item

    #And User clicks on the Save button to send submit
