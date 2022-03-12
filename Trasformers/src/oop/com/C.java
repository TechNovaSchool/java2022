package oop.com;

public class C extends A{

    public static void cClass(){
        System.out.println("I am C class");
    }

    public static void main(String[] args) {

        A a = new A();
        a.aClass();
    }
}
