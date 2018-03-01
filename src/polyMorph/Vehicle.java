package polyMorph;

/**
 * Created by Sven on 2018/3/1.
 */
public abstract class Vehicle {
    private String type;
    public Vehicle(){}
    public Vehicle(String s){type=s;}
    public abstract void drivedByFemaleDriver();
    public abstract void drivedByMaleDriver();
}

