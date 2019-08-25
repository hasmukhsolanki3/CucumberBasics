@bvt @prod
Feature: Login to Prod

In Order to successfully login to Prod
As a user
I should enter correct username and password

Background:
	Given user naviagates to Facebook site
	When user validates the login page title
	
Scenario: In Order verify login to Facebook to Prod
	And user enters "valid" username
	And user enters "valid" password
	And user validate captcha image
	Then user "shouldbe" logged in to Facebook successfully

Scenario: In Order verify login to Facebook to Prod
	And user enters "invalid" username
	And user enters "invalid" password
	And user validate captcha image
	Then user "shouldnot" logged in to Facebook successfully
	