package login.com;

public class LoginPageLocators {

    String pageTitle = "Orange HRM";
    String userName = "UserName input box";
    String passWord = "Password input box";
    String loginButton = "LOGIN";

    public boolean isTitleDisplayed(String title) {

        return pageTitle.equals(title);
    }

    public void enterUserName(String userName){
        System.out.println("entered " + userName + " into " + this.userName);
    }

    public void enterPassword(String password){
        System.out.println("entered " + password + " into " + this.passWord);
    }

    public  void clickButton(){
        System.out.println("Clicked " + this.loginButton);
    }
}
