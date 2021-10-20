Feature: FE Permissions - Role Based - Job

  @test
  Scenario: Successful Login with Valid Credentials
    Given User launch Chrome browser

    When User opens URL "https://sit.digitalzenith.io/"
    Then User enters their Username as "vstone@digitalzenith.io"
    And User enters their Password as "Cyb0rg!!"
    When User clicks on the SignIn button

    Then User click on Search button
    And User text on Search bar as "Lunga"
    Then User clicks link scrollable Job
    When User click on a Job link item


    When User clicks on the link Send CV

    And User selects all checkboxes

    Then User clicks on Change Stage link

    When User clicks on the Offer button

    #And user click on Save
