package Review;

public class ChaseBank {

    public static void main(String[] args) {



        PersonalInfoPage john = new PersonalInfoPage("John", "Smith", "jsmaith@gmail.com", 6678654, "708-555-4321","03/22/1977");
        AddressPage john_Address = new AddressPage("123 main street", "MainCity", "FL", "1234", "123");

        PersonalInfoPage bob = new PersonalInfoPage("Bob", "Smith", "bobsmith@yhoo.com", 65638272, "765-987-2111", "07/21/1976");
        AddressPage bob_Address = new AddressPage("124 main street", "OtherCity", "AZ", "3456789", "32");


        System.out.println(john.email);
        System.out.println(bob.email);

        System.out.println(john.SSN);
        System.out.println(bob.SSN);

        System.out.println(john_Address.state);
        System.out.println(bob_Address.state);
        System.out.println(bob_Address.streetName);
        bob_Address.streetName = "32 main ave";
        System.out.println(bob_Address.streetName);

        System.out.println(john.cellNumber);
        john.cellNumber = "708-321-6579";
        System.out.println(john.cellNumber);









    }
}
