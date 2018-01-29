package BankAccount;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class BankAccount {
    String ownerName;
    int accountNumber;
    float balance;
    // 声明一个有三个参数的构造方法
    public BankAccount(String initName,int initAccountNumber,float initBalance){
        ownerName = initName;
        accountNumber = initAccountNumber;
        balance = initBalance;
    }
    // 假设一个新账号的初始余额为0，则可以增加一个带有两个参数的构造方法
    /*public BankAccount(String initName,int initAccountNumber){
        ownerName = initName;
        accountNumber = initAccountNumber;
        balance = 0.0f;
    }*/
    // 无参数的构造方法：自定义默认的初始化方式
    /*public BankAccount(){
        ownerName = "";
        accountNumber = 999999;
        balance = 0.0f;
    }*/
    // 使用this重载构造方法，避免编码的冗余
    public BankAccount(String initName,int initAccountNumber){
        this(initName,initAccountNumber,0.0f);
    }
    public BankAccount(){
        this("",999999,0.0f);
    }

}
