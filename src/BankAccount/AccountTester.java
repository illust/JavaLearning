package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class AccountTester {
    public static void main(String args[]){
        BankAccount anAccount;

        anAccount = new BankAccount("ZhangLi",0);
        System.out.println("Here is the account:" + anAccount);
        System.out.println("Account name:"+anAccount.getOwnerName());
        System.out.println("Account number:"+anAccount.getAccountNumber());
        System.out.println("Balance:$"+anAccount.getBalance());
        System.out.println();

        anAccount = new BankAccount("WangFang",0);
        System.out.println(anAccount);
        anAccount.deposit(225.67f);
        anAccount.deposit(300.00f);
        System.out.println(anAccount);
        anAccount.withdraw(600.17f);
        System.out.println(anAccount);
        System.out.println();

        System.out.println(BankAccount.example1());
        System.out.println(BankAccount.example2());
        System.out.println(BankAccount.emptyAccountExample());

    }
}
