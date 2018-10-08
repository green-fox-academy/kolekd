package GardenApp;

public class Flower extends Plant{

    public Flower (int minWater, int waterAbsorption, String type, int currentWater){

        super (minWater, waterAbsorption, type, currentWater);
        type = type + " Flower";
    }
}
