import javax.swing.*;
import java.util.Random;
import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {

    public static void mainDraw(Graphics graphics){
        Random rand = new Random();
        Scanner in = new Scanner (System.in);
        // Create a square drawing function that takes 2 parameters:
        // The square size, and the fill color,
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.
        int h = 320;
        int w = 320;
        int x = 160 - (320 / 2);
        int y = 160 - (320 / 2);


        for (int i = 1; i < 8; i++) {



            h -= 40;
            w -= 40;
            x = 160 - (w/2);
            y = 160 - (h/2);

                if (i == 1) {
                    graphics.setColor(Color.pink);
                } else if (i == 2) {
                    graphics.setColor(Color.magenta);
                } else if (i == 3) {
                    graphics.setColor(Color.blue);
                } else if (i == 4) {
                    graphics.setColor(Color.green);
                } else if (i == 5) {
                    graphics.setColor(Color.yellow);
                } else if (i == 6) {
                    graphics.setColor(Color.orange);
                } else if (i == 7) {
                    graphics.setColor(Color.red);
                }

                square(x, y, h, w, graphics);
        }

////// This is the 'Choose your square size and colour' part. //////

//      System.out.println("Please enter the size of your desired square.");
//      int size = in.nextInt();

//      System.out.println("Please enter the square's colour.");
//      String colourinput = in.next();

//           int hw = size;
//           int w = hw;
//           int h = hw;
//           int x = 160 - (hw / 2);
//           int y = 160 - (hw / 2);

//            for (int i = 0; i < 1; i++) {
//               {
//                       int R = 0;
//                       int G = 0;
//                       int B = 0;

//                       if (colourinput.equals("blue")){
//                           R = 0;
//                           G = 0;
//                           B = 255;
//                     } else if (colourinput.equals("red")){
//                         R = 255;
//                         G = 0;
//                         B = 0;
//                     } else if (colourinput.equals("green")){
//                         R = 0;
//                         G = 255;
//                         B = 0;
//                       }

//                   Color colour = new Color(R,G,B);
//                   square(x, y, w, h, graphics, colour);
//                   h = 50 + rand.nextInt(250);
//                   w = h;
//                   hw = h;
//                   x = 160 - (hw / 2);
//                   y = 160 - (hw / 2);
//               }
//            }
    }

    public static void square (int x, int y, int w, int h, Graphics graphics){
        graphics.drawRect(x,y,w,h);
        graphics.fillRect(x,y,w,h);
    }


    //    Don't touch the code below

////// My function
//   public static void square (int x,int y,int w,int h, Graphics graphics, Color colour) {
//       graphics.setColor(colour);
//       graphics.drawRect(x, y, w, h);
//       graphics.fillRect(x,y,w,h);
//    }
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