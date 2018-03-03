package tmp;

import java.util.Scanner;

/**
 * Created by Sven on 2018/3/3.
 * The purpose of this prog is to verify Goldbach Conjecture
 */
public class progQuiz1 {

    private static boolean isPrime(int m){
        boolean stat = false;
        for(int k=2;k<=(m/2+1);k++){
            if(m%k==0) break;
            if(k==(m/2+1)) stat = true;
        }
        return stat;
    }
    public static void main(String[] args){
        System.out.println("请输入任何一个大于六的偶数");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1;i<n/2;i++){
            if(isPrime(i)&&isPrime(n-i)){
                System.out.println(n+" = "+ i + "+" + (n-i));
            }
        }
    }
}
