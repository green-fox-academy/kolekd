import java.util.*;

public class MatchMaking{
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...
        ArrayList<String> hub = new ArrayList<String>();

        ArrayList<String> pairs = new ArrayList<String>();

        for (int i = 0; i < girls.size(); i++) {
            {
                hub.add(boys.get(i));
                hub.add(girls.get(i));
            }
            System.out.println(hub);
            {
                pairs.addAll(hub);
            }
            {
                hub.clear();
            }
    }
        System.out.println("List:");
        System.out.print(pairs);
    //    System.out.println(makingMatches(girls, boys));
    }
}