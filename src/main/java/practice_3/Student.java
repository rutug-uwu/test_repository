package practice_3;

public class Student {
    final static int MAX_YEARS = 11;
    static int studentsCount;

    static {
        studentsCount = 0;
    }


    int age;
    String name;

    public Student(int someAge, String soneName) {
        this.age = someAge;
        this.name = soneName;
        studentsCount ++; //инкремент, увеличение значения на 1
    }

    static void printMaxYears(){
        System.out.println(MAX_YEARS);
    }
}
