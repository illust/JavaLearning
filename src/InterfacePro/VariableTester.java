package InterfacePro;

/**
 * Created by Sven on 2018/2/7.
 */

/** 声明接口类型的变量，并用它来访问对象
 *  类型隐式向上转换
 */

public class VariableTester {
    public static void main(String[] args)
    {
        Shape2D var1 = new Rectangle(5,6);
        Shape2D var2 = new Circle(2.0);
        System.out.println("Area of var1 = " + var1.area());
        System.out.println("Area of var2 = " + var2.area());
    }
}
