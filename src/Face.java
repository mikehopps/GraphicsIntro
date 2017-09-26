import java.awt.*;

/**
 * Created by michael_hopps on 9/26/17.
 */
public class Face {

    private int x, y, diameter;
    private Color color;

    public Face(int x, int y, int diameter, Color color){
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        this.color = color;
    }
    public void draw(Graphics2D g2){
        //Big oval for head
        //2 smaller ovals for eyes
        //an arc for the smile

        g2.setColor(color);
        g2.fillOval(x, y, diameter, diameter);

        g2.setColor(Color.BLACK);
        g2.fillOval(x+diameter/4, y+diameter/4, diameter/6, diameter/6);
        g2.fillOval(x+diameter/4*3 - diameter/6, y+diameter/4, diameter/6, diameter/6);

        g2.drawArc(x+diameter/4, y+diameter/4, diameter/2, diameter/2, 200, 140);
    }

}
