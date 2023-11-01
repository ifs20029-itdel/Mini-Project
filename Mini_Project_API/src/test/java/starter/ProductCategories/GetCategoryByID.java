package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCategoryByID {
    protected static String url = "https://altashop-api.fly.dev/api/categories/31412";

    @Step("user is on the product Category by ID page endpoint")
    public String userIsOnTheProductListByIdPageEndpoint(){
        return url;
    }
    @Step("user requests the product Category by ID endpoint")
    public void userRequestTheProductListbyIDendpoint(){
        SerenityRest.given().get(userIsOnTheProductListByIdPageEndpoint());
    }

    @Step("i receive  response code is 200 OK")
    public void SystemGivesaResponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
