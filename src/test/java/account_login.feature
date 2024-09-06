Feature: Customer Account Login

  Scenario: Successful login with valid credentials
    Given the user is on the Customer Account login page
    When the user enters a valid email and password
    And clicks on the login button
    Then the user should be redirected to the account dashboard

  Scenario: Unsuccessful login with invalid credentials
    Given the user is on the Customer Account login page
    When the user enters an invalid email and password
    And clicks on the login button
    Then an error message should be displayed
