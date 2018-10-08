package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    private List<Flower> flowers;
    private List<Tree> trees;

    public void addFlower (Flower flower){
        flowers.add(flower);
    }

    public void addTree (Tree tree){
        trees.add(tree);
    }

    public Garden(){
        flowers = new ArrayList<>();
        trees = new ArrayList<>();
    }

    public int checkIfThirsty () {
        int thirstyOnes = 0;
        for (int i = 0; i < trees.size(); i++) {
        if ((trees.get(i)).currentWater < (trees.get(i)).minWater) {
            thirstyOnes++;
            }
        } return thirstyOnes;

    }

    public void watering (int pouringWater, int thirstyOnes, Garden garden){
        for (int i = 0; i < thirstyOnes; i++) {
            if ((trees.get(i)).currentWater < (trees.get(i)).minWater) {
                (trees.get(i)).currentWater += pouringWater / thirstyOnes;
            }
        }
    }



}