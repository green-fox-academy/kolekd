import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int w = 40;
        int h = 40;
        int x = 0;
        int y = 0;

        for (int i = 0; i < 30; i++) {
            square(x,y,w,h,graphics);
            if (x < 320 && y == 0){x+=40;}
            else if (x == 320 && y == 0){y+=40;}
            else if (x > 0 && y == 40){x-=40;}
            else if (x == 0 && y == 40){y+=40;}
            else if (x < 320 && y == 40){x+=40;}
        }



    }

    public static void square (int x, int y, int w, int h, Graphics graphics){
        graphics.drawRect(x,y,w,h);
        graphics.fillRect(x,y,w,h);
    }

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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}