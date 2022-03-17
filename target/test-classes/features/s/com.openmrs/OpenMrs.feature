Feature:Open MRS tests

  @openMRS
  Scenario: Register a patient
    Given the user logs in to OpenMRS with following credentials
      | username | admin    |
      | password | Admin123 |
    When the user register a new patient with following information:
      | GivenName    | Alina         |
      | FamilyName   | Reva         |
      | Gender       | Male         |
      | Day          | 13           |
      | Month        | August       |
      | Year         | 1994         |
      | Address      | 2200 E Devon |
      | PhoneNumber        | 3147148390   |
      | relationType | Doctor       |
      | RelativeName | Potel        |

    Then the user validates the patient name and familyName
      | GivenName    | Alina         |
      | FamilyName   | Reva         |