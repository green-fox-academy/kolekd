package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Plant> plants;

    public void addPlant (Plant plant){
        plants.add(plant);
    }

    public Garden(){
        plants = new ArrayList<>();
    }

    public int checkIfThirsty () {
        int thirstyOnes = 0;
        for (int i = 0; i < plants.size(); i++) {
        if ((plants.get(i)).currentWater < (plants.get(i)).minWater) {
            thirstyOnes++;
            System.out.println((plants.get(i)).type + " needs water");
            } else {
            thirstyOnes++;
            System.out.println((plants.get(i)).type + " doesn't need water");
        }
        }System.out.println();
        return thirstyOnes;
    }

    public int checkIfThirstyTextless () {
        int thirstyOnes = 0;
        for (int i = 0; i < plants.size(); i++) {
            if ((plants.get(i)).currentWater < (plants.get(i)).minWater) {
                thirstyOnes++;
            } else {
                thirstyOnes++;
            }
        }
        return thirstyOnes;
    }

    public void watering (int pouringWater, int thirstyOnes){
        System.out.println("Watering with " + pouringWater + ".");
        for (int i = 0; i < thirstyOnes; i++) {
            if ((plants.get(i)).currentWater < (plants.get(i)).minWater) {
                (plants.get(i)).currentWater += ((double)(pouringWater / thirstyOnes)/100)*((plants.get(i)).waterAbsorption);
            }
        }
        System.out.println();
    }



}