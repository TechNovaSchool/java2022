package constarctor_.com;

import java.lang.reflect.Constructor;

public class Human {

    // state or attributes
    public String firstName;
    public int age;
    public String lastName;
    public long cellNumber;
    public double weight;
    public double height;
    public String eyeColor;
    public char gender;
    public boolean isEmployed;

    //Constructor
    public Human (String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
    }

    public Human(int age){
        this.age = age;
    }

    public Human(long cellNumber){
        this.cellNumber = cellNumber;
    }

    public Human(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    public Human(char gender){
        this.gender = gender;
    }

    public Human(boolean isEmployed){
        this.isEmployed = isEmployed;
    }


    public Human(String eyeColor){
        this.eyeColor = eyeColor;
    }

    public Human(){



    }



}
