import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class FractalTriangle {
    public static void mainDraw(Graphics graphics) {
        Random rand = new Random();                    //Random + Scanner
        Scanner in = new Scanner(System.in);

        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(red, green, blue);
        //graphics.setColor(randomColor);

        double cConv = 100;
        double aConv = 200;
        double bConv = Math.sqrt((Math.pow(aConv,2))-(Math.pow(cConv,2)));

        int a = (int) aConv;
        int b = (int) bConv;
        int c = (int) cConv;

        int x1 = 700;
        int y1 = 450;

        int borderSize = 400;
        int size = 200;

        tringleBorder(borderSize,graphics);
        tringle(size, graphics);

    }

    public static void tringleBorder (int size, Graphics graphics){

        double ConvX = 800-size;
        double ConvY = 450-size;

        int borderX1 = (int) ConvX;
        int borderY1 = (int) ConvY;

        double cConv = size;
        double aConv = cConv*2;
        double bConv = Math.sqrt((Math.pow(aConv,2))-(Math.pow(cConv,2)));

        int a = (int) aConv;
        int b = (int) bConv;
        int c = (int) cConv;

        size = c;

        int StartX1 = borderX1;
        int StartY1 = borderY1;
        int X2 = StartX1 + size;
        int Y2 = StartY1 + b;
        int X3 = X2+c;
        int Y3 = StartY1;

        graphics.drawLine(StartX1,StartY1,X2,Y2);
        graphics.drawLine(X2,Y2,X3,Y3);
        graphics.drawLine(X3,Y3,StartX1,StartY1);

    }

    public static void tringle (int size, Graphics graphics){

        double ConvX = (600/100)*size;
        double ConvY = (277/100)*size;

        int borderX1 = (int) ConvX;
        int borderY1 = (int) ConvY;

        double cConv = size;
        double aConv = cConv*2;
        double bConv = Math.sqrt((Math.pow(aConv,2))-(Math.pow(cConv,2)));

        int a = (int) aConv;
        int b = (int) bConv;
        int c = (int) cConv;

        size = c;

        int StartX1 = borderX1;
        int StartY1 = borderY1;
        int X2 = StartX1 - size*2;
        int Y2 = StartY1 - b*2;
        int X3 = X2+c*2;
        int Y3 = StartY1;

        graphics.drawLine(StartX1,StartY1,X2,Y2);
        graphics.drawLine(X2,Y2,X3,Y3);
        graphics.drawLine(X3,Y3,StartX1,StartY1);

    }


    // Don't touch the code below
    static int WIDTH = 1600;
    static int HEIGHT = 900;

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