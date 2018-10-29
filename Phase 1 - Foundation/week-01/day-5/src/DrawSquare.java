import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();

        for (int i = 1; i <= input; i++) {
            for (int j = 1; j <= input; j++) {
                if (j == 1 || i == 1 || j == input || i == input)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }




    }
}