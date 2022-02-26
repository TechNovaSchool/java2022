import java.time.LocalDate;

public class MethodsBasicPartTwo {

    LocalDate date = LocalDate.now();

    public  static void addTwoNumbers (int x, int y){
        System.out.println(x + y);
    }

    void addThreeNumbers (int x, int y, int z){
        System.out.println(x + y + z);
    }

    int returnAge(int age){
        // before return
        return age;
        // we can not have any code after return
    }

    void clickButton(String locator){
        System.out.println(pageTitle("Hello"));
        System.out.println( locator + " button is clicked");
    }

    void addNameAgeEmail(int age , String name, char email ){
        System.out.println(age + " " + name + " " + email);
    }

    int multiplyTwoNumbers (int x, int y){

        int result = x * y;
        return result;

    }

    boolean pageTitle(String title){

        if(title.equals("Welcome to your page")){
            return true;
        }else{
            return false;
        }
    }

    String printName(String name){
        return name;
    }





   int calculateAge(int birthYear){

        return date.getYear() - birthYear;
    }



    public static void main(String[] args) {

        addTwoNumbers(10, 20);
        addTwoNumbers(30, 40);

        MethodsBasicPartTwo obj = new MethodsBasicPartTwo();
        obj.addThreeNumbers(10, 20, 30);

       int age =  obj.returnAge(45);
        System.out.println(age);

        obj.clickButton("Login");

        String name = obj.printName("John Smith");
        System.out.println(name);



        //int result = obj.multiplyTwoNumbers(2, 4);

        //System.out.println(result);

        int  age2 = obj.calculateAge(1977);

        if(age2 >= 18){
            System.out.println("Your are allowed to buy tobacco");
        }else{
            System.out.println("you are not allowed");
        }



    }

}
