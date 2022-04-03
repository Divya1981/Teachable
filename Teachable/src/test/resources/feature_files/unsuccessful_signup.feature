Feature: User is unable to signup with invalid/blank name,email and/or invalid password combination
 
  Scenario: signup unsuccessful
    Given User navigates to correct url
    And User clicks on Signup option
    And User enters Name as "<Name>"
    And User enters Email as "<Email>"
    And User enters Password as "<Password>"
    When User clicks signup button
    Then User should not be able to signup with status "<status>"
    Then User exits the website

Examples: 
      |  Name         | Email           | Password  | status |
      |  Test1        |                 |           |  Fail  |
      |  Test1        |  Test@test      |  test12   |  Fail  |
      |  Test1        |  Test@test.com  |           |  Fail  |
      |               |  Test@test.com  |  test     |  Fail  |
     