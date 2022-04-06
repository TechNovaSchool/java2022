package Review;

import java.time.LocalDate;
import java.util.Scanner;

public class MethodReview {

    Scanner sc = new Scanner(System.in);
    LocalDate date = LocalDate.now();


    public void addTwoNumbers(){

        System.out.println(3+3);
    }

    public void addTwoNumbers(double x, double y){

        System.out.println(x + y);
    }

    public static void login(String username, String password){

        // enter username
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter UserName: ");
        String usernameFromUser = sc.nextLine();
        // enter password
        System.out.print("Enter Password: ");
        String passwordFromUser = sc.nextLine();

        if(usernameFromUser.equals(username)){
            System.out.println("Valid UserName");

            if(passwordFromUser.equals(password)){
                System.out.println("Valid Password : ");
                System.out.println(" Login Success");
            }else{
                System.out.println("Password is Invalid");
            }
        }else{
            System.out.println("UserName is Invalid!");
        }


        // click login button



    }

    public void navigate(String url){

        // navigate to the url
    }

    public void convertToUpperCase(){

        System.out.println("Enter a text: ");
        String str = sc.nextLine();
        System.out.println(str.toUpperCase());
        System.out.println(date.getMonth());
    }

    public int ageCalculator(){

        System.out.print("Enter year of birth: ");
        int yearOfBirth = sc.nextInt();
        System.out.println("Age is : " + (date.getYear() - yearOfBirth));
        return date.getYear() - yearOfBirth;
    }

    public boolean checkAge() {

        if (ageCalculator() > 18){
          return true;
        }
        return false;
    }

    public String pageTitle(String element){

        // gets text from UI page

        return element;
    }

    public void printName(String name){

        System.out.println(name);
    }

    public int getYear(){

        return date.getYear(); //2022
    }

    public int [] arrayNums(){

        int [] nums = {1, 2, 3, 4, 5};
        return nums;
    }

    public double getPrice(){

        return 12;

    }



    /// adding numbers

    public void addNumbers(int numberOne, int numberTwo){
        System.out.println(numberOne + numberTwo);
    }

    public double addNumbers(double numberOne, double numberTwo){
        return numberOne + numberTwo;
    }

    public static void addNumbers(int x, int y, int z){
        System.out.println(x + y + z);
    }

    public boolean addNumbers(int x , double y){

        if(x > y){
            return true;
        }
        return false;
    }

    public String addNumbers(){

        return "Adding numbers";
    }



}


