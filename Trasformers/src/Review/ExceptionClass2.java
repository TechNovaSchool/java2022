package Review;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionClass2 extends ExceptionHandling{

    static int age;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ask user to enter a string
        // print what user enters

/*

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a name: ");
            String name = sc.nextLine();
            System.out.print("Enter your age: ");
            age = sc.nextInt();
            System.out.println("You have entered : " + name + " and age : " + age);*/



      /*  try{
          userInput();
        }catch (ArithmeticException | InputMismatchException e){
            System.out.println("User entered invalid number " + e);
        }finally{
            System.out.println("Finally is executed");
        }*/
    }
}
