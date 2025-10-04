package livecoding_practice;

import java.util.*;
import java.util.stream.Collectors;

public class Homework {

    //1. Проверка палиндрома
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("\\s+", "").toLowerCase();

        return new StringBuilder(clean).reverse().toString().equals(clean);
    }

    //2. Сумма чисел массива
    public int getSumValues(int[] arr) {
        int result = 0;

        for (int i : arr) {
            result = result + i;
        }

        return result;
    }

    //3. Поиск максимального числа
    public int getMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException();

        int max = arr[0];

        for (int i : arr) {
            if (i > max) max = i;
        }

        return max;
    }

    //4. Проверка на простое число
    public boolean isSimple(int number) {
        if (number <= 1) return false;

        for (int i = 2; i * i <= number; i++) {
            if (number % 2 == 0) return false;
        }

        return true;
    }

    //5. Факториал числа
    public int factorialOfValue(int number) {
        if (number < 0) throw new IllegalArgumentException();
        if (number == 0 || number == 1) return 1;


        int result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    //6. Подсчёт гласных
    public int countVowels(String s) {
        int count = 0;

        for (char c : s.toLowerCase().toCharArray()) {
            if ("aeiouаеёиоуыэюя".indexOf(c) >= 0) count++;
        }

        return count;
    }

    //7. Поиск второго максимального элемента
    public static int getSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            }
        }

        return second;
    }

    //8. Проверка анаграммы
    public boolean isAnagram(String a, String b) {
        char[] newA = a.toCharArray();
        char[] newB = b.toCharArray();

        Arrays.sort(newA);
        Arrays.sort(newB);

        return Arrays.equals(newA, newB);
    }

    //9. Подсчёт слов в строке
    public static int countWords(String s) {
        return s.trim().split("\\s+").length;
    }

    //10. Сумма значений в списке
    public int getSum(List<Integer> list) {
        int result = 0;

        for (int i : list) {
            result = result + i;
        }

        return result;
    }

    //11. Проверка уникальности элементов
    public boolean isUnique(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (!set.add(i)) return false;
        }

        return true;
    }

    //12. Реализация Person с геттерами и сеттерами
    //Создан класс Person

    //13. Обработка деления на 0
    public int Divide(int a, int b) {
        try {
            return a / b;
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    //14. Фильтрация списка строк по префиксу
    public List<String> filter(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toList());
    }

    //15. Удаление дубликатов из списка
    public List<Integer> removeDuplicates(List<Integer> list) {

        return new ArrayList<>(new HashSet<>(list));
    }

    //16. Фильтрация нечетных чисел
    public List<Integer> filterOddNumber(List<Integer> list) {
        return list.stream()
                .filter(x -> x % 2 != 0)
                .collect(Collectors.toList());
    }

    //17. Проверка наличия элемента в списке
    public boolean isContain(List<Integer> list, int value) {
        return list.contains(value);
    }

    //18. Проверка корректности скобочной последовательности
    public boolean isBalance(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else if (c == ')') count--;

            if (count < 0) return false;
        }

        return count == 0;
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

    //20. Слияние двух списков
    public List<String> mergeLists(List<String> a, List<String> b) {
        List<String> result = new ArrayList<String>(a);
        result.addAll(b);

        return result;
    }

    //21. Проверка возраста с использованием объекта
//   public boolean isAdult() {
//       return this.age >= 18;
//   }

    //22. Проверка чётности числа
    public boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    //23. Простое перечисление дней недели (enum)
    // Создал enum Day

    //24. Конкатенация строк через StringBuilder
    public static String concatenation(String[] words) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            stringBuilder.append(words[i]);

            if (i != words.length - 1) stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    //25. Вывод элементов очереди
    public void printQueue(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    //26. Сортировка по длине строки
    //list.sort(Comparator.comparingInt(String::length));

    //27. Форматированный вывод чисел
    //System.out.printf("%.2f", d);

    //28. Проверка палиндрома числа
    public static boolean isPalindromeInt(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        return original == reverse;
    }

    //29. Генерация случайного числа от 1 до 10
    public int getRandom() {
        return new Random().nextInt(10) + 1;
    }

    //30. Подсчёт уникальных символов
    public int getUniqueSymbols(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        return set.size();
    }
}
