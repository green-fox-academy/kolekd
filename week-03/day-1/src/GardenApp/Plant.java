package GardenApp;

public class Plant{

    private int currentWater;
    private int minWater;
    private int waterAbsorption;
    private String type;
    private boolean thirsty = currentWater < minWater;

    public Plant(int minWater, int waterAbsorption, String type, int currentWater) {
        this.minWater = minWater;
        this.waterAbsorption = waterAbsorption;
        this.type = type;
        this.currentWater = currentWater;
    }


    @Override
    public String toString() {
        return "" + currentWater;
    }

    public void needsWater (boolean thirsty){

    }

    public void watering (int pouringWater){
            currentWater += pouringWater;
        }
}
