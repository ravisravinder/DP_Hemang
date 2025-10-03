package immutabilityWithCollections;

import java.util.ArrayList;
import java.util.List;

public class TestImmutable1 {
        public static void main(String[] args) {
            Employee1 e1 = new Employee1("Alice", 25);
            Employee1 e2 = new Employee1("Bob", 30);

            List<Employee1> empList = new ArrayList<>();
            empList.add(e1);
            empList.add(e2);

            Manager1 manager = new Manager1("Carol", 40, empList);

            System.out.println(manager.getEmployees()); // [Alice, Bob]

            // Try modifying original list
            empList.add(new Employee1("Eve", 35));
            System.out.println(manager.getEmployees()); // Still [Alice, Bob] ✅

            // Try modifying returned list
            List<Employee1> retrievedList = manager.getEmployees();
            // retrievedList.add(new Employee("Eve", 35)); // Throws UnsupportedOperationException ✅
        }
    }

