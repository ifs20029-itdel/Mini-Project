package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginSteps extends PageObject {
    private By emailField() {
        return By.xpath("//label[text()='Email']/following-sibling::input");
    }
    private By passwordField() {
        return By.xpath("//label[text()='Password']/following-sibling::input");
    }

    private By SignBtn() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }
    private By Login(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    private By validateFailedLogin(){ return By.xpath("/html/body/div/div/main/div/div/div/div[2]/div[1]");}

    private By invalidpassword(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[2]/div");}

    private By notfillemail(){return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[2]/div");}
    @Step
    public void OnAltaShopPage(){
    open();
    $(SignBtn()).shouldBeVisible();
    }

    @Step
    public void inputEmail(String email){
        $(emailField()).type(email);
    }
    @Step
    public void inputpassword(String password){
        $(passwordField()).type(password);
    }
    @Step
    public void clickSignButton(){
        $(SignBtn()).click();
    }
    @Step
    public void clickSubmitLogin(){
        $(Login()).click();
    }
    @Step
    public void failedLoginBecauseInvalidEmail(){
        $(validateFailedLogin()).isDisabled();
    }
    @Step
    public void failedLoginBecauseInvalidPassword(){
        $(invalidpassword()).isDisabled();
    }
    @Step
    public void failedLoginBecauseNotFillEmail(){
        $(notfillemail()).isDisabled();
    }

}

