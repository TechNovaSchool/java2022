package Review;

import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

        ///
   /*    try {
           String str = "Hello";
           System.out.println(str.charAt(10));
       }catch (Exception e) {
           System.out.println("Something went wrong: " + e.getMessage());
       }finally{
           System.out.println("Finally is run");
       }



       try{

           int [] numArr = {2, 4, 6, 8, 10};
           System.out.println(numArr[9]);

       }catch (Exception e){
           System.out.println(e);
           System.exit(0);
       }finally{
           System.out.println("Final run ? or not");
       }
*/


    }

    public static  void userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int numOne = sc.nextInt();
        System.out.print("Enter second number: ");
        int numTwo = sc.nextInt();
        int result = numOne / numTwo;
        System.out.println("Result is : " + result);
    }
}
