package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateNewProduct {
    protected static String url = "https://altashop-api.fly.dev/api/products";
    @Step("user is on the product POST page endpoint")
    public String userIsOnTheProductPostPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint with post data")
    public void UserMakesArequestWithTheOstMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","Sony PS5");
        requestBody.put("description","play has no limits");
        requestBody.put("price",299);
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductPostPageEndpoint());
    }
    @Step("tthe system responds with the status code 200")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}


