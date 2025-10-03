package immutabilityWithCollections.notWorking;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alice",25);
        Employee e2 = new Employee("Bob",30);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);

        // Try modifying original list
        Manager manager = new Manager("Tim",21,employeeList);
        employeeList.add(new Employee("Bob",35));
        employeeList.add(new Employee("Eve",35));
        System.out.println(manager.getEmployees());
    }
}
