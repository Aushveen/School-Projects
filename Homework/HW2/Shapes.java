import javax.swing.*;
import java.awt.Graphics;

public class Shapes extends JComponent {

    Point a;
    Line lOne, lTwo;
    Triangle t;


    public static void main(String[] args){
        JFrame a = new JFrame();
        a.setVisible(true);
        a.setSize(500,500);
        a.add(new Shapes());

    }

    public Shapes(){
        this.a = new Point(180,180);
        Point a = new Point(20,400), b = new Point(200,250);
        this.lOne = new Line(a,b);
        Point c = new Point(160,20), d = new Point(300,160);
        this.lTwo = new Line(c, d);
        Point f = new Point(90,175), g = new Point(110,370);
        this.t = new Triangle(f,g,new Point(301,199));
    }

    public void paintComponent(Graphics g){
        this.a.draw(g);
        this.lTwo.draw(g);
        this.lOne.draw(g);
        this.t.draw(g);
    }

}
