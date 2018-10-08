package GardenApp;

import java.util.ArrayList;
import java.util.List;

import static java.awt.Color.yellow;

public class Main {
    public static void main(String[] args) {


        Tree purple = new Tree(10, 40, "purple", 0);
        Tree orange = new Tree(10, 40, "orange", 0);

        Flower yellow = new Flower(5, 70,"yellow", 0);
        Flower blue = new Flower(5, 10, "blue", 0);


        Garden garden = new Garden();
        garden.addFlower(yellow);
        garden.addFlower(blue);
        garden.addTree(purple);
        garden.addTree(orange);


        System.out.println(garden.checkIfThirsty());

        garden.watering(40, garden.checkIfThirsty(), garden);

        System.out.println(garden.checkIfThirsty());

        }
    }

