import java.util.Arrays;

public class ArrayPart2 {

    public static void main(String[] args) {


  /*      int [] numbers = new int[3];

        numbers[0]= 10;
        numbers[1]= 20;
        numbers[2]= 30;
        numbers[1] = 40;

        System.out.println(numbers[1]);


        //int [] numbers2 = {10, 20, 30, 40, 50};


        double[] doubleArr = new double[5];
        doubleArr[0] = 10.10;
        doubleArr[1] = 330.10;
        doubleArr[2] = 14.10;
        doubleArr[3] = 1330.10;
        doubleArr[4] = 1770.10;

        System.out.println( doubleArr[3]);

        String [] names = {"John", "Bob", "Smith", "Jack", "Dan"};*/

        //System.out.println(names[2]);

        // for loop
      /*  for (int i = 0; i < names.length;  i ++){

            System.out.println(names[i]);
        }

        // for each
        for (String name : names){

            System.out.println(name);
        }*/


       /* int [] numbs = {4, 5, 8, 1, 3, 1, 9 , 2, 6, 4, 0};

        // How to sort an array in a way that
        // Sort even numbs & odd numbs

        //0 2 4 4 6 8 1 1 3 5 9

        int [] oddArr = new int[numbs.length];
        int [] evenArr = new int[numbs.length];

        int j = 0, o = 0;
        for (int i = 0; i < numbs.length; i++){

                if(numbs[i] % 2 == 0){
                    j++;
                    evenArr[i]+= numbs[i];
                }else {
                    o++;
                    oddArr[i] =numbs[i];
                }
        }

        Arrays.sort(evenArr);
        for (int i: evenArr){

            if(i == 0){
                continue;
            }
            System.out.print(i + ", ");
        }

        Arrays.sort(oddArr);
        for (int i: oddArr){
            if(i == 0){
                continue;
            }
            System.out.print(i + ", ");
        }

*/














        /*char [] charArr = {'a', 's', 't', 'Q', 'A', 'b', 'r'};

       Arrays.sort(charArr);
       for (char c : charArr) {

           System.out.print(c + ", ");
       }
*/





/*

        int [] numbs = {443, 44, 8, 9, 1, 7, 4, 22, 44};


        // First way
        int mx = numbs[0]; //44
        for (int i : numbs){
            if(i < mx){
                mx = i;
            }
        }
        //--------------------
        // second way
        Arrays.sort(numbs); // 7 8 8 22 44 443
        System.out.println("Mn is "+  numbs[0]);
        System.out.println("Mx is "+  numbs[numbs.length - 1]);

*/












    }
}
