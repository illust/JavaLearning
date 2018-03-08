package thinkinjavaUnit5;

/**
 * Created by Sven on 2018/3/8.
 */
public class OverloadOrder {
    static void f(String s,int i){
        System.out.println("String: " + s + " , int: " + i);
    }
    static void f(int i,String s){
        System.out.println("int: " + i + ", String: " + s);
    }
    public static void main(String[] args){
        f("String first",11);
        f(99,"Int first");
    }
}
