package oop.com;

public class Human {

    static String firstName;
    static String lastName;
    int age;
    char gender;
    String email;
    String address;
    long phoneNumber;
    boolean isEmployed;
    double weight;
    double height;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Human(int age, char gender){
        this.age = age;
        this.gender = gender;
    }

    public String getEmail(){
        return email;
    }

    public String getAddress(){
        return address;
    }

    public Human(){

    }

    public int getAge(){
        return age;
       // System.out.println(age);
    }

    public static void printName(){
        System.out.println(firstName + " " + lastName);
    }






}
