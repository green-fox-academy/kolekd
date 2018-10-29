import CountLetters.CountLetters;
import org.junit.Assert;
import org.junit.Test;

import java.util.Dictionary;
import java.util.HashMap;

public class CountLettersTest {

    @Test
    public void correctAmount (){

        CountLetters dictionary = new CountLetters();

        HashMap newDictionary = new HashMap();

        newDictionary.put('w', 1);
        newDictionary.put('h', 1);
        newDictionary.put('a', 1);
        newDictionary.put('t', 1);
        newDictionary.put('e', 2);
        newDictionary.put('v', 1);
        newDictionary.put('r', 1);


        Assert.assertEquals(newDictionary, dictionary.Dictionary("whatever"));
    }

    @Test
    public void wrongAmount (){

        CountLetters dictionary = new CountLetters();

        HashMap newDictionary = new HashMap();

        newDictionary.put('w', 1);
        newDictionary.put('a', 1);
        newDictionary.put('t', 1);
        newDictionary.put('e', 2);
        newDictionary.put('v', 1);
        newDictionary.put('r', 1);


        Assert.assertNotEquals(newDictionary, dictionary.Dictionary("whatever"));
    }

    @Test
    public void wrongValue (){

        CountLetters dictionary = new CountLetters();

        HashMap newDictionary = new HashMap();

        newDictionary.put('w', 3);
        newDictionary.put('h', 1);
        newDictionary.put('a', 1);
        newDictionary.put('t', 1);
        newDictionary.put('e', 2);
        newDictionary.put('v', 1);
        newDictionary.put('r', 1);


        Assert.assertNotEquals(newDictionary, dictionary.Dictionary("whatever"));
    }

}
