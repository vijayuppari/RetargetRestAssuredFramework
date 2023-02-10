package Utils1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class JsonUtils {

    private static ObjectMapper objectMapper = new ObjectMapper();
    public static Map<String,Object> getJsonDataasMap(String jsonFileName) throws IOException {

        String completejsonpath = System.getProperty("user.dir") + "\\src\\test\\resources\\airlineData\\"+jsonFileName;
        Map<String,Object> data = objectMapper.readValue(new File(completejsonpath), new TypeReference<>(){});
        return data;
    }

}
