import java.util.ArrayList;

public class Sequence extends ArrayList<Integer> {
    public Sequence sum(Sequence other) {
        Sequence a = new Sequence();
        for (int i = 0; i < Math.max(this.size(), other.size()); i++) {
            int b, c;
            if (i < this.size()) b = this.get(i);
            else b = 0; 
            if (i < other.size()) c = other.get(i);
            else c = 0; 
            a.add(b + c); 
        }
        return a;
    }
    public static void main(String[] args) {
        Sequence a = new Sequence(), b = new Sequence(); 
        a.add(1); a.add(5); a.add(3); 
        System.out.println( a ); // [1, 5, 3] 
        b.add(-2);
        Sequence c = a.sum(b); 
        System.out.println( c ); // [-1, 5, 3]
    }
}
