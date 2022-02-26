public class MethodVoidAndReturn {

    public static void main(String[] args) {


        addAgeAndName(33, "John");
    }



    // void == no return type
    public static void printText(String text){
        System.out.println(text);
    }

    // with return type
    public static boolean printText2(){

        return true;



    }

    public static void addAgeAndName(int age, String name){

        System.out.println("Age is "+ age + " name is " + name);
    }


}
