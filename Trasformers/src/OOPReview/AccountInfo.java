package OOPReview;

public class AccountInfo {

    private String accountNumber;
    private long routingNumber;
    private String customerName;
    private double balance;
    private int age;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

    public void setCustomerName(String customerName) {

      this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAge(int age) {

        if (age >= 18){
            this.age = age;
        }else{
            System.out.println("Not eligible age to open an account");
        }
    }

    public int getAge() {
        return age;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public String getCustomerName() {

        for (int i = 0; i < customerName.length(); i++) {

            String str = customerName.toLowerCase();
            if (!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && !(str.charAt(i) == 32)) {
                return "Enter a valid name";
            }
        }
        return customerName;
    }

    public double getBalance() {
        return balance;
    }
}
