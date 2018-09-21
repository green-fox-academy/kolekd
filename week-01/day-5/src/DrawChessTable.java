import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
        //
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        // % % % %
        //  % % % %
        //

        for (int i = 1; i <= 4; i++)
            for (int j = 1; j <= 4; j++) {
                if (j == 2) System.out.println(" % % % %");
                else if (j == 1) System.out.println("% % % % ");
            }
    }
}