package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateaCommentForProduct {
    protected static String email="rizalsahala125@gmail.com";
    protected static String password="rizalsahala125";
    public String token ="";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step("I have endpoint auth")
    public String prossesEndpointAuth(){
        return endpointAuth + "/auth/login";
    }

    @Step ("I Send endpoint auth")
    public void KirimEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(prossesEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }
    @Step ("I set endpoint get ratings")
    public String setEndpointRatings() {
        return endpointAuth + "/products/14456/comments";
    }

    @Step ("I send POST HTTP Request")
    public void sendEndpointCreateRatings() {
        String content= "the games are great including Gran Turismo 7 but sadly GT4 is much better";

        String body = "{\n" +
                "    \"content\":\"the games are great including Gran Turismo 7 but sadly GT4 is much better\"\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).body(reqBody.toString()).post(setEndpointRatings());
    }

    @Step("i see status code 200")
    public void getStatusCOde() {
        restAssuredThat(response -> response.statusCode(200));
    }
}

