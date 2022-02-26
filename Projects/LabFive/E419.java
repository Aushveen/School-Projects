import java.util.Scanner;

public class E419 {
    public static void main(String[] args){
        Scanner c = new Scanner(System.in);
        System.out.println("Input a number corresponding to a month of the year: ");
        int month = c.nextInt();
        String months = "January  February March    April    May      June     July     August   SeptemberOctober  November December ";
        System.out.println("the corresponding month is: " + months.substring(((month-1) * 9), (month-1) * 9+9));
    }
}
