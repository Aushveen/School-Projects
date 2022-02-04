import java.awt.Graphics;
import java.util.Scanner;
import javax.swing.JFrame;

public class LabThree {
    public static void main(String[] args) {
        JFrame a = new JFrame();
        int width, height;
        Scanner in = new Scanner(System.in);
        System.out.println("What frame size do you want?");

        //int width = 600, height = 600;

        width = height = in.nextInt();
        a.setVisible(true);
        a.setSize(width + 40, height + 60);
        Rose m = new Rose(width, height);
        a.add(m);
    }

}
