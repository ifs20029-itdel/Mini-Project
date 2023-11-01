package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    protected static String url = "https://altashop-api.fly.dev/api/categories";

    @Step("user is on the product category page endpoint")
    public String UserisOnTheProductListPageEndpoint(){
        return url;
    }
    @Step("user requests the product category endpoint")
    public void UserrequestTheProductListEndpoint(){
        SerenityRest.given().get(UserisOnTheProductListPageEndpoint());
    }
    @Step("user should receive a list of products category")
    public void UserShouldReceiveAListOfProduct(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive response code is 200 ok")
    public void thatTheRespodeCodeis200OK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
