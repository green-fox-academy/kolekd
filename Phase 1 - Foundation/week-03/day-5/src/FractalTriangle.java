import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

public class FractalTriangle {
    public static void mainDraw(Graphics graphics) {
        Random rand = new Random();                    //Random

        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(red, green, blue);

        int xCenter = rand.nextInt(550 + 1 - 250) + 250;
        int yCenter = rand.nextInt(550 + 1 - 250) + 250;


//        int xCenter = 400;
//        int yCenter = 400;

        int borderSize = rand.nextInt(300 + 1 - 250) + 250;
        int borderSizeStatic = 300;                     // In case of need to stop the size changing.

        double ConvX = (xCenter-(borderSize/2));
        double ConvY = ((yCenter- borderSize))+(Math.sqrt((Math.pow(borderSize,2))-(Math.pow(borderSize/2,2))));

        int startPointX1 = (int) ConvX;
        int startPointY1 = (int) ConvY;

        triangleBorder(xCenter, yCenter, borderSize,graphics);
        triangle(startPointX1, startPointY1, borderSize, graphics);

    }

    public static void triangleBorder (int xCenter, int yCenter, int borderSize, Graphics graphics){

        Random rand = new Random();                    //Random

        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(red, green, blue);
        graphics.setColor(new Color (210,210,210));

        double cConv = borderSize;
        double aConv = cConv*2;
        double bConv = Math.sqrt((Math.pow(aConv,2))-(Math.pow(cConv,2)));

        double ConvX = xCenter-borderSize;
        double ConvY = yCenter-borderSize;

        int borderX1 = (int) ConvX;
        int borderY1 = (int) ConvY;

        int a = (int) aConv;
        int b = (int) bConv;
        int c = (int) cConv;

        borderSize = c;

        int StartX1 = borderX1;
        int StartY1 = borderY1;
        int X2 = StartX1 + borderSize;
        int Y2 = StartY1 + b;
        int X3 = X2+c;
        int Y3 = StartY1;

        graphics.drawLine(StartX1,StartY1,X2,Y2);
        graphics.drawLine(X2,Y2,X3,Y3);
        graphics.drawLine(X3,Y3,StartX1,StartY1);
        int[]trianglePolygonX = {StartX1,X2,X3};
        int[]trianglePolygonY = {StartY1,Y2,Y3};
        graphics.fillPolygon(trianglePolygonX,trianglePolygonY,3);
    }

    public static void triangle (int startPointX, int startPointY, int borderSize, Graphics graphics){

        Random rand = new Random();                    //Random

        float red = rand.nextFloat();
        float green = rand.nextFloat();
        float blue = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(red, green, blue);
        graphics.setColor(randomColor);

        int size = borderSize/2;

        double cConv = size;
        double aConv = cConv*2;
        double bConv = Math.sqrt((Math.pow(aConv,2))-(Math.pow(cConv,2)));

        double altC = borderSize;
        double altA = altC*2;
        double altB =  Math.sqrt((Math.pow(altA,2))-(Math.pow(altC,2)));

        int a = (int) aConv;
        int b = (int) bConv;
        int c = (int) cConv;

        size = c;

        int StartX1 = startPointX;
        int StartY1 = startPointY;
        int X2 = StartX1 + size;
        int Y2 = StartY1 - b;
        int X3 = X2+c;
        int Y3 = StartY1;

        graphics.drawLine(StartX1,StartY1,X2,Y2);
        graphics.drawLine(X2,Y2,X3,Y3);
        graphics.drawLine(X3,Y3,StartX1,StartY1);

        int[]trianglePolygonX = {StartX1,X2,X3};
        int[]trianglePolygonY = {StartY1,Y2,Y3};
        graphics.fillPolygon(trianglePolygonX,trianglePolygonY,3);


        if(size>8){
            graphics.setColor(randomColor);
            triangle((int)startPointX-(borderSize/4), (int)(startPointY)-(b/2), borderSize/2, graphics );

            graphics.setColor(randomColor);
            triangle((int)(startPointX+(borderSize*0.75)), (int)(startPointY)-(b/2), borderSize/2, graphics );

            graphics.setColor(randomColor);
            triangle((int)startPointX+(borderSize/4), (int)(startPointY)+(b/2), borderSize/2, graphics );

        }

        //if(n == 0)
        //return tringle(xCenter, yCenter, borderSize, size, graphics);
    }


    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;
    static double ANGLE = 137.5;

    public static void main(String[] args)  {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();

        boolean goingUp = true;
        while (true) {
            if (goingUp) {
                if (ANGLE > 137.7) {
                    goingUp = false;
                }
                ANGLE += 0.001;
            } else {
                if (ANGLE < 137.3) {
                    goingUp = true;
                }
                ANGLE -= 0.001;
            }
            panel.repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}