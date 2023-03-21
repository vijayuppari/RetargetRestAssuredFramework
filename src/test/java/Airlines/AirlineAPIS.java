package Airlines;

import Utils.RestUtils;
import io.restassured.response.Response;
import pojos.Airlinepojo;
import pojos.Airlinepojodefault;

import java.util.HashMap;
import java.util.Map;

public class AirlineAPIS {

    public Response createAirlineAPI(Map<String,Object> payload){
        String endpoint = (String) Base.jsondata.get("createAirlineendpoint");
        return RestUtils.performPost(endpoint,payload,new HashMap<>());

    }

    public Response createAirlineAPI(Airlinepojo payload){
        String endpoint = (String) Base.jsondata.get("createAirlineendpoint");
        return RestUtils.performPost(endpoint,payload,new HashMap<>());
    }

    public Response createAirlineAPI(Airlinepojodefault payload){
        String endpoint = (String) Base.jsondata.get("createAirlineendpoint");
        return RestUtils.performPost(endpoint,payload,new HashMap<>());
    }

}
