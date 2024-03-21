Feature: access to the employees page

  Scenario Outline: All users able to access to the employees page
    Given the user logged in as "<user type>"
    Then the user can pass on Company Structure under Employee menu
    Then the user views the following modules in the Employees page
      | Company Structure   |
      | Find Employee       |
      | Telephone Directory |
      | Staff Changes       |
      | Efficiency Report   |
      | Honored Employees   |
      | Birthdays           |
      | New page            |

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |