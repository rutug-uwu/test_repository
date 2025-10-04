package practice_4.hw;

import java.util.Random;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String[] args) {
        //Проверка метода по определению четности числа
//        checkEven(2);
//        checkEven(3);

        //проверка метода по определению возрастной категории пользователя
//        checkAgeCategory(17);
//        checkAgeCategory(18);

        //Проверка метода checkMinNumber (определение меньшего числа)
//        checkMinNumber(5,10);
//        checkMinNumber(10,5);
//        checkMinNumber(5,5);

        //Проверка метода checkMinValue (определение меньшего числа)
//        System.out.println(checkMinValue(55,1));
//        System.out.println(checkMinValue(2,77));
        //System.out.println(checkMinValue(5,5));

        //Проверка метода isMultipleOfThree()
//        isMultipleOfThree(5);
//        isMultipleOfThree(6);

        //Проверка метода checkSchoolScore()
//        checkSchoolScore(1);
//        checkSchoolScore(90);
//        checkSchoolScore(75);
//        checkSchoolScore(50);

        //Проверка метода checkMaxNumber
        //System.out.println(checkMaxNumber(20,35,15));

        //Проверка метода printNumbers
        //printNumbers(15);

        //Проверка метода calculateSumOfNumbers
        //System.out.println(calculateSumOfNumbers());

        //Проверка метода multiply
        //System.out.println(multiply(5,10));

        //Проверка метода multiplyTable
//        multiplyTable(2);

        //проверка метода checkTypeOfYear
//        checkTypeOfYear(1950);
//        checkTypeOfYear(1960);

        //Проверка метода validatePassword
//        validatePassword();

        //Проверка метода printReverseScore
//        printReverseScore();

        // Проверка метода checkNaturalDivisor
//        checkNaturalDivisor(20);

        //Проверка метода findFactorialOfNumber
//        System.out.println(findFactorialOfNumber(10));


        //Проверка метода findFirstDivisor
        //System.out.println(findFirstDivisor(9));
        //System.out.println(findFirstDivisor2(9));


        //Проверка метода checkNaturalNumber
//        checkNaturalNumber(10);
//        checkNaturalNumber(7);

        //Првоерка метода findMaxNumber
//        findMaxNumber();

        //Проверка метода guessNumber
        //guessNumber(10);

//        printNumbersBefore10();

        //Проверка метода doReverse()
//        System.out.println(doReverse(1999));

        //Проверка метода checkPassword
        checkPassword();


    }

    //1. Определение чётности числа
    public static void checkEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " - Чётное число!");
        }

        if (number % 2 != 0) {
            System.out.println(number + " - Нечётное число!");
        }
    }

    //2. Проверка возраста на совершеннолетие
    public static void checkAgeCategory(int age) {
        if (age >= 18) {
            System.out.println("Пользователь совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Пользователь несовершеннолетний");
        }
    }

    //3. Минимум из двух чисел (первый вариант)
    public static void checkMinNumber(int firstNumber, int secondNumber) {
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " - меньшее из 2-ух чисел");
        }

        if (secondNumber < firstNumber) {
            System.out.println(secondNumber + " - меньшее из 2-ух чисел");
        }

        if (firstNumber == secondNumber) {
            System.out.println("Числа равны");
        }
    }

    //3. Минимум из двух чисел (второй вариант)
    public static int checkMinValue(int number1, int number2) {
        int min = 0;

        if (number1 < number2) {
            min = number1;
        }

        if (number2 < number1) {
            min = number2;
        }

        return min;
    }

    //4. Проверка кратности
    public static void isMultipleOfThree(int value) {
        if (value % 3 == 0) {
            System.out.println(value + " - делится на 3 без остатка");
        }

        if (value % 3 != 0) {
            System.out.println(value + " - не делится на 3 без остатка");
        }
    }

    //5. Оценка по баллам
    public static void checkSchoolScore(int score) {

        if (score >= 90 && score <= 100) {
            System.out.println("Отлично");
        }
        if (score >= 75 && score <= 89) {
            System.out.println("Хорошо");
        }
        if (score >= 50 && score <= 74) {
            System.out.println("Удовлетворительно");
        }
        if (score < 50) {
            System.out.println("Неудовлетворительно");
        }
    }

    //6. Сравнение трёх чисел
    public static int checkMaxNumber(int n1, int n2, int n3) {
        int maxNumber = n1;

        if (n2 > n1) {
            maxNumber = n2;
        }
        if (n3 > maxNumber) {
            maxNumber = n3;
        }

        return maxNumber;
    }

    //7. Чётные числа от 1 до N
    public static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //8. Сумма чисел от 1 до 100
    public static int calculateSumOfNumbers() {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result = result + i;
        }

        return result;
    }

    //9. Умножение без оператора *
    public static int multiply(int a, int b) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = result + a;
        }

        return result;
    }

    //10. Таблица умножения для числа
    public static void multiplyTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + number * i);
        }
    }

    //11. Проверка високосного года
    public static void checkTypeOfYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " - високосный год");
        } else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
    }

    //12. Пароль с попытками
    public static void validatePassword(){
        Scanner scanner = new Scanner(System.in);
        int count = 3;
        String password;

        do {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            count--;
        } while (count >= 1);

        System.out.println("Доступ запрещен");
    }

    //13. Обратный отсчёт
    public static void printReverseScore(){

       for (int i = 10; i != 0; i--){
           System.out.println(i);

           if (i == 1){
               System.out.println("Старт!");
           }
       }
    }

    //14. Подсчёт делителей числа
    public static void checkNaturalDivisor(int number){
        int count = 0;

        for (int i = 2; i <= number-1; i++){
            if (number % i == 0){
                System.out.println("Делитель: " + i);
                count++;
            }
        }

        System.out.println("Количество натуральных делителей: " + count);
    }

    //15. Факториал числа
    public static int findFactorialOfNumber(int number){
        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial = factorial * i;
        }

        return factorial;
    }

    //16. Поиск первого делителя (1 вариант)
    public static int findFirstDivisor(int number){
        int i;
        for (i = 2; i <= number; i++){
            if(number % i == 0)
                break;
        }

        return i;
    }

    //16. Поиск первого делителя (2 вариант)
    public static int findFirstDivisor2(int number){
        int divisor = 2;
        while (divisor < number){
            divisor++;
            if (number % divisor == 0)
                break;
        }

        return divisor;
    }

    //17. Проверка на простое число
    public static void checkNaturalNumber(int number){
        for (int i = 2; i < number-1; i++){
            if (number % i == 0) {
                System.out.println(number + " = составное число (не простое)");
                return;
            }
        }

        System.out.println(number + " = простое число");
    }

    //19. Поиск максимального числа в серии
    public static void findMaxNumber(){
        Scanner scanner = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();

            if (number > max && number > 0){
                max = number;
            }
        } while (number != 0);

        System.out.println(max + " - максимально большое из введенных вами чисел");
    }

    //23. Угадать число
    public static void guessNumber(int bound){
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(bound);

        int number;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("Вы угадали!");
    }

    //21. Реверс числа
    public static int doReverse(int number){
        String str = String.valueOf(number);
        String reversedStr = new StringBuilder(str).reverse().toString();

        return Integer.parseInt(reversedStr);
    }


    //29. Вывод чисел в столбик и в строку
    public static void printNumbersBefore10(){
        int i = 1;

        while (i <= 10){
            System.out.println(i);
            i++;
        }

        System.out.print("Все числа в одной строке: ");
        i = 1;
        while (i <= 10) {
            System.out.print(i);
            if (i < 10) {
                System.out.print(" ");
            }
            i++;
        }
        System.out.println();
    }

    //30. Проверка пароля с досрочным выходом
    public static void checkPassword() {
        int count = 5;
        Scanner scanner = new Scanner(System.in);
        String password = "";

        while (count > 0) {
            System.out.print("Введите пароль: ");
            password = scanner.nextLine();
            count--;

            if (password.equals("exit")) {
                System.out.println("Программа завершена");
                return;
            }
        }

        System.out.println("Доступ запрещен");
    }
}
