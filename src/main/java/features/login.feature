Feature: Login functionality

  Scenario: Successful login with valid credentials
    Given the user is on the login page
    When the user enters valid username and password
    And clicks the login button
    Then the user should be redirected to the homepage
    And see a welcome message

  Scenario: Login fails with invalid credentials
    Given the user is on the login page
    When the user enters an invalid username or password
    And clicks the login button
    Then an error message should be displayed

  Scenario: Login fails with empty fields
    Given the user is on the login page
    When the user leaves the username or password field empty
    And clicks the login button
    Then a validation message should be shown to fill all fields
