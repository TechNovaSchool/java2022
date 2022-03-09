package constarctor_.com;

public class John {

    public static void main(String[] args) {

        Human john;

        john =  new Human("John", "Smith");
        System.out.println(john.firstName + " " + john.lastName);

        john = new Human(33);
        System.out.println(john.age);

        john = new Human("Brown");
        System.out.println(john.eyeColor);

        john.isEmployed = true;
        System.out.println(john.isEmployed);


    }
}
