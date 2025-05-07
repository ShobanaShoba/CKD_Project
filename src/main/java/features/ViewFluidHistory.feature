Feature: View Fluid Intake History

  As a user,
  I want to view fluid intake history,
  So that I can track my daily hydration over time.

  Scenario: User views fluid intake history
    Given the user is on the fluid tracking system page
    When the user selects the view history option
    Then the user should see the list of previous fluid intakes
