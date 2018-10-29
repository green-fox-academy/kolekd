import java.util.ArrayList;
import java.util.List;
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

        Scanner in = new Scanner(System.in);
        int input = 5;

        StringBuilder starBuilder = new StringBuilder();
        StringBuilder spaceBuilder = new StringBuilder();

        for (int i = 0; i < input; i++) {
            starBuilder.append("*");
            spaceBuilder.append(" ");
        }

        String starLine = starBuilder.toString();
        String spaceLine = spaceBuilder.toString();
        List<String> stars = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            stars.add(i, starLine);
        }

        int k = 1;
        for (int i = 0; i < input; i++) {
            if (i < input/2+1) {
                spaceBuilder.replace(input / 2 - i, (input / 2 + 1) + i,
                        starLine.substring(input / 2 - i, (input / 2 + 1) + i));
                System.out.println(spaceBuilder.toString());
                spaceBuilder.replace(0, spaceLine.length(), spaceLine);
            } else {
                spaceBuilder.replace(k, input - k,
                        starLine.substring(k, input - k));
                System.out.println(spaceBuilder.toString());
                spaceBuilder.replace(0, spaceLine.length(), spaceLine);
                k++;
            }

        }
    }
}