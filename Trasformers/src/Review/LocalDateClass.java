package Review;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class LocalDateClass {

    public static void main(String[] args) {

        //local Date
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getMonthValue());
        System.out.println(date.withMonth(3));

        // local Time
        LocalTime time =  LocalTime.now();
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.print(time.format(DateTimeFormatter.ofPattern("hh:mm:ss  ")));
        System.out.println(date.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));

        String name = "John";
        System.out.println(name.charAt(6));





        //Date date2 = new Date();
        //System.out.println(date2.getTime());

        // ask user to enter month number /value
        // write code to print associated month with the users entry

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month as a number : ");

        int numberFromUser = sc.nextInt();

        switch(numberFromUser){
            case 1: case 2: case 3: case 4: case 5: case 6:
            case 7: case 8: case 9: case 10: case 11: case 12:
                System.out.println("Current month is : " + date.withMonth(numberFromUser).getMonth());
                break;
                default: System.out.println("Invalid month");
        }
*/
    }




}
