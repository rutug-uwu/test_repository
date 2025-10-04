package practice_5.hw.task_5;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(2, 2);
        Shape triangle = new Triangle(5, 5);

        Student.printArea(triangle);
    }
}
