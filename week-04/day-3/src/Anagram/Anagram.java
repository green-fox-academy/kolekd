package Anagram;

public class Anagram {

    public boolean Anagrams (String word1, String word2){           //1- earth   2- heart
        int zeroMeansGood = 0;
        if (word1.length() == word2.length()){
            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word2.length(); j++) {
                    if (word1.charAt(i) == word2.charAt(j)){
                        zeroMeansGood++;
                    }
                    System.out.println(zeroMeansGood);
                }

                break;
            }
        } else {
            System.out.println("Words aren't the same length.");
        }
        boolean areAnagrams = true;
        return areAnagrams;
    }



}
