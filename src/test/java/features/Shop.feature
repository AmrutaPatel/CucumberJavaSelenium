Feature: Verify Shop Page Functionality

  Scenario: Verify product price
    Given the user is on Shop page
    When the user finds the "Smiley Bear" product
    Then verify that the price is "14.99"