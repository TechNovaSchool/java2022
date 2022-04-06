package Review;

public class MainClass {

    public static void main(String[] args) {


        MethodReview mr = new MethodReview();
        //mr.addTwoNumbers();
        //mr.addTwoNumbers(4, 4);
        //mr.navigate("www.orange.com");
        mr.printName("John Smith");
        //mr.login("admin", "admin123");



        double result = mr.addNumbers(80.0, 90.0);

        System.out.println(result);





       /* mr.convertToUpperCase();
        mr.ageCalculator();

        boolean age = mr.checkAge();
        System.out.println(age);

        String title = mr.pageTitle("Login Page Title");
        System.out.println( title);*/


        // Assertion will compare 2 values (expected vs.actual) & and returns boolean

    }

    public void testCase02(){

        MethodReview mr = new MethodReview();
        mr.navigate("www.orange.com");
        mr.login("admin", "admin123");

        // check something else
    }

    public void testCase03(){

        MethodReview mr = new MethodReview();
        mr.navigate("www.orange.com");
        mr.login("admin", "admin123");

        // check something else
        // check something else
    }


}
