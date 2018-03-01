package Ball;

/**
 * Created by Sven on 2018/3/1.
 */
public class MovingBall extends Ball {
    private double speed;
    public MovingBall(){}
    public MovingBall(double xValue,double yValue,double r,String c,double s){
        super(xValue,yValue,r,c);
        speed = s;
    }
    public String toString(){
        return super.toString() + ",speed " + Double.toString(speed);
    }
}

/**
 * 注意：
 * 子类不能直接存取父类中声明的私有数据成员，super.toString调用父类
 * Ball的toString方法输出类Ball中声明的属性值
 * */