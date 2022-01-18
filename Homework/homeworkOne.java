import java.math.BigInteger;

public class homeworkOne {

    private static int n = 0;

    public static void main(String[] args) {
        while(true){
            System.out.println("Fibonacci of " + n + " = " + fib(n));
            n++;
        }


    }
    public static BigInteger fib(int n){
        if (n == 0 || n == 1){
            return BigInteger.ONE;
        }
        return fib(n-1).add(fib(n-2));
    }
}