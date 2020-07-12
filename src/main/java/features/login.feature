Feature: Login Functionality

Scenario: Check login functionality with valid username and password

Given User is already on login page
When user should be on title page
Then user enters username and password
Then user is click on login button
And user is on home page