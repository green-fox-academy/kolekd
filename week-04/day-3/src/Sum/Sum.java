package Sum;

import java.util.ArrayList;

public class Sum {

    private ArrayList<Integer> list;

    public int sum (ArrayList <Integer> list){
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }




}
