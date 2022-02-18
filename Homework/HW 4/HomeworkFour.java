import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class HomeworkFour {
    public static void main(String[] args){
        System.out.println("Please enter what number you want a square root for:");
        Scanner a = new Scanner(System.in);
        double n = a.nextDouble();
        System.out.println(HomeworkFour.babylonians(n));
        System.out.println("Enter the initial bal: ");
        Scanner b = new Scanner(System.in);
        double initial = b.nextDouble();
        System.out.println("Enter the interest rate: ");
        Scanner c = new Scanner(System.in);
        double rate = c.nextDouble();
        System.out.println("Enter the monthly withdraw amt.: ");
        Scanner d = new Scanner(System.in);
        double withdraw = d.nextDouble();
        System.out.println(HomeworkFour.collegeFund(initial,rate,withdraw));
        Scanner e = new Scanner(System.in);
        System.out.println("Enter distance to work ");
        double dist = e.nextDouble();
        Scanner f = new Scanner(System.in);
        System.out.println("Enter train ticket price ");
        double ticket = f.nextDouble();
        HomeworkFour.trainOrCar(ticket,dist);

        JFrame z = new JFrame();
        z.add(new Two());
        z.setSize(600,600);
        z.setVisible(true);


    }
    public static double babylonians(double n){
        double a = n;
        double g = a/2;
        while (g != Math.sqrt(a))
             g = (g + a/g)/2;
        return g;
    }
    public static int collegeFund(double initial, double interest, double withdraw){
        int months = 0;
        while (initial > 0){
            initial = initial * (1 + (interest)/100);
            initial = initial - withdraw;
            months++;
        }
        return months;
    }
    public static void trainOrCar(double ticket, double dist){
        double costPerGal = 4;
        double maintainPerMile = 0.05;
        if ((dist * costPerGal + maintainPerMile * dist) > ticket)
            System.out.println("The train is cheaper by $" +((dist*costPerGal+dist*maintainPerMile) - ticket));
        else if((dist * costPerGal + maintainPerMile * dist) < ticket)
            System.out.println("The car is cheaper by $" +(ticket - (dist*costPerGal+dist*maintainPerMile)));
        else
            System.out.println("Either is the same, there is no difference");

    }

    public static class Two extends JComponent{
        public void paintComponent(Graphics g){
            Graphics2D g2 = (Graphics2D) g;
            float thickness = 6;
            Stroke oldStroke = g2.getStroke();
            g2.setStroke(new BasicStroke(thickness));

            Rectangle a = new Rectangle(110, 110, 200, 50);
            g2.setColor(Color.BLUE);
            g2.draw(a);
            Rectangle b = new Rectangle(150,120,100,250);
            g2.setColor(Color.RED);
            g2.draw(b);
            Rectangle ab = a.intersection(b);
            g2.setColor(Color.GREEN);
            g2.draw(ab);
            Rectangle c = new Rectangle(400,400,50,80);
            Rectangle ac = a.intersection(c);

            g2.setStroke(oldStroke);
        }
    }

}
