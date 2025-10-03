package immutabilityWithCollections.notWorking;

import java.util.List;

public final class Manager {
    private final String name;
    private final int age;
    private final List<Employee> employees;

    // Constructor
    public Manager(String name, int age, List<Employee> employees) {
        this.name = name;
        this.age = age;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Defensive copy for getter
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', age=" + age + ", employees=" + employees + '}';
    }
}