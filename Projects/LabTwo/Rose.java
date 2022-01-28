import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;

public class Rose extends JComponent {
    int width, height;

    public Rose(int w, int h){
        this.width = w;
        this.height = h;
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.CYAN);
        g.drawRect(0,0,width+40,height+60);
        g.fillRect(0,0,width+40,height+60);
        g.setColor(Color.RED);
        g.fillOval(60,60,200,200);
        g.fillOval(60,330,200,200);
        g.fillOval(20,(330+60)/2,200,200);
        g.fillOval(400,(330+60)/2,200,200);
        g.fillOval(360,330,200,200);
        g.fillOval(360,60,200,200);
        g.fillOval((360+60)/2,360,200,200);
        g.fillOval((360+60)/2,30,200,200);
        g.setColor(Color.GREEN);
        g.fillRect(287,450,50,210);
        g.setColor(Color.YELLOW);
        g.fillOval(110,100,400,400);


    }


}
