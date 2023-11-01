package starter.Page;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class RiwayatTransaction extends PageObject {
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
    private By Profil(){
        return By.xpath("//*[@id=\"app\"]/div[1]/header/div/button[2]/span/i");
    }
    private By RiwayatBtn(){
        return By.xpath("//div[contains(text(),\"Transaksi\")]/parent::div");
    }


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
    public void ProfilBtn(){
        $(Profil()).click();
    }
    @Step
    public void RiwayatBtnn(){
        $(RiwayatBtn()).click();
    }
}

