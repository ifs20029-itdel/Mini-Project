Feature:As a user i have be able to success login so that i can see products page

  Scenario: User can add product to cart
    Given the user is on the home page
    When they click Beli button on a product they want to buy
    Then the product should be added to their cart
