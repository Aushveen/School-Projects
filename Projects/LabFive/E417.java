import java.util.Scanner;

public class E417 {
    public static void main(String[] args){
        Scanner b = new Scanner(System.in);
        System.out.println("Enter the first time in military format: ");
        String firstNum = b.nextLine();
        System.out.println("Enter the second time in military format: ");
        String secNum = b.nextLine();

        int hour1 = Integer.valueOf(firstNum.substring(0,2)); //inclusive on the first, exclusive on the second
        int min = Integer.valueOf(firstNum.substring(3,5));

        int hour2 = Integer.valueOf(secNum.substring(0,2));
        int min2 = Integer.valueOf(secNum.substring(3,5));

        int time1 = hour1*60+min; //total hours in minutes + minutes
        int time2 = hour2*60+min2;

        int diff = (time2 - time1 + 1440) % 1440; // 1440 minutes in a day
        int hours = diff/60; // return back to hours format
        int minutes = diff%60; // return back to minutes format
        System.out.println("The difference between the times are: " +hours+ " hours and " + minutes + " minutes");
    }

}
