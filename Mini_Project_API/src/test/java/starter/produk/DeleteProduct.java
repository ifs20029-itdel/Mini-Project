package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products/87759";

    @Step("user wants to delete post data with valid ID")
    public String UserWantToDeletePostDataWithValidID(){
        return url;
    }
    @Step("a user makes a request with the DELETE method on the endpoint")
    public void UserMakeArequestWithTheDeleteMethode(){
        SerenityRest.given().delete(UserWantToDeletePostDataWithValidID());
    }
    @Step("the system gives a response with status code 200")
    public void theSystemGiveAresponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
