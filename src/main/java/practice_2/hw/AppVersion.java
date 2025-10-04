package practice_2.hw;

public class AppVersion {
    public static final String VERSION = "1.0.0";

    //приватный конструктор
    private AppVersion() {
        System.out.println("Нельзя создать экземпляр утилитарного класса");
    }
}
