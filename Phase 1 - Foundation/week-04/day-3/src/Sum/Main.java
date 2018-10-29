package Sum;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        Sum konkretniSuma = new Sum();

        int result = konkretniSuma.sum(list);

        System.out.println(result);
    }

}
