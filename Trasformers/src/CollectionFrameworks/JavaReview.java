package CollectionFrameworks;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaReview {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        // ask user to enter a product name and it's price
        // after 5 item ask usk user Q : Y/N
        // if yes : ask for 5 more items
        // if No : stop the program
        // at the end print receipt price net to it
        // total amount at the bottom of the receipt
        // Current date & time 04-02-2022 & time : 12:20:20

        //           Store name
        //
        // Product name ________Product Price
        // milk                    7.99
        // milk                    7.99
        // milk                    7.99
        // milk                    7.99
        // milk                    7.99
        // milk                    7.99

        ///    total price      20.00
        ///     date & time






        Map <String, Double> store = new TreeMap<String, Double>();
        double totalPrice = 0;

        for (int i = 1; i<=10; i++){

            System.out.print("Enter product name: #"+i + " : ");
            String productName = sc.nextLine();

            System.out.print("Enter product price: #"+i+ " : ");
            double productPrice = sc.nextDouble();
            totalPrice += productPrice;
            sc.nextLine();

            if(i == 5){
                System.out.print("Do you have more products to checkout? Y/N");
                String answer = sc.nextLine();
                if(answer.equals("Y")){
                    i = 5;
                }else{
                    break;
                }
            }
           store.put(productName, productPrice);

        }

        System.out.println("***********   SNOW STORE  ************ ");
        System.out.println("************************************** ");
        System.out.println("Product   .....  Price");

       for (Map.Entry<String, Double> entry : store.entrySet()){

           System.out.println(entry.getKey()+" \n............... "+ entry.getValue());

       }

        System.out.println("Total Price is : $" + String.format("%.2f", totalPrice) + " *****");
        System.out.println("***** " + date.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")) + " " + time.format(DateTimeFormatter.ofPattern("hh:mm:ss")) + " *****");







    }
}
