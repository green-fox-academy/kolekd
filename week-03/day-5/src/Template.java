import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Template {
    public static void mainDraw(Graphics graphics) {
        Random rand = new Random();                    //Random + Scanner
        Scanner in = new Scanner(System.in);

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();                     //Random Colour
        Color randomColor = new Color(r, g, b);
        //graphics.setColor(randomColor);

        graphics.drawOval(800,450,13,13);





    }

    public static void tringleBorder (int x1, int y1, int x2, int y2, Graphics graphics){

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