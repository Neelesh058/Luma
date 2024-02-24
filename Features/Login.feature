

Feature: User Login functionality
@Part1
Scenario: User validate the login
  Given I am on the login page
  When  I enter valid credentials
  And   I click on the login button
  Then  I should be logged in to my account
  Then  I should be in HomePage

@Part2

  Scenario:  verify user id able to reset password
  Given user is on password reset page
  When user check the change password checkbox
  And enter the current password new password and confirm password
  Then user save the details