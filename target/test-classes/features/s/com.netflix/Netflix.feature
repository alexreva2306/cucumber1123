Feature:netflix login

  Scenario: Negative login
    When I navigate to Netflix login page
    And I enter not valid email
    And I enter not valid password
    And I click submit button
    Then I see Incorrect password element

  Scenario Outline: Login with 5 different Emails
    When I navigate to Netflix login page
    And I enter not valid "<email>"
    And I enter not valid password
    And I click submit button
    Then I see Incorrect password element
    Examples:
      | email            |
      | test1@test.com   |
      | tesst2@test.com  |
      | test333@test.com |
      | test444@test.com |