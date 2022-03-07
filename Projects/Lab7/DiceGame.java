import java.util.*;

public class DiceGame {
    public static void main(String[] args){
        Random rand = new Random();
        int numOf66 = 0;
        int finalCount = 0;
        int numOf6 = 0;
        int finalCountTwo = 0;
        int countOf6 = 0;
        for (int i = 0; i < 1000000; i++){
            for (int n = 0; n < 24; n++){
                int jimmyDice = rand.nextInt(6) + 1;
                int happyDice = rand.nextInt(1,7);
                if (jimmyDice == 6 && happyDice == 6)
                    numOf66 ++;
            }
            if (numOf66 >= 1)
                finalCount++; // u get a dollar
            numOf66 = 0;
            for (int k = 0; k < 4; k++){
                int oneDice = rand.nextInt(6);
                if (oneDice == 5)
                countOf6++;
            }
            if (countOf6>=1)
                finalCountTwo++;
            countOf6 = 0;
        }
        System.out.println("After rolling a pair of dice 24 times a million times, I won $" + finalCount);
        System.out.println("This means I won " + finalCount + " times and lost " + (1000000 - finalCount) + " times");
        System.out.println("After rolling a single dice 4 times a million times, the number 6 appeared " + finalCountTwo+ " Times");
        System.out.println("This means I won " + finalCountTwo + " times and lost " + (1000000 - finalCountTwo) + " times");

    }


}
