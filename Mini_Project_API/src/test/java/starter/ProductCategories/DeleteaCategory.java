package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteaCategory {
    protected static String url = "https://altashop-api.fly.dev/api/categories/31415";

    @Step("user wants to delete category post data with valid ID")
    public String UserWantToDeletePostDataWithValidID(){
        return url;
    }
    @Step("a user makes a request with the Delete method on the endpoint")
    public void UserMakeArequestWithTheDeleteMethode(){
        SerenityRest.given().delete(UserWantToDeletePostDataWithValidID());
    }
    @Step("the system response with status code 200")
    public void theSystemGiveAresponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
