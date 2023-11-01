package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    protected static String url = "https://altashop-api.fly.dev/api/products/87758";

    @Step("user is on the product list by ID page endpoint")
    public String userIsOnTheProductListByIdPageEndpoint(){
        return url;
    }
    @Step("user requests the product list by ID endpoint")
    public void userRequestTheProductListbyIDendpoint(){
        SerenityRest.given().get(userIsOnTheProductListByIdPageEndpoint());
    }

    @Step("i receive that the response code is 200")
    public void SystemGivesaResponseWithStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}