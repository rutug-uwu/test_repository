package practice_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //создали переменную petya
        //присвоили переменной petya экземпляр класса Student
        //Создание переменной с использованием дефолтного конструктора
        //System.out.println(Student.studentsCount);

        Student petya = new Student(18, "Петя");

        //System.out.println(Student.studentsCount);

        Student kolya = new Student(20, "Коля");

        //System.out.println(Student.studentsCount);

        int[] array = new int[] { 1, 2, 3, 4, 5,6,7,8,9,10,11 };
        System.out.println(array.length);
    }
}
