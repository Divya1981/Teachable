Feature: User is able to signup with correct name,email and password combination
 
  Scenario: Signup Successful
    Given User navigates to correct url
    And User clicks on Signup option
    And User enters name
    And User enters valid email
    And User enters valid password
    When User clicks signup button
    Then User should land on the homepage_signup with "<homeurl>"
    Then User exits the website
    Examples: 
    |  homeurl |
    | https://takehome.zeachable.com/   |
    
    Scenario: Login link takes User to Login page from Signup page
    Given User navigates to correct url
    And User clicks on Signup option
    When User clicks Login link at bottom of screen
    Then User should land on login page
    Then User exits the website