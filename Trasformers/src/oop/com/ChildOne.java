package oop.com;

public class ChildOne extends SingleInheritanceClass {

    public static void main(String[] args) {

        printName("John");
        printAge(21);
        singASong();
        childSingASong();
        //System.out.println(name);
    }

    public static void childSingASong(){
        System.out.println("... Little Star");
    }
}
