package car.com;

public class Car {

    static double engine = 2.5;
    int seats = 4;
    int wheel;
    String color;
    double price;
    String interior;
    boolean isElectric;
    String model ;
    String make;

    public void drive(){
        System.out.println(make + " " + model+ " is driving");
    }

    public void startEngine(){
        System.out.println(make + " " + model+ " start engine");
    }

    public void stopEngine(){
        System.out.println(make + " " + model+ " stop engine");
    }

    public void brokeDown(){
        System.out.println(make + " " + model+ " is broken");
    }

    public void honk(){
        System.out.println(make + " " + model+ " is beep beeping");
    }






}
