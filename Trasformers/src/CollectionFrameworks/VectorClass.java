package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorClass {


    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList <>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        Vector <String> season = new Vector<>();
        season.add("Spring");
        season.add("Summer");
        season.add("Autumn");
        season.add("Winter");
        System.out.println(season);
        season.set(0, "SPRING");
        System.out.println(season);
        System.out.println(season.get(0));
        season.remove(0);
        System.out.println(season);
        season.clear();
        System.out.println(season);
        System.out.println(season.addAll(days));
        System.out.println(season);
        season.addElement("Thursday");
        System.out.println(season.capacity());
        System.out.println(season.size());
        System.out.println(season.clone());
        System.out.println(days.clone());

        System.out.println(season.contains("Monday2"));
        System.out.println(season.containsAll(days));


        System.out.println(season.elementAt(0));
        System.out.println(season.get(0));

        System.out.println(season.elements());



    }
}
