package CollectionFrameworks;

import java.util.*;


public class TreeMapClass {

    public static void main(String[] args) {

        Map<Integer, String> month = new TreeMap<Integer, String>();
        month.put(1, "January");
        month.put(2, "February");
        month.put(3, "March");
        month.put(4, "April");
        month.put(5, "May");
        month.put(6, "June");
        month.put(7, "July");
        month.put(8, "August");
        month.put(9, "September");
        month.put(10, "October");
        month.put(11, "November");
        month.put(12, "December");
        month.putIfAbsent(12, "December");

        System.out.println(month);

        for(Map.Entry<Integer, String> entry : month.entrySet()){

            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

        System.out.println(month.keySet());
        System.out.println(month.values());
        System.out.println(month.containsValue("january"));
        System.out.println(month.containsKey(12));
        //System.out.println(month.putIfAbsent(12, "December"));


        // ask user to enter key & values data format
        // example : 1 Monday 2  Tuesday
        TreeMap <Integer, String> days = new TreeMap<Integer, String>();

        for (int i = 1; i <=7; i++){
            Scanner sc = new Scanner(System.in);

            System.out.print(i + " Enter a value: ");
            String value = sc.nextLine();

            System.out.print(i + " Enter a key: ");
            int key = sc.nextInt();

            days.put(key, value);
        }

        System.out.println(days);








    }
}
