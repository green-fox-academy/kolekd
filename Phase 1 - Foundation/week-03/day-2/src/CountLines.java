import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main (String[] args){

        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and
        // should not raise any error.

        Path mrPath = Paths.get("mrFile");

        List<String> text = new ArrayList<>();
        text.add("line #1");
        text.add("line #2");

        try {
            Files.write(mrPath, text);
            List<String> lines = Files.readAllLines(mrPath);
            int numberOfLines = lines.size();
            System.out.println(numberOfLines);
        } catch (IOException e) {
            System.out.println("0");
        }

    }
}
