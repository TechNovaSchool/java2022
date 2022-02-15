import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;

class ArraysQA {

    public static void main(String[] args) {



      /*  String [] daysOfWeek  = {"Monday","Tuesday", "Wednesday","Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(daysOfWeek[0]);
        System.out.println(daysOfWeek[5]);
        System.out.println(daysOfWeek.length);*/
/*
        String [] daysOfWeek = new String[7];

        daysOfWeek[0] ="Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";

        System.out.println(daysOfWeek[5]);*/

   /*     int [] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //System.out.println(number[4]);

        int [] number2 = new int[9];

        number2[0] = 1;
        number2[1] = 2;
        number2[2] = 3;
        number2[3] = 4;
        number2[4] = 5;
        number2[5] = 6;
        number2[6] = 7;
        number2[7] = 8;
        number2[8] = 9;

        System.out.println(number2[5]);

        boolean [] bool = new boolean[2];

        bool[0] = true;
        System.out.println(bool[1]);*/




       /* String [] daysOfWeek = new String[7];

        daysOfWeek[0] ="Monday";
        daysOfWeek[1] = "Tuesday";
        daysOfWeek[2] = "Wednesday";
        daysOfWeek[3] = "Thursday";
        daysOfWeek[4] = "Friday";
        daysOfWeek[5] = "Saturday";
        daysOfWeek[6] = "Sunday";


        for (String day : daysOfWeek){

            if (day.equals("Saturday") || day.equals("Sunday")){

                continue;
            }

            System.out.println(day);
        }
*/




      /*  char [] charArr = {'a', 'b', 'f', 'm', 'o', 'q', 'c', 'A', 'a'};

        int totalA = 0;
        for (char c : charArr) {

            if (c == 'A' || c == 'a') {

                totalA++;

            }


        }
        System.out.println(totalA);*/


        Scanner input = new Scanner(System.in);

        // take input from users
        System.out.print("Enter first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

        // check if length is same
        if (str1.length() == str2.length()) {

            // convert strings to char array
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same
            // then the string is anagram
            boolean result = Arrays.equals(charArray1, charArray2);

            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }

        input.close();
    }

}
































