public class MethodsBasic {

    public static void main(String[] args) {

        // calling the method
        /*printNumber();
        printText();
        printName("John");
        printName("John 01");
        printName("John 02");
        printNameWithHello("John");
        printNameWithHello("Bob");
        printNameWithHello("Allan");
        printNameWithHello("Smith");
        printFullName("John", "Smith");*/


/*
       MethodsClassA aClass = new MethodsClassA();

       aClass.addTwoNumbers(30, 50);
       MethodsClassA.multiplyTwoNumbers(30, 10);*/

        MethodsBasicPartTwo obj = new MethodsBasicPartTwo();
        System.out.println(obj.calculateAge(1997));
    }

    // outside the main method
    // creating method
    public static void printText(){
        System.out.println("Hello3");
    }

    public static void printNumber(){
        System.out.println(2022);
    }

    public static void printName(String name){
        System.out.println(name);
    }

    public static void printNameWithHello(String name){

        System.out.println("Hello " + name);

    }

    public static void printFullName(String firstName, String lastName){

        System.out.println(firstName + " " + lastName);

    }

    public static void addTwoNumbers(int x, int y){

        System.out.println(x + y);
    }

}
