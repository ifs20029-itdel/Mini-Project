package starter.ProductCategories;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class CreateaCatagory { protected static String url = "https://altashop-api.fly.dev/api/categories";
    @Step("user is on the product catagory POST page endpoint")
    public String userIsOnTheProductPostPageEndpoint(){
        return url;
    }
    @Step("a user makes a request with the POST method on the endpoint")
    public void UserMakesArequestWithTheOstMethode(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("name","No gaming");
        requestBody.put("description","not for purposes");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductPostPageEndpoint());
    }
    @Step("the system responds status code 200")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
