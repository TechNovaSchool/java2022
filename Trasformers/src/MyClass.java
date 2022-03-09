

public class MyClass {

    // instance variables // class members
     String name = "Bob";
     int age = 23;
      char gender = 'M';

    // class variables
    static String lastName = "Smith";
    static int birthYear = 1987;



    public static void main(String[] args) {
        // local variable
        int number= 10;

        MyClass cs = new MyClass();
        System.out.println(cs.name);
        cs.print(23);
        System.out.println(lastName + birthYear);


    }

    void print(int age){
        String name = "John";
        System.out.println(name + age + gender);
    }


}


