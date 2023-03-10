package Airlines;



import Utils1.RandomDataGenerator;
import Utils1.RandomDataTypesNames;
import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;
import pojos.Airlinepojo;

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

    public static Map<String, Object> createAirlinePayloadWithRandomData(){

        Map<String, Object> payload = new HashMap<>();
        Faker faker = new Faker();
        payload.put("id",faker.number().digits(10));
        payload.put("name", RandomDataTypesNames.FIRSTNAME);
        payload.put("country",RandomDataTypesNames.COUNTRY);
        payload.put("logo", RandomStringUtils.randomAlphabetic(10));
        payload.put("slogan",RandomStringUtils.randomAlphabetic(10));
        payload.put("head_quaters",RandomDataTypesNames.CITY);
        payload.put("website","https://www." + RandomStringUtils.randomAlphabetic(10)+ ".com/");
        payload.put("established",faker.number().numberBetween(1900,2020));

        return payload;
    }

    public static Airlinepojo createAirlinePayloadWithPojo(){

        Faker faker = new Faker();

        return Airlinepojo.builder().id(Integer.parseInt(RandomDataGenerator.getRandomNumber(5)))
                .name(String.valueOf(RandomDataTypesNames.FIRSTNAME)).country(String.valueOf(RandomDataTypesNames.COUNTRY))
                .logo(RandomStringUtils.randomAlphabetic(10)).sologon(RandomStringUtils.randomAlphabetic(10))
                .head_quaters(String.valueOf(RandomDataTypesNames.CITY)).website("https://www." + RandomStringUtils.randomAlphabetic(10) + ".com/")
                .established(String.valueOf(faker.number().numberBetween(1900, 2020))).build();
    }

    public static Airlinepojo createAirlinePayloadWithPojowithdefault(){

        Faker faker = new Faker();

        return Airlinepojo.builder().id(Integer.parseInt(RandomDataGenerator.getRandomNumber(5)))
                .name(String.valueOf(RandomDataTypesNames.FIRSTNAME)).country(String.valueOf(RandomDataTypesNames.COUNTRY))
                .logo(RandomStringUtils.randomAlphabetic(10)).sologon(RandomStringUtils.randomAlphabetic(10))
                .head_quaters(String.valueOf(RandomDataTypesNames.CITY)).website("https://www." + RandomStringUtils.randomAlphabetic(10) + ".com/")
                .established(String.valueOf(faker.number().numberBetween(1900, 2020))).build();
    }
}
