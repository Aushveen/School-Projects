import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;

public class Sequence extends JComponent {
    private ArrayList<Integer> values;
    ArrayList<Circle> circles = new ArrayList<Circle>();
    public Sequence() {
        this.values = new ArrayList<Integer>();
    }
    public Sequence(int[] values){
        this();
        for (int v : values) {
            this.values.add( v);
            this.circles.add(new Circle(v, (int)(Math.random() * 400 + 50),
                    (int)(Math.random() * 400 + 50)));

        }
    }
    public void add(int n) {
        this.values.add(n);
    }
    public Integer get(int n) {
        return this.values.get(n);
    }
    public int length() { return this.values.size(); }
    public String toString() {
        return this.values.toString();
    }
    public void paintComponent(Graphics g) {
            for (int index = 0; index < this.values.size()-1; index += 1) {
                Circle a = this.circles.get(index),
                        b = this.circles.get(index+1);
                a.draw(g);
                g.drawLine(a.x+a.radius, a.y+a.radius, b.x+b.radius, b.y+b.radius);
            }
            this.circles.get(this.values.size()-1).draw(g);
        }
    public static void main(String[] args) {
        Sequence m = new Sequence( new int[] { 6, 2, 1, 4, 3, 5 , 8, 7} );
        System.out.println( m );
        JFrame f = new JFrame("Homework 03");
        f.add(m);
        f.setVisible(true);
        f.setSize(550, 550);
    }
}