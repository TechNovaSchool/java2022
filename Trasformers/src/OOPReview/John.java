package OOPReview;

public class John extends Parent {

    public static void main(String[] args) {
        John john = new John();
        john.dancing();
        john.cooking();

        Parent parent = new Parent();
        parent.cooking();
        parent.dancing();
    }


    public void ski(){
        System.out.println("John can ski");
    }

    public void autoRace(){
        System.out.println("Race a car");
    }
}
