package bycicle.com;

public class SportBike {

    public static void main(String[] args) {


        Bycicle sportBike = new Bycicle();

        sportBike.wheel = 2;
        sportBike.color = "red";
        sportBike.price = 8000.00;
        sportBike.name = "BMW";
        sportBike.basket = false;
        sportBike.type = "BMW_5.7";

        System.out.println("Bike price is : " + sportBike.price);

        sportBike.gear();
        sportBike.ride();
    }
}
