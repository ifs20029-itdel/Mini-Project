package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Page.*;

public class UserSteps {

    @Steps
    LoginSteps loginSteps;
    @Steps
    RegisterSteps registerSteps;
    @Steps
    AddToCartSteps addToCartSteps;
    @Steps
    CheckoutSteps checkoutSteps;
    @Steps
    RiwayatTransaction riwayatTransaction;
    @Steps
    LogoutSteps logoutSteps;



    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        loginSteps.OnAltaShopPage();
    }

    @When("user clicks on Sign button")
    public void userClicksOnSignButton() {
        loginSteps.clickSignButton();
    }

    @And("user enters valid email")
    public void userEntersValidEmail() {
        loginSteps.inputEmail("rizalsahala125@gmail.com");
    }

    @And("user enters valid password")
    public void userEntersValidPassword() {
        loginSteps.inputpassword("rizalsahala125");
    }

    @And("they click the Login button")
    public void theyClickTheButton() {
        loginSteps.clickSubmitLogin();
    }

    @Then("they should be redirected to the home page")
    public void theyShouldBeRedirectedToTheHomePage() {
        System.out.println("user should be redirected to AltaShop homepage");
    }

    @And("user enters invalid email")
    public void userEntersInvalidEmail() { loginSteps.inputEmail("rizalsahala@gmail.com");}

    @Then("verify failed login")
    public void failedLogin() {loginSteps.failedLoginBecauseInvalidEmail(); }

    @And("user not enter email")
    public void userNotFillEmail1() { loginSteps.inputEmail(" ");}

    @Then("verify failed login because not enter email")
    public void notfillEmail() {loginSteps.failedLoginBecauseInvalidEmail(); }

    @And("user enters invalid password")
    public void userEntersInvalidPassword() { loginSteps.inputpassword("rizalsahala");}

    @Then("verify failed login because invalid password")
    public void invalidpassword() {loginSteps.failedLoginBecauseInvalidEmail(); }

// ==========================Register=======================================

    @Given("the user is on the registration page")
    public void theUserIsOnTheRegistrationPage() {
        registerSteps.OnAltaShoppage();
        registerSteps.clickSignButton();
    }

    @When("user clicks on Register button")
    public void userClicksOnRegisterButton() {
        registerSteps.clickregister();

    }

    @And("use enters Nama Lengkap")
    public void useEntersNamaLengkap() {
        registerSteps.inputNamalengkap("Rizal Sahala Bakti");
    }

    @And("user enters email")
    public void userEntersEmail() {
        registerSteps.inputEmail("rizalsahala125@gmail.com");
    }

    @And("user enters password")
    public void userEntersPassword() {
        registerSteps.inputpassword("rizalsahala125");
    }

    @Then("they should be redirected to the login page")
    public void theyShouldBeRedirectedToTheLoginPage() {
        System.out.println("user should be redirected to Login homepage");
    }

    @And("user enters Not Fill email")
    public void userNotFillEmail() { registerSteps.inputEmail(" ");}

    @Then("registration failed")
    public void registrationfailed(){
        System.out.println("The error notification \"email is required\" appears");
    }

//===========================Add To Cart ====================================

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
        addToCartSteps.OnAltaShopPage();
        addToCartSteps.clickSignButton();
        addToCartSteps.inputEmail("rizalsahala125@gmail.com");
        addToCartSteps.inputpassword("rizalsahala125");
        addToCartSteps.clickSubmitLogin();

    }
    @When("they click Beli button on a product they want to buy")
    public void theyClickOnAProductTheyWantToBuy() {
        addToCartSteps.clickbeli();
    }
    @Then("the product should be added to their cart")
    public void theProductShouldBeAddedToTheirCart() {
        System.out.println("the product should be added to their cart");
    }

// ==========================Checkout=======================================

    @Given("the user is on the althashop page")
    public void theUserIsOnTheAlthashopPage() {
        checkoutSteps.OnAltaShopPage();
        checkoutSteps.clickSignButton();
        checkoutSteps.inputEmail("rizalsahala125@gmail.com");
        checkoutSteps.inputpassword("rizalsahala125");
        checkoutSteps.clickSubmitLogin();
        addToCartSteps.clickbeli();

    }

    @When("they click cart button")
    public void theyClickCartButton() {
        checkoutSteps.CartBtn();
    }
    @And("they click the Bayar button")
    public void theyClickTheBayarButton() {
        checkoutSteps.BayarBtn();
    }
    @Then("they should complete Checkout")
    public void theyShouldCompleteCheckout() {
        System.out.println("they should complete Checkout");
    }

// =======================RiwayatTransaction===================================

    @Given("the user has made purchases on the website")
    public void theUserHasMadePurchasesOnTheWebsite() {
        riwayatTransaction.OnAltaShopPage();
        riwayatTransaction.clickSignButton();
        riwayatTransaction.inputEmail("rizalsahala125@gmail.com");
        riwayatTransaction.inputpassword("rizalsahala125");
        riwayatTransaction.clickSubmitLogin();

    }
    @When("they click on the Riwayat Button")
    public void theyClickOnTheLink() {
        riwayatTransaction.ProfilBtn();
        riwayatTransaction.RiwayatBtnn();
    }
    @Then("they should be redirected to the riwayat transaction page")
    public void theyShouldBeRedirectedToTheRiwayatTransactionPage() {
        System.out.println("they should be redirected to the riwayat transaction page");
    }

//=========================Logout===================================================

    @Given("the user is on the home page altashop")
    public void theUserIsOnTheHomePageAltashop() {
        logoutSteps.OnAltaShopPage();
        logoutSteps.clickSignButton();
        logoutSteps.inputEmail("rizalsahala125@gmail.com");
        logoutSteps.inputpassword("rizalsahala125");
        logoutSteps.clickSubmitLogin();
    }

    @When("they click on the LogoutButton")
    public void theyClickOnTheLogoutButton() {
        logoutSteps.ProfilBtn();
        logoutSteps.LogoutBtn();
    }

    @Then("they should be redirected to the login page again")
    public void theyShouldBeRedirectedToTheLoginPageAgain() {
        System.out.println("they should be redirected to the login page again");
    }
}
