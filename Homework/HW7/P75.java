
import java.util.*;

public class P75 {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Give a number: ");
        int n = a.nextInt();
        int[][] magicSquare = new int[n][n];
        //

        int row = 0;
        int column = n / 2;
        int curr_row;
        int curr_col;
        if (n % 2 == 0) {
            int number = 0;
            while (number <= n * n) {
                magicSquare[row][column] = number;
                number++;
                curr_row = row;
                curr_col = column;
                row -= 1;
                column += 1;
                if (row == -1) {
                    row = n - 1;
                }
                if (column == n) {
                    column = 0;
                }
                if (magicSquare[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_col;
                    if (row == -1) {
                        row = n - 1;
                    }
                }
            }
        } else{
            int number = 1;
            while (number <= n * n) {
                magicSquare[row][column] = number;
                number++;
                curr_row = row;
                curr_col = column;
                row -= 1;
                column += 1;
                if (row == -1) {
                    row = n - 1;
                }
                if (column == n) {
                    column = 0;
                }
                if (magicSquare[row][column] != 0) {
                    row = curr_row + 1;
                    column = curr_col;
                    if (row == -1) {
                        row = n - 1;
                    }
                }
            }
        }
        for (int i = 0; i < magicSquare.length; i++) {
            for (int j = 0; j < magicSquare.length; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println();
        }
    }
}