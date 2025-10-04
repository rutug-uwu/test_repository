package practice_5.hw.task_6;

import java.util.List;

public abstract class Employee {
    private String position;

    public Employee(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public abstract double calculateSalary();


    public static double getSalary(List<Employee> employees) {
        double totalSalary = 0;

        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            totalSalary = totalSalary + employee.calculateSalary();
        }

        return totalSalary;
    }
}
