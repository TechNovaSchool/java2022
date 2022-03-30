package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListPart2 {

    public static void main(String[] args) {

        // empty arraylist that can store String
        ArrayList <String> months = new ArrayList <String>();
        // adding elements
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");
        // print all values
        System.out.println(months);
        System.out.println(months.get(2));
        System.out.println(months.get(6));






        ArrayList <Integer> numbers = new ArrayList <Integer>();
        numbers.add(10);
        numbers.add(161);
        numbers.add(12);
        numbers.add(10);
        numbers.add(660);
        numbers.add(20);
        numbers.add(10);
        numbers.add(120);
        numbers.add(50);
        numbers.add(1);
        numbers.add(30);
        numbers.add(111);
        numbers.add(5);


        System.out.println(numbers.get(2));


        ArrayList <Character> chars = new ArrayList <Character> ();
        chars.add('x');
        chars.add('y');
        chars.add('z');
        System.out.println(chars.get(1));




        ArrayList <Long> longNumbers = new ArrayList <Long> ();
        longNumbers.add(7234665756L);
        longNumbers.add(723465756L);
        longNumbers.add(72365756L);
        System.out.println(longNumbers);

        ArrayList <Double> doubleNumbers = new ArrayList <Double> ();
        doubleNumbers.add(33.33);
        doubleNumbers.add(44.44);
        doubleNumbers.add(55.55);
        System.out.println(doubleNumbers.get(1));




        ArrayList <Float> floatNumbers = new ArrayList <Float>();
        floatNumbers.add(1332.33f);
        floatNumbers.add(12.373f);
        floatNumbers.add(1442.383f);
        floatNumbers.add(1332.33f);
        floatNumbers.add(12.383f);
        floatNumbers.add(122.383f);
        floatNumbers.add(152.33f);
        floatNumbers.add(172.33f);
        floatNumbers.add(1882.33f);
        System.out.println(floatNumbers);


        System.out.println("Before Set: " + months.get(10));
        months.set(10, "Hot month");
        System.out.println("After set: " + months.get(10));
        months.remove(10);
        months.add(10, "November");
        months.add(0, "Months: ");
        System.out.println(months);


        System.out.println("Before clear: " + floatNumbers);
        System.out.println(floatNumbers.size());
        floatNumbers.clear();
        System.out.println("After clear: " + floatNumbers);
        System.out.println(floatNumbers.size());

        System.out.println(months.size());


        for (int i = 0; i < months.size(); i++){

            System.out.println(months.get(i));
        }

        for (String month : months){

            System.out.println(month);
        }


        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(numbers.get(numbers.size() -1));

        //how can we add all values of array list?

        int result = 0;
        for (int i : numbers){
            result += i;
        }
        System.out.println(result);



        int max = 0;
        for ( int i = numbers.size() - 1; i >= 0; i-- ){
            //System.out.println(numbers.get(i));
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        System.out.println(max);






        // write java program to get A-Z
        // create ArrayList and store A-Z which generated from above task


        ArrayList <String> alphabet = new ArrayList <String> ();

      /*  String r;
        for (char c = 'A'; c <= 'Z'; c++){

            for(char s = 'a'; s <= 'z'; s++){
                r = c +""+ s;
                if(c == Character.toUpperCase(s)){
                    alphabet.add(r);
                    continue;
                }
            }
        }
        System.out.println(alphabet);*/

        String alphabetResult;
        for (char c = 'Z'; c >= 'A'; c--){
            alphabetResult = c +""+Character.toLowerCase(c);
            alphabet.add(alphabetResult);
        }

        System.out.println(alphabet);


        // ask user to enter 10 word
        // store all 10 words to arraylist
        // 10 month , 10 fruit , 10 car
        ArrayList <String> str = new ArrayList<String>();

        for(int i = 1; i<=10; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print(i+ " Enter a word: ");
            String userInput = sc.nextLine();
            str.add(userInput);
        }
        System.out.println(str);

        ArrayList <Integer> num = new ArrayList<Integer>();

        int i = 1;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println(i+ " Enter a number");
            int userInput = sc.nextInt();
            num.add(userInput);
            i++;
        }while(i <= 10);

        System.out.println(num);








































    }
}
