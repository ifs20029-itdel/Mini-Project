Feature: Product Management
  As a user of the system
  I want to be able to manage products
  So that I can view, create, update, and delete products
  @catagory
  Scenario: Create a Catagory
    Given user is on the product category POST page endpoint
    When a user makes a request with the POST method on the endpoint
    Then the system responds status code 200
    And the post create a catagory that was just created

  @getcategory
  Scenario: Get all catagories
    Given user is on the product category page endpoint
    When user requests the product category endpoint
    Then user should receive a list of products category
    And i receive response code is 200 ok
  @Byid
  Scenario: Get Category by ID
    Given user is on the product Category by ID page endpoint
    When user requests the product Category by ID endpoint
    Then i receive  response code is 200 OK
    And user should receive a Category by ID
  @delete
  Scenario: Delete a Category
    Given user wants to delete category post data with valid ID
    When a user makes a request with the Delete method on the endpoint
    Then the system response with status code 200
    And post data with ID 12513 has been deleted