package OOPReview;

import java.util.Scanner;

public class Cat extends Feline implements Domestic{


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Tom");
        cat.makeSound();
        cat.eat();
        cat.sleep();
        cat.selfish();
        cat.drinkMink();
        cat.jump();
        cat.walk();
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " less sleeps more");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " 23 hrs a day");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " walks less sleeps more");
    }

    @Override
    public void selfish() {
        System.out.println(getName() + " 50/50");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " can jum");
    }

    public void drinkMink(){
        System.out.println(getName() + " drink milk at breakfast");
    }

    @Override
    public void play() {

    }

    @Override
    public void playful() {

    }

    @Override
    public void friendly() {

    }
}
