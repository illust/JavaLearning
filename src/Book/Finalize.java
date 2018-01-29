package Book;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class Finalize {
    public static void main(String args[]){
        Book book = new Book(1);
        new Book(3);    // 无用（不再使用）对象被内存回收机制自动回收

        System.gc();    // 申请立即回收垃圾
    }
}
