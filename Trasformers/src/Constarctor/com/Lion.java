package Constarctor.com;

public class Lion {

    public static void main(String[] args) {

        /*Animal lion = new Animal();
        System.out.println(lion.name);
        System.out.println(lion.age);
        System.out.println(lion.fur);*/

        Animal lion2 = new Animal("Simba", 4, "Dark Yellow", "Male", 120, false);
        System.out.println(lion2.animalName + " " + lion2.animalAge);

        Animal dog = new Animal("Rex", 5, "Brown", "Male", 54, false);
        Animal eagle = new Animal("Rosie", 6, "Brown", "Female", 45, true);

        System.out.println(eagle.animalCanFly);
        System.out.println(dog.animalCanFly);




    }
}
