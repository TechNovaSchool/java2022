package oop;

public class Cat implements Animal, Animal2{


    @Override
    public void makeSound() {
        System.out.println("Meo Meo");
    }

    @Override
    public void sleep() {
        System.out.println(23);
    }

    @Override
    public void eat() {
        System.out.println("Can eats");
    }

    @Override
    public void run() {
        System.out.println("Can Runs");
    }

    @Override
    public boolean fly() {
        return false;
    }

    @Override
    public String name(String  name) {
        return name;
    }

    @Override
    public boolean domestic(boolean YN) {
        return YN;
    }

    @Override
    public boolean friendly(boolean YN) {
        return YN;
    }

    @Override
    public boolean playful(boolean YN) {
        return YN;
    }
}
