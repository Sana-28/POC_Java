package Interview;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
    public static void main(String args[]){
        Set<Employee> s = new HashSet<>();
        Employee e1 = new Employee("1", "dev");
        Employee e2 = new Employee("1", "dev");
        s.add(e1);
        s.add(e2);
        s.size();
    }
}
