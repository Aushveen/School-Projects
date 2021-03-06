import java.util.*;

public class BuffonNeedle {
    public static void main(String[] args){
        Random rand = new Random();
        int hits = 0;
        for (int i = 0; i < 10000; i++){
            double lower = rand.nextDouble() * 2;
            double angle = rand.nextDouble() * 180;
            angle = Math.PI / 180 * angle;
            double higher = lower + Math.sin(angle);
            if (higher >= 2)
                hits++;
        }
        System.out.println("After 10,000 tried, the needle hit " + hits + " times.");
        System.out.println("The quotient of the tries/hits is " + 10000.0/hits);
    }
}
