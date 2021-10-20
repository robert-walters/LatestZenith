Feature: FE - Client Contact - Jobs tab error

  Background:
    Given I have opened the Login page
    When I have logged into the application

  @test
  Scenario: Verifying if Candidate Status not updating
    When User navigates to Client Contact and gets an error on Jobs tab
