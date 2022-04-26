import java.util.*;

public class Bicycle {
    private int gearSize = 0;
    private double cadence = 0;

    public static void main(String[] args){
        Bicycle a = new Bicycle(200,300);
        System.out.println(a.speed());
    }

    public Bicycle(int gearSize, double cadence){
        this.gearSize = gearSize;
        this.cadence = cadence;
    }
    public double setCadence(double cadence){
        this.cadence = cadence;
        return this.cadence;
    }
    public double speed(){
        return (this.gearSize * Math.PI) / (12 * 5280) * this.cadence * 60;
    }

}
