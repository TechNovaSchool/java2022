package Review;

public class LoginPage {

    String usernameInput = "[id=txtUsername] ";
    String passwordInput = "[id=txtPassword] ";

    public LoginPage(String username, String password) {

        System.out.println(this.usernameInput + username);
        System.out.println(this.passwordInput + password);
    }

    public void Login(){
        System.out.println("Hello Class method");
    }
}
