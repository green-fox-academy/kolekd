package Exercise10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Create a Fox class with 3 properties(name, type, color) Fill a list with at least 5 foxes,
        //  it's up to you how you name/create them! Write a Stream Expression to find the foxes with
        //  green color! Write a Stream Expression to find the foxes with green color and pallida type!

        Fox fox1 = new Fox("Edward", "pallida", "pink");
        Fox fox2 = new Fox("Alejandro", "Fennec", "green");
        Fox fox3 = new Fox("Vlad", "pallida", "green");
        Fox fox4 = new Fox("Vulpix", "Fire", "green");
        Fox fox5 = new Fox("Garry", "pallida", "red");

        List<Fox> foxList = new ArrayList<>();

        foxList.add(fox1);
        foxList.add(fox2);
        foxList.add(fox3);
        foxList.add(fox4);
        foxList.add(fox5);

        List<Fox> greenFoxes = foxList.stream()
                .filter(n -> n.colour.equals("green"))
                .collect(Collectors.toList());

        List<Fox> greenPallidaFoxes = foxList.stream()
                .filter(n -> n.colour.equals("green") && n.type.equals("pallida"))
                .collect(Collectors.toList());

        System.out.println("Green-coloured foxes:");
        for(Fox fox : greenFoxes){
            System.out.println(fox.name);
        }

        System.out.println("\nGreen-coloured pallida foxes:");
        for(Fox fox : greenPallidaFoxes){
            System.out.println(fox.name);
        }
    }
}
