package oop.com;

public class BMW extends Car {


    @Override
    public void starting() {
        System.out.println(super.make + " is staring");
    }

    @Override
    public void driving() {
        System.out.println(super.make + " is driving");
    }

    @Override
    public void stopping() {
        System.out.println(super.make + " is stopping");
    }

    @Override
    public void parking() {
        System.out.println(super.make + " is parking");
    }

    public void getCarProperty(){
        System.out.println(super.model);
        System.out.println(super.year);
        System.out.println(super.VIN);
        starting();
        driving();
        stopping();
        parking();
    }

    public static void main(String[] args) {
       BMW bmw = new BMW();
       bmw.getCarProperty();
    }
}
