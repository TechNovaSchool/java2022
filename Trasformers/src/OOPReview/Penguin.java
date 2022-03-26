package OOPReview;

public class Penguin extends Bird{

    @Override
    public void canFly() {
        System.out.println("Penguin can not fly :(");
    }

    public  void eat(){
        System.out.println("Penguin eat fish");
    }

}
