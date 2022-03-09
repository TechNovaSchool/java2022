package car.com;

public class VWGolf {

    public static void main(String[] args) {

        Car golf = new Car();
        golf.startEngine();
        golf.drive();
        golf.make = "VW";

        String newColor = golf.color = "green";
        double price = golf.price = 35000.00;
        double engine = golf.engine = 2.5;

        System.out.println(newColor);
        System.out.println(engine);
        System.out.println(price);
    }

}
