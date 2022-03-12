package oop.com;

public class ChildClass extends ParentClass {

    @Override
    public void sayHello(){
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
    }

    static String name = "Bob";
    String id = "Child ID";

    public static void main(String[] args) {
        System.out.println(name);

        ParentClass pr = new ParentClass();
        System.out.println(pr.id);

        ChildClass cr = new ChildClass();
        System.out.println(cr.id);


    }




}
