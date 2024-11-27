Feature: Login page Automation of saucedemo application
Scenario: Check login is successful with valid credentials.
Given User is on login page
When User enters valid username and password
And Clicks on ligin button
Then User should be navigated to homepage
And close the browser
