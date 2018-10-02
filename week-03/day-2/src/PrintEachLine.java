import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PrintEachLine {
    public static void main(String[] args) {

        // Write a program that opens a file called "my-file.txt", then prints
        // each of the lines form the file.
        // If the program is unable to read the file (for example it does not exists),
        // then it should print an error message like: "Unable to read file: my-file.txt"


        List<String> text = new ArrayList<>();
        text.add("First line of text.");
        Path myPath = Paths.get("my-file.txt");

        try {
            Files.write(myPath,text);
            List<String> lines = Files.readAllLines(myPath);
            System.out.println(lines);
        } catch (Exception e){
            System.out.println("Couldn't read the file");
        }

    }
}