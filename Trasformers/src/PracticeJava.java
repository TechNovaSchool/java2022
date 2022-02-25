import java.util.Arrays;
import java.util.Scanner;

public class PracticeJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user to enter a char
        // Write Java Program to Find ASCII Value of a character

        // A = 65
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("Enter a single char : ");

        char charFromUser = sc.next().charAt(0);
        int value = charFromUser;
        System.out.println("The value of " + charFromUser + " is " + value);*/

        // Ask user to enter a char
        // write java code to check if the char is alphabet
        // A - Z or a - z

        // object or instance of a Scanner class
     /*   Scanner sc = new Scanner(System.in);
        System.out.print("Enter a singe char : ");

        char charFromUser = sc.next().charAt(0);

        if(charFromUser >= 'a' && charFromUser <= 'z' || charFromUser >= 'A' && charFromUser <= 'Z'){
            System.out.println(charFromUser + " is an alphabet");
        }else{
            System.out.println(charFromUser + " is NOT an alphabet");
        }*/

        // Ask uer to enter a string with numbers
        // Write java code to separate  chars & others values
/*
        String chars = "";
        String otherValues = "";

        System.out.println("Enter a String : ");
        String strFromUser = sc.nextLine();

        for (int i = 0; i < strFromUser.length(); i++){

            if (strFromUser.charAt(i) >= 'a' && strFromUser.charAt(i) <= 'z'
            || strFromUser.charAt(i) >= 'A' && strFromUser.charAt(i) <= 'Z'){

                chars += strFromUser.charAt(i);

            } else{

                otherValues += strFromUser.charAt(i);
            }
        }
        System.out.println("All char Values: " + chars);
        System.out.println("All other Values: " + otherValues);*/









        // how to convert string number into int?

      /*  String number = "2022";

        System.out.println(number+10);

        int year = Integer.parseInt(number);

        System.out.println(year+10);

        long year1 = Long.parseLong(number);

        // int to string

        int x = 2022;

        String xValue = String.valueOf(x);

        System.out.println(xValue+ 20);
*/






        // Write java code to check of 2 string are palindrome
        // anna , level, civic, madam,

        // first way is with StringBuilder

    /*    String palindrome = "level".toLowerCase();
        String reversedString = "";

        for (int i = palindrome.length()-1; i >= 0; i-- ){

            reversedString += palindrome.charAt(i);
        }

        if(palindrome.equals(reversedString)){
            System.out.println("Is a  Palindrome");
        }else{
            System.out.println("Not  a Palindrome");
        }

*/




     /*   StringBuilder strBuilder = new StringBuilder(palindrome);
        strBuilder.reverse();

        if(palindrome.equals(strBuilder.toString())){
            System.out.println("Is a Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
*/




        // print Alphabet from A to Z
        // from a to z

/*
        String strChars = "";

        for (char c = 'A'; c <= 'Z'; c++){

            strChars += c;
        }

        for (char c = 'a'; c <= 'z'; c++){

            strChars += c;
        }

        char [] charArr = strChars.toCharArray();
        System.out.println(charArr[12] + "" + charArr[30]);*/




        //angel = glean
        //arc = car
        //brag = grab
        //bored = robed
        //cat = act
        //cider = cried
        //dusty = study
        //elbow = below
        //inch = chin
        //night = thing
        //peach = cheap
        //players = parsley
        //sadder = dreads
        //save = vase
        //state = taste

        //Write Java Program to Check if two strings are anagram

        String str1 = "angel".toLowerCase();
        String str2 = "glean".toLowerCase();

        if (str1.length() == str2.length()){

            char [] charArr1  = str1.toCharArray(); // state
            char [] charArr2  = str2.toCharArray(); // taste

            Arrays.sort(charArr1);  // aetts
            Arrays.sort(charArr2);  // aetts

            if (Arrays.equals(charArr1, charArr2)){
                System.out.println("Is an Anagram");
            }else{
                System.out.println("Is not an Anagram");
            }
        }else{
            System.out.println("Not an Anagram");
        }

    }

}
