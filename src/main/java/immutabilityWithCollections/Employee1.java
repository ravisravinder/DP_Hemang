package immutabilityWithCollections;

import java.util.Objects;

public final class Employee1 {
    private final String name;
    private final int age;

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 e = (Employee1) o;
        return age == e.age && Objects.equals(name, e.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}