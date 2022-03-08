import java.util.*;

public class Sequence {
    private int[] values;
    public Sequence(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }
    public int get(int i) { return values[i]; }
    public int size() { return values.length; }
    public String toString() {
        return java.util.Arrays.toString( values );
    }
    public static void main(String[] args){
        Sequence one = new Sequence(3);
        Sequence two = new Sequence(4);
        one.set(0, -1);
        one.set(1, 6);
        one.set(2, 3);
        two.set(0, 2);
        two.set(1, 5);
        two.set(2, 1);
        two.set(3, 7);
        System.out.println("One plus two is: " + one.sum(two));
        System.out.println("One is equal to two: " + one.equals(two));
        System.out.println("One has the same values has two: " + one.SameValues(two));
    }

    public boolean equals(Sequence other){
        boolean result = true;
        if (other.size() != this.size())
            return false;
        for(int i = 0; i < other.size(); i++){
            if(other.get(i) != this.get(i))
                result = false;
        }
        return result;
    }

    //E7.12
    public boolean SameValues(Sequence other){
        boolean result = true;
        int compare;
        if (this.size() != other.size())
            return false;
        for (int i = 0; i < other.size(); i++){
            compare = this.get(i);
            for (int j = 0; j < other.size(); j++){
                if (this.get(j) == compare) {
                    result = true;
                    break;
                }
                else
                    result = false;
            }
            if (result == false)
                return result;
        }
        return result;
    }

    //e7.14
    public Sequence sum(Sequence other) {
        Sequence result = new Sequence( Math.max( this.size(), other.size() ) );
        for (int i = 0; i < result.size(); i++) {
            int a, b;
            if (i < this.size()) a = values[i]; else a = 0;
            if (i < other.size()) b = other.get(i); else b = 0;
            result.set(i, a + b);
        }
        return result;
    }
}

