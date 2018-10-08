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

    public int checkIfThirstyAll () {
        int thirstyOnes = 0;
        for (int i = 0; i < trees.size(); i++) {
            if ((trees.get(i)).currentWater < (trees.get(i)).minWater) {
                thirstyOnes++;
            }
        }
        for (int i = 0; i < flowers.size(); i++) {
            if ((flowers.get(i)).currentWater < (flowers.get(i)).minWater) {
                thirstyOnes++;
            }
        }   return thirstyOnes;
    }


    public void watering (int pouringWater, int thirstyOnes){
        for (int i = 0; i < thirstyOnes; i++) {
            if ((trees.get(i)).currentWater < (trees.get(i)).minWater) {
                (trees.get(i)).currentWater += pouringWater / thirstyOnes;
            }
            for (int j = 0; j < i; j++) {
                if ((flowers.get(j)).currentWater < (flowers.get(j)).minWater) {
                    (flowers.get(j)).currentWater += pouringWater / thirstyOnes;
                }
            }
        }
    }



}