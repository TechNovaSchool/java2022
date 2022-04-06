package CollectionFrameworks;

import java.util.*;

public class QueueClass {

    public static void main(String[] args) {


        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add(0, "Sunday");
        days.add("Saturday");

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("John");
        queue.add("Bob");
        queue.add("Lee");
        queue.add("John Smith");
        queue.addAll(days);

        System.out.println(queue.peek());

        PriorityQueue <Character> chars = new PriorityQueue<>();
        chars.add('c');
        chars.add('r');
        chars.add('f');
        chars.add('d');
        chars.add('a');
        chars.add('b');


        Iterator<Character> it = chars.iterator();

        while(it.hasNext()){

            System.out.println(it.next());

        }




        System.out.println(chars);
        //System.out.println(chars.poll());
        chars.remove();
        System.out.println(chars.remove());
        System.out.println(chars.contains('a'));
        chars.clear();
        System.out.println();
        System.out.println(chars.remove('b'));
        System.out.println(chars);


        ArrayDeque <Integer> arrQ = new ArrayDeque<>();
        arrQ.add(192);
        arrQ.add(132);
        arrQ.add(142);
        arrQ.add(152);
        arrQ.add(162);
        arrQ.add(172);
        arrQ.add(182);
        System.out.println(arrQ);


        Queue <Integer> queueNUm = new PriorityQueue<>();
        queueNUm.addAll(arrQ);
        System.out.println(queueNUm);

        System.out.println(queue);










    }
}
