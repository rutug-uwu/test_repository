package hw_practice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeTask {

    //1. Проверка палиндрома
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();

        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    //2. Сумма чисел массива
    public int getSum(int[] arr) {
        int total = 0;

        for (int i : arr) {
            total = total + i;
        }

        return total;
    }


    //3.Поиск максимального числа
    public int max(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
        }

        return max;
    }

    //4. Проверка на простое число
    public boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    //5. Факториал числа
    public int isFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        if (n < 0) throw new IllegalArgumentException();

        int result = 1;

        for (int i = 2; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    //6. Подсчёт гласных
    public int countVowels(String s) {
        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiouyауоыиэяюёе".indexOf(c) >= 0) count++;
        }

        return count;
    }

    //7. Поиск второго максимального элемента
    public int getSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        return second;
    }

    //8.Проверка анаграммы
    public boolean isAnagram(String a, String b) {
        char[] numberOne = a.toCharArray();
        char[] numberTwo = b.toCharArray();

        Arrays.sort(numberOne);
        Arrays.sort(numberTwo);

        return Arrays.equals(numberOne, numberTwo);
    }

    //9. Подсчёт слов в строке
    public int CountWords(String s) {
        if (s == null || s.trim().isEmpty()) return 0;

        return s.trim().split("\\s+").length;
    }

    //10. Сумма значений в списке
    public int getSum(List<Integer> list) {
        int sum = 0;

        for (int i : list) {
            sum = sum + i;
        }

        return sum;
    }

    //11. Проверка уникальности элементов
    public boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) {
                return false;
            }
        }

        return true;
    }

    //12.Реализация Person с геттерами и сеттерами
    // Создан

    //13. Обработка деления на 0
    public int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    //14. Фильтрация списка строк по префиксу
    public List<String> listFilter(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
    }

    //15. Удаление дубликатов из списка
    public List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new HashSet<>(list));
    }

    //16. Фильтрация нечетных чисел
    public List<Integer> filterOdds(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }


    //17. Проверка наличия элемента в списке
    public boolean isContains(List<Integer> list, int number) {
        return list.contains(number);
    }

    //18. Проверка корректности скобочной последовательности
    public boolean isBalance(String s) {
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else if (c == ')') balance--;

            if (balance < 0) return false;
        }

        return balance == 0;
    }

    //19. Проверка, является ли строка числом
    public boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


    //20.Слияние двух списков
    public List<String> listMerge(List<String> a, List<String> b) {
        List<String> result = new ArrayList<>(a);
        result.addAll(b);

        return result;
    }

    //21.Проверка возраста с использованием объекта
    //готово

    //22.Проверка чётности числа
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    //23. Простое перечисление дней недели (enum)
    //Готово

    //24. Конкатенация строк через StringBuilder
    public static String join(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);
            if (i != words.length - 1) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }

    //25. Вывод элементов очереди
    public void printQueue(Queue<String> queue){
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


    //26. Сравнение двух объектов по equals
    //Создал в Book

    //27. Сортировка по длине строки
    // list.sort(Comparator.comparingInt(String :: length));

    //28. Форматированный вывод чисел
    //System.out.printf("%.2f", d);

    //29. Проверка палиндрома числа
    public static boolean isPalindromeOfInt(int n){
        int original = n;
        int reverse = 0;

        while (n > 0){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        return original == reverse;
    }

    //30.
    public int getRandom(){
        return new Random().nextInt(10) + 1;
    }
}
