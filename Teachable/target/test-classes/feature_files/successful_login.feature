
Feature: User is able to login with correct email and password combination
 
  Scenario: Login Successful
    Given User navigates to correct url
    And User Clicks on Login option
    And User enters correct email 
    And User enters correct password
    When User clicks Login button
    Then User should land on the homepage with "<homeurl>"
    Then User exits the website
     Examples: 
    |  homeurl |
    | https://takehome.zeachable.com/   |   
    
    Scenario: Signup link takes User to Signup page from login page
    Given User navigates to correct url
    And User Clicks on Login option
    When User clicks Signup link at bottom of screen
    Then User should land on signup page
    Then User exits the website
    
    Scenario: Forgot Password link takes User to Reset Password page from login page
    Given User navigates to correct url
    And User Clicks on Login option
    When User clicks Forgot Password
    Then User should land on Reset Password page
    Then User exits the website