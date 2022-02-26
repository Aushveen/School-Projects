import java.util.ArrayList;
import java.util.Collections;

public class DataSet {
    private double a,b,c;
    ArrayList list = new ArrayList<Double>();
    public DataSet(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        list.add(a);
        list.add(b);
        list.add(c);
    }
    public void add(double value){
        list.add(value);

    }
    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            double a = (double) list.get(i);
            sum = sum + a;
        }
        return sum / list.size();
    }
    public double getSmallest(){
        Collections.sort(list);
        return (double) list.get(0);
    }
    public double getLargest(){
        Collections.sort(list);
        return (double) list.get(list.size() - 1);
    }
    public double getRange(){
        return getLargest() - getSmallest();
    }
}
