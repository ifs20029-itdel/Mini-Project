package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.GetUserInformation;
import starter.Authentication.Login;
import starter.Authentication.Register;
import starter.ProductCategories.CreateaCatagory;
import starter.ProductCategories.DeleteaCategory;
import starter.ProductCategories.GetAllCategories;
import starter.ProductCategories.GetCategoryByID;
import starter.produk.*;

public class UserSteps {
    @Steps
    GetAllProduct getAllProduct;
    @Steps
    CreateNewProduct createNewProduct;
    @Steps
    GetProductByID getProductByID;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    AssignaProductRating assignaProductRating;
    @Steps
    GetProductRatings getProductRatings;
    @Steps
    Register register;
    @Steps
    Login login;
    @Steps
    GetUserInformation getUserInformation;
    @Steps
    CreateaCommentForProduct createaCommentForProduct;
    @Steps
    GetProductComment getProductComment;
    @Steps
    CreateaCatagory createaCatagory;
    @Steps
    GetAllCategories getAllCategories;
    @Steps
    GetCategoryByID getCategoryByID;
    @Steps
    DeleteaCategory deleteaCategory;


    @Given("user is on the product list page endpoint")
    public void userIsOnTheProductListPageEndpoint() {
        getAllProduct.UserisOnTheProductListPageEndpoint();
    }

    @When("user requests the product list endpoint")
    public void userRequestsTheProductListEndpoint() {
        getAllProduct.UserrequestTheProductListEndpoint();
    }

    @Then("user should receive a list of products")
    public void userShouldReceiveAListOfProducts() {
        getAllProduct.UserShouldReceiveAListOfProduct();
    }

    @And("i receive that the response code is 200 OK")
    public void iReceiveThatTheResponseCodeIsOK() {
        getAllProduct.thatTheRespodeCodeis200OK();
    }

    // ============================CreateNewProduct================================
    @Given("user is on the product POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        createNewProduct.userIsOnTheProductPostPageEndpoint();
    }

    @When("a user makes a request with the POST method on the endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpointWithPostData() {
        createNewProduct.UserMakesArequestWithTheOstMethode();

    }

    @Then("the system responds with the status code 200")
    public void theSystemRespondsWithTheStatusCode() {
        createNewProduct.TheSystemresponsWithTheStatusCode200();
    }

    @And("the post add new prodoct that was just created")
    public void thePostAddNewProdoctThatWasJustCreated() {
    }


    // =============================GetProductByID=====================================
    @Given("user is on the product list by ID page endpoint")
    public void userIsOnTheProductListByIDPageEndpoint() {
        getProductByID.userIsOnTheProductListByIdPageEndpoint();
    }

    @When("user requests the product list by ID endpoint")
    public void userRequestsTheProductListByIDEndpoint() {
        getProductByID.userRequestTheProductListbyIDendpoint();
    }

    @Then("i receive that the response code is 200")
    public void iReceiveThatTheResponseCodeIs() {
        getProductByID.SystemGivesaResponseWithStatusCode200();
    }

    @And("user should receive a products by ID")
    public void userShouldReceiveAProductsByID() {
    }
    //===============================DeleteProduct=============================
    @Given("user wants to delete post data with valid ID")
    public void userWantsToDeletePostDataWithValidID() {
        deleteProduct.UserWantToDeletePostDataWithValidID();

    }

    @When("a user makes a request with the DELETE method on the endpoint")
    public void aUserMakesARequestWithTheDELETEMethodOnTheEndpoint() {
        deleteProduct.UserMakeArequestWithTheDeleteMethode();
    }

    @Then("the system gives a response with status code 200")
    public void theSystemGivesAResponseWithStatusCode() {
        deleteProduct.theSystemGiveAresponseWithStatusCode200();
    }

    @And("post data with ID 11305 has been deleted")
    public void postDataWithIDHasBeenDeleted() {
    }
    //================================AssignAProductRating==================================
    @Given("user selects makes a request with the POST method on the endpoint")
    public void userSelectsMakesARequestWithThePOSTMethodOnTheEndpoint() {
        assignaProductRating.setEndpointRatings();
    }

    @When("the product rating should be assign")
    public void theProductRatingShouldBeAssign() {
        assignaProductRating.sendEndpointCreateRatings();
    }

    @Then("the system responds with the status code 200 ok")
    public void theSystemRespondsWithTheStatusCodeOk() {
        assignaProductRating.getStatusCOde();
    }
    //====================GetProductRating=============================
    @Given("user is on the product ratings page endpoint")
    public void userIsOnTheProductRatingsPageEndpoint() {
        getProductRatings.UserrequestTheProductRatingsEndpoint();
    }

    @When("user requests the product ratings endpoint")
    public void userRequestsTheProductRatingsEndpoint() {
        getProductRatings.UserrequestTheProductRatingsEndpoint();
    }

    @Then("user should receive a list of products ratings")
    public void userShouldReceiveAListOfProductsRatings() {
        getProductRatings.UserShouldReceiveAListOfProductRatings();
    }

    @And("i receive response code is 200 OK")
    public void iReceiveResponseCodeIsOK() {
        getProductRatings.TheRespodeCodeis200OK();
    }
    //============================Register==============================
    @Given("user is on Register page endpoint")
    public void userIsOnRegisterPageEndpoint() {
        register.userIsOnRegisterEndpoint();
    }

    @When("user requests the Register endpoint")
    public void userRequestsTheRegisterEndpoint() {
        register.userRequestTheRegisterEndpoint();
    }

    @Then("user success Register status code response 200 ok")
    public void userSuccessRegisterStatusCodeResponseOk() {
        register.TheSystemresponsWithTheStatusCode200();
    }
    //================================Login========================================
    @Given("user is on Login page endpoint")
    public void userIsOnLoginPageEndpoint() {
        login.userIsOnLoginEndpoint();
    }

