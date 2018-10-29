import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner in = new Scanner(System.in);
        int input = 7;
        int lastLineStars = (input*2) - 1;

        StringBuilder starBuilder = new StringBuilder();
        StringBuilder spaceBuilder = new StringBuilder();

        for (int i = 0; i < lastLineStars; i++) {
            starBuilder.append("*");
            spaceBuilder.append(" ");
        }

        String starLine = starBuilder.toString();
        String spaceLine = spaceBuilder.toString();
        List<String> stars = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            stars.add(i, starLine);
        }

        String level = spaceLine;
        StringBuilder pyramidBuilder = new StringBuilder(level);
        for (int i = 0; i < input; i++) {
            spaceBuilder.replace(lastLineStars/2 - i, (lastLineStars/2 + 1) + i,
                                   starLine.substring(lastLineStars/2 - i, (lastLineStars/2 + 1) + i));
            System.out.println(spaceBuilder.toString());
            spaceBuilder.replace(0,spaceLine.length(), spaceLine);
        }

    }
}