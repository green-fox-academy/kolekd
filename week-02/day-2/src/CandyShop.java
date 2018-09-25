import java.util.*;

public class CandyShop{
    public static void main(String... args){

        // Accidentally we added "2" and "false" to the list.
        // Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
        // No, don't just remove the lines
        // Create a method called sweets() which takes the list as a parameter.

        ArrayList<Object> arrayList = new ArrayList<Object>();
        arrayList.add("Cupcake");
        arrayList.add(2);
        arrayList.add("Brownie");
        arrayList.add(false);


        System.out.println(sweets(arrayList));

        // Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"
    }

    public static ArrayList<Object> sweets(ArrayList<Object> arrayList){
        for (int i = 0; i < arrayList.size(); i++) {
           if (i == 1){arrayList.set(i, "Croissant");}
           if (i == 3){arrayList.set(i, "Ice cream");}
        }
        return arrayList;
    }

}