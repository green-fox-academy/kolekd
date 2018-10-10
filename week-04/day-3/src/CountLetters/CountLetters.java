package CountLetters;

import java.util.HashMap;

public class CountLetters {

    public HashMap Dictionary (String word){

        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
        HashMap<Character, Integer> dictionaryBlank = new HashMap<Character, Integer>();

        System.out.println("Word: " + "\"" + word + "\"");

        for (int i = 0; i < word.length(); i++) {
            dictionaryBlank.put(word.charAt(i), 0);
        }

        for (int i = 0; i < word.length(); i++) {
            dictionary.put(word.charAt(i), dictionary.getOrDefault(word.charAt(i), i) + 1);
            dictionaryBlank.put(word.charAt(i), dictionaryBlank.get(word.charAt(i))+  1);
        }

        System.out.println(dictionaryBlank);

        return dictionaryBlank;
    }

}
