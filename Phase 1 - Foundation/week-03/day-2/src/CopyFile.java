import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    public static void main (String[] args){

        // Write a function that copies a file to an other
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful

        String path = "my-file4";
        String path2 = "my-file5";

        copyFile(path, path2);

    }
    public static void copyFile(String path, String path2){
        Path mrPath = Paths.get(path);
        Path mrPath2 = Paths.get(path2);

        List<String> words = new ArrayList<>();
        List<String> words2 = new ArrayList<>();

        words.add("I am the sentence number 1.");
        words2.add("I am the sentence number 2.");

        try {
            Files.write(mrPath, words);
            Files.write(mrPath2, words2);

            List<String> lines = Files.readAllLines(mrPath);
            Files.write(mrPath2,lines);

            boolean CopySuccessful = true;
            System.out.println(CopySuccessful);

        } catch (Exception e){
            boolean CopySuccessful = false;
            System.out.println(CopySuccessful);
        }

    }

}
