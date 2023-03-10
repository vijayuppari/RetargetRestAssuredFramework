package pojos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@Builder
public class Airlinepojo {

    private int id;
    private String name;
    private String country;
    private  String logo;
    private String sologon;
    private String head_quaters;
    private String website;
    private String established;

}
