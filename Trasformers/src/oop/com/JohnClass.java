package oop.com;

public class JohnClass {

    public static void main(String[] args) {

        Contractor ct = new Contractor("John", 60, 40);
        System.out.println(ct.getName());
        System.out.println(ct.getSalary());
        System.out.println(ct.calculateSalary());


        Contractor ct2 = new Contractor("Bob", 75, 40);
        System.out.println(ct2.calculateSalary());



        FullTimer ft1 = new FullTimer("Danny", 65);
        System.out.println(ft1.calculateSalary());


    }
}
