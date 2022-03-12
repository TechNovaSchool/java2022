package oop.com;

public class ChildTwo extends SingleInheritanceClass{

    public static void main(String[] args) {

        printName("Bob");
        printAge(33);
        singASong();
        dance();
    }

    public static void dance(){
        System.out.println("Bob is dancing");
    }
}
