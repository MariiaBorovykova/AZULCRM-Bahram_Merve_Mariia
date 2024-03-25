Feature: User should be able to send messages by clicking on Message tab in the Activity Stream


  Scenario Outline: Verify that the user can send a message by filling in the mandatory fields.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user can write "New Message" in the Message title field
    And user should see in the delivery box "All employees" by default
    Then user click on Send button
    Then user can see created post with Message title "New Message"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |
  @US04
  Scenario Outline: Verify the corresponding error messages for the mandatory fields. Message content.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user should see in the delivery box "All employees" by default
    Then user click on Send button
    Then user can see Error message "The message title is not specified"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |
  @US04
  Scenario Outline: Verify the corresponding error messages for the mandatory fields. Recipient.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user can write "Message title" in the Message title field
    Then user delete all employees from delivery box
    Then user click on Send button
    Then user can see Error message "Please specify at least one person"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |
  @US04
  Scenario Outline: Verify that the delivery is 'All employees' by default.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user should see in the delivery box "All employees" by default
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |
  @US04
  Scenario Outline: Verify that the user can cancel sending message at any time before sending.
    Given the user logged in as "<user type>"
    Then user click Message tab
    Then user can write "Appreciation is canceled" in the Message title field
    Then user should see in the delivery box "All employees" by default
    Then user click on Cancel button
    Then user can not see created post with Message title "Appreciation is canceled"
    Examples:
      | user type      |
      | Helpdesk user  |
      | Marketing user |
      | HR user        |