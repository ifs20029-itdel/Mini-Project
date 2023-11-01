Feature:As a user i have be able to success login so that i can Checkout products

  Scenario: User can checkout product
    Given the user is on the althashop page
    When they click cart button
    And they click the Bayar button
    Then they should complete Checkout