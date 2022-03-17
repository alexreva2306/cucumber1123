Feature:Validation of Products

  @productproject
  Scenario: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "MyMoney" and "4"
    And the user enters the address information "Techtorial","2200 E Devon","Des Plaines","IL","60018"
    And the user enters the card information "Visa","123456789123","08/24"
    Then the user validates success message
    And the user validates product details "Techtorial","MyMoney","4","2200 E Devon","Des Plaines","IL","60018","Visa","123456789123","08/24"

  @productprojectOutline
  Scenario Outline: Validation of New Product Creation
    Given the user navigates to product website homepage and click orderButton
    When the user enters the product information "<productName>" and "<quantity>"
    And the user enters the address information "<customerName>","<street>","<city>","<state>","<zipcode>"
    And the user enters the card information "<cardType>","<cardNumber>","<expireDate>"
    Then the user validates success message
    And the user validates product details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expireDate>"
    Examples:
      | productName | quantity | customerName | street        | city        | state | zipcode | cardType         | cardNumber   | expireDate |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |
      | MyMoney     | 4        | Techtorial   | 2200 E Devon  | Des Plaines | IL    | 60018   | Visa             | 123456789123 | 08/24      |
      | FamilyAlbum | 6        | ahmet        | 560 michigan  | Michigan    | MO    | 60345   | MasterCard       | 523456789123 | 05/12      |
      | ScreenSaver | 7        | Dino         | 43dino adress | Schamburg   | TX    | 60034   | American Express | 623456789123 | 02/23      |