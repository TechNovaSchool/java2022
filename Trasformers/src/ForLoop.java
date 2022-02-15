
public class ForLoop {

    public static void main(String[] args) {

       /* int i = 1;

        while (i <= 5){
            System.out.print(i);
             i++;
        }*/

        // for loop

      /*  for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
*/

      /*  for (int i = 1; i <=10; i++){

            System.out.println(4 + " X " + i + " = " + 4 * i);
        }*/


        //2 4 6 8 10 .. 80

      /*  for (int i = 2; i <= 80; i += 2){

            System.out.print(i);
        }


        for (int i = 80; i >= 2; i -= 2){
            System.out.print(i);
        }*/


/*

        String str = "Hello";
        char ch = '2';

        System.out.println(str+ch);

        for (int i = 0; i<str.length(); i++){

            System.out.println(str.charAt(i) == 'o');
        }
*/



       /* for (int i = 0; i<10; i++){

            if (i == 5){
               continue;
            }
            System.out.println(i);
        }
*/
      /*  String str = "Welcome To 2022";

        for (int i = 0; i<str.length(); i++){

            if (str.charAt(i) == 't' || str.charAt(i) == 'T' ){
                continue;
            }

            System.out.print(str.charAt(i));
        }
*/


        for (int i = 0; i < 5; i++) {

            System.out.println(" outer loop " + i);

            int j = 0;
            while (j < 5) {
                System.out.println("inner loop " + j);
                j++;

                if (i == 3) {
                    break;
                }
            }


        }




    }
}
