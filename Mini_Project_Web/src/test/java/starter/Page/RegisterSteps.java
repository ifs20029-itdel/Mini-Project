package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RegisterSteps extends PageObject {
    private By MasukanEmail() {
        return By.xpath("//label[text()='Email']/following-sibling::input");
    }
    private By MasukaPassword() {
        return By.xpath("//label[text()='Password']/following-sibling::input");
    }
    private By MasukaNamaLengkap() {
        return By.xpath("//label[text()='Nama Lengkap']/following-sibling::input");
    }

    private By SignBtn() {
        return By.xpath("//*[@id=\"app\"]/div/header/div/button[2]/span");
    }
    private By RegisterBtn(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
    }
    private By Register(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/div/a");
    }

    private By validateFailedRegister() {
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[1]/div");
    }
    @Step
    public void OnAltaShoppage(){
        open();
        $(SignBtn()).shouldBeVisible();
    }
    @Step
    public void inputNamalengkap(String email){
        $(MasukaNamaLengkap()).type(email);
    }
    @Step
    public void inputEmail(String email){
        $(MasukanEmail()).type(email);
    }
    @Step
    public void inputpassword(String password){
        $(MasukaPassword()).type(password);
    }
    @Step
    public void clickSignButton(){
        $(SignBtn()).click();
    }
    @Step
    public void clickregister(){
        $(Register()).click();
    }

    @Step
    public void clickRegisterBtn(){
        $(RegisterBtn()).click();
    }

    @Step
    public void failedRegisterBecauseInvalidEmail(){$(validateFailedRegister()).isDisabled();}
}

