Feature: Download Fluid Tracking History Report

  As a user,
  I want to download my fluid tracking history as a report,
  So that I can keep a record for future reference.

  Scenario: User downloads fluid tracking history report
    Given the user is on the fluid tracking system page
    When the user clicks the download report button
    Then the fluid tracking history report should be downloaded successfully
