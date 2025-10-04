package practice_5.hw.task_5;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double area = radius * radius * PI;

        return area;
    }
}
