package enumSample;

/**
 * Created by Sven Wong on 2018/1/29.
 */
enum Score {
    EXCELLENT,
    QUALIFIED,
    FAILED;
}


public class ScoreTester {
    public static void main(String[] args){
        giveScore(Score.EXCELLENT);
    }

    public static void giveScore(Score s){
        switch(s){
            case EXCELLENT:
                System.out.println("Excellent");
                break;
            case QUALIFIED:
                System.out.println("Qualified");
            case FAILED:
                System.out.println("Failed");
                break;
        }
    }
}
