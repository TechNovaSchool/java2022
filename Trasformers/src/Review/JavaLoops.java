package Review;

public class JavaLoops {

    public static void main(String[] args) {


        /*int i = 1;

        while( i <= 10 ){

            System.out.println(i);

            i++;
        }

        //


        for (int j = 1; j <= 10; j++){
            System.out.println(j);
        }

        //


        int k = 0;

        do {

            System.out.println(" Do while " + k);
            k++;

        }while( k < 1 );
        */





        for (int i = 1; i<= 5; ++i){
            System.out.println("OUTER: " + i);

            int j = 1;
            while(j <= i){
                System.out.println(" INNER: " + j);
                j++;
            }
        }









    }
}
