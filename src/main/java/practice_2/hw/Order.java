package practice_2.hw;

public class Order {
    private static int id;

    int number;
    int price;
    String description;

    public Order(String description, int price, int number) {
        this.description = description;
        this.price = price;
        this.number = number;
        id++;
    }

    public static int getId() {
        return id;
    }
}
