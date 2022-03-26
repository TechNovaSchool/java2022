package oop;

public class Tom extends Cat{

    public static void main(String[] args) {
        Cat cat = new Cat();


        System.out.println(cat.name("Tom"));
        System.out.println(cat.domestic(true));
        System.out.println(cat.friendly(false));
        System.out.println(cat.playful(true));


    }
}
