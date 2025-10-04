package practice_5.hw.task_5;

public class Triangle extends Shape {
    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    double getArea() {
        double area = side * height / 2;

        return area;
    }
}
