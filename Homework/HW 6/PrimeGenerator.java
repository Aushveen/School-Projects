import java.util.ArrayList;

public class PrimeGenerator {
    private int a = 0;
    private int b = 2;
    public ArrayList list = new ArrayList<Integer>();
    public PrimeGenerator(int a){
        this.a = a;
    }

    public void isPrime(){
        while (b <= a) {
            if (b >= 2 && b % 2 != 0)
                list.add(b);
            else if (b == 2)
                System.out.print("2 ");
            else if (a < 2)
                System.out.println("No prime numbers below");
            nextPrime();
        }
        if (b == a || b > a)
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
    }
    public void nextPrime(){
        if (b % 2 == 0 || b % 3 == 0)
            b++;
        else
            b = b + 2;
    }
}
