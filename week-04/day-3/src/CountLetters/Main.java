package CountLetters;

import java.util.ArrayList;
import java.util.HashMap;

@SuppressWarnings("SpellCheckingInspection")
public class Main {
    public static void main(String[] args){
//        dictionary.put('a', 5);
//
//        System.out.println(dictionary);
//
//        System.out.println(dictionary);
//

//
//        for (int i = 0; i < word.length(); i++) {
//            word.charAt(i);
//        }

        HashMap<Character, Integer> dictionary = new HashMap<Character, Integer>();
        HashMap<Character, Integer> dictionaryBlank = new HashMap<Character, Integer>();

        String word = "bourbon";                     // b o u r b o n

        System.out.println("Word: " + "\"" + word + "\"");

        for (int i = 0; i < word.length(); i++) {
                dictionaryBlank.put(word.charAt(i), 0);
        }

        for (int i = 0; i < word.length(); i++) {
                dictionary.put(word.charAt(i), dictionary.getOrDefault(word.charAt(i), i) + 1);
                dictionaryBlank.put(word.charAt(i), dictionaryBlank.get(word.charAt(i))+  1);
        }

        System.out.println(dictionaryBlank);
    }
}
