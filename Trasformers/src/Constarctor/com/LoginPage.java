package Constarctor.com;

public class LoginPage {

    String username;
    String password;
    String SignIn;
    boolean isDisplayed;

    LoginPage(String username, String password, String SignIn){

        this.username = username;
        this.password = password;
        this.SignIn = SignIn;
    }

    LoginPage(){
        this.isDisplayed = false;
    }

    public void EnterUserName(){
        System.out.println("Entered username as " + this.username);
    }

    public void EnterPassword(){
        System.out.println("Entered pwd as " +this.password);
    }

    public void ClickSignIn(){
        System.out.println("Clicked " +this.SignIn);
    }


    public void Longin(){
        EnterUserName();
        EnterPassword();
        ClickSignIn();
    }



}
