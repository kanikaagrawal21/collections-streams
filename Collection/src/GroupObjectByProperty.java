import java.util.*;
import java.util.stream.Collectors;

class Employee {
    String name;
    String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class GroupObjectByProperty{
    public static Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<Employee>> grouped = groupByDepartment(employees);
        System.out.println(grouped); // Output: {HR=[Alice, Carol], IT=[Bob]}
    }
}
