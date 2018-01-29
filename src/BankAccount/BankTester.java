package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class BankTester {
    public static void main(String args[]){
        BankAccount myAccount = new BankAccount("Tom",6,24);
        System.out.println("ownerName="+myAccount.ownerName);
        System.out.println("accountNumber="+myAccount.accountNumber);
        System.out.println("balance="+myAccount.balance);
    }
}
