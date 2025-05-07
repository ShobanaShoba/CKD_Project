Feature: Create a new account

  Scenario: Successfully create a new account with valid details
    Given I am on the registration page
    When I enter valid user details including username, email, and password
    And I click on the "Create Account" button
    Then I should see a confirmation message "Account created successfully"
    And I should be redirected to the login page

  Scenario: Fail to create an account with missing details
    Given I am on the registration page
    When I leave some mandatory fields empty
    And I click on the "Create Account" button
    Then I should see an error message "Please fill out all required fields"

  Scenario: Fail to create an account with an invalid email format
    Given I am on the registration page
    When I enter an invalid email "user@domain" in the email field
    And I click on the "Create Account" button
    Then I should see an error message "Please enter a valid email address"

  Scenario: Fail to create an account with a weak password
    Given I am on the registration page
    When I enter a weak password "12345"
    And I click on the "Create Account" button
    Then I should see an error message "Password must be at least 6 characters long"
