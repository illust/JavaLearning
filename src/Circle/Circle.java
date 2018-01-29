package Circle;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class Circle {
    static double PI = 3.14159265;
    private int radius;
    public double circumference(){
        return 2*PI*radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
}
