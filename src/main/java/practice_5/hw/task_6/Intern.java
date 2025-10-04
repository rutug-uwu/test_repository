package practice_5.hw.task_6;

public class Intern extends Employee {
    private double baseSalary;
    private double bonus;

    public Intern(String position, double baseSalary, double bonus) {
        super(position);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
