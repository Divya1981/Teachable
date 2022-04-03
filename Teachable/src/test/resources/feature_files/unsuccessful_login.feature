Feature: User is unable to login with incorrect email and/or incorrect password combination
 
  Scenario: Login unsuccessful
    Given User navigates to correct url
    And User Clicks on Login option
    And User enters email as "<email>"
    And User enters password as "<password>"
    When User clicks Login button
    Then User should stay on the login page with login "<status>"
    Then User exits the website

Examples: 
      | email             | password   | status  |
      | takehome@test.com |  test      | Fail    |
      | test@test.com     |  Teachable | Fail    |
      | test@test.com     |  test      | Fail    |
     
