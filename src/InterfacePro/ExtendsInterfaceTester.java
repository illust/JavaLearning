package InterfacePro;

/**
 * Created by Sven on 2018/2/7.
 */
public class ExtendsInterfaceTester {  // 测试类
    public static void main(String[] args){
        CircleExtend cir;
        cir = new CircleExtend(2.0);
        cir.setColor("blue");
        System.out.println("Area = " + cir.area());
    }
}
