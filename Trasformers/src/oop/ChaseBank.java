package oop;

import oop.com.BankAccount;

public class ChaseBank {

    public static void main(String[] args) {

        BankAccount JohnAccount = new BankAccount();
        JohnAccount.setAccountNumber("876345123");
        JohnAccount.setBalance(1000.00);
        JohnAccount.setCustomerName("John Smith");
        JohnAccount.setEmail("jsmith@gmail.com");
        JohnAccount.setPhone("777654123");


        System.out.println(JohnAccount.getAccountNumber());
        System.out.println(JohnAccount.getBalance());
        System.out.println(JohnAccount.getCustomerName());
        System.out.println(JohnAccount.getEmail());
        System.out.println(JohnAccount.getPhone());

        JohnAccount.deposit(500.00);
        System.out.println(JohnAccount.getBalance());

        JohnAccount.withdraw(430.00);
        JohnAccount.withdraw(150.00);

        System.out.println(JohnAccount.getBalance());

        JohnAccount.deposit(500.00);

        System.out.println(JohnAccount.getBalance());

        JohnAccount.withdraw(1500.00);
        




    }
}
