package Airlines;

import java.util.HashMap;
import java.util.Map;

public class Payloads {

    public static String createAirlinePayload(String id,String name,String country,String logo,String slogon,
                                           String headquerters, String website, String establishment ){

        String requestPayload="{\n" +
                "    \"id\": "+id+",\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"country\": \""+country+"\",\n" +
                "    \"logo\": \""+logo+"\",\n" +
                "    \"slogan\": \""+slogon+"\",\n" +
                "    \"head_quaters\": \""+headquerters+"\",\n" +
                "    \"website\": \""+website+"\",\n" +
                "    \"established\": \""+establishment+"\"\n" +
                "}";
        return requestPayload;
    }
    public static Map<String, Object> createAirlinePayloadFromMap(String id, String name, String country, String logo, String slogon,
                                                                  String headquerters, String website, String establishment ){

        Map<String,Object> payload = new HashMap<>();
        payload.put("id",id);
        payload.put("name",name);
        payload.put("country",country);
        payload.put("logo",logo);
        payload.put("slogan",slogon);
        payload.put("head_quaters",headquerters);
        payload.put("website",website);
        payload.put("established",establishment);

        return payload;
    }
}
