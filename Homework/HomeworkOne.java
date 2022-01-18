import java.math.BigInteger;
import java.util.Scanner;

public class HomeworkOne {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("What fibonacci number do you want to know: ");
	int n = in.nextInt();
        System.out.println("Fibonacci of " + n + " = " + fib(n));


    }
    public static BigInteger fib(int n){
        if (n == 0 || n == 1){
            return BigInteger.ONE;
        }
        return fib(n-1).add(fib(n-2));
    }
}