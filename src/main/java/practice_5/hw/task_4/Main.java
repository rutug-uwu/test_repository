package practice_5.hw.task_4;

public class Main {
    public static void main(String[] args) {
        Player kirito = new Player(100);

        kirito.heal(1);
        kirito.takeDamage(50);
        System.out.println(kirito.getHealth());
        kirito.heal(50);
        System.out.println(kirito.getHealth());
    }
}
