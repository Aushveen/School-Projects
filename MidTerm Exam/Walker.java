import java.util.*;

public class Walker {
    private int x,y,numSteps;

    public void walk(){
        int dir = (int)(Math.random()) * 4;
        if (dir == 0) this.x++; // East
        else if(dir == 1) this.x--; //West
        else if(dir == 2) this.y++; //North
        else this.y--; //South
        numSteps++;
    }
    public int steps(){
        return numSteps;
    }
    public double howFar(){
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y,2));
    }
    public static void main(String[] args){
        int steps = Integer.parseInt(args[0]);
        int obj = Integer.parseInt(args[1]);
        ArrayList<Walker> a = new ArrayList<Walker>();
        for (int i = 0; i < obj; i++)
            a.add(new Walker());
        for (int i = 0; i < steps; i++)
            for (Walker w : a)
                w.walk();
        double sum = 0;
        for (Walker w : a)
            sum += w.howFar();
        double avg = sum / obj;
        System.out.println("After " + steps + " random steps, the distance to the origin on avg. for the walkers is "
                + avg + " which is proportional to the square root of the # of steps " + Math.sqrt(steps) +
                " which is proportional to the avg by a factor of " + avg/Math.sqrt(steps));

    }
}
