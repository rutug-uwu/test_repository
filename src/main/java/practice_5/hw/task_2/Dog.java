package practice_5.hw.task_2;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Собака издает звук");
    }
}
