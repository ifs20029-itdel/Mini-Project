package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductRatings {
    protected static String url = "https://altashop-api.fly.dev/api/products/87758/ratings";

    @Step("user is on the product ratings page endpoint")
    public String UserisOnTheProducRatingsPageEndpoint(){
        return url;
    }
    @Step("user requests the product ratings endpoint")
    public void UserrequestTheProductRatingsEndpoint(){
        SerenityRest.given().get(UserisOnTheProducRatingsPageEndpoint());
    }
    @Step("user should receive a list of products ratings")
    public void UserShouldReceiveAListOfProductRatings(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive response code is 200 OK")
    public void TheRespodeCodeis200OK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}