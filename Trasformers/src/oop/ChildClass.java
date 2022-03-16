package oop;

public class ChildClass extends AbstractClass {

    @Override
    public void print(String text) {
        super.print("Hello");
    }

    @Override
    public void sayHi() {
        System.out.println("Hello");
    }
}
