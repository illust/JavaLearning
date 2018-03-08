package thinkinjavaUnit5;

/**
 * Created by Sven on 2018/3/8.
 */

class Tree{
    int height;
    Tree(){
        System.out.print("Planting a seeding");
        height = 0;
    }
    Tree(int initialHeight){
        height = initialHeight;
        System.out.print("Creating new Tree that is " + height + " feet tall");
    }
    void info(){
        System.out.print("Tree is " + height + " feet tall");
    }
    void info(String s){
        System.out.print(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
