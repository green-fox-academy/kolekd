import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class Logs {
    public static void main (String[] args){


        // Read all data from 'log.txt'.
        // Each line represents a log message from a web server
        // Write a function that returns an array with the unique IP adresses.
        // Write a function that returns the GET / POST request ratio.

        Path logPath = Paths.get("log.txt");

        List <String> logList = fileToArray(logPath);

        for (String str : logList){
            System.out.println(str);
        }

        List <String> IPList = IPOnly(logList);

        for (String str : IPList){
            System.out.println(str);
        }
    }

    public static List <String> IPOnly (List<String> list){
        List <String> IPList = new ArrayList<>();
        for (String str : list){
            if (!IPList.contains(str.substring(27,38))){
            IPList.add(str.substring(27,38));
            }
        }
        Collections.sort(IPList);

        return IPList;
    }

    public static List <String>fileToArray(Path logPath){
        List <String> list = new ArrayList<>();
        try{
            list = Files.readAllLines(logPath);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return list;
    }
}
