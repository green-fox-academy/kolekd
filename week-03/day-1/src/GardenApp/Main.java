package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Plant> plants = new ArrayList<Plant>();

        Tree purple = new Tree(10, 40, "purple", 0);
        Tree orange = new Tree(10, 40, "orange", 0);

        Flower yellow = new Flower(5, 70,"yellow", 0);
        Flower blue = new Flower(5, 10, "blue", 0);

        plants.add(yellow);
        plants.add(blue);

        plants.add(purple);
        plants.add(orange);


        yellow.watering(40);
        System.out.println(yellow.toString());

        System.out.println();

    }
}
