package practice_5.hw.task_6;

public class Manager extends Employee{
    private double baseSalary;
    private double bonus;

    public Manager(String position, double baseSalary, double bonus) {
        super(position);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}
