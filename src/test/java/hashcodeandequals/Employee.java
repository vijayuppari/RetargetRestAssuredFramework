package hashcodeandequals;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@AllArgsConstructor
@EqualsAndHashCode
public class Employee {

    private int id;
    private String name;

    private  String gender;


    // These equals and hashcode methods are useful to override and acheive our custom
    // behavoiur incase if we have 100s of fields creating these is big challange
    // So that we will use annotation as lombok it will take care of it

    /*@Override
    public boolean equals(Object obj) {
        Employee e= (Employee) obj;
        return this.id==e.id && this.name==e.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }*/
}
