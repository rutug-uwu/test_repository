package practice_5.hw.task_6;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee intern = new Intern("Интерн", 50000, 0);
        Employee developer = new Developer("Разработчик", 50000, 20000);
        Employee manager = new Manager("Менеджер", 50000, 50000);

        List<Employee> employees = Arrays.asList(intern, developer, manager);


        System.out.println(Employee.getSalary(employees));
    }
}
