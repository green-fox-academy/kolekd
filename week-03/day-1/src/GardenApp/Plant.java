package GardenApp;

import java.util.ArrayList;

public class Plant{

    public int currentWater;
    public int minWater;
    private int waterAbsorption;
    private String type;
    public boolean thirsty = currentWater < minWater;

    public Plant(int minWater, int waterAbsorption, String type, int currentWater) {
        this.minWater = minWater;
        this.waterAbsorption = waterAbsorption;
        this.type = type;
        this.currentWater = currentWater;
    }


    public String plantName() {return "" + type;}
    @Override
    public String toString() {
        return "Current water: " + currentWater + ", minWater: " + minWater;
    }

}
