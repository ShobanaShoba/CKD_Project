Feature: Home Page Navigation

  As a user,
  I want to navigate to different features from the home page,
  So that I can access all the app functionalities easily.

  Scenario: User navigates to all features from the home page
    Given the user is on the home page
    When the user clicks on each feature icon
    Then the user should be navigated to the corresponding feature page
