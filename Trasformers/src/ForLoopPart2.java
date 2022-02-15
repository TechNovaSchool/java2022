import java.util.Scanner;

public class ForLoopPart2 {

    public static void main(String[] args) {

        // 1 .. 100

       /* for (int i = 1; i <= 100; i++){
            System.out.print(i);
        }*/

        //
/*
        String str = "Monday";

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'y'){
                System.out.println(i);
            }
        }*/

        // loop through a string
        // check if the last  2 char of string is yz
        // if yes Print True
        //else Print false


     /*   String str = "abc-ttyz";

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i));

            if(str.charAt(i) == 'z' && str.charAt(i-1) == 'y' && str.charAt(i-2) == 't' ){

               // System.out.println(true);

            }

        }
*/

        // ask user to enter a product name and it's price
        // after 5 item ask usk user Q : Y/N
        // if yes : ask for 5 more items
        // if No : stop the program
        // at the end print receipt price net to it
        // total amount at the bottom of the receipt

/*
        String product;
        double price;
        double totalPrice = 0;

        for (int i = 1; i <= 10; i++){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Product " + i + " : ");
            product = sc.nextLine();
            System.out.print("Enter  the  Price " + i + " : ");
            price = sc.nextDouble();
            totalPrice += price;
            System.out.println(product + ".............." + price);

            if(i == 5 ){
                System.out.print("Do you want to buy more products? Y/N  ");
                sc.nextLine();
                String yn = sc.nextLine();

                if (yn.equals("Y")) {
                    i = 5;
                }else{
                    break;
                }
            }
        }

        System.out.println(" ");
        System.out.println("Total is: $" + totalPrice);*/


        //1
        //12
        //123
        //1234
        //12345
        //123456
        //1234567
        //12345678
        //123456789
        //12345678910

      /*  for (int i = 10; i >= 1; i-- ){

            for (int j = 10; j >= i; j-- ){

                System.out.print( j );
            }

            System.out.println();
        }
*/
        //1
        //2 3
        //4 5 6
        //7 8 9 10


        //11232123312341235123

    /*    for (int i = 1; i <= 5; i++){

            System.out.print(" : " + i + " : ");

            for (int j = 1; j <= 3; j++){
                System.out.print(j);
            }
        }
*/



     /*   String str = "Hello";

        for (int i = str.length()-1; i >= 0; i--){

         if (str.charAt(i) == 'e'){
             break;
         }

            System.out.print(str.charAt(i));
        }*/



        // Palindrome

        // civic, anna, level, April
/*

        String str = "Level";
        String result = "";

        for (int i = str.length()-1; i >= 0; i--){

            result += str.charAt(i);

        }
        if (str.toLowerCase().equals(result.toLowerCase())){
            System.out.println("this is Palindrome");
        }else{
            System.out.println("this is NOT Palindrome");
        }
*/











































    }
}
