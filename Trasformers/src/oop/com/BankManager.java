package oop.com;

public class BankManager extends BankOfAmerica{

    public static void main(String[] args) {

        BankOfAmerica ba = new BankOfAmerica();

        System.out.println(ba.fullName);
        System.out.println(ba.routingNumber);
        System.out.println(ba.getDebitCreditNumber());
        System.out.println(ba.getAccountNumber());

        ba.setSsn(3456);

        System.out.println(ba.getSsn());

    }
}
