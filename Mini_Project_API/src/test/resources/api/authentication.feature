Feature: Authentication
  As a user of the system
  I want to be able to manage products

  Scenario: Register
    Given user is on Register page endpoint
    When user requests the Register endpoint
    Then user success Register status code response 200 ok

  @login
  Scenario: Login
    Given user is on Login page endpoint
    When user requests the Login endpoint
    Then user success Login status code response 200 ok

  Scenario: Get User Information
    Given user have endpoint auth
    When user send endpoint auth
    When user has endpoint to get user information
    And user get user information
    Then User get user information status code 200