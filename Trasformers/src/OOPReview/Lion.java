package OOPReview;

public class Lion extends Feline {


    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.setName("Simba");
        System.out.println(lion.getName());
        lion.makeSound();
        lion.eat();
        lion.sleep();
        lion.selfish();
        lion.walk();
        lion.jump();
    }

    @Override
    public void makeSound() {
        System.out.println(getName() +  " Roar Roar Roar");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eat row meat");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleep 20 hrs a day");
    }

    @Override
    public void walk() {
        System.out.println(getName() + " with 4 leg ");
    }

    @Override
    public void selfish() {
        System.out.println(getName() + " is selfish");
    }

    @Override
    public void jump() {
        System.out.println(getName() + " is a good jumper");
    }

    @Override
    public void play() {

    }
}
