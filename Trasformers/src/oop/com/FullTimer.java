package oop.com;

public class FullTimer extends Employee {

    public FullTimer(String name, int salary){
        super(name,salary);
    }

    @Override
    public int calculateSalary() {
        return getSalary() * 40;
    }
}
