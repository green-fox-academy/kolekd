import javax.swing.*;
import java.util.Random;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.util.Scanner;

// Create a line drawing function that takes 2 parameters:
// The x and y coordinates of the line's starting point
// and draws a line from that point to the center of the canvas.
// Draw 3 lines with that function. Use loop for that.

public class ToCenter {
    public static void mainDraw(Graphics graphics) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        //System.out.println("Please input the desired number of lines.");
        int NrOfLines = 150;
        //System.out.println("Input the coordinates of the begginning point of your desired line." +
        //                    "\nPlease input the x coordinate of the beginning point");
        int inputx1 = 0;

        ////System.out.println("Please input the y coordinate of the beginning point");
        int inputy1 = 0;




        for (int i = 0; i < NrOfLines; i++) {
            float r = rand.nextFloat();
            float g = rand.nextFloat();
            float b = rand.nextFloat();
            Color randomColor = new Color(r, g, b);
            graphics.setColor(randomColor);
            {
            line (inputx1, inputy1, graphics);}
            inputy1 += 2;
        }
        }

    public static void line (int inputx1, int inputy1, Graphics graphics){
           graphics.drawLine(inputx1, inputy1, 150, 150 );
    }

    // Don't touch the code below
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

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }


    }
}