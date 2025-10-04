package practice_5.hw.task_2;

public class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("Животное издает звук");
    }

    public static void describe(Animal animal){
        animal.makeSound();
    }
}
