package oop.com;

public class BankOfAmerica {

    public String fullName = "John Smith";
    private long ssn;
    private int age = 32;
    private long accountNumber = 654567893;
    public long routingNumber = 34534573;
    private long debitCreditNumber = 767565678;

    public long getDebitCreditNumber() {
        return debitCreditNumber;
    }

    public long getAccountNumber(){
        return accountNumber;
    }

    public void setSsn(long ssn) {
        String ssnStr = Long.toString(ssn);
        if(ssnStr.length() == 9){
            this.ssn = ssn;
        }else{
            System.out.println("Invalid input");
        }
    }

    public long getSsn() {
        return ssn;
    }




}