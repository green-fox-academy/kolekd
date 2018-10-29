import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner in = new Scanner (System.in);
        int input = in.nextInt();
        int k = 0;

        for (int i = 1; i <= input; i++, k = 0) {
            for (int space = 1; space <= input - i; ++space) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }

        for (int i = input; i <= 1; i--, k = 0) {
            for (int space = 1; space <= input - i; ++space) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                System.out.print("*");
                k++;
            }
            System.out.println();
        }

    }
}