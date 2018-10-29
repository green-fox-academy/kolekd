package Anagram;

public class Anagram {

    public boolean Anagrams (String word1, String word2){           //1- reset
        boolean areAnagrams = true;                                 //2- trees
        int zeroMeansGood = 0;
        Character a = '{';
        if (word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i) == word2.charAt(j) && word1.charAt(i) != a){
                        a = word1.charAt(i);
                        zeroMeansGood++;
                    }
                }
            }
            if (zeroMeansGood == word1.length()){
                System.out.println("\"" + word1 + "\"" + " is an anagram of " + "\"" + word2 + "\"");
            } else {
                areAnagrams = false;
                System.out.println("\"" + word1 + "\"" + " is not an anagram of " + "\"" + word2 + "\"");
            }
        } else {
            areAnagrams = false;
            System.out.println("Words \"" + word1 + "\" and \"" + word2 + "\" aren't the same length.");
        }
        return areAnagrams;
    }



}