    @When("user requests the Login endpoint")
    public void userRequestsTheLoginEndpoint() {
        login.userRequestTheLoginEndpoint();
    }

    @Then("user success Login status code response 200 ok")
    public void userSuccessLoginStatusCodeResponseOk() {
        login.TheSystemresponsWithTheStatusCode200();
    }
    //==========================GetUserInformation==================================
    @Given("user have endpoint auth")
    public void userHaveEndpointAuth() {
        getUserInformation.setPostEndpointAuth();
    }

    @When("user send endpoint auth")
    public void userSendEndpointAuth() {
        getUserInformation.sendEndpointAuth();
    }

    @When("user has endpoint to get user information")
    public void userHasEndpointToGetUserInformation() {
        getUserInformation.setEnpointGet();
    }

    @And("user get user information")
    public void userGetUserInformation() {
        getUserInformation.sendGetUserInfo();
    }

    @Then("User get user information status code 200")
    public void userGetUserInformationStatusCode() {
        getUserInformation.UserGetUserInformationStatusCode200();
    }
    //============================= Create a Comment for product=====================================
    @Given("user is on the POST product page endpoint")
    public void userIsOnThePOSTProductPageEndpoint() {
        createaCommentForProduct.prossesEndpointAuth();
        createaCommentForProduct.KirimEndpointAuth();
        createaCommentForProduct.setEndpointRatings();

    }

    @When("a user makes a request with the POST method on endpoint with post data")
    public void aUserMakesARequestWithThePOSTMethodOnEndpointWithPostData() {
        createaCommentForProduct.sendEndpointCreateRatings();
    }

    @Then("the system responds status code 200 ok")
    public void theSystemRespondsStatusCodeOk() {
        createaCommentForProduct.getStatusCOde();
    }
    @And("the post Create a Comment for product that was just created")
    public void thePostCreateACommentForProductThatWasJustCreated() {
    }
    //================================ Procduct Comment =========================
    @Given("user is on the product Comment page endpoint")
    public void userIsOnTheProductCommentPageEndpoint() {
        getProductComment.UserrequestTheProductCommentEndpoint();
    }

    @When("user requests the product comment endpoint")
    public void userRequestsTheProductCommentEndpoint() {
        getProductComment.UserShouldReceiveAListOfProductComment();

    }

    @Then("user should receive a list of products comment")
    public void userShouldReceiveAListOfProductsComment() {
        getProductComment.UserShouldReceiveAListOfProductComment();
    }

    @And("i receive response code is 200")
    public void iReceiveResponseCodeIs() {
        getProductComment.TheRespodeCodeis200OK();
    }

    //====================================== Crate a catagory =============================
    @Given("user is on the product category POST page endpoint")
    public void userIsOnTheProductCatagoryPOSTPageEndpoint() {
        createaCatagory.userIsOnTheProductPostPageEndpoint();
    }

    @When("a user makes a request with the POST method on the endpoint")
    public void aUserMakesARequestWithThePOSTMethodOnTheEndpoint() {
        createaCatagory.UserMakesArequestWithTheOstMethode();
    }

    @Then("the system responds status code 200")
    public void theSystemRespondsStatusCode() {
        createaCatagory.TheSystemresponsWithTheStatusCode200();
    }

    @And("the post create a catagory that was just created")
    public void thePostCreateACatagoryThatWasJustCreated() {

    }
    //====================Get All Categories ===========================
    @Given("user is on the product category page endpoint")
    public void userIsOnTheProductCategoryPageEndpoint() {
        getAllCategories.UserisOnTheProductListPageEndpoint();
    }

    @When("user requests the product category endpoint")
    public void userRequestsTheProductCategoryEndpoint() {
        getAllCategories.UserrequestTheProductListEndpoint();
    }

    @Then("user should receive a list of products category")
    public void userShouldReceiveAListOfProductsCategory() {
        getAllCategories.UserShouldReceiveAListOfProduct();
    }

    @And("i receive response code is 200 ok")
    public void iReceiveResponseCodeIsOk() {
        getAllCategories.thatTheRespodeCodeis200OK();
    }
    //============================GET Category By ID =====================================
    @Given("user is on the product Category by ID page endpoint")
    public void userIsOnTheProductCategoryByIDPageEndpoint() {
        getCategoryByID.userIsOnTheProductListByIdPageEndpoint();
    }

    @When("user requests the product Category by ID endpoint")
    public void userRequestsTheProductCategoryByIDEndpoint() {
        getCategoryByID.userRequestTheProductListbyIDendpoint();
    }

    @Then("i receive  response code is 200 OK")
    public void iReceiveResponseCode_IsOK() {
        getCategoryByID.SystemGivesaResponseWithStatusCode200();
    }

    @And("user should receive a Category by ID")
    public void userShouldReceiveACategoryByID() {
    }
    //=======================Delete a Category ===================================
    @Given("user wants to delete category post data with valid ID")
    public void userWantsToDeleteCategoryPostDataWithValidID() {
        deleteaCategory.UserWantToDeletePostDataWithValidID();

    }

    @When("a user makes a request with the Delete method on the endpoint")
    public void aUserMakesARequestWithTheDeleteMethodOnTheEndpoint() {
        deleteaCategory.UserMakeArequestWithTheDeleteMethode();
    }

    @Then("the system response with status code 200")
    public void theSystemResponseWithStatusCode() {
        deleteaCategory.theSystemGiveAresponseWithStatusCode200();
    }

    @And("post data with ID 12513 has been deleted")
    public void postDataWithIDHasBeen_Deleted() {
    }
}