import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 1 parameter:
        // the square size
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

        Random rand = new Random();



        int hw = 50 + rand.nextInt(250);
        int w = hw;
        int h = hw;
        int x = 160-(hw/2);
        int y = 160-(hw/2);

        for (int i = 0; i < 3; i++)
        {
            {
                square(x, y, w, h, graphics);
                h = 50 + rand.nextInt(250);
                w = h;
                hw = h;
                x = 160-(hw/2);
                y = 160-(hw/2);
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