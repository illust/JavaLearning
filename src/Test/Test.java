package Test;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class Test {
    // private int m;
    static int m = 3;
    public static void fun(){
        System.out.println(m);
    }
}

/**
 *
 提示：静态方法中不能引用非静态变量！这句话的含义：
 我们知道，静态方法可以通过所在类直接调用而不需要实例化对象，非静态成员变量
 则是一个对象的属性，它只有在有实例化对象时才存在，所以在静态方法中是不可以调用
 静态变量的！
 */