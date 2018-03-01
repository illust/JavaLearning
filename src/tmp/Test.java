package tmp;
import java.io.*;
/**
 * Created by Sven on 2018/3/1.
 */
class Person{
    public void print(){System.out.print("Person ");}
    public void printMyGender(String s){
        this.print();
        System.out.print(s+" ");
    }
}

class Gender{
    String type = "gender";
    public void print(Person p){p.printMyGender(type);}
}

class Female extends Gender{
    public Female(){
        type = "female";
    }
}

class Male extends Gender{
    public Male(){
        type = "male";
    }
}

class Employee extends Person{
    public void print(){
        System.out.print("Employee ");
    }
}

class Manager extends Employee{
    public void print(){
        System.out.println("Manager ");
    }
}

public class Test {
    public static void main(String[] args){
        Manager man = new Manager();
        Employee em = new Employee();
        Gender gender1 = new Male();
        Gender gender2 = new Female();
        gender1.print(man);
        gender2.print(em);
    }
}
