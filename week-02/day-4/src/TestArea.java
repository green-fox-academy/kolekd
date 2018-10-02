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
        double y1 = 450-8*b;
        double x2 = x1 + a;
        double y2 = y1 - b;

        int ix1 = (int)x1;
        int iy1 = (int)y1;
        int ix2 = (int)x2;
        int iy2 = (int)y2;

        for (int i = 1; i < 60; i++) {
            if(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 7){
                y1+=2*b;
                y2+=2*b;
            } else if (i == 8){
                y1-=11*b;
                y2-=11*b;
                x1+=(2*c)-a;
                x2+=(2*c)-a;
            } else if(i == 9 || i == 10 || i == 11 || i == 12 || i == 13) {
                y1 += 2 * b;
                y2 += 2 * b;
            } else if (i == 14) {
                y1 -= 10 * b;
                y2 -= 10 * b;
                x1 -= (3 * c);
                x2 -= (3 * c);
            } else if(i == 15 || i == 16 || i == 17 || i == 18 || i == 19) {
                y1 += 2 * b;
                y2 += 2 * b;
            } else if(i == 20) {
                y1-=9*b;
                y2-=9*b;
                x1-=c+a;
                x2-=c+a;
            } else if (i == 21 || i == 22 || i == 23 || i == 24){
                y1 += 2 * b;
                y2 += 2 * b;
            } else if (i == 25){
                x1+=2*((c*2)+(a*2));
                x2+=2*((c*2)+(a*2));
            } else if (i == 26 || i == 27 || i == 28 || i == 29) {
                y1 -= 2 * b;
                y2 -= 2 * b;
            } else if (i == 30) {
                x1 -= (c*5)+(a*5);
                x2 -= (c*5)+(a*5);
                y1 += b;
                y2 += b;
            } else if (i == 31 || i == 32 || i == 33) {
                y1 += 2 * b;
                y2 += 2 * b;
            } else if (i == 34) {
                x1 += (c * 6) + (a * 6);
                x2 += (c * 6) + (a * 6);
            } else if (i == 35 || i == 36 || i == 37) {
                y1 -= 2 * b;
                y2 -= 2 * b;
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