import java.util.Arrays;

public class MultiDArrays {

    public static void main(String[] args) {


        int [] numbers = {1, 2, 3, 4, 5};

        int [] [] numbers2 = { {1 ,2 ,3}, {4, 5, 6} };

        // how to access 2D array
        /*System.out.println(numbers[0]);
        System.out.println(numbers2[1][0]);
        System.out.println(numbers2[0][2]);
        System.out.println(numbers2[1][1] + " " + numbers2[1][2]);*/


        char [][] charArray1 = { {'A', 'B', 'C', 'R', 'S'}, {'X'} };

        for (int i = 0; i <charArray1.length; i++){

            for (int j = 0; j <charArray1[i].length; j++){

                System.out.print(charArray1[i][j]);

            }
        }














        char [][] charArr = new char[3][3];
        charArr[0][0] = 'a';
        charArr[0][1] = 'b';
        charArr[0][2] = 'c';
        charArr[1][0] = 'x';
        charArr[1][1] = 'y';
        charArr[1][2] = 'z';

        // a a
        //System.out.println(charArray1[0][0] + "" + charArr[0][0]);
        // XxYyZz
        //System.out.println(charArray1[1][0] +""+ charArr[1][0] + ""+charArray1[1][1] +""+ charArr[1][1] + ""+ charArray1[1][2] +""+ charArr[1][2]);
        // b
        //System.out.println(charArr[0][1]);










        char a = 'q';
        char b = 'q';

        String x = a+ "" + b;


    }
}
