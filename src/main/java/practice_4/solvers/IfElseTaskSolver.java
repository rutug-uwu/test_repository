package practice_4.solvers;

public class IfElseTaskSolver {
    public static void main(String[] args) {
        //проверка метода четности
        System.out.println(checkParity(5));
        System.out.println(checkParity(6));

        // проверка метода определения возрастка
        System.out.println(checkAge(17));
        System.out.println(checkAge(18));
        System.out.println(checkAge(60));
        System.out.println(checkAge(61));

        //проверка метода по нахождению максимального среди 3-х чисел
        System.out.println(checkMax(3,7,5));
        System.out.println(checkMax(1,2,300));
    }

    // метод по определению четности\нечетности числа
    public static String checkParity(int number) {
        // number % 2 == 0 -> Четное
        // number % 2 == 1 -> Нечетное

        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }

        return parity;
    }

    //метод по определению классификации возраста
    public static String checkAge(int age) {
        String ageCategory = "";

        if (age < 18) {
            ageCategory = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageCategory = "Совершеннолетний";
        }
        if (age > 60) {
            ageCategory = "Пожилой";
        }

        return ageCategory;
    }

    //метод по определению наибольшего числа
    public static int checkMax(int a, int b, int c) {
        int maxAB = b;

        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;

        if (c > b) {
            max = c;
        }

        return max;
    }
}
