@Sanity
Feature: Login
  
  In Order to successfully login
  As a user
  I should enter correct username and password

  Scenario Outline: In Order verify login to Facebook
    Given user naviagates to Facebook site
    When user validates the login page title
    And user enters "<username>" username
    And user enters "<password>" password
    And user select age category and location
      | Age      | Location |
      | below 18 | India    |
      | above 18 | USA      |
    Then user "<loginType>" logged in to Facebook successfully

    Examples: 
      | username  | password  | loginType |
      | correct   | correct   | shouldbe  |
      | incorrect | incorrect | shouldnot |
