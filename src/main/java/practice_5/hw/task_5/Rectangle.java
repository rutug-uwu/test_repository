package practice_5.hw.task_5;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        double area = length * width;

        return area;
    }
}
