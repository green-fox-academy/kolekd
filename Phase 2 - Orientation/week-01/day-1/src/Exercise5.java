import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {

        // Write a Stream Expression to find the uppercase characters in a string.

        String word = "dfskHdsovnEsdvosdbLdfsnLdsvojsbdvOsdjbs";

        List <Character> letters = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {
            letters.add(word.charAt(i));
        }

        System.out.println(letters);

        List <Character> lettersUpperCase = letters.stream()
                                   .filter(n -> Character.isUpperCase(n))
                                   .collect(Collectors.toList());

        System.out.println(lettersUpperCase);

    }
}
