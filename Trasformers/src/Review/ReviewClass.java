package Review;
import java.util.Arrays;

public class ReviewClass {


    public static void main(String[] args) {


        int [] numArr = {2, 4, 6, 8, 10};
        numArr[2] = 100;
        System.out.println(numArr[2]);

        char [] charArr = {'a', 'b', 'c', 'd'};
        System.out.println(charArr[0]);

        double [] doubleArr = {10.4, 33.44, 200.12};
        System.out.println(doubleArr[1]);

        int [] arrayNums = new int[5];
        arrayNums[0] = 20;
        arrayNums[1] = 30;
        arrayNums[2] = 40;
        arrayNums[3] = 50;
        arrayNums[4] = 60;
        arrayNums[0] = 70;

        for (int j : numArr) {
            System.out.print(j + ",");
        }

        for(char c : charArr){
            System.out.print(c);
        }

        int [] xyz = {2, 4, 6, 8, 10};
        int [] abc = {6, 4, 2, 8, 10};

        int resultInt = Arrays.compare(xyz, abc);
        boolean resultBool = Arrays.equals(xyz, abc);
        System.out.println("***************** "+resultBool + " *****************");
        System.out.println("***************** "+resultInt + " *****************");


        int result = 0;


        for (int i : xyz){
            result += i;
        }

        System.out.println("************ " + result);

        String [] str = {"hello", "bye", "Welcome"};

        String hello = str[0].toUpperCase();

        System.out.println(hello);

        for ( String s: str){
            System.out.println("ABC: " + s.toUpperCase());
        }
    }
}
