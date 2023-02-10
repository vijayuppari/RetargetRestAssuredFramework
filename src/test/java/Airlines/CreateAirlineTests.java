package Airlines;

import Utils.RestUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateAirlineTests extends AirlineAPIS {
@Test
    public void createAirline() throws IOException {

    Map<String, Object> airlinePayloadFromMap = Payloads.createAirlinePayloadFromMap("20061", "Indian Airways", "India",
            "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
            "From Sri Lanka", "Delhi,India", "www.srilankaairways.com", "1990");

    Response airlineAPIresponse = createAirlineAPI(airlinePayloadFromMap);
    Assert.assertEquals(airlineAPIresponse.statusCode(),200);

}
}
