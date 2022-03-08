import java.util.ArrayList;

public class PrimeGenerator {
    private int a = 0;
    private int b = 2;
    public ArrayList list = new ArrayList<Integer>();
    public PrimeGenerator(int a){
        this.a = a;
    }

    public boolean isPrime(int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public void nextPrime(){
        if (b % 2 == 0 || b % 3 == 0)
            b++;
        else
            b = b + 2;
    }
}
