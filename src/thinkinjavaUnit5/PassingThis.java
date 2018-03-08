package thinkinjavaUnit5;

/**
 * Created by Sven on 2018/3/8.
 */

class Person{
    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        System.out.println("Remove peel");
        return apple;
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args){
        new Person().eat(new Apple());
    }
}
