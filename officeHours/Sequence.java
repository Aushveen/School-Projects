import java.util.ArrayList;

public class Sequence extends ArrayList<Integer> {
    private int[] values;
    public Sequence(int size) { values = new int[size]; }
    public void set(int i, int n) { values[i] = n; }
    public int obtain(int i) { return values[i]; }
    public int size() { return values.length; }
    public static void main(String[] args){
        Sequence one = new Sequence(10);
        Sequence two = new Sequence(10);
        one.set(0,84);
        one.set(1,10);
        one.set(2, 69);
        one.set(3, 12);
        one.set(4, 22);
        one.set(5, 10);
        one.set(6, 4000000);
        one.set(7, 12);
        one.set(8, 22);
        one.set(9, 88);
        two.set(0,84);
        two.set(1,10);
        two.set(2, 69);
        two.set(3, 12);
        two.set(4, 22);
        two.set(5, 10);
        two.set(6, 4000000);
        two.set(7, 12);
        two.set(8, 22);
        two.set(9, 88);
        System.out.println(one);
        System.out.println(two);
        /**
        System.out.println("One is equal to two: " + one.equals(two));
        System.out.println("One has the same values has two: " + one.SameValues(two));
        System.out.println("One plus two is: " + one.sum(two));
         **/

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
    public Sequence sum(Sequence other){
        Sequence add = new Sequence(0);
        for (int i =0; i < Math.max(this.size(), other.size()); i++){
            int b, c;
            if(i < this.size())
                b = this.get(i);
            else
                b = 0;
            if (i < other.size())
                c = other.get(i);
            else
                c = 0;
            add.add(b+c);
        }

        return add;
    }
}
