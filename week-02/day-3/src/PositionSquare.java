import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 2 parameters:
        // the x and y coordinates of the square's top left corner
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.

        Random rand = new Random();

        int hw = 50;

        int x = rand.nextInt(150 - 50);
        int y = rand.nextInt(150 - 50);
        int w = hw;
        int h = hw;

        for (int i = 0; i < 4; i++)
        {
            {
                square(x, y, w, h, graphics);
                x = rand.nextInt(320 - 30);
                y = rand.nextInt(320 - 30);
            }
        }

    }

    //    Don't touch the code below

    public static void square (int x,int y,int w,int h, Graphics graphics) {
        graphics.drawRect(x, y, w, h);
    }
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}