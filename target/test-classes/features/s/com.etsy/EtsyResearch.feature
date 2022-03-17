@regression
Feature: Etsy Search Functionality

  Background: navigate
    Given the user navigates to "https://www.etsy.com/"
  @hat @tc1 @smoke @regression @special
  Scenario: Validation of etsy search Hat
  #  Given the user navigates to "https://www.etsy.com/"
    When the user searches with "Hat"
    Then the user validates the title "Hat | Etsy"

  @hat @tc2 @smoke @regression @special
  Scenario: Validation of etsy search Key
  #  Given the user navigates to "https://www.etsy.com/"
    When the user searches with "Key"
    Then the user validates the title "Key | Etsy"

  @hat @tc3 @smoke @special
  Scenario: Validation of etsy search Pin
   # Given the user navigates to "https://www.etsy.com/"
    When the user searches with "Pin"
    Then the user validates the title "Pin | Etsy"