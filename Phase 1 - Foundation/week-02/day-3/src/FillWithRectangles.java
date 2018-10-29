import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FillWithRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.

        Random rand = new Random();

        int hw = rand.nextInt(150 - 50);

        int x = rand.nextInt(150 - 50);
        int y = rand.nextInt(150 - 50);
        int w = hw;
        int h = hw;

        for (int i = 0; i < 4; i++)
        {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            graphics.setColor(randomColor);
            {
                square(x, y, w, h, graphics);
                x = rand.nextInt(320 - 30);
                y = rand.nextInt(320 - 30);
                h = rand.nextInt(150 - 100);
                w = h;
            }
        }
    }

    public static void square (int x,int y,int w,int h, Graphics graphics) {
        graphics.drawRect(x,y,w,h);
    }
    //    Don't touch the code below
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}