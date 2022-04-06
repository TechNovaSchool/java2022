package CollectionFrameworks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class HashSetClass {

    public static void main(String[] args) {


        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(1);
        numbers.add(15);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);


        HashSet<Character> chars = new HashSet<Character>();
        chars.add('m');
        chars.add('w');
        chars.add('a');
        chars.add('b');
        chars.add('g');
        chars.add('y');

        System.out.println(chars);
        System.out.println(chars.isEmpty());

        SortedSet<Character> chars2 = new TreeSet<Character>();
        chars2.add('c');
        chars2.add('d');
        chars2.add('w');
        chars2.add('a');
        chars2.add('e');
        chars2.add('t');
        chars2.add('u');
        chars2.add('b');
        chars2.add('m');
        chars2.add('q');

        System.out.println(chars2);

        SortedSet<String> strSorted = new TreeSet<>();
        strSorted.add("Apple");
        strSorted.add("peach");
        strSorted.add("Banana");
        strSorted.add("orange");
        strSorted.add("watermelon");
        System.out.println(strSorted);
        System.out.println(strSorted.subSet("apple", "peach"));
        System.out.println(strSorted.headSet("orange"));
        System.out.println(strSorted.last());
        System.out.println(strSorted.first());

        ArrayList<String> days = new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        days.add("Monday");

        System.out.println(days);

        TreeSet <String> sortedDays = new TreeSet<String>();
        sortedDays.addAll(days);
        System.out.println(sortedDays);

        strSorted.addAll(days);

        System.out.println(strSorted);



    }
}
