package oop.com;

public class Unicorn extends Animal{


    public static void main(String[] args) {
        Unicorn un  = new Unicorn();
        un.eat();
        un.canFly();
        un.makeSound();
    }

    @Override
    public void eat() {
        System.out.println("Not all Animal can eat");
    }

    @Override
    public void makeSound() {
        System.out.println("Happy Sound");
    }

    @Override
    public void canFly() {
        super.eat();
        System.out.println("Unicorn can Fly");
    }
}
