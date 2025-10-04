package practice_2.hw;

public class SomeClass {
    private String name;
    private static int count = 3;

    //5 + ++4 =
    public SomeClass(String name) {
        this.name = name;

        if (count == 0){
            throw new IllegalStateException();
        }

        count--;
    }
}
