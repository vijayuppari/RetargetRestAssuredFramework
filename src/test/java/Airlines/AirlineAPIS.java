package Airlines;

import Utils.RestUtils;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIS {

    public Response createAirlineAPI(Map<String,Object> payload){
        String endpoint = (String) Base.jsondata.get("createAirlineendpoint");
        return RestUtils.performPost(endpoint,payload,new HashMap<>());

    }
}
