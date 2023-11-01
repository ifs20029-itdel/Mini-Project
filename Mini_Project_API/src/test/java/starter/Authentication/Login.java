package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://altashop-api.fly.dev/api/auth/login";
    @Step("user is on Login page endpoint")
    public String userIsOnLoginEndpoint(){
        return url;
    }
    @Step("user requests the Login endpoint")
    public void userRequestTheLoginEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","rizalsahala125@gmail.com");
        requestBody.put("password","rizalsahala125");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnLoginEndpoint());
    }
    @Step("user success Login status code response 200 ok")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

