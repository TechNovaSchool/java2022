package OOPReview;

public abstract class Animal implements Zoo {

    private String name;

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
    public abstract void walk();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
