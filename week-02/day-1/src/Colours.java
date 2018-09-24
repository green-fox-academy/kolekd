import java.util.Arrays;

public class Colours {
    public static void main(String[] args) {

        String[][] colours = new String[3][5];

        colours[0] = new String[] {"lime", "forest green", "olive", "pale green", "spring green"};
        colours[1] = new String[] {"orange red", "red", "tomato"};
        colours[2] = new String[] {"orchid", "violet", "pink", "hot pink"};

        System.out.println(Arrays.deepToString(colours));
    }
}