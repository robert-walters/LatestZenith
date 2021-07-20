Feature: FE - "Add to job" - Display only jobs associated with logged in user

  Background:
    Given I have opened the Login page
    When I have logged into the application

  @test
  Scenario: Example Tests - Add & View Responsible User, Team
    When User adds record to Job and Display only jobs associated with logged in user