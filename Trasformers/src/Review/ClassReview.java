package Review;

public class ClassReview {


    //DOM - Document Object Model


    int year = 2022;
    static int newYear = 2023;

    // API
    // endpoint
    static String endpoint = "/index.php/auth/login";
    static String SSN;

     String  username = "[id='txtUsername']";
     String password = "[id='txtPassword']";


    public static void main(String[] args) {

        ClassReview cr = new ClassReview();


        System.out.println(cr.year);

        cr.Login("Admin", "admin123");
    }

    public void print(String str){

        System.out.println(str);

    }

    public void Login(String username, String password){


        System.out.println(this.username + username);
        System.out.println(this.password + password);
    }
}
