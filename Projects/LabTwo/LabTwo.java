import java.awt.Graphics;
import javax.swing.JFrame;

public class LabTwo {
    public static void main(String[] args){
        JFrame a = new JFrame();
        int width = 600 , height = 600;
        a.setVisible(true);
        a.setSize(width + 40, height + 60);
        Rose m = new Rose(width,height);
        a.add(m);

    }

}
