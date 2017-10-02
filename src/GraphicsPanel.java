import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel{

    public GraphicsPanel(int width, int height){
        setSize(width,height);
    }

    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D)g;

        //1. Randomize the location of these Faces
        //2. Randomize the diameters of these Faces
        //      50-199 pixels at random

        //For loop! -> repeats code a fixed number of times!

        for(int i = 0; i < 2000; i++){
            Face aFace = new Face(getRandX(), getRandY(), getRandDiameter(), getRandColor());
            aFace.draw(g2);
        }
        repaint();

//        g2.setColor(new Color(54, 40, 177));
//        g2.fillOval(0, 0, getWidth(), getHeight());
//
//        g2.setColor(new Color(238, 140, 12));
//        g2.drawRect(getWidth()/2-100,getHeight()/2-150, 200, 300);
//
//        g2.setStroke(new BasicStroke(10));
//
//        int[] xs = {getWidth()/2, getWidth(), 0};
//        int[] ys = {0, getHeight(), getHeight()};
//        g2.drawPolygon(xs, ys, 3);
//
//
//        g2.setColor(Color.BLACK);
//
//        g2.setFont(new Font("Chalkduster", Font.BOLD, 40));
//        g2.drawString("GRAFICKS!", 300, 400);
    }

    public Color getRandColor(){
        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        Color randColor = new Color(red, green, blue);
        return randColor;
    }
    public int getRandX(){
        int x = (int)(Math.random()*getWidth());
        return x;
    }
    public int getRandY(){
        int y = (int)(Math.random()*getHeight());
        return y;
    }
    public int getRandDiameter(){
        int d = (int)(Math.random()*50 + 50);
        return d;
    }

}