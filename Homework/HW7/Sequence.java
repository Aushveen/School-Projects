
import java.util.*;
import java.awt.*;


public class Sequence {

    private ArrayList<Integer> values;

    public static void main(String[] args){
        Sequence one = new Sequence();
        Sequence two = new Sequence();

        one.add(1);
        one.add(4);
        one.add(10);
        one.add(3);

        two.add(7);
        two.add(2);
        two.add(3);

        System.out.println(one);
        System.out.println(two);
        System.out.println(one.append(two)); // it works, but merge gets messed up if this is not commented out
        System.out.println(one.merge(two));
    }

    public Sequence() {
        values = new ArrayList<Integer>();
    }
    public void arrange(){
        Collections.sort(values);
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public int size(){
        return values.size();
    }
    public int get(int i) { return values.get(i); }

    // E7.22, also accidentally solved E7.24

    public Sequence append(Sequence other){

        if (other.size() < this.size())
            for (int i = 0; i < other.size(); i++)
                this.add(other.get(i));
        else if(other.size() > this.size())
            for (int i = 0; i < this.size(); i++)
                other.add(this.get(i));
        else
            for (int i = 0; i < this.size(); i++)
                other.add(this.get(i));

        if (this.size() > other.size()) {
            this.arrange();
            return this;
        } else {
            other.arrange();
            return other;
        }
    }
//E7.23
    public Sequence merge(Sequence other){
        Sequence a = new Sequence();
        int count = 0;
        if (this.size() > other.size()) {
            for (int i = 0; i < other.size(); i++) {
                a.add(this.get(i));
                a.add(other.get(i));
                count++;
            }
            while (count < this.size()){
                a.add(this.get(count));
                count++;
            }

        } else {
            for (int i = 0; i < this.size(); i++) {
                a.add(this.get(i));
                a.add(other.get(i));
                count++;
            }
            while (count < other.size()){
                a.add(other.get(count));
                count++;
            }

        }
        return a;
    }
}
