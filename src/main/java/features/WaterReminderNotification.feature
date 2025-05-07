Feature: Water Intake Reminder Notification

  As a user,
  I want to get a notification as a reminder to have water,
  So that I can stay hydrated throughout the day.

  Scenario: User receives a push notification to drink water
    Given the user has enabled water reminders in the app
    When the scheduled time for reminder is reached
    Then the mobile app should send a push notification to remind the user to drink water
