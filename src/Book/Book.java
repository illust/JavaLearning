package Book;

/**
 * Created by Sven Wong on 2018/1/29.
 */
public class Book {
    public int id;
    public Book(int i){
        id = i;
    }
    protected void finalize(){
        switch(id){
            case 1:
                System.out.print("《漂》");
                break;
            case 2:
                System.out.print("《Java语言程序设计》");
                break;
            case 3:
                System.out.print("《罗马假日》");
                break;
            default:
                System.out.print("《未知书籍》");
                break;
        }
        System.out.println("所对应的实例对象存储单元被回收");
    }
}
