package oop.com;

public class HomePageTestCase01 {

    public static void main(String[] args) {

        HomePage page = new HomePage("TC01");
        page.verifyTitle("Home Page");

        CustomerPage ctPage = new CustomerPage("TC01");
        ctPage.verifyTitle("Customer Page");
    }


}
