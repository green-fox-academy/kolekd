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
                    System.out.println(zeroMeansGood);
                }
            }
        } else {
            areAnagrams = false;
            System.out.println("Words aren't the same length.");
        }
        return areAnagrams;
    }



}
