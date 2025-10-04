package practice_4.solvers;

public class ForTaskSolver {
    public static void main(String[] args) {
        //проверка таблицы умножения для числа
        // multiplyTable(5);

        //проверка суммы всех чисел до числа
        //System.out.println(someOfAllNumbers(10));

        //проверка метода по определению простого числа
        //System.out.println(checkNumberIsSimple(7));
        //System.out.println(checkNumberIsSimple(6));

        //Проверка метода по распечатке всех простых чисел до 100
        printAllSimpleNumbersBefore100();
    }

    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            //System.out.println(number * i);
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static int someOfAllNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static boolean checkNumberIsSimple(int number) {
        // простое число - это число, которое делится на себя и на 1
        // Как понять, что число простое?
        // надо пройтись от 2 до number-1 и проверить, есть ли хотя бы 1 число при делении на которое мы получаем остаток, то число непростое
        boolean isSimple = true;
        for (int i = 2; i < number - 1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100(){
        for (int i = 2; i <= 100; i++ ){
            if (checkNumberIsSimple(i)) {
                System.out.println(i);
            }
        }
    }
}
