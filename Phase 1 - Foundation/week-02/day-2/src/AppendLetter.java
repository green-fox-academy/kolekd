import java.lang.reflect.Array;
import java.util.*;

public class AppendLetter{
    public static void main(String... args){

        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        //System.out.println(appendA(far));


   //     System.out.println(appendA(far));
    }

    public static List<String> appendA(List<String> far){
        for (int i = 0; i < far.size(); i++) {
            far.set(i,"a" + far.get(i));
        }
        return far;
    }

}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"