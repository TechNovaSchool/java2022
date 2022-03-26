package OOPReview;

import java.sql.Driver;

public class MainBird {

    public static void main(String[] args) {

        Bird bird;

        bird = new Bird();
        bird.canFly();
        //Bird.eat();

        bird = new Eagle();
        bird.canFly();
        bird.eat();



        bird = new Penguin();
        bird.canFly();
        //Penguin.eat();
    }
}
