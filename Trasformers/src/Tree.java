public class Tree {

    // instance variables
    int age = 10;
    String type = "Fruit Tree";

    // class variables
    static double price = 70.00;
    static String name = "Apple Tree";


    public static void main(String[] args) {

        //local variable
        String delivery = "04/20/22";

        Tree tree = new Tree();

        System.out.println(tree.age);
        System.out.println(tree.type);

        System.out.println(price);
        System.out.println(name);

        System.out.println(delivery);

        tree.getTreePrice();


    }

    public void getTreePrice(){

        System.out.println(price);
    }


}
