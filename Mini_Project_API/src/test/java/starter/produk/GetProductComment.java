package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductComment {
    protected static String url = "https://altashop-api.fly.dev/api/products/87758/comments";

    @Step("user is on the product comment page endpoint")
    public String UserisOnTheProducCommentPageEndpoint(){
        return url;
    }
    @Step("user requests the product comment endpoint")
    public void UserrequestTheProductCommentEndpoint(){
        SerenityRest.given().get(UserisOnTheProducCommentPageEndpoint());
    }
    @Step("user should receive a list of products comment")
    public void UserShouldReceiveAListOfProductComment(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("i receive response code is 200 OK")
    public void TheRespodeCodeis200OK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}