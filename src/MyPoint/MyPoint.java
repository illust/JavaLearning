package MyPoint;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Created by Sven Wong on 2018/1/30.
 */
public class MyPoint {
    private double x;
    private double y;

    public  MyPoint(){
        x = 0;
        y = 0;
    }
    public MyPoint(double x,double y){
        this.x = x;
        this.y = y;
    }

    public double getD(MyPoint mp){
        return sqrt(pow((x-mp.x),2)+pow((y-mp.y),2));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float x1,y1;
        float x2,y2;
        x1 = in.nextFloat();
        y1 = in.nextFloat();
        x2 = in.nextFloat();
        y2 = in.nextFloat();

        MyPoint mp = new MyPoint(x1,y1);
        double distance = mp.getD(new MyPoint(x2,y2));
        System.out.println("The distance is:"+distance);
    }
}
