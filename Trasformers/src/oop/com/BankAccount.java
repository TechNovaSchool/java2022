package oop.com;

public class BankAccount {

    /*
▪ Create a new class for a bank account.
▪ Create fields for the account number, balance, customer name, email and phone number.
▪ Create getters and setters for each field.
▪ Create two additional methods:
▪ To allow the customer to deposit funds(this should increment the balance field)
▪ To allow the customer to withdraw funds:
 This should deduct from the balance field,
but not allow the withdrawal to complete if there are insufficient funds.
 */
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phone;

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("New balance is : " + getBalance());
    }

    public void withdraw(double withdrawAmount){

       if(this.balance - withdrawAmount < 0){
           System.out.println("Only " + this.balance + " is available in your account");
       }else{
           this.balance -= withdrawAmount;
           System.out.println("You withdraw: " + withdrawAmount + " you available balance is now: " + this.balance);
       }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }






}
