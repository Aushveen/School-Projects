import java.util.Scanner;

public class E44 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int one = a.nextInt();
        int two = a.nextInt();
        System.out.println("Sum: " + sum(one,two));
        System.out.println("Difference: " + diff(one,two));
        System.out.println("Product: " + product(one,two));
        System.out.println("Average: " + avg(one,two));
        System.out.println("Absolute Value of Difference: " + dist(one,two));
        System.out.println("Max: " + max(one,two));
        System.out.println("Min: " + min(one,two));
    }
    public static int sum(int one, int two){
        return one + two;
    }
    public static int diff(int one, int two){
        return one - two;
    }
    public static int product(int one, int two){
        return one*two;
    }
    public static int avg(int one, int two){
        return sum(one,two) / 2;
    }
    public static int dist(int one, int two){
        return Math.abs(diff(one,two));
    }
    public static int max(int one, int two){
        return Math.max(one,two);
    }
    public static int min(int one, int two){
        return Math.min(one,two);
    }
}
