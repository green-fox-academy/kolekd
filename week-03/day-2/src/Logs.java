import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;


public class Logs {
    public static void main (String[] args){


        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        Path logPath = Paths.get("log.txt");
        array(logPath);

    }
    public static void array (Path logPath){
        logPath = Paths.get("log.txt");

        try{
            List<String> lines = Files.readAllLines(logPath);
            List<String> linesCut = new ArrayList<>();

            int getCount = 0;
            int postCount = 0;
            for (int i = 0; i < lines.size(); i++) {
                String buddy = lines.get(i);
                if (buddy.contains("GET"));{
                    getCount += 1;
                } if (buddy.contains("POST")){
                    postCount += 1;
                }

            }
            System.out.println(getCount);
            System.out.println(postCount);

 //  UNIQUE ADRESSES SETUP
 //          for (int i = 0; i < lines.size(); i++) {
 //              String buddy = lines.get(i);
 //              String buddyCut = buddy.substring(28, 38);
 //              linesCut.add(buddyCut);
 //          }

 //          Collections.sort(linesCut);
 //          System.out.println(linesCut);


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
