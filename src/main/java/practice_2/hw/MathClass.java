package practice_2.hw;

public class MathClass {

    public static void checkValue(int value){
        if(value % 2 == 0){
            System.out.println(value + " - Чётное число");
        }
        if (value % 2 != 0){
            System.out.println(value + " - Нечётное число");
        }
    }
}
