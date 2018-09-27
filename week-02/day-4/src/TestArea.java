import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TestArea {

    public static void mainDraw(Graphics graphics){
        Random rand = new Random();
        Scanner in = new Scanner (System.in);

        double c = 30;
        double a = c/2;
        double b = Math.sqrt((Math.pow(c,2))-(Math.pow(a,2)));

        double x1 = 800-c;
        double y1 = 450;
        double x2 = x1 + a;
        double y2 = y1 - b;

        int ix1 = (int)x1;
        int iy1 = (int)y1;
        int ix2 = (int)x2;
        int iy2 = (int)y2;

        for (int i = 1; i < 3; i++) {
            if(i == 2){

                y2+=b;
            }
            hexagon(x1, x2, y1, y2, graphics);
        }
    }
    public static void hexagon (double x1, double x2, double y1, double y2, Graphics graphics){

        double c = 30;
        double a = c/2;
        double b = Math.sqrt((Math.pow(c,2))-(Math.pow(a,2)));
        // c^2 = b^2 + a^2
        // b^2 = c^2 - a^2
        // a^2 = c^2 - b^2

        for (int i = 1; i < 7; i++) {
            if (i == 1) {

            } else if (i == 2) {
                x1 = x2;
                y1 = y2;
                x2 = x1 + c;
                y2 = y1;
            } else if (i == 3) {
                x1 = x2;
                y1 = y2;
                x2 += a;
                y2 += b;
            } else if (i == 4) {
                x1 = x2;
                y1 = y2;
                x2 -= a;
                y2 += b;
            } else if (i == 5) {
                x1 = x2;
                y1 = y2;
                x2 -= c;
            } else if (i == 6) {
                x1 = x2;
                y1 = y2;
                y2 -= b;
                x2 -= a;
            }
            int ix1 = (int)x1;
            int iy1 = (int)y1;
            int ix2 = (int)x2;
            int iy2 = (int)y2;
            {
                line(ix1,iy1,ix2,iy2,graphics);}

        }
    }
    public static void line (int ix1, int iy1, int ix2, int iy2, Graphics graphics){
        graphics.drawLine(ix1, iy1, ix2, iy2);
    }


    //    Don't touch the code below
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