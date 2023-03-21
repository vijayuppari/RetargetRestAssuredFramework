package hashcodeandequals;

import java.util.HashSet;
import java.util.Set;

public class EmployeeImpl {

    public static void main(String[] args) {


        Employee employee1  = new Employee(1,"vijay","male");
        Employee employee2  = new Employee(1,"vijay","male");

        System.out.println(employee1.equals(employee2));

        Set eset= new HashSet();
        eset.add(employee1);
        eset.add(employee2);
        System.out.println(eset);
    }
}
