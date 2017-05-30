Feature: Verify Cart Page Functionality

  Scenario: Verify cart count
    Given the cart count is "0"
    And the user is on Shop page
    When the user adds "Smiley Bear" to the cart
    Then verify that the cart count is "1"
    When the user is on Cart Page
    And the user clicks Empty Cart
    And clicks "yes" to confirm to empty the cart
    Then verify that the cart count is "0"