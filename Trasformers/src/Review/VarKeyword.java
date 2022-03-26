package Review;

public class VarKeyword {


    int number = 12;
    public static void main(String[] args) {

        int x = 10;
        char c = 'a';
        String str = "Hello";
        long num = 12345;
        float f = 10.3f;
        double d = 20.4;
        boolean b = true;
        byte bt = 2;
        short st = 1;

        // var

        var name = "John";
        var number = 20;
        var byteNumber = 12;
        var shortNumber = 13;
        var floatNumber = 12.4;
        var doubleNumber = 12.2;
        var booleanValue = true;

        System.out.println(name);

    }


    public static int print(String txt){
        System.out.println(txt);
        var intValue = 12;
        return intValue;
    }
}
