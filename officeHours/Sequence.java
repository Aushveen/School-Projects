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
        // System.out.println("sjefhaergkjhagijhegrjhgerjhgerjhegrwjeghregriuhergiuh"); 
        
        Sequence one = new Sequence(4);
        Sequence two = new Sequence(3);
        one.set(0, 7);
        one.set(1, 2);
        one.set(2, 5);
        one.set(3, 2);
        
        two.set(0, 7);
        two.set(1, 5);
        two.set(2, 2);      
       
        
        System.out.println("One plus two is: " + one.sum(two));
        System.out.println(one + " is equal to " + two + ": " + one.equals(two));
        System.out.println(one + " has the same values as " + two + ": " + one.sameValues(two));
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
    public boolean sameValues(Sequence other){
        for (int i = 0; i < this.size(); i++) 
            if (! other.contains(this.get(i)) ) 
                return false; 
        for (int i = 0; i < other.size(); i++) 
            if (! this.contains(other.get(i)) ) 
                return false; 
        return true; 
    }

    public boolean contains(int value) {
        for (int i = 0; i < this.size(); i++){
            if (this.get(i) == value) 
                return true;
        }
        return false;
        
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
