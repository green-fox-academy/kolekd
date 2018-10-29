import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Tree {
    public static void mainDraw(Graphics graphics) {
        Random rand = new Random();                    //Random + Scanner
        Scanner in = new Scanner(System.in);

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(r, g, b);
        //graphics.setColor(randomColor);


        int lineLength = 50;
        int spreadPoint = 400;

        int mainBeginPointX = 400;
        int mainBeginPointY = 650;

        introLine (mainBeginPointX, mainBeginPointY, lineLength, graphics);
        triLine (spreadPoint, lineLength,mainBeginPointY, graphics);

    }

    public static void triLine (int spreadPoint, int lineLength,int mainBeginPointY, Graphics graphics) {

        int beginPointX = spreadPoint;
        int beginPointY = mainBeginPointY - lineLength;
        int spread = 15;
        int extension = lineLength - (lineLength / 4);
        int extended = beginPointY - extension;
        int spreadPointLeft = spreadPoint - spread;
        int spreadPointRight = spreadPoint + spread;
        int regular = beginPointY - lineLength;

        graphics.drawLine(beginPointX, beginPointY, spreadPoint, regular);
        graphics.drawLine(beginPointX, beginPointY, spreadPointRight, extended);
        graphics.drawLine(beginPointX, beginPointY, spreadPointLeft, extended);

        // Doesn't run
        //
        //int n = 0;
        //
        //if (n < 8) {
        //    System.out.println("55");
        //    triLine(beginPointX, beginPointY - lineLength, spreadPoint, graphics);
        //    n++;
        //}
    }

    public static void introLine (int mainBeginPointX, int mainBeginPointY,int lineLength, Graphics graphics){

        int lineLengthX = mainBeginPointX;
        int lineLengthY = mainBeginPointY - lineLength;

        graphics.drawLine (mainBeginPointX, mainBeginPointY, lineLengthX, lineLengthY);
    }
    // Don't touch the code below
    static int WIDTH = 800;
    static int HEIGHT = 800;

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