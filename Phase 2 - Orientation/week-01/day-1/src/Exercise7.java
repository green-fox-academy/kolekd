import java.util.*;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {

        // Write a Stream Expression to find the frequency of characters in a given string!

        String word = "Mississippi";

        List <Character> letters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        List <Character> lettersUnique = letters.stream()
                .distinct()
                .collect(Collectors.toList());

        List <Integer> occurences = letters.stream()
                .distinct()
                .map(n -> Collections.frequency(letters, n))
                .collect(Collectors.toList());

        System.out.println(lettersUnique);
        System.out.println(occurences);

    }
}
