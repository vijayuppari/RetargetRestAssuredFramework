package Airlines;

import Utils1.JsonUtils;

import java.io.IOException;
import java.util.Map;

public class Base {

    public static Map<String, Object> jsondata;

    static {
        String env = System.getProperty("env") == null ? "qa" : System.getProperty("env");
        try {
            jsondata = JsonUtils.getJsonDataasMap("/qa/AirlineDataApp.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
