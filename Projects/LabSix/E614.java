import java.util.Scanner;

public class E614 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number you want in binary format: ");
        int n = s.nextInt();
        while(n != 0){
            System.out.println(n%2);
            n = n / 2;
        }
    }
}
