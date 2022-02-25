public class MethodsBasic {

    public static void main(String[] args) {

        // calling the method
        printNumber();
        printText();
        printName("John");
        printName("John 01");
        printName("John 02");


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



 // create a method that takes a String param as name
    // print Hello name
    // "John"
    // Hello John



}
