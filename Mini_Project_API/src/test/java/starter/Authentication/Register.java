package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {
    protected static String url = "https://altashop-api.fly.dev/api/auth/register";
    @Step("user is on Register page endpoint")
    public String userIsOnRegisterEndpoint(){
        return url;
    }
    @Step("user requests the Register endpoint")
    public void userRequestTheRegisterEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","rizalsahala@gmail.com");
        requestBody.put("password","rizalsahala125");
        requestBody.put("fullname","Rizal Sahala Bakti");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnRegisterEndpoint());
    }
    @Step("user success Register status code response 200 ok")
    public void TheSystemresponsWithTheStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}

