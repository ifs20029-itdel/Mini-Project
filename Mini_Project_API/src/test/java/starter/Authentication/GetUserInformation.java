package starter.Authentication;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.asynchttpclient.Response;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserInformation {
    protected static String email="rizalsahala125@gmail.com";
    protected static String password="rizalsahala125";
    public String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpemFsIFNhaGFsYSBCYWt0aSIsIkVtYWlsIjoicml6YWxzYWhhbGExMjVAZ21haWwuY29tIn0.JIyAUYc9y3zdZt_HkFUkUf7pd9mMKgsahAkkKFEKzVU";
    public String endpointAuth="https://altashop-api.fly.dev/api/auth";
    @Step("I have endpoint auth")
    public String setPostEndpointAuth(){
        return endpointAuth + "/login";
    }

    @Step ("I Send endpoint auth")
    public void sendEndpointAuth(){
        String body = "{\n" +
                "    \"email\":" + email + ",\n" +
                "    \"password\":" + password + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);

        SerenityRest.given().header("Content-Type", "application/json").body(reqBody.toString()).post(setPostEndpointAuth());
        token = lastResponse().getBody().jsonPath().get("data");
    }

    @Step("i send endpoint get")
    public String setEnpointGet(){
        return endpointAuth + "/info";
    }

    @Step("i Send GET HTTP Request")
    public void sendGetUserInfo(){
        SerenityRest.given().header("Authorization", "Bearer " + token).get(setEnpointGet());
    }
    @Step("User get user information status code 200")
    public void UserGetUserInformationStatusCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
