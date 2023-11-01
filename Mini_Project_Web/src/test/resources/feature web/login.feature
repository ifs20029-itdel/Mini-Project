Feature:As a user i have be able to success login so that i can see products page

  @login
  Scenario: User success login with valid credentials
    Given the user is on the login page
    When user clicks on Sign button
    And user enters valid email
    And user enters valid password
    And they click the Login button
    Then they should be redirected to the home page


  Scenario: User failed login because invalid email
    Given the user is on the login page
    When user clicks on Sign button
    And user enters invalid email
    And user enters valid password
    And they click the Login button
    Then verify failed login

  Scenario: User failed login because invalid password
    Given the user is on the login page
    When user clicks on Sign button
    And user enters valid email
    And user enters invalid password
    And they click the Login button
    Then verify failed login because invalid password


  Scenario: User failed login because not enter email
    Given the user is on the login page
    When user clicks on Sign button
    And user not enter email
    And user enters valid password
    And they click the Login button
    Then verify failed login because not enter email