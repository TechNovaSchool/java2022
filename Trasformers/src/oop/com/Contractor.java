package oop.com;

public class Contractor extends Employee{

    private int workHours;

    public Contractor(String name, int salary, int  workHours) {
        super(name, salary);
        this.workHours = workHours;
    }

    @Override
    public int calculateSalary() {
        return getSalary() * workHours;
    }
}
