import java.util.Scanner;

public class E66 {
    public static void main(String[] args){
        Scanner g = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = g.nextDouble();
        Scanner h = new Scanner(System.in);
        System.out.println("Etner second number: ");
        double num2 = h.nextDouble();
        Scanner j = new Scanner(System.in);
        System.out.println("Enter third number");
        double num3 = j.nextDouble();
        DataSet data = new DataSet(num1,num2,num3);
        System.out.println("This is the average: " + data.getAverage());
        //add 200 to the set
        data.add(200);
        System.out.println("New avg: " + data.getAverage());
        System.out.println("Max: " + data.getLargest());
        System.out.println("Min: " + data.getSmallest());
        System.out.println("Range: " + data.getRange());
    }
}
