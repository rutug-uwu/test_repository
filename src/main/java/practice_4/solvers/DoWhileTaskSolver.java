package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        //Проверка метода по угадыванию рандомного числал
        //guessNumber(10);

        //Проверка метода по поиску минимально-введенного числа
        findMinimum();

        //Проверка метода по вводу корректного лог + пароля
        //checkCredentials();
    }


    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        int number;

        do {
            System.out.print("Угадайте число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.print("Верно!");
    }

    public static void findMinimum(){
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = Integer.MAX_VALUE;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0){
                min = number;
            }
        } while (number >= 0);

        System.out.println("Минимальное число: " + min);
    }

    public static void checkCredentials(){
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("Введите логин: ");
            login = scanner.nextLine();
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Доступ разрешен.");
    }
}
