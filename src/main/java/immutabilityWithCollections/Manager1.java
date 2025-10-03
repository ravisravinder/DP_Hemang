package immutabilityWithCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Manager1 {
    private final String name;
    private final int age;
    private final List<Employee1> employees;

    // Constructor
    public Manager1(String name, int age, List<Employee1> employees) {
        this.name = name;
        this.age = age;

        // Defensive copy!
        this.employees = new ArrayList<>(employees);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Defensive copy for getter
    public List<Employee1> getEmployees() {
        return Collections.unmodifiableList(employees);
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', age=" + age + ", employees=" + employees + '}';
    }
}