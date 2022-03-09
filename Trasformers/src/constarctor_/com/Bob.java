package constarctor_.com;

public class Bob {

    public static void main(String[] args) {

        Human bob = new Human();

        bob.firstName = "Bob";
        bob.lastName = "Marley";
        bob.age = 77;

        System.out.println(bob.firstName);
        System.out.println(bob.lastName);
        System.out.println(bob.age);
    }
}
