import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel{

    public GraphicsPanel(int width, int height){
        setSize(width,height);

    }
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        g2.setColor(new Color(54, 40, 177));
        g2.fillOval(0, 0, getWidth(), getHeight());

        g2.setColor(new Color(238, 140, 12));
        g2.fillRect(getWidth()/2-100,getHeight()/2-150, 200, 300);

        g2.setStroke(new BasicStroke(10));

        int[] xs = {getWidth()/2, getWidth(), 0};
        int[] ys = {0, getHeight(), getHeight()};
        g2.drawPolygon(xs, ys, 3);

        g2.setColor(Color.BLACK);

        g2.setFont(new Font("Chalkduster", Font.BOLD, 40));
        g2.drawString("GRAFICKS!", 300, 400);

    }

}