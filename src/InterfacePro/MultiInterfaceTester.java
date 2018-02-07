package InterfacePro;

/**
 * Created by Sven on 2018/2/7.
 */
public class MultiInterfaceTester {
    public static void main(String[] args){
        Circle2 cir;
        cir = new Circle2(2.0);
        cir.setColor("blue");
        System.out.println("Area = " + cir.area());
    }
}
