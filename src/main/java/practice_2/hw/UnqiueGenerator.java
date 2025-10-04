package practice_2.hw;

public class UnqiueGenerator {
    private static int nextId = 1;

    //приватный конструктор, запрещающий создавать новые объекты класса
    private UnqiueGenerator(){}

    public static int getNextId(){
        return nextId++;
    }

    public static int getCurrentId(){
        return nextId;
    }
}
