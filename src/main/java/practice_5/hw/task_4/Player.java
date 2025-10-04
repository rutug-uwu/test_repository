package practice_5.hw.task_4;

public class Player {
    private int health;

    public Player(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int dmg) {
        if (health - dmg > 0) {
            health = health - dmg;
        } else System.out.println("Слишком мало здоровья");
    }

    public void heal(int hp) {
        if (hp + health <= 100) {
            health = hp + health;
        } else System.out.println("Слишком много здоровья");
    }
}
