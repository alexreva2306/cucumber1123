@SmokeLoginTest
Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

  Scenario: Validation of WebOrder Login Positive Scenario
    When th e user provides credentials
    Then the user is on the home page

  @regressionoutline2
  Scenario Outline: Validation of WebOrder Login Negative Scenario 2
    When th e user provides wrong "<userName>" and "<password>"
    Then the user validates the "<errorMessage>" error message

    Examples:
      | userName              | password | errorMessage   |
      | bobo                  | rich     | Sign in Failed |
      | guest1@microworks.com | resident | Sign in Failed |
      | who?                  | Guest1!  | Sign in Failed |
      | ddd12@#$!             | 123456!  | Sign in Failed |
      |                       |          | Sign in Failed |
      | ddd12@#$!             |          | Sign in Failed |
      |                       | 123456!  | Sign in Failed |
      | @#$%^^                | 123456   | Sign in Failed |
      | 123456                | @#$%^    | Sign in Failed |
      | 12345                 | dfdgdfgd | Sign in Failed |
      | sfgddyt               | 123456!  | Sign in Failed |
      | dfhf                  | !@#$%^   | Sign in Failed |
      | !@#$%^@#$!            | 12345    | Sign in Failed |



