public class MethodOverLoading {

    public static void main(String[] args) {
        addNumbers(90);
        addNumbers(20, 50);
        addNumbers();
        addNumbers(30, 40, 60);
        addNumbers(30, 40, 50, 80);
    }


    ///--------------------


    static void addNumbers(int x , int y){
        System.out.println(x + y);
    }

    static void addNumbers(int x , int y , int z){
        System.out.println(x + y + z);
    }

    static void addNumbers(int x , int y , int z , int a){
        System.out.println(x + y + z + a);
    }

    static void addNumbers(){
        System.out.println("no params");
    }

    static void addNumbers(int x ){
        System.out.println(x);
    }

    static void selectDropDown(String name){

    }

    static void selectDropDown(int index){

    }

    static void selectDropDown(char option){

    }
}
