package pojos;

import Utils1.RandomDataGenerator;
import Utils1.RandomDataTypesNames;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.stream.Stream;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Airlinepojodefault {

    private String gender =Stream.of("male","female").findAny().get();
    private int id =Integer.parseInt(RandomDataGenerator.getRandomNumber(5));
    private String name= RandomDataGenerator.getRandomData(RandomDataTypesNames.FIRSTNAME);
    private String country =RandomDataGenerator.getRandomData(RandomDataTypesNames.COUNTRY);
    private  String logo = RandomStringUtils.randomAlphabetic(10);
   // private String sologon = RandomDataGenerator.getRandomData(RandomDataTypesNames.SLOGON);
    private String head_quaters = String.valueOf(RandomDataTypesNames.CITY);
    private String website= "https://www." + RandomStringUtils.randomAlphabetic(10) + ".com/";
    private String established = String.valueOf(RandomDataGenerator.getRangeofyear());

}
