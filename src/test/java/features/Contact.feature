Feature: Verify Contact Page functionality

  Scenario: Verify mandatory error messages are displayed
    Given the user is on Contact page
    When the user clicks Submit button
    Then verify that the following error messages are displayed
      | fieldname | errormessage         |
      | forename  | Forename is required |
      | email     | Email is required    |
      | message   | Message is required  |


  Scenario: Verify error messages are not displayed when valid values are entered
    Given the user is on Contact page
    When the user enters following values for the fields
      | fieldname | fieldvalue          |
      | forename  | Automation          |
      | email     | automation@test.com |
      | message   | Testing Automation  |
    Then verify that the following error messages are not displayed
      | fieldname | errormessage |
      | forename  |              |
      | email     |              |
      | message   |              |


  Scenario: Verify invalid field error messages
    Given the user is on Contact page
    When the user enters following values for the fields
      | fieldname | fieldvalue  |
      | email     | automation@ |
      | telephone | @$#         |
    Then verify that the following error messages are displayed
      | fieldname | errormessage                          |
      | email     | Please enter a valid email            |
      | telephone | Please enter a valid telephone number |

  Scenario: Verify the successful submission
    Given the user is on Contact page
    When the user enters following values for the fields
      | fieldname | fieldvalue         |
      | forename  | Dan                |
      | email     | dan@jupiter.com    |
      | message   | Testing Automation |
    And the user clicks Submit button
    Then verify that "Thanks Dan, we appreciate your feedback." message is displayed
