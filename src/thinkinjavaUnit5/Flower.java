package thinkinjavaUnit5;

/**
 * Created by Sven on 2018/3/8.
 */

public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        System.out.println("Constructor w/ int arg only, petalCount= "
            + petalCount);
    }
    Flower(String ss){
        System.out.println("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }
    Flower(String s, int petals){
        this(petals);
        // ! this(s);   // Can't call two!
        this.s = s;     // Another use of "this"
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount(){
        // ! this(11); // 除了构造器以外，编译器禁止在其他任何方法中调用构造器
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Flower x = new Flower("hello",38);
        x.printPetalCount();
    }
}
