package FleetOfThings;

import java.util.ArrayList;
import java.util.Collections;

public class Fleet {
    private ArrayList<Thing> things;

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public void remove (int index) {
        things.remove(index);
    }

    public Thing get (int index) {
        return things.get(index);
    }


    public void set (int index, Thing thing){
        things.set(index, thing);
    }

    public void sortStuff (){

        for (int i = 0; i < things.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (things.get(i).compareTo(things.get(j)) > 0){
                    Thing temp = things.get(i);
                    things.set(i, things.get(j));
                    things.set(j, temp);
                }
            }
        }
        Collections.sort(things);
    }

    public void extractX (Fleet fleet, Fleet fleetX) {
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i).completed){
                fleetX.add(fleet.get(i));
                fleet.remove(i);
            }
        }
    }

    public void removeX (Fleet fleet) {
        for (int i = 0; i < fleet.size(); i++) {
            if (fleet.get(i).completed){
                fleet.remove((i));
            }
        }
    }

    public int compareTo(Thing o) {
        return 0;
    }


    public int size () {
        return things.size();
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < things.size(); i++) {
            result += (i+1) + ". " + things.get(i) + "\n";
        }
        return result;
    }
}