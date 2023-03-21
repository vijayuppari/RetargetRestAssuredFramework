package Airlines;

import Utils.RestUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import pojos.Airlinepojo;
import pojos.Airlinepojodefault;
import pojos.Names;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CreateAirlineTests extends AirlineAPIS {
@Test(enabled = false)
    public void createAirline() throws IOException {

    Map<String, Object> airlinePayloadFromMap = Payloads.createAirlinePayloadFromMap("20061", "Indian Airways", "India",
            "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png",
            "From Sri Lanka", "Delhi,India", "www.srilankaairways.com", "1990");

    Response airlineAPIresponse = createAirlineAPI(airlinePayloadFromMap);
    Assert.assertEquals(airlineAPIresponse.statusCode(),200);

}
    @Test(enabled = false)
    public void createAirlinewithRandomdata() throws IOException {

        Map<String, Object> airlinePayloadFromMap = Payloads.createAirlinePayloadWithRandomData();
        Response airlineAPIresponse = createAirlineAPI(airlinePayloadFromMap);
        Assert.assertEquals(airlineAPIresponse.statusCode(),200);
    }

    @Test(enabled = false)
    public void createAirlinewithPojo() throws IOException {

        Airlinepojo airlinePayloadWithPojo = Payloads.createAirlinePayloadWithPojo();
        Response airlineAPIresponse = createAirlineAPI(airlinePayloadWithPojo);
        Assert.assertEquals(airlineAPIresponse.statusCode(),200);
    }
    @Test(enabled = false)
    public void createAirlinewithPojowithdefaultandcustom() throws IOException {
        Airlinepojodefault airlinepojodefault = new Airlinepojodefault().toBuilder().name(String.valueOf(Names.VIJAY)).build();
        Response airlineAPIresponse = createAirlineAPI(airlinepojodefault);
        Assert.assertEquals(airlineAPIresponse.statusCode(),200);
    }

    @Test(enabled = false)
    public void createAirlinewithPojowithdefaultwithsetofcustomvalues() throws IOException {
        Airlinepojodefault airlinepojodefault = new Airlinepojodefault();
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(airlinepojodefault));
    }

    @Test(enabled = true)
    public void createAirlineandverifyresponse() throws IOException {

        Airlinepojodefault airlinepojodefault= new Airlinepojodefault();
        Response response = createAirlineAPI(airlinepojodefault);

        // First Way
        Assert.assertEquals(response.jsonPath().getString("name"),airlinepojodefault.getName());

        // Second way:

        ObjectMapper objectMapper = new ObjectMapper();
        Airlinepojodefault airlinepojodefault1 = objectMapper.readValue(response.getBody().asString(), Airlinepojodefault.class);
        Assert.assertEquals(airlinepojodefault1,airlinepojodefault);


    }
}
