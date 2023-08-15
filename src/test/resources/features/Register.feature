@Register
Feature: I as a user want to register on the page

@HU001
  Scenario Outline: the user register on the page
    Given the user open brower
    When the user fill out first name <firstName> last name <lastName> user <userName> password <password>
    Then the user validates that the registration was successful

    Examples:
      | firstName | lastName | userName | password |
      | Stefany   | Lopez | Stefa123 | Admin123 |

