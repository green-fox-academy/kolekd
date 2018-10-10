import Anagram.Anagram;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTest {

    private Anagram thisAnagram = new Anagram();

    @Test
    public void isAnagram () {

        String word1 = "reset";
        String word2 = "trees";

        boolean isAnagram = thisAnagram.Anagrams(word1,word2);


        Assert.assertEquals(true, isAnagram);
    }

    @Test
    public void getAnagramDiffLength () {

        String word1 = "reset";
        String word2 = "tree";

        boolean isAnagram = thisAnagram.Anagrams(word1,word2);


        Assert.assertEquals(false, isAnagram);
    }

    @Test
    public void isNotAnagram () {

        String word1 = "reset";
        String word2 = "glass";

        boolean isAnagram = thisAnagram.Anagrams(word1,word2);


        Assert.assertEquals(false, isAnagram);
    }

}













