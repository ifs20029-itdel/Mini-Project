Feature: Product Management
  As a user of the system
  I want to be able to manage products
  So that I can view, create, update, and delete products

  Scenario: Get all product
    Given user is on the product list page endpoint
    When user requests the product list endpoint
    Then user should receive a list of products
    And i receive that the response code is 200 OK

  Scenario: Create New Product
    Given user is on the product POST page endpoint
    When a user makes a request with the POST method on the endpoint with post data
    Then the system responds with the status code 200
    And the post add new prodoct that was just created

  Scenario: Get product by ID
    Given user is on the product list by ID page endpoint
    When user requests the product list by ID endpoint
    Then i receive that the response code is 200
    And user should receive a products by ID

  Scenario: Delete Product
    Given user wants to delete post data with valid ID
    When a user makes a request with the DELETE method on the endpoint
    Then the system gives a response with status code 200
    And post data with ID 11305 has been deleted

  Scenario: Assign a product rating
    Given user selects makes a request with the POST method on the endpoint
    When the product rating should be assign
    Then the system responds with the status code 200 ok

  Scenario: Get Product Ratings
    Given user is on the product ratings page endpoint
    When user requests the product ratings endpoint
    Then user should receive a list of products ratings
    And i receive response code is 200 OK

  Scenario: Create a Comment for product
    Given user is on the POST product page endpoint
    When a user makes a request with the POST method on endpoint with post data
    Then the system responds status code 200 ok
    And the post Create a Comment for product that was just created

  Scenario: Get Product Comment
    Given user is on the product Comment page endpoint
    When user requests the product comment endpoint
    Then user should receive a list of products comment
    And i receive response code is 200
