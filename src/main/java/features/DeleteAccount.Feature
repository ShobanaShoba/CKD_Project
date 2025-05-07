Feature: Delete Account

  Scenario: Successful account deletion
    Given the user is logged in
    And the user navigates to the settings page
    When the user clicks on the "Delete Account" button
    And confirms the account deletion
    Then the user should see a confirmation message saying "Your account has been deleted"
    And the user should be logged out

  Scenario: Account deletion fails without confirmation
    Given the user is logged in
    And the user navigates to the settings page
    When the user clicks on the "Delete Account" button
    Then the user should see a warning asking for confirmation

  Scenario: Account deletion fails due to an error
    Given the user is logged in
    And the user navigates to the settings page
    When the user clicks on the "Delete Account" button
    And an error occurs during deletion
    Then the user should see an error message saying "An error occurred while deleting your account. Please try again later."
