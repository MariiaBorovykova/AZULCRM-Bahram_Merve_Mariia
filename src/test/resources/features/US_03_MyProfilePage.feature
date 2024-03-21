@US_03
Feature: User, I should be able to access my profile page.

  Scenario Outline: Verify that the user can view the following options on My Profile page.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click the username
    And user click on "My Profile" button
    Then user should land on the My Profile page
    And user should see following options on My Profile page
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |

  Scenario Outline: Verify that the email under the General tab is the same as the user’s account.
    Given the user logged in as "<user type>"
    Then user should land on the homepage
    Then user click the username
    And user click on "My Profile" button
    Then user should land on the My Profile page
    And user should see relevant "<user type>" under the General tab

    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |