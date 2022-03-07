import java.util.*;

public class P66 {
    public static int pileSize;
    public static int firstTurn;
    public static int currentTurn;
    public static int intelligence;
    public static int pullTotal;
    public static Random rand;

    public static void main(String[] args) {
        Scanner play = new Scanner(System.in);
        Random rand = new Random();
        pileSize = (rand.nextInt(91)) + 10;
        firstTurn = (rand.nextInt(2));
        intelligence = rand.nextInt(2);
        currentTurn = 0;
        System.out.println(pileSize);
        System.out.println(firstTurn);
        System.out.println(intelligence);
        if (firstTurn == 0) {
            System.out.println("Computer goes first");
            System.out.println("Total number of marbles is: " + pileSize);
            while (pileSize > 1) {
                if(currentTurn % 2 == 0){
                    pullMarbles();
                }else {
                    System.out.println("Player turn, please enter your number: ");
                    String playerPull = play.nextLine();
                    pileSize = pileSize - Integer.parseInt(playerPull);
                }
                System.out.println("The total number of marbles is now: " + pileSize);
                currentTurn = currentTurn + 1;
            }
            if(currentTurn % 2 == 0) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        if (firstTurn == 1) {
            System.out.println("Player goes first");
            System.out.println("Total number of marbles is: " + pileSize);
            while (pileSize > 1) {
                if(currentTurn % 2 == 1){
                    pullMarbles();
                }else {
                    System.out.println("Player turn, please enter your number: ");
                    String playerPull = play.nextLine();
                    pileSize = pileSize - Integer.parseInt(playerPull);
                }
                System.out.println("The total number of marbles is now: " + pileSize);
                currentTurn = currentTurn + 1;
            }
            if(currentTurn % 2 == 1) {
                System.out.println("Player wins!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }

    public static void pullMarbles(){
        Random rand1 = new Random();
        if (intelligence == 0) {
            if (pileSize == 2 || pileSize == 3 || pileSize == 7 || pileSize == 15 || pileSize == 31 || pileSize == 63) {
                pullTotal = rand1.nextInt((pileSize / 2)) + 1;
                pileSize = pileSize - pullTotal;
            } else {
                if (pileSize <= 100 && pileSize >= 64) {
                    pileSize = 63;
                } else if (pileSize < 63 && pileSize > 32) {
                    pileSize = 31;
                } else if (pileSize < 31 && pileSize > 15) {
                    pileSize = 15;
                } else if (pileSize < 14 && pileSize > 7) {
                    pileSize = 7;
                } else if (pileSize < 7 && pileSize > 3) {
                    pileSize = 3;
                }
            }
        }
        if (intelligence == 1) {
            pullTotal = rand1.nextInt((pileSize / 2)) + 1;
            pileSize = pileSize - pullTotal;
        }
    }

}