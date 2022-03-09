import java.util.*;

public class P71 {
    private static ArrayList dice = new ArrayList<Integer>();
    private static Random rand = new Random();

    public static void main(String[] args){
        Boolean inRun = false;
        for (int i = 0; i < 20; i++){
            int n = rand.nextInt(1,7);
            dice.add(n);
        }
        for (int i = 0; i < dice.size() - 1; i++){
            if (inRun)
                if (dice.get(i) != dice.get(i-1)){
                    System.out.print(")");
                    inRun = false;
                }
                if (!inRun)
                    if ((dice.get(i) == dice.get(i+1))){
                        System.out.print("(");
                        inRun = true;
                    }
            System.out.print(dice.get(i));

        }
    }
}
