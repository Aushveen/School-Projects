import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;

public class Rose extends JComponent {
    int width, height;

    public Rose(int w, int h){
        this.width = w;
        this.height = h;
    }

    public int scale(int value){
        return (int)(this.width / 600.0 * value);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.CYAN);
        g.drawRect(0,0,scale(640),scale(660));
        g.fillRect(0,0,scale(640),scale(660));
        g.setColor(Color.RED);
        g.fillOval(scale(60),scale(60),scale(200),scale(200));
        g.fillOval(scale(60),scale(330),scale(200),scale(200));
        g.fillOval(scale(20),scale((330+60)/2),scale(200),scale(200));
        g.fillOval(scale(400),scale((330+60)/2),scale(200),scale(200));
        g.fillOval(scale(360),scale(330),scale(200),scale(200));
        g.fillOval(scale(360),scale(60),scale(200),scale(200));
        g.fillOval(scale((360+60)/2),scale(360),scale(200),scale(200));
        g.fillOval(scale((360+60)/2),scale(30),scale(200),scale(200));
        g.setColor(Color.GREEN);
        g.fillRect(scale(287),scale(450),scale(50),scale(210));
        g.setColor(Color.YELLOW);
        g.fillOval(scale(110),scale(100),scale(400),scale(400));
    }
}