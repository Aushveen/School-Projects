import java.math.BigInteger;
import java.util.Scanner;

public class HomeworkOne {

    private static BigInteger[] series = new BigInteger[10000000];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What fibonacci number do you want to know: ");
        int n = in.nextInt();
        System.out.println("Fibonacci of " + n + " = " + fib(n));
    }

    public static BigInteger fib(int n){
        if(n < 2) {
            return BigInteger.ONE;
        }

        if(series[n] != null) {
            return series[n];
        }

        series[n] = fib(n - 1).add(fib(n - 2));
        return series[n];
    }
}