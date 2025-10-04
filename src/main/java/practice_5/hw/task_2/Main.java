package practice_5.hw.task_2;

public class Main {
    public static void main(String[] args) {

        Animal someAnimal = new Animal("Кенгуру");
        Animal cat = new Cat("Вафля");
        Animal dog = new Dog("Барбос");

        Animal.describe(cat);
        Animal.describe(dog);
        Animal.describe(someAnimal);

        cat.makeSound();
        dog.makeSound();

    }
}
