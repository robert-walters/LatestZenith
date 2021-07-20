Feature: FE & BE - Candidate - Status not updating or setting to correct default value

  Background:
    Given I have opened the Login page
    When I have logged into the application

  @test
  Scenario: Verifying if Candidate Status not updating
    When I create a new Candidate to check if Status has updated
    Then verify I can view the candidate status update
