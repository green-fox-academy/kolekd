package GardenApp;

public class Tree extends  Plant{

    public Tree (int minWater, int waterAbsorption, String type, int currentWater){

        super (minWater, waterAbsorption, type, currentWater);
        type = type + " Tree";
    }
}
