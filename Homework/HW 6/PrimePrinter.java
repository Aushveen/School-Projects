import java.util.*;

public class PrimePrinter {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter number you want to find prime numbers below: ");
        int n = a.nextInt();
        PrimeGenerator b = new PrimeGenerator(n);
        b.isPrime();

    }
}
