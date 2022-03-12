package oop.com;

public class ParentClass {

    static String name = "John Smith";
    String id = "Parent ID";

    public void printName(){
        System.out.println(name);
    }

    public void printAge(int age ){
        System.out.println("age is : " + age);
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void dancing(){
        System.out.println(name + " is dancing");
    }

    public static void main(String[] args) {
        ParentClass pr = new ParentClass();
        pr.printName();
        pr.printAge(32);
        pr.sayHello();
        pr.dancing();
    }
}
