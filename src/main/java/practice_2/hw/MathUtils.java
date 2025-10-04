package practice_2.hw;

public final class MathUtils {

    // Приватный конструктор предотвращает создание экземпляров
    private MathUtils() {
        throw new AssertionError("Нельзя создать экземпляр утилитарного класса");
    }

    // Арифметические операции
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль");
        }
        return a / b;
    }

    public static int modulo(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль при взятии модуля");
        }
        return a % b;
    }
}