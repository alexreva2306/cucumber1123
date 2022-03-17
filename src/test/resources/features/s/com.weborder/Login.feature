Feature: Login Functionality for WebOrder Page

  Background:
    Given the user navigates to the WebOrder website

    @smoke @regression @ahmet
  Scenario: Validation of WebOrder Login Positive Scenario
   # Given the user navigates to the WebOrder website
    When th e user provides credentials
    Then the user is on the home page

    Scenario: Validation of WebOrder Login Negative Scenario 1
     # Given the user navigates to the WebOrder website
      When th e user provides correct username and wrong password
      Then the user validates the "Sign in Failed" error message

  Scenario: Validation of WebOrder Login Negative Scenario 2
   # Given the user navigates to the WebOrder website
    When th e user provides wrong "ahmet" and "baldir"
    Then the user validates the "Sign in Failed" error message
@smoke @regression @tc1 @ahmet
  Scenario: Validation of WebOrder Login Negative Scenario 3
  #  Given the user navigates to the WebOrder website
    When th e user provides empty username and password
    Then the user validates the "Sign in Failed" error message