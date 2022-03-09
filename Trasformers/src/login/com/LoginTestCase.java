package login.com;

public class LoginTestCase {

    public static void main(String[] args) {

        TestData data = new TestData();
        LoginPageLocators page = new LoginPageLocators();

        System.out.println("Opened Orange HRM Login Page");
        page.isTitleDisplayed(data.pageTitle);
        page.enterUserName(data.username);
        page.enterPassword(data.password);
        page.clickButton();
    }
}
