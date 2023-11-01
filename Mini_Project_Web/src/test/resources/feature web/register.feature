Feature:As a user i have be able to success login so that i can see products page

Scenario: User can register with valid information
Given the user is on the registration page
When user clicks on Register button
  And use enters Nama Lengkap
  And user enters email
  And user enters password
Then they should be redirected to the login page

  Scenario: User failed register because not fill email
    Given the user is on the registration page
    When user clicks on Register button
    And use enters Nama Lengkap
    And user enters invalid email
    And user enters password
    Then registration failed