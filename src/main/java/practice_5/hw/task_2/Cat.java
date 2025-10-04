package practice_5.hw.task_2;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Кошка издает звук");
    }
}
