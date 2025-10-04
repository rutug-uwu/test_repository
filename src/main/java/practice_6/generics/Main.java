package practice_6.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Элемент");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(3);

    }
}
