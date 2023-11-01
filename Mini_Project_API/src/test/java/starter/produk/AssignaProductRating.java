package starter.produk;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AssignaProductRating {

    public String token ="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IlJpemFsIFNhaGFsYSBCYWt0aSIsIkVtYWlsIjoicml6YWxzYWhhbGExMjVAZ21haWwuY29tIn0.JIyAUYc9y3zdZt_HkFUkUf7pd9mMKgsahAkkKFEKzVU";
    public String endpointAuth = "https://altashop-api.fly.dev/api";

    @Step ("I set endpoint get ratings")
    public String setEndpointRatings() {
        return endpointAuth + "/products/87758/ratings";
    }

    @Step ("I send POST HTTP Request")
    public void sendEndpointCreateRatings() {
        String count = "3";

        String body = "{\n" +
                "    \"count\":" + count + ",\n" +
                "}";
        JSONObject reqBody = new JSONObject(body);
        SerenityRest.given().header("Authorization", "Bearer "+token).body(reqBody.toString()).post(setEndpointRatings());
    }

    @Step("i see status code 200")
    public void getStatusCOde() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
