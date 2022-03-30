package CollectionFrameworks;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayListClass {

    public static void main(String[] args) {

        // regular/build-in array of Strings
        String [] cars = {"BMW", "BENZ", "Opel", "Ford", "Tesla"};
        System.out.println(cars.length);
        for( String car : cars){
            System.out.println(car);
        }

       System.out.println(">>>>>>> ArrayList <<<<<<<");

        // arraylist
        ArrayList <String> carArr  = new ArrayList <String> ();
        carArr.add("BMW");
        carArr.add("BENZ");
        carArr.add("Opel");
        carArr.add("Ford");
        carArr.add("Tesla");
        System.out.println(carArr.size());
        System.out.println(carArr.get(0));
        System.out.println(carArr);



        // create a Array list which can hold days of the week
        ArrayList <String> days = new ArrayList <String> ();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        System.out.println("Before set " + days);
        System.out.println(days.get(5));
        System.out.println(days.get(3));
        System.out.println(days.set(5, "Weekend"));
        System.out.println(days.set(6, "Weekend"));
        System.out.println("After set " + days);
        System.out.println(days.get(6));

        //create arraylist that hold 7 numbers (ints)
        ArrayList <Integer> numbers = new ArrayList <Integer> ();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
        System.out.println(numbers.get(7));
        numbers.set(3, 40);
        System.out.println(numbers.get(3));
        numbers.set(0, 50);
        System.out.println(numbers.get(0));

        // array list of chars
        ArrayList <Character> chars = new ArrayList <Character> ();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');
        chars.add('f');
        chars.add('g');
        System.out.println(chars);
        System.out.println(chars.get(4));
        chars.set(0, 'x');
        chars.set(1, 'y');
        chars.set(2, 'z');
        System.out.println(chars);



        // arraylist pf doubles
        ArrayList <Double> doubles = new ArrayList <Double> ();
        doubles.add(120.43);
        doubles.add(130.52);
        doubles.add(10.62);
        doubles.add(103.73);
        doubles.add(120.37);
        doubles.add(103.72);
        doubles.add(120.76);
        System.out.println(doubles);
        System.out.println(doubles.get(4));



        days.remove(0);
        days.remove(5);
        days.remove(4);
        days.remove(3);
        days.remove(2);
        System.out.println(days.get(0));
        System.out.println(days.get(1));


        System.out.println(chars.size());
        chars.clear();
        System.out.println(chars.size());


        for (double aDouble : doubles) {
            System.out.println(aDouble);
        }

        for (int i = 0; i < doubles.size(); i++){
            System.out.println(doubles.get(i));
        }




        ArrayList <String> names = new ArrayList<String>();
        names.add("John");
        names.add("Doe");
        names.add("Nurlan");
        names.add("Anisa");
        names.add("Mika");
        names.add("Laman");
        names.add("Aytan");
        names.add("AlyK");
        names.add("Kamol");
        names.add("Max");
        names.add("Merivan");
        names.add(0, "Names: ");

        System.out.println(names);
        //Collections.sort(names);
        System.out.println(names.get(7));
        names.set(0, "Smith");
        System.out.println(names);
        names.remove(2);
        System.out.println(names.size());
        names.clear();
        System.out.println(names.size());




    }
}