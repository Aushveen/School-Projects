import java.util.Scanner;

public class Year {
    public static void main(String[] args){
        System.out.println("Is the year a leap year?: " + isLeapYear());

    }
    public static boolean isLeapYear(){
        Scanner year1 = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        String year = year1.nextLine();
        int yearInt = Integer.parseInt(year);
        if (yearInt % 4 == 0)
            if (yearInt % 100 == 0 && yearInt % 400 != 0)
                return false;
            else
                return true;
        else
            return false;

    }
}
