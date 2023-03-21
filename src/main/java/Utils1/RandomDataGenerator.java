package Utils1;

import net.datafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

public class RandomDataGenerator {


    static Faker faker = new Faker();

    public static String getFirstName(){
       return  faker.name().firstName();
    }

    public static String getLastName(){
        return  faker.name().lastName();
    }

    public static String getRandomData(RandomDataTypesNames randomDataTypesNames){

        switch (randomDataTypesNames){
            case FIRSTNAME:
                return faker.name().firstName();
            case LASTNAME:
                return faker.name().lastName();
            case FULLNAME:
                return faker.name().fullName();
            case CITY:
                return faker.address().city();
            case COUNTRY:
                return  faker.address().country();
            case SLOGON:
                return RandomStringUtils.randomAlphanumeric(6);
            default:
                return "This type of random data type is not available";
        }
    }

    public static String getRandomNumber(int count){
        return faker.number().digits(count);
    }

    public static String getRandomSlogon(int count){
        return RandomStringUtils.randomAlphabetic(10);
    }

    public static int getRangeofyear(){
        return faker.number().numberBetween(1900,2000);
    }

}
