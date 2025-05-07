Feature: Set Water Intake Limit

  As a user,
  I want to set a limit for the water intake,
  So that I can monitor and manage my daily hydration goal.

  Scenario: User sets a daily water intake limit
    Given the user is on the fluid tracking system page
    When the user sets a water intake limit of 2000ml
    Then the system should save the water intake limit successfully
