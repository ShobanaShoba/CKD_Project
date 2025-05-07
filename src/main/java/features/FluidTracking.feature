Feature: Fluid Tracking System

  As a user,
  I want to add daily fluid intake from time to time,
  So that I can track my hydration.

  Scenario: User saves daily fluid intake
    Given the user navigates to the fluid tracking system
    When the user adds a fluid intake of 250ml at 10 AM
    And the user clicks the save button
    Then the fluid intake should be saved successfully
