import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        // The square should have as many lines as the number was       //
        //
        //
        //
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%


        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || j == 1 || j == rows || i == j)
                    System.out.print("%");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }



    }
}