package oop.com;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Wooff Wooff");
    }

    @Override
    public void canFly() {
        System.out.println("Dog can not Fly");
    }
}
