package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LikedListClass {

    public static void main(String[] args) {

        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add(0, "Sunday");
        days.add("Saturday");


        LinkedList <String> day = new LinkedList<>();
        day.add("Monday");
        day.add("Tuesday");
        day.add("Wednesday");
        day.addAll(days);

        System.out.println(days);
        System.out.println(day.get(0));
        day.addFirst("Sunday");
        day.addLast("Saturday");
        System.out.println(day);



        LinkedList <Integer> number = new LinkedList<>();
        number.add(2);
        number.add(4);
        number.addLast(30);
        number.addFirst(1);
        number.add(200);

        System.out.println(number.get(3));
        System.out.println(number.getFirst());
        System.out.println(number.getLast());
        number.removeFirst();
        number.removeLast();
        System.out.println(number);

        for (String d: day){
            System.out.println(d);
        }

        for( int i = 0; i < day.size(); i++){
            System.out.println(day.get(i));
        }




        LinkedList <Character> chars = new LinkedList<Character>();
        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');

        System.out.println(chars);
        chars.set(3, 'e');
        System.out.println(chars);
        chars.remove(0);
        System.out.println(chars);
        chars.clear();
        System.out.println(chars);
        Collections.sort(chars);






    }
}
