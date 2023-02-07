package Airlines;

import Utils.RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class CreateAirline {
@Test
    public void createAirline() {

    String endpoint="https://api.instantwebtools.net/v1/airlines";
    String requestPayload="{\n" +
                    "    \"id\": 20037,\n" +
                    "    \"name\": \"Indian Airways\",\n" +
                    "    \"country\": \"India\",\n" +
                    "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                    "    \"slogan\": \"From Sri Lanka\",\n" +
                    "    \"head_quaters\": \"Delhi,India\",\n" +
                    "    \"website\": \"www.srilankaairways.com\",\n" +
                    "    \"established\": \"1990\"\n" +
                    "}";
    Response response = RestUtils.performPost(endpoint,requestPayload,new HashMap<>());
    Assert.assertEquals(response.statusCode(),200);

}
}
