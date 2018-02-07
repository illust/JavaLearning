package InterfacePro;

/**
 * Created by Sven on 2018/2/7.
 */
// 声明一个接口Shape2D，包括π和计算面积的方法原型
interface Shape2D { // 声明Shape2D接口
    double pi = 3.14;     // 数据成员一定要初始化，省略final
    double area(); // 抽象方法，可以省略public以及abstract
}

class Circle implements Shape2D
{
    double radius;
    public Circle(double r){
        radius = r;
    }
    public double area(){
        return (pi*radius*radius);
    }
}

class Rectangle implements Shape2D
{
    int width,height;
    public Rectangle(int w,int h)
    {
        width = w;
        height = h;
    }
    public double area(){
        return (width * height);
    }
}

interface Color{
    void setColor(String str); // 抽象方法
}


// 通过实现接口达到多重继承
class Circle2 implements Shape2D,Color  // 实现Circle2类
{
    double radius;
    String color;
    public Circle2(double r)     // 构造方法
    {
        radius = r;
    }
    public double area()        // 定义area()的处理方式
    {
        return (pi*radius*radius);
    }
    public void setColor(String str)    // 定义setColor的处理方式
    {
        color = str;
        System.out.println("color="+color);
    }
}

// 接口的扩展
// 声明Shape接口
interface Shape{
    double pi = 3.14;
    void setColor(String str);
}

// 声明Shape2Dext接口扩展了Shape接口
interface Shape2Dext extends Shape{
    double area();
}

// 接口的实现
class CircleExtend implements Shape2Dext{
    double radius;
    String color;
    public CircleExtend(double r){ radius = r; }
    public double area(){
        return (pi*radius*radius);
    }
    public void setColor(String str){
        color = str;
        System.out.println("color="+color);
    }
}