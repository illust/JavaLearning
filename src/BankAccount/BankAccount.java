package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class BankAccount {
    private String ownerName;
    private int accountNumber;
    private float balance;

    // 声明一个有三个参数的构造方法
    public BankAccount(String initName,int initAccountNumber,float initBalance){
        ownerName = initName;
        accountNumber = initAccountNumber;
        balance = initBalance;
    }
    // 使用this重载构造方法，避免编码的冗余
    public BankAccount(String initName,int initAccountNumber){
        this(initName,initAccountNumber,0.0f);
    }
    public BankAccount(){
        this("",999999,0.0f);
    }

    public String getOwnerName(){ return ownerName;}
    public int getAccountNumber(){return accountNumber;}
    public float getBalance(){return balance;}

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }

    // 覆盖toString()方法
    public String toString(){
        return ("Account #" + accountNumber + " with balance $" + balance);
    }

    // 给BankAccount类增加存款及取款方法
    public float deposit(float anAmount){
        balance += anAmount;
        return(balance);
    }
    public float withdraw(float anAmount){
        balance -= anAmount;
        return(anAmount);
    }
}
