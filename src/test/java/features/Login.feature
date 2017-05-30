 Feature: Verify Login Page functionality

   Scenario: Verify invalid login message
     Given the user is on Login pge
     When the user enters username as "XXX" and password as "XXX"
     And the user clicks the Login button
     Then verify that "Your login details are incorrect" error message is displayed

   Scenario: Verify a valid login
     Given the user is on Login pge
     When the user enters username as "user1" and password as "letmein"
     And the user clicks the Login button
     Then verify that "Welcome to Jupiter Toys, a magical world for good girls and boys." welcome message is displayed