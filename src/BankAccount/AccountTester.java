package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class AccountTester {
    public static void main(String args[]){
        BankAccount anAccount;
        anAccount = new BankAccount("ZhangLi",100023,0);
        anAccount.setBalance(anAccount.getBalance()+100);
        System.out.println("Here is the account:" + anAccount);
        System.out.println("Account name:"+anAccount.getOwnerName());
        System.out.println("Account number:"+anAccount.getAccountNumber());
        System.out.println("Balance:$"+anAccount.getBalance());
        System.out.println();
        anAccount = new BankAccount("WangFang",100024,0);
        System.out.println(anAccount);
        anAccount.deposit(225.67f);
        anAccount.deposit(300.00f);
        System.out.println(anAccount);
        anAccount.withdraw(400.17f);
        System.out.println(anAccount);
    }
}
