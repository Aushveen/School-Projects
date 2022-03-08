import java.util.Scanner;

public class P62 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the first num: ");
        double b = a.nextDouble();
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the second num: ");
        double c = d.nextDouble();
        DataSet z = new DataSet(b, c);
        z.add(2.2);
        z.add(13);
        System.out.println("This is the data: " + z.list);
        System.out.println("This is the average of data set: " + z.getAverage());
        System.out.println("This is the standard deviation: " + z.getStandardDeviation());

    }

}
