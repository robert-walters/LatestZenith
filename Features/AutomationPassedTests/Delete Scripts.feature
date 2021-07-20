Feature: Delete Scripts

  Scenario Outline: Delete Candidate with given Family Name 1
    Given I have Logged via the backend and stored id token
    Given I have deleted Candidate with the family name <familyName>
    Examples:
      | familyName |
      | "Test"    |

  @delete
  Scenario Outline: Delete Candidate with given Family Name 2
    Given I have Logged via the backend and stored id token
    Given I have deleted Candidate with the family name <familyName>
    Examples:
      | familyName         |
      | "Tese" |
