package OOPReview;

public class Bob {



    public static void openAccount(){

        AccountInfo bobAccount = new AccountInfo();
        bobAccount.setAccountNumber("9874576123");
        bobAccount.setRoutingNumber(234123465);
        bobAccount.setCustomerName("Bob  Marley");
        bobAccount.setBalance(200000.00);
        bobAccount.setAge(55);

        System.out.println(bobAccount.getAccountNumber());
        System.out.println(bobAccount.getRoutingNumber());
        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getAge());
    }


    public static void main(String[] args) {

        openAccount();

    }
}
