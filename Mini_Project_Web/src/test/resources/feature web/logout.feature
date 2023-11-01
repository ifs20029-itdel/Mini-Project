Feature:As a user i have be able to success logout


  Scenario: User can logout account
    Given the user is on the home page altashop
    When they click on the LogoutButton
    Then they should be redirected to the login page again