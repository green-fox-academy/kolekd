package FleetOfThings;

import java.util.ArrayList;

public class Fleet {
    private ArrayList<Thing> things;

    public Fleet() {
        things = new ArrayList<>();
    }

    public void add(Thing thing) {
        things.add(thing);
    }

    public Thing get (int index) {
        return things.get(index);
    }

    public void set (int index, Thing thing){
        things.set(index, thing);
    }

    public void sortStuff (Fleet fleet){
        for (int i = 0; i < fleet.size(); i++) {
            for (int j = 0; j < i; j++) {
                if (fleet.get(i).compareTo(fleet.get(j)) > 0){
                    Thing temp = fleet.get(i);
                    fleet.set(i, fleet.get(j));
                    fleet.set(j, temp);
                }
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