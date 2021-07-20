Feature: FE/BE:  Alerts - Candidate - View "Created By"

  Background:
    Given I have opened the Login page
    When I have logged into the application

  @test
  Scenario: Example Tests - Create Candidate
    When User navigates to Candidates Add an alert and view Created By
    Then Verify I can view the created by


