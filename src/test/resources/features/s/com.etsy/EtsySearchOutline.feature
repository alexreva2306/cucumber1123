Feature: Etsy Search Functionality

  Background: navigate
    Given the user navigates to "https://www.etsy.com/"

  @regressionoutline
  Scenario Outline: Validation of etsy search Hat
    When the user searches with "<searchValue>"
    Then the user validates the title "<titlevalidation>"
    Examples:
      | searchValue | titlevalidation |
      | Hat         | Hat \| Etsy     |
      | Key         | Key \| Etsy     |
      | Pin         | Pin \| Etsy     |
      | bag         | notitle         |
      | flowers     | flowers         |

    #  "\"--> use to make it text
        #for windows --> ctrl+alt+L
  #for mac ----> command + option+L

