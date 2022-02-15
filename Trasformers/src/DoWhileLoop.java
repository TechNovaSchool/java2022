import java.util.Scanner;

public class DoWhileLoop {


    public static void main(String[] args) {


        // do while loop

     /*   int i = 0;

        do {

            System.out.println(i + " hello");
            i++;

        }while(i < 5);*/

        // 10 12 14 16 .. 50 included

       /* int i = 10;

        do {

            System.out.println(i);
            i += 2;

        }while(i <= 50);

        int x = 50;

        do {

            System.out.println(x);
            x -= 2;

        }while(x >= 10);*/

        // 10 20 30 40 ... 100

     /*   int i = 10;

        do {

            System.out.println(i);

            i += 5;

        }while(i <= 100);
*/



        // ask user to enter username
        // if user name is correct ask for password
        // if username is invalid print print invalid username
        // if username correct but password ins invalid rint invalid password
        // print Login Success ! when correct username and password
        // ask user 3 times when username or pwd is invalid


        String expectedUserName = "Admin123";
        String expectedPassword = "admin123$";

        int i = 0;

     do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter userName: ");
            String actualUserName = sc.nextLine();

            if(actualUserName.equals(expectedUserName)){

                 for (int j = 0; j< 2; j++) {

                    System.out.print("Enter password: ");
                    String actualPassword = sc.nextLine();

                    if (actualPassword.equals(expectedPassword)) {
                        System.out.println("Login Successful!");
                        break;
                    } else {
                        System.out.println("Invalid Password");
                    }
                }
                break;

            }else {
                System.out.println("Invalid UserName");
            }
            i++;

        }while (i < 3);


        // 5 X 1 = 5
        // 5 X 2 = 10

  /*      int i = 1;

        do {

            System.out.println(5 + " X " + i + " = " + 5 * i);
            i++;

        } while (i > 11);
*/











    }
}
