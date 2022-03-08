import java.util.ArrayList;

public class DataSet {
    ArrayList list = new ArrayList<Double>();
    public DataSet(double a, double b){
        list.add(a);
        list.add(b);
    }
    public void add(double a){
        list.add(a);
    }
    public double getAverage(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++){
            double a = (double) list.get(i);
            sum += a;
        }
        return sum / list.size();
    }
    public double getStandardDeviation(){
        double a = 0;
        double b = 0;
        for (int i = 0; i < list.size(); i++){
            a += Math.pow((double) list.get(i) - getAverage(), 2);
        }
        b = a / (list.size() - 1);
        return Math.sqrt(b);
    }

}
