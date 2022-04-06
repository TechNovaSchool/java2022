package CollectionFrameworks;

import java.util.*;

public class HashMapClass {

    public static void main(String[] args) {


        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add(0, "Sunday");
        days.add("Saturday");

        HashMap <String, String> country = new HashMap<String, String>();
        country.put("USA", "DC");
        country.put("Brasil", "Brazilia");
        country.put("Canada", "Ottawa");
        country.put("France", "Paris");
        country.put("Ukraine", "Kiev");
        country.put("Kenya", "Nairobi");


        System.out.println(country);

        for (Map.Entry<String, String> entry : country.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());

        }



        Map<String, Double> price = new HashMap<>();
        price.put("apple", 5.99);
        price.put("suger", 7.10);
        price.put("bread", 4.99);
        price.put("eggs", 7.00);
        price.put("milk", 5.00);

        price.put("apple", 2.99);

        price.remove("suger");
        for(Map.Entry<String, Double> pr : price.entrySet()){

            System.out.println(pr.getKey() + " " + pr.getValue());

        }

        System.out.println(price.get("apple"));

        System.out.println(price.containsKey("suger"));
        System.out.println(price.containsValue(2.00));



    }
}
