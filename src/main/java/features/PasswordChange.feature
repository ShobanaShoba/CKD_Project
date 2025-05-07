Feature: Change Password

  Scenario: Successful password change
    Given the user is logged in
    And the user navigates to the settings page
    When the user enters the old password and a new password
    And clicks the "Change Password" button
    Then the password should be successfully changed
    And a confirmation message should be displayed

  Scenario: Password change fails with incorrect old password
    Given the user is logged in
    And the user navigates to the settings page
    When the user enters an incorrect old password
    And enters the new password
    And clicks the "Change Password" button
    Then an error message should be displayed indicating the old password is incorrect

  Scenario: Password change fails with mismatched new passwords
    Given the user is logged in
    And the user navigates to the settings page
    When the user enters the old password
    And enters mismatched new passwords
    And clicks the "Change Password" button
    Then an error message should be displayed indicating the new passwords do not match
