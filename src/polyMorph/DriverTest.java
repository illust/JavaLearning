package polyMorph;

/**
 * Created by Sven on 2018/3/1.
 */
public class DriverTest {
    public static void main(String[] args){
        Driver a = new FemaleDriver();
        Driver b = new MaleDriver();
        Vehicle x = new Car();
        Vehicle y = new Bus();
        a.drives(x);
        b.drives(y);
    }
}
/**
 * 二次分发(double dispatching)
 * 对输出消息的请求被分发两次；
 * 首先根据驾驶员的类型被发送给一个类
 * 之后根据交通工具的类型被发送给另一个类
 * */
