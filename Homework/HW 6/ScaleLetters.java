import java.util.*;
import java.lang.Math;

public class ScaleLetters
{
    public static void main(String args[])
    {
        // taking variable for loop iteration and row .
        int row,r,c,s,w ;
        //creating object
        Scanner sc = new Scanner(System.in);
        // entering the number of row
        System.out.print("Enter rows : ");
        row = sc.nextInt();
        //outer for loop
        s  = (row  / 3);
        w  = row  / 2 + row  / 5 + s  + s ;
        //Printing o part
        for (r = 0; r < row ; r++)
        {
            for (c = 0; c <= w ; c++)
            {
                if (c == w  - Math.abs(s) || c == Math.abs(s))
                    System.out.print("*");
                else if ((r == 0 || r == row - 1) && c > Math.abs(s) && c < w  - Math.abs(s))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            if (s  != 0 && r < row  / 2)
                s --;
            else if (r >= (row  / 2 + row  / 5))
                s --;
            System.out.print("\n");
        }
        int  d=row;
        for (r = 0; r < row  / 2; r++)
        {
            for (c = 0; c <= d; c++)
            {
                if (c == d)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.print("\n");
            d++;
        }
    }
}