Feature: Candidate Record

  Background:
    Given I have opened the Login page
    And I have logged into the application

  @test
  Scenario Outline: Create Candidate
    When I create a new candidate via the Plus Icon with the name <fullName>
    #Then verify I can view the new candidate
    Examples:
      | fullName    |
      | "Terry Lee" |

  @test2
  Scenario: Candidate Successful Adds New Activity
    Given I have navigated to the Candidate created during Testing
#    When User clicks on search button
#    Then Searches for Candidate name as "Tony"
#    When User clicks on the Candidate "Tony Stark"
#    When user clicks on the Plus Top button
#    And User click on Candidate Review
#    Then User adds Notes reviews as "Candidate is really impressive."
#    When User selects the Create button

  Scenario: Delete Candidate