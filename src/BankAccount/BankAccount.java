package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class BankAccount {
    private static int LAST_ACCOUNT_NUMBER = 0;
    private String ownerName;
    private int accountNumber;
    private float balance;

    // 声明一个有两个参数的构造方法
    public BankAccount(String initName,float initBalance){
        ownerName = initName;
        accountNumber = ++LAST_ACCOUNT_NUMBER;
        balance = initBalance;
    }
    // 使用this重载构造方法，避免编码的冗余
    public BankAccount(String initName){
        this(initName,0.0f);
    }
    public BankAccount(){
        this("",0.0f);
    }

    public String getOwnerName(){ return ownerName;}
    public int getAccountNumber(){return accountNumber;}
    public float getBalance(){return balance;}

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    // 覆盖toString()方法
    public String toString(){
        return ("Account #" + accountNumber + " with balance " + new java.text.DecimalFormat("$0.00").format(balance));
    }

    // 给BankAccount类增加存款及取款方法
    // 存款
    public float deposit(float anAmount){
        balance += anAmount;
        return(balance);
    }
    // 取款
    public float withdraw(float anAmount){
        if(balance < anAmount)
            System.out.println("Your balance is not enough!");
        else
            balance -= anAmount;
        return(anAmount);
    }

    // 使用类方法生成特殊的实例
    public static BankAccount example1(){
        BankAccount ba = new BankAccount();
        ba.setOwnerName("LiHong");
        ba.deposit(1000);
        return ba;
    }

    public static BankAccount example2(){
        BankAccount ba = new BankAccount();
        ba.setOwnerName("ZhaoWei");
        ba.deposit(1000);
        ba.deposit(2000);
        return ba;
    }

    public static BankAccount emptyAccountExample(){
        BankAccount ba = new BankAccount();
        ba.setOwnerName("HeLi");
        return ba;
    }

}
