package oop.com;

public abstract class Car {

   final String make = "BMW";
   final String model = "X5";
   final int year = 2022;
   final String VIN = "ABC123XYZ";

    public abstract void starting();
    public abstract void driving();
    public abstract void stopping();
    public abstract void parking();

}
