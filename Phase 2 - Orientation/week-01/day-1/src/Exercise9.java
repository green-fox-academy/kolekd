import java.util.*;
import java.util.stream.Collectors;

public class Exercise9 {
    public static void main(String[] args) {

        // Write a Stream Expression to convert a char array to a string!

        char[] letters = {'C','O','N','V','E','R','T',' ','M','E','!'};
        List<Character> letterList = new ArrayList<>();

        for (int i = 0; i < letters.length; i++) {
            letterList.add(letters[i]);
        }

        String word = "";
        StringBuilder build = new StringBuilder(word);

        letterList.stream()
                .forEach(n -> build.append(n.toString()));

        System.out.println(build.toString());
    }
}
