import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {


        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();


        for (int i = 0; i <= input; i++)
        {
        for (int j = 0; i > j; j++)
        {
        System.out.print("*");
        }
        System.out.println("");
        }
    }
}